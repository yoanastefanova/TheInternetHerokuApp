package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

  private final WebDriver webDriver;
  private final By successLogin = By.id("flash");


  public SecureAreaPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public boolean isSuccessfulLogin() {
//       return webDriver.findElement(successLogin).getText();
    return webDriver.findElement(successLogin).isDisplayed();
  }
}
