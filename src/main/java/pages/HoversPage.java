package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

  private final WebDriver webDriver;
  private final By figureBox = By.className("figure");
  private final By captionBox = By.className("figcaption");

  public HoversPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public FigureCaption hoverOverFigure(int index) {
    WebElement figure = webDriver.findElements(figureBox).get(index - 1);

    Actions actions = new Actions(webDriver);
    actions.moveToElement(figure).build().perform();//hover action
    return new FigureCaption(figure.findElement(captionBox));
  }

  public class FigureCaption {

    private final WebElement caption;
    private final By header = By.tagName("h5");
    private final By link = By.tagName("a");


    public FigureCaption(WebElement caption) {
      this.caption = caption;
    }

    public boolean isCaptionDisplayed() {
      return caption.isDisplayed();
    }

    public String getTitle() {
      return caption.findElement(header).getText();
    }

    public String getLink() {
      return caption.findElement(link).getAttribute("href");
    }

    public String getLinkText() {
      return caption.findElement(link).getText();
    }
  }
}
