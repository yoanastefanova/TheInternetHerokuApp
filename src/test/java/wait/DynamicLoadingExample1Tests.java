package wait;

import static org.testng.Assert.assertEquals;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPageExample1;

public class DynamicLoadingExample1Tests extends BaseTests {

  @Test
  public void testWaitAndClick() {
    DynamicLoadingPageExample1 dynamicLoadingPageExample1 = homePage.clickDynamicLoadingPage()
        .clickOnExample1();

    String message = dynamicLoadingPageExample1.clickBtnAndWaitUntilMessageIsVisible();
    assertEquals(message, "Hello World!");
  }
}
