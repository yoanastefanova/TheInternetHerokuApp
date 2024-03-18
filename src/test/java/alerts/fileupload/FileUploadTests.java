package alerts.fileupload;

import static org.testng.Assert.assertEquals;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests {

  @Test
  public void testFileUpload() {
    FileUploadPage fileUploadPage = homePage.clickFileUploadPage();
    String filePath = "D:\\AutomationTesting\\TheInternetHerokuApp\\src\\test\\java\\alerts\\fileupload\\testFile.png";

    fileUploadPage.clickChooseFileAndEnterFilePath(filePath);
    fileUploadPage.clickUploadBtn();
    assertEquals(fileUploadPage.getUploadMessage(), "File Uploaded!");
    assertEquals(fileUploadPage.getUploadedFileName(), "testFile.png");
  }
}
