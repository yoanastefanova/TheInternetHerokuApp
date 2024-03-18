package dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import base.BaseTests;
import java.util.List;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTests extends BaseTests {

  @Test
  public void testSelectOption() {
    DropdownPage dropdownPage = homePage.clickDropdown();

    String option = "Option 1";
    dropdownPage.selectFromDropdown(option);
    List<String> selectedOptions = dropdownPage.getSelectedOptions();
    assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
    assertTrue(selectedOptions.contains(option), "Option not selected");
  }
}
