package utils;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieManager {

  private final WebDriver webDriver;
  private Cookie cookie;


  public CookieManager(WebDriver webDriver){
    this.webDriver = webDriver;
  }

  public void addCookie(Cookie cookie){
    webDriver.manage().addCookie(cookie);
  }

  public void deleteCookie(Cookie cookie){
    webDriver.manage().deleteCookie(cookie);
  }

  public void deleteCookieByName(String cookieName){
    webDriver.manage().deleteCookieNamed(cookieName);
  }

  public Set<Cookie> getAllCookies(){
    return webDriver.manage().getCookies();
  }

  public Cookie getCookieByName(String cookieName){
    return webDriver.manage().getCookieNamed(cookieName);
  }

  public boolean isCookiePresent(String cookie){
    return webDriver.manage().getCookieNamed(cookie) != null;
  }

  public Cookie buildCookie(String name, String value){
    return new Cookie.Builder(name, value)
        .domain("the-internet.herokuapp.com")
        .build();
  }

}
