package alerts.contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTests {

  @Test
  public void testContextClick() {
    ContextMenuPage contextMenuPage = homePage.clickContextMenuPage();

    contextMenuPage.rightClickOnBox();
    contextMenuPage.confirmPopUp();
  }
}
