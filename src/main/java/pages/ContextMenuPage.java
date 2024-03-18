package pages;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMenuPage {

  private final WebDriver webDriver;
  private final By contextMenuBox = By.id("hot-spot");

  public ContextMenuPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void rightClickOnBox() {
    WebElement box = webDriver.findElement(contextMenuBox);
    Actions actions = new Actions(webDriver);
    actions.moveToElement(box).contextClick().build().perform();
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }

  public void confirmPopUp() {
//    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//    alert.accept();
    webDriver.switchTo().alert();
  }

}
