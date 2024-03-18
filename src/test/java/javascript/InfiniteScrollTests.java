package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

public class InfiniteScrollTests extends BaseTests {

  @Test
  public void testScrollToFifthParagraph() {
    InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScrollPage();

    infiniteScrollPage.scrollDownToParagraph(5);
  }
}
