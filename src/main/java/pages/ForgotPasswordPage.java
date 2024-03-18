package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {


  private final WebDriver webDriver;
  private final By emailInput = By.id("email");
  private final By retrievePasswordBtn = By.id("form_submit");

  public ForgotPasswordPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void enterEmail(String email) {
    webDriver.findElement(emailInput).sendKeys(email);
  }

  public void clickRetrievePasswordBtn() {
    webDriver.findElement(retrievePasswordBtn).click();
  }
}
