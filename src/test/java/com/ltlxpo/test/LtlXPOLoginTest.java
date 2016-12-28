package com.ltlxpo.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;
import com.ltlxpo.pageobjects.LtlXPOHomePage;
import com.ltlxpo.pageobjects.LtlXPOLoginPage;
import com.ltlxpo.setup.SeleniumBaseTest;
import org.testng.annotations.Test;

public class LtlXPOLoginTest extends SeleniumBaseTest {
	  
  @Test
  public void loginWithValidCredentialsTest() {
      //navigate to login page                        
      LtlXPOHomePage ltlXPOHomePage = new LtlXPOHomePage().open();
      ltlXPOHomePage.clickLoginButton();
      LtlXPOLoginPage ltlXPOLoginPage = ltlXPOHomePage.goToLoginPage();
      
      //try to login
      ltlXPOLoginPage.login("mikefadhl@gmail.com", "bluek0Hort");

      //verify user is logged in
      AssertJUnit.assertTrue(ltlXPOHomePage.checkLoginStatus());
  }
}
