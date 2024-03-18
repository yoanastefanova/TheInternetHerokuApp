package utils;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class WindowManager {

  private final WebDriver webDriver;
  private final WebDriver.Navigation navigation;

  public WindowManager(WebDriver webDriver) {
    this.webDriver = webDriver;
    navigation = webDriver.navigate();
  }

  public void goBack() {
    navigation.back();
  }

  public void goForward() {
    navigation.forward();
  }

  public void refresh() {
    navigation.refresh();
  }

  public void goToAnUrl(String url) {
    navigation.to(url);
  }

  public void switchToNewTab() {
    Set<String> windows = webDriver.getWindowHandles();
    windows.forEach(webDriver.switchTo()::window);
  }

  public void switchToTab(String tabTitle) {
    Set<String> windows = webDriver.getWindowHandles();

    System.out.println("Number of tabs: " + windows.size());
    System.out.println("Windows' handles: ");
    windows.forEach(System.out::println);

    for (String window : windows) {
      System.out.println("Switching to window: " + window);
      webDriver.switchTo().window(window);

      System.out.println(webDriver.getTitle());

      if (tabTitle.equals(webDriver.getTitle())) {
        break;
      }
    }
  }

}
