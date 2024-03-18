package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPageExample1 {

  private static final By mainContent = By.id("content");
  private static final By btnStart = By.id("start");
  private static final By loadingIndicator = By.cssSelector("loading");
  private static final By successMessage = By.id("finish");
  private final WebDriver webDriver;


  public DynamicLoadingPageExample1(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public String clickBtnAndWaitUntilMessageIsVisible() {
    //        FluentWait fluentWait = new FluentWait(webDriver)
//                .withTimeout(Duration.ofSeconds(20))
//                        .pollingEvery(Duration.ofSeconds(1))
//                                .ignoring(NoSuchElementException.class);
//        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));

    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));

    webDriver.findElement(btnStart).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
    return webDriver.findElement(successMessage).getText();
  }

  public boolean verifyClickBtn(){
    return webDriver.findElement(btnStart).isDisplayed();
  }

}
