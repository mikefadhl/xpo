package com.ltlxpo.pageobjects;

import com.ltlxpo.setup.PageLoadHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.ltlxpo.setup.SeleniumDriver.getDriver;

/**
 * Page object Ltl XPO Login page.
 *
 */

public class LtlXPOLoginPage extends BaseObjectPage<LtlXPOLoginPage> {

    @FindBy(id = "j_username")
    WebElement emailField;

    @FindBy(id = "j_password")
    WebElement passwordField;
	
	@FindBy(css = "input[class='panel-login__loginButton']")
    WebElement signInButton;
   

    public LtlXPOLoginPage() {
        super(getDriver());
    }
    
    @Override
    public String getPageUrl() {
        return "/webapp/membership_app/login.jsp";
    }
   
    public void login(String login, String password) {        
    	type(emailField, login);
        type(passwordField, password);
        click(signInButton);
    }
    
    public LtlXPOLoginPage open() {
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
                isElementIsVisible(By.cssSelector("input[class='panel-login__loginButton']")).
                isElementIsClickable(By.cssSelector("input[class='panel-login__loginButton']"));
    }

}
