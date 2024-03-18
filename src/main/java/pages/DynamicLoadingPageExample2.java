package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPageExample2 {

  private static final By btnStart = By.cssSelector("#start button");
  private static final By loadingIndicator = By.id("loading");
  private static final By successMessage = By.id("finish");
  private final WebDriver webDriver;

  public DynamicLoadingPageExample2(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public String clickBtnAndWaitForLoadingToDisappearToSeeMessage() {
    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));

    webDriver.findElement(btnStart).click();
    wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));
    return webDriver.findElement(successMessage).getText();
  }
}
