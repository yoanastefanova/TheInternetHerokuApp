package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

  //no need for three different locators because the text is located in the same path for every frame
  private static final By iFrameBody = By.xpath("//body");
  private final WebDriver webDriver;
  private String frameText;


  public NestedFramesPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public String getTextLeft() {
    switchToLeftInnerFrame();
    frameText = webDriver.findElement(iFrameBody).getText();
    switchToMainFrame();
    return frameText;
  }

  public String getTextMiddle() {
    switchToMiddleInnerFrame();
    frameText = webDriver.findElement(iFrameBody).getText();
    switchToMainFrame();
    return frameText;
  }

  public String getTextRight() {
    switchToRightInnerFrame();
    frameText = webDriver.findElement(iFrameBody).getText();
    switchToMainFrame();
    return frameText;
  }

  //the left inner frame is contained in another inner frame -> html/frameset/frame/html/frameset/frame/html
  public void switchToLeftInnerFrame() {
    webDriver.switchTo().frame(0).switchTo().frame(0);
  }

  public void switchToMiddleInnerFrame() {
    webDriver.switchTo().frame(0).switchTo().frame(1);
  }

  public void switchToRightInnerFrame() {
    webDriver.switchTo().frame(0).switchTo().frame(2);
  }

  public void switchToMainFrame() {
    webDriver.switchTo().defaultContent();
  }

  public void switchToTopInnerFrame() {
    webDriver.switchTo().frame(0);
  }

}
