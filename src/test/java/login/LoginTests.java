package login;

import static org.testng.Assert.assertTrue;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

  @Test
  public void testSuccessfulLogin() {
    LoginPage loginPage = homePage.clickFormAuthentication();
    loginPage.setUsername("tomsmith");
    loginPage.setPassword("SuperSecretPassword!");
    SecureAreaPage secureAreaPage = loginPage.loginAndGoToSecureAreaPage();
    assertTrue(secureAreaPage.isSuccessfulLogin());
  }
}
