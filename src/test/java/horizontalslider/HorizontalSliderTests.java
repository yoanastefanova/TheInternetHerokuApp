package horizontalslider;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTests extends BaseTests {

  @Test
  public void testHorizontalSliderToGetTheNumberFour() {
    HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();

    int i = 0;
    while (!horizontalSliderPage.getSliderNumber().equals("4")) {
      horizontalSliderPage.sendKeysToSlider(Keys.ARROW_RIGHT);
      ++i;
    }
    System.out.println(i);
  }
}
