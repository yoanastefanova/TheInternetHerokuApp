package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {

  private final WebDriver webDriver;
  private final By closeBtn = By.cssSelector("div[class='modal-footer'] p");
  private final By pageTitle = By.cssSelector("div[class='example'] h3");

  public EntryAdPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void clickCloseBtn() {
    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOfElementLocated(closeBtn));
    webDriver.findElement(closeBtn).click();
  }

  public String getTitle() {
    return webDriver.findElement(pageTitle).getText();
  }
}
