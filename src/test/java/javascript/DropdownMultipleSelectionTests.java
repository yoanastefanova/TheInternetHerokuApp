package javascript;

import static org.testng.Assert.assertEquals;

import base.BaseTests;
import java.util.List;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownMultipleSelectionTests extends BaseTests {

  @Test
  public void testMultipleSelectionDropdown() {
    DropdownPage dropdownPage = homePage.clickDropdown();

    dropdownPage.allowMultipleSelectionDropdownAndSelectBoth();
    List<String> selectedOptions = dropdownPage.getSelectedOptions();
    assertEquals(selectedOptions.get(0), "Option 1");
    assertEquals(selectedOptions.get(1), "Option 2");
  }
}
