import static org.testng.Assert.assertFalse;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utils.CookieManager;

public class CookiesTests extends BaseTests {

  @Test
  public void removeAndCheckCookies(){
    CookieManager cookieManager = getCookieManager();
    Cookie cookie = cookieManager.buildCookie("optimizelyBuckets1", "%7B%TD");
    cookieManager.addCookie(cookie);
    cookieManager.deleteCookieByName("optimizelyBuckets1");
    assertFalse(cookieManager.isCookiePresent(cookie.getName()));
  }

}
