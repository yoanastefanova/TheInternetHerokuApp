package pages;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownPage {

  private final WebDriver webDriver;
  private final By dropdown = By.id("dropdown");
  private final By option1 = By.xpath("//option[@value='1']");
  private final By option2 = By.xpath("//option[@value='2']");


  public DropdownPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  public void selectFromDropdown(String option) {
    findDropdownElement().selectByVisibleText(option);
  }

  public List<String> getSelectedOptions() {
    List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
    return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
  }

  public void allowMultipleSelectionDropdownAndSelectBoth() {
    String script = "document.querySelector(\"#dropdown\").setAttribute('multiple', '')";
    var jsExecutor = (JavascriptExecutor) webDriver;
    jsExecutor.executeScript(script);
    selectFromDropdown("Option 1");
    selectFromDropdown("Option 2");

    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementSelectionStateToBe
        (option1, true));
    wait.until(ExpectedConditions.elementSelectionStateToBe
        (option2, true));
  }

  private Select findDropdownElement() {
    return new Select(webDriver.findElement(dropdown));
  }
}
