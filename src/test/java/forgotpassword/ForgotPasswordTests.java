package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {

  @Test
  public void testSuccessfulForgottenPassword() {
    ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();

    forgotPasswordPage.enterEmail("avc@gmail.com");
    forgotPasswordPage.clickRetrievePasswordBtn();
  }
}
