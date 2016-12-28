package com.ltlxpo.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.ltlxpo.setup.SeleniumDriver.getDriver;

/**
 * PageLoadHelper
 *
 */
public class PageLoadHelper {
    public static PageLoadHelper isLoaded() {
        PageLoadHelper loadHelper = new PageLoadHelper();
        return loadHelper;
    }

    public static PageLoadHelper isClickable() {
        PageLoadHelper loadHelper = new PageLoadHelper();
        return loadHelper;
    }

    public PageLoadHelper isElementIsClickable(By by) {
        try {
            new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(by));
            return this;
        } catch (WebDriverException e) {
            throw new Error("Element is not clickable");
        }
    }

    public PageLoadHelper isElementIsClickable(WebElement element) {
        try {
            new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(element));
            return this;
        } catch (WebDriverException e) {
            throw new Error("Element is not clickable");
        }
    }
    
    public PageLoadHelper isElementIsVisible(By by) {
        try {
            new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOfElementLocated(by));
            return this;
        } catch (WebDriverException e) {
            throw new Error("Element is not visible");
        }
    }
}
