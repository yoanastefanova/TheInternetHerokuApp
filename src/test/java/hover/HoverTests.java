package hover;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTests extends BaseTests {

  @Test
  public void testHoverUser1() {
    HoversPage hoversPage = homePage.clickHovers();
    HoversPage.FigureCaption figureCaption = hoversPage.hoverOverFigure(1);
    assertTrue(figureCaption.isCaptionDisplayed(), "Caption is not displayed.");
    assertEquals(figureCaption.getTitle(), "name: user1", "Caption is incorrect.");
    assertEquals(figureCaption.getLinkText(), "View profile", "Link text is incorrect.");
    assertTrue(figureCaption.getLink().endsWith("/users/1"), "Link is incorrect.");

  }
}
