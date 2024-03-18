package keypresses;

import static org.testng.Assert.assertTrue;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeyPressesTests extends BaseTests {

  @Test
  public void testBackspace() throws InterruptedException {
    KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
    keyPressesPage.enterKey(Keys.BACK_SPACE.toString());
    assertTrue(keyPressesPage.getResultKeyYouEntered().contains("BACK_SPACE"));
  }

  @Test
  public void testPageDown() throws InterruptedException {
    KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
    keyPressesPage.enterKey(Keys.PAGE_DOWN.toString());
    assertTrue(keyPressesPage.getResultKeyYouEntered().contains("PAGE_DOWN"));
  }

  @Test
  public void testCharSequence() throws InterruptedException {
    KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
    keyPressesPage.enterKey(Keys.chord(Keys.NUMPAD1, Keys.ADD, Keys.NUMPAD2));
    assertTrue(keyPressesPage.getResultKeyYouEntered().contains("NUMPAD2"));
  }

  //the platform doesn't perform as expected but the key press is fine
  @Test
  public void testCharSequenceShift() throws InterruptedException {
    KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
    keyPressesPage.enterKey(Keys.chord(Keys.SHIFT, Keys.SEMICOLON));
    assertTrue(keyPressesPage.getResultKeyYouEntered().contains(":"));
  }
}
