package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FramesPage;
import pages.NestedFramesPage;

public class NestedFramesTests extends BaseTests {

  @Test
  public void testNestedFrames() {
    FramesPage framesPage = homePage.clickFramesPage();
    NestedFramesPage nestedFramesPage = framesPage.clickOnNestedFrames();

    //used in a case when the passing of one test condition is not necessary to execute the upcoming tests
//        used when we have multiple assertions in our test method or we want to execute some other line of codes after the assertion statement
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(nestedFramesPage.getTextLeft(), "LEFT");
    softAssert.assertEquals(nestedFramesPage.getTextMiddle(), "MIDDLE");
    softAssert.assertEquals(nestedFramesPage.getTextRight(), "RIGHT");
    softAssert.assertAll();
  }
}
