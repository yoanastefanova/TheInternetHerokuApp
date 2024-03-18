package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

  private static final By textParagraphs = By.className("jscroll-added");
  private final WebDriver webDriver;


  public InfiniteScrollPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  /*
  Scrolls until paragraph with specified index is in view
  index is 1-based
   */
  public void scrollDownToParagraph(int index) {
    //(horizontal, vertical)
    String script = "window.scrollTo(0, document.body.scrollHeight)";
    var jsExecutor = (JavascriptExecutor) webDriver;

    while (getNumberOfParagraphsPresent() < index) {
      jsExecutor.executeScript(script);
    }
  }

  private int getNumberOfParagraphsPresent() {
    return webDriver.findElements(textParagraphs).size();
  }

}
