package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

  private final WebDriver webDriver;
  private final By chooseFileBtn = By.id("file-upload");
  private final By uploadBtn = By.id("file-submit");
  private final By uploadMessage = By.cssSelector("div[class='example'] h3");
  private final By uploadedFileName = By.id("uploaded-files");

  public FileUploadPage(WebDriver webDriver) {
    this.webDriver = webDriver;
  }

  //    "Choose file" btn is actually an input window and is tagged with <input>
  public void clickChooseFileAndEnterFilePath(String filePath) {
    webDriver.findElement(chooseFileBtn).sendKeys(filePath);
  }

  //    also an <input> element, yet clickable
  public void clickUploadBtn() {
    webDriver.findElement(uploadBtn).click();
  }

  public String getUploadMessage() {
    return webDriver.findElement(uploadMessage).getText();
  }

  public String getUploadedFileName() {
    return webDriver.findElement(uploadedFileName).getText();
  }

}
