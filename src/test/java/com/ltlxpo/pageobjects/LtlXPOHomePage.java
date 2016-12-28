package com.ltlxpo.pageobjects;

import com.ltlxpo.setup.PageLoadHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.ltlxpo.setup.SeleniumDriver.getDriver;

/**
 * Page object Ltl XPO home page.
 *
 */

public class LtlXPOHomePage extends BaseObjectPage<LtlXPOHomePage> {

    @FindBy(id = "logInHdrMenu")
    WebElement loginButton;
    
    @FindBy(css = "button[aria-owns='menu_container_3']")
    WebElement loginStatus;    
    
    public LtlXPOHomePage() {
        super(getDriver());
    }
    
    @Override
    public String getPageUrl() {
        return "";
    }
    
    public void clickLoginButton() {
    	isElementClickable(loginButton);
        click(loginButton);
    }
        
    public boolean checkLoginStatus() {
    	isElementClickable(loginStatus);
        return isElementDisplayed(loginStatus);
    }
    
    public LtlXPOHomePage open() {
        return new LtlXPOHomePage().openPage(LtlXPOHomePage.class);
    }

    public LtlXPOLoginPage goToLoginPage() {
        return new LtlXPOLoginPage().openPage(LtlXPOLoginPage.class);
    }
    
    public void isElementClickable(WebElement element) throws Error{
    	PageLoadHelper.isClickable().
    	     isElementIsClickable(element);
    }
    
    @Override
    protected void load() {
    }

    @Override
    protected void isLoaded() throws Error {
        PageLoadHelper.isLoaded().
                isElementIsVisible(By.id("logInHdrMenu")).
                isElementIsClickable(By.id("logInHdrMenu"));
    }

}
