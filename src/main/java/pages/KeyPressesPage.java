package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

  private final WebDriver webDriver;

  private final By inputForm = By.id("target");
  private final By resultPressedKey = By.id("result");

  public KeyPressesPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void enterKey(String key) {
    webDriver.findElement(inputForm).sendKeys(key);
  }

  //enter multiple keys at one time (ex.: alt code)
  //this should result in π=3.14 but i can't make the alt codes work
  public void enterPi(String key) {
    enterKey(Keys.chord(Keys.ALT, "227") + "=3.14");
  }


  public String getResultKeyYouEntered() {
    return webDriver.findElement(resultPressedKey).getText();
  }
}
