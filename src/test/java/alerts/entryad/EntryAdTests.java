package alerts.entryad;

import static org.testng.Assert.assertEquals;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class EntryAdTests extends BaseTests {

  @Test
  public void testModal() {
    EntryAdPage entryAdPage = homePage.clickEntryAdPage();

    entryAdPage.clickCloseBtn();
    assertEquals(entryAdPage.getTitle(), "Entry Ad");
  }
}
