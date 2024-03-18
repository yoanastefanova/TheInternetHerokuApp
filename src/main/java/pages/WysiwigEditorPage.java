package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwigEditorPage {

  private final WebDriver webDriver;
  private final String editorIframeID = "mce_0_ifr";
  private final By textArea = By.id("tinymce");
  private final By alignCenterBtn = By.xpath("//button[@title='Align center']");


  public WysiwigEditorPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void clearTextArea() {
    switchToEditArea();
    webDriver.findElement(textArea).clear();
    switchToMainArea();
  }

  public void sendTextArea(String text) {
    switchToEditArea();
    webDriver.findElement(textArea).sendKeys(text);
    switchToMainArea();
  }

  public String getTextFromEditor() {
    switchToEditArea();
    String text = webDriver.findElement(textArea).getText();
    switchToMainArea();
    return text;
  }

  //buttons are in the main area
  public void clickAlignCenterBtn() {
    webDriver.findElement(alignCenterBtn).click();
  }


  //switches context from page's DOM to iframe DOM
  private void switchToEditArea() {
    webDriver.switchTo().frame(editorIframeID);
  }

  private void switchToMainArea() {
    webDriver.switchTo().parentFrame();
  }
}
