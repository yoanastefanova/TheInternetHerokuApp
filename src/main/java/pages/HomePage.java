package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

  private static final String FORM_AUTHENTICATION = "Form Authentication";
  private static final String DROPDOWN = "Dropdown";
  private static final String FORGOT_PASSWORD = "Forgot Password";
  private static final String HOVERS = "Hovers";
  private static final String KEY_PRESSES = "Key Presses";
  private static final String HORIZONTAL_SLIDER = "Horizontal Slider";
  private static final String ALERTS = "JavaScript Alerts";
  private static final String FILE_UPLOAD = "File Upload";
  private static final String ENTRY_AD = "Entry Ad";
  private static final String CONTEXT_MENU = "Context Menu";
  private static final String WYSIWYG_EDITOR = "WYSIWYG Editor";
  private static final String FRAMES = "Frames";
  private static final String DYNAMIC_LOADING = "Dynamic Loading";
  private static final String LARGE_AND_DEEP_DOM = "Large & Deep DOM";
  private static final String INFINITE_SCROLL = "Infinite Scroll";
  private static final String MULTIPLE_WINDOWS_PAGE = "Multiple Windows";
  private final WebDriver webDriver;


  public HomePage(WebDriver webDriver) {
    this.webDriver = webDriver;// the same driver that has launched the browser already
  }

  public LoginPage clickFormAuthentication() {
    clickLink(FORM_AUTHENTICATION);
    return new LoginPage(webDriver);
  }

  public DropdownPage clickDropdown() {
    clickLink(DROPDOWN);
    return new DropdownPage(webDriver);
  }

  public ForgotPasswordPage clickForgotPassword() {
    clickLink(FORGOT_PASSWORD);
    return new ForgotPasswordPage(webDriver);
  }

  public HoversPage clickHovers() {
    clickLink(HOVERS);
    return new HoversPage(webDriver);
  }

  public KeyPressesPage clickKeyPresses() {
    clickLink(KEY_PRESSES);
    return new KeyPressesPage(webDriver);
  }

  public HorizontalSliderPage clickHorizontalSlider() {
    clickLink(HORIZONTAL_SLIDER);
    return new HorizontalSliderPage(webDriver);
  }

  public AlertsPage clickJavaScriptAlerts() {
    clickLink(ALERTS);
    return new AlertsPage(webDriver);
  }

  public FileUploadPage clickFileUploadPage() {
    clickLink(FILE_UPLOAD);
    return new FileUploadPage(webDriver);
  }

  public EntryAdPage clickEntryAdPage() {
    clickLink(ENTRY_AD);
    return new EntryAdPage(webDriver);
  }

  public ContextMenuPage clickContextMenuPage() {
    clickLink(CONTEXT_MENU);
    return new ContextMenuPage(webDriver);
  }

  public WysiwigEditorPage clickWysiwigEditorPage() {
    clickLink(WYSIWYG_EDITOR);
    return new WysiwigEditorPage(webDriver);
  }

  public FramesPage clickFramesPage() {
    clickLink(FRAMES);
    return new FramesPage(webDriver);
  }

  public DynamicLoadingPage clickDynamicLoadingPage() {
    clickLink(DYNAMIC_LOADING);
    return new DynamicLoadingPage(webDriver);
  }

  public LargeAndDeepDOMPage clickLargeAndDeepDOMPage() {
    clickLink(LARGE_AND_DEEP_DOM);
    return new LargeAndDeepDOMPage(webDriver);
  }

  public InfiniteScrollPage clickInfiniteScrollPage() {
    clickLink(INFINITE_SCROLL);
    return new InfiniteScrollPage(webDriver);
  }

  public MultipleWindowsPage clickMultipleWindowsPage() {
    clickLink(MULTIPLE_WINDOWS_PAGE);
    return new MultipleWindowsPage(webDriver);
  }

  private void clickLink(String linkText) {
    webDriver.findElement(By.linkText(linkText)).click();
  }

}
