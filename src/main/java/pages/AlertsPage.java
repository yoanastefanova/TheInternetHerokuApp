package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

  private final WebDriver webDriver;
  private final By clickForJSAlert = By.xpath(".//button[text()='Click for JS Alert']");
  private final By result = By.id("result");
  private final By clickForJSConfirm = By.xpath(".//button[text()='Click for JS Confirm']");
  private final By clickForJSPrompt = By.xpath(".//button[text()='Click for JS Prompt']");


  public AlertsPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void clickJSAlertButton() {
    webDriver.findElement(clickForJSAlert).click();
  }

  public void clickOkOnPopUpAlert() {
    webDriver.switchTo().alert().accept();
  }

  public String getResultText() {
    return webDriver.findElement(result).getText();
  }

  public void clickJSConfirmButton() {
    webDriver.findElement(clickForJSConfirm).click();
  }

  public String getTextOfPopUpAlert() {
    return webDriver.switchTo().alert().getText();
  }

  public void clickOkOnPopUpCancelAlert() {
    webDriver.switchTo().alert().dismiss();
  }

  public void clickJSPromptButton() {
    webDriver.findElement(clickForJSPrompt).click();
  }

  public void setInputAlert(String input) {
    webDriver.switchTo().alert().sendKeys(input);
  }

}
