package alerts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTests extends BaseTests {

  @Test
  public void testAcceptAlert() {
    AlertsPage alertsPage = homePage.clickJavaScriptAlerts();

    alertsPage.clickJSAlertButton();
    alertsPage.clickOkOnPopUpAlert();
    assertTrue(alertsPage.getResultText().contains("successfully"));
  }

  @Test
  public void testClickJSConfirmCancel() {
    AlertsPage alertsPage = homePage.clickJavaScriptAlerts();

    alertsPage.clickJSConfirmButton();
    String popUpText = alertsPage.getTextOfPopUpAlert();
    alertsPage.clickOkOnPopUpCancelAlert();
    assertEquals(popUpText, "I am a JS Confirm");
    assertTrue(alertsPage.getResultText().contains("Cancel"));
  }

  @Test
  public void testClickJSPrompt() {
    AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
    String input = "Test input";

    alertsPage.clickJSPromptButton();
    alertsPage.setInputAlert(input);
    alertsPage.clickOkOnPopUpAlert();
    assertEquals(alertsPage.getResultText(), "You entered: " + input);
  }
}
