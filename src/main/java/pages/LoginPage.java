package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  private final WebDriver webDriver;
  private final By usernameField = By.id("username");
  private final By passwordField = By.id("password");
  private final By loginBtn = By.className("radius");

  public LoginPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void setUsername(String username) {
    webDriver.findElement(usernameField).sendKeys(username);
  }

  public void setPassword(String password) {
    webDriver.findElement(passwordField).sendKeys(password);
  }

  public SecureAreaPage loginAndGoToSecureAreaPage() {
    webDriver.findElement(loginBtn).click();
    return new SecureAreaPage(webDriver);
  }

}
