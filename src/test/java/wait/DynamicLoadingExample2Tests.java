package wait;

import static org.testng.Assert.assertEquals;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPageExample2;

public class DynamicLoadingExample2Tests extends BaseTests {

  @Test
  public void testWaitAndClick() {
    DynamicLoadingPageExample2 dynamicLoadingPageExample2 = homePage.clickDynamicLoadingPage()
        .clickOnExample2();
    String message = dynamicLoadingPageExample2.clickBtnAndWaitForLoadingToDisappearToSeeMessage();
    assertEquals(message, "Hello World!");

  }

}
