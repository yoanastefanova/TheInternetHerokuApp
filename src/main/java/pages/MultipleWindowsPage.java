package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

  private static final By clickHereLink = By.cssSelector("a[href='/windows/new']");
  private final WebDriver webDriver;

  public MultipleWindowsPage(WebDriver webDriver){
    this.webDriver = webDriver;
  }

  public void clickHereLink(){
    webDriver.findElement(clickHereLink).click();
  }

}
