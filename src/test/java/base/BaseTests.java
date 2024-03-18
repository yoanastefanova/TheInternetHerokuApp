package base;

import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.CookieManager;
import utils.WindowManager;

public class BaseTests {

  protected HomePage homePage;
  private WebDriver webDriver;

  @BeforeClass
  public void setUp() {
    webDriver = new ChromeDriver(getChromeOption());
    goHome();
    webDriver.manage().window().maximize();
  }

  @BeforeMethod
  public void goHome() {
    webDriver.get("https://the-internet.herokuapp.com/");
    homePage = new HomePage(webDriver);
  }

//  @Test
//  public void howManyButtonsInMenuElements() {
//    WebElement shiftingContent = webDriver.findElement(By.linkText("Shifting Content"));
//    shiftingContent.click();
//    WebElement menuElement = webDriver.findElement(By.linkText("Example 1: Menu Element"));
//    menuElement.click();
//    int numberOfButtons = webDriver.findElements(By.cssSelector("li a")).size();
//    System.out.println(numberOfButtons);
//
//  }

  @AfterClass
  public void quitWebDriver() {
    webDriver.quit();
  }

  @AfterMethod
  public void recordFailure(ITestResult result) {

    if (ITestResult.FAILURE == result.getStatus()) {
      TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
      File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
      try {
        Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public WindowManager getWindowManager() {
    return new WindowManager(webDriver);
  }

  public CookieManager getCookieManager() {
    return new CookieManager(webDriver);
  }


  private ChromeOptions getChromeOption() {
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("disable-infobars");
    return chromeOptions;
  }

  private void setCookie() {
    Cookie cookie = new Cookie.Builder("test", "123").domain("https://the-internet.herokuapp.com/")
        .build();
    webDriver.manage().addCookie(cookie);
  }
}
