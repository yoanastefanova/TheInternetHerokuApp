package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

  private final WebDriver webDriver;
  private final By sliderContainer = By.xpath("//input[@value='0']");
  private final By sliderNumber = By.id("range");

  public HorizontalSliderPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void clickOnSlider() {
    webDriver.findElement(sliderContainer).click();
  }

  public void sendKeysToSlider(Keys key) {
//        clickOnSlider();
    webDriver.findElement(sliderContainer).sendKeys(key);
  }

  public String getSliderNumber() {
    return webDriver.findElement(sliderNumber).getText();
  }
}
