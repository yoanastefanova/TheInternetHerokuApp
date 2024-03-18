package navigation;

import static org.testng.Assert.assertTrue;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPageExample1;

public class NavigationTests extends BaseTests {

  @Test
  public void testNavigation() {
    //go in a few pages
    homePage.clickDynamicLoadingPage().clickOnExample1();
    getWindowManager().goBack();
    getWindowManager().refresh();
    getWindowManager().goForward();
    getWindowManager().goToAnUrl("https://google.com");
  }

  @Test
  public void testSwitchTab() {
    homePage.clickMultipleWindowsPage().clickHereLink();
    getWindowManager().switchToTab("New Window");
  }

  @Test
  public void testRightClickNewTab() {
    DynamicLoadingPageExample1 dynamicLoadingPageExample1 = homePage.clickDynamicLoadingPage()
        .contextClickOnExample1AndOpenInNewTab();
    getWindowManager().switchToNewTab();
    assertTrue(dynamicLoadingPageExample1.verifyClickBtn());
  }

}
