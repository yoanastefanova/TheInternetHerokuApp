package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

  private static final By example1 = By.cssSelector("a[href='/dynamic_loading/1']");
  private static final By example2 = By.cssSelector("a[href='/dynamic_loading/2']");
  private final WebDriver webDriver;


  public DynamicLoadingPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public DynamicLoadingPageExample1 clickOnExample1() {
    webDriver.findElement(example1).click();
    return new DynamicLoadingPageExample1(webDriver);
  }


  public DynamicLoadingPageExample1 contextClickOnExample1AndOpenInNewTab() {
    webDriver.findElement(example1).sendKeys(Keys.CONTROL, Keys.RETURN);
    return new DynamicLoadingPageExample1(webDriver);
  }

  public DynamicLoadingPageExample2 clickOnExample2() {
    webDriver.findElement(example2).click();
    return new DynamicLoadingPageExample2(webDriver);
  }

}
