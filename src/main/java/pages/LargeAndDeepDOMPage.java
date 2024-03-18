package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDOMPage {

  private static final By table = By.id("large-table");
  private final WebDriver webDriver;

  public LargeAndDeepDOMPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  //in that case the element we're looking for is actually in the DOM
  //so we can scroll it into view
  public void scrollToTable() {
    WebElement tableElement = webDriver.findElement(table);
    String scrollScript = "arguments[0].scrollIntoView();";
    ((JavascriptExecutor) webDriver).executeScript(scrollScript, tableElement);
  }

  public void highlightTable() {
    WebElement tableElement = webDriver.findElement(table);
    String highlightScript = "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');";
    ((JavascriptExecutor) webDriver).executeScript(highlightScript, tableElement);
  }
}
