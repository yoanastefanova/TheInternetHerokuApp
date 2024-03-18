package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LargeAndDeepDOMPage;

public class LargeAndDeepDOMTests extends BaseTests {

  @Test
  public void testScroll() throws InterruptedException {
    LargeAndDeepDOMPage largeAndDeepDOMPage = homePage.clickLargeAndDeepDOMPage();

    largeAndDeepDOMPage.scrollToTable();
    largeAndDeepDOMPage.highlightTable();
    Thread.sleep(2000);
  }
}
