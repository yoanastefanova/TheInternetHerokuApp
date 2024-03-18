package frames;

import static org.testng.Assert.assertEquals;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwigEditorPage;

public class FramesWysiwigTests extends BaseTests {

  @Test
  public void testWysiwig() throws InterruptedException {
    WysiwigEditorPage wysiwigEditorPage = homePage.clickWysiwigEditorPage();

    String word1 = "hello ";
    String word2 = "world!";

    wysiwigEditorPage.clearTextArea();
    wysiwigEditorPage.sendTextArea(word1);
    wysiwigEditorPage.sendTextArea(word2);
    wysiwigEditorPage.clickAlignCenterBtn();
    assertEquals(wysiwigEditorPage.getTextFromEditor(), word1 + word2);
  }
}
