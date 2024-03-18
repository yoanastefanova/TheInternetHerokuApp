package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

  private final static By nestedFramesBtn = By.cssSelector("a[href='/nested_frames']");
  private final WebDriver webDriver;

  public FramesPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public NestedFramesPage clickOnNestedFrames() {
    webDriver.findElement(nestedFramesBtn).click();
    return new NestedFramesPage(webDriver);
  }
}
