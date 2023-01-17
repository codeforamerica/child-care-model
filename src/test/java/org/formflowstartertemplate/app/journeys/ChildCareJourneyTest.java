package org.formflowstartertemplate.app.journeys;

import static org.assertj.core.api.Assertions.assertThat;
import static org.formflowstartertemplate.app.utils.YesNoAnswer.NO;
import static org.formflowstartertemplate.app.utils.YesNoAnswer.YES;
import org.openqa.selenium.WebElement;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ChildCareJourneyTest extends JourneyTest {

  @Test
  void fullChildCareFlow() {
    // Landing screen
    assertThat(testPage.getTitle()).isEqualTo("Get child care assistance");
    testPage.clickButton("Apply For Child Care Benefits");
    // How this works
//    testPage.clickContinue();
//    // Language preference
//    testPage.clickContinue();
//    // Getting to know you
//    testPage.clickContinue();
//    // Personal info
    testPage.enter("firstName", "Testy");
    testPage.enter("lastName", "McTesterson");
    testPage.enter("dateofBirthDay", "01");
    WebElement radio = driver.findElement(By.id("firstTimeApplying-Yes-label"));
    radio.click();

    testPage.enter("dateofBirthMonth", "01 - January");
    testPage.enter("dateofBirthYear", "2000");
    testPage.clickButton("Next");

    testPage.goBack();

    assertThat(testPage.getCssSelectorText(".form-card__content")).contains("What is your first name?");

    // Enter subflow
    testPage.clickButton("Next");
    testPage.clickButton("+ Add Child");

    testPage.enter("childFirstName", "cookie");
    testPage.enter("childLastName", "monster");
    testPage.enter("childDateofBirthDay", "01");
    testPage.enter("childDateofBirthMonth", "01 - January");
    testPage.enter("childDateofBirthYear", "2020");
    WebElement grandchildSelector = driver.findElement(By.id("childRelationship-My grandchild"));
    grandchildSelector.click();

    WebElement hasDisabilitySelector = driver.findElement(By.id("childHasDisability-Yes"));
    hasDisabilitySelector.click();

    WebElement notInFosterCareSelector = driver.findElement(By.id("childInFosterCare-No"));
    notInFosterCareSelector.click();

    testPage.clickButton("Next");

    assertThat(testPage.getCssSelectorText(".content-card")).contains("cookie monster");



//    <label for="childRelationship-My grandchild" id="childRelationship-My grandchild-label" class="radio-button is-selected">
//    <input type="radio" id="childRelationship-My grandchild" value="My grandchild" name="childRelationship" aria-invalid="false" checked="checked">
//    <span>My grandchild</span>
//  </label>
//    assertThat(testPage.getInputValue("firstName")).isEqualTo("Testy");

//    assertThat(testPage.getSelectValue("firstName")).contains("Testy");

//    // Home address
//    testPage.enter("streetAddress", "1111 N State St");
//    testPage.enter("city", "Roswell");
//    testPage.enter("state", "NM");
//    testPage.enter("zip", "88201");
//    testPage.clickContinue();
//    // Eligibility
//    testPage.clickContinue();
//    // Housemates
//    testPage.enter("hasHousehold", NO.getDisplayValue());
//    // Income screen
//    assertThat(testPage.getTitle()).isEqualTo("Income");
//    // Go back to household page and select yes instead
//    testPage.goBack();
//    testPage.enter("hasHousehold", YES.getDisplayValue());
//    // Housemate Info
//    testPage.enter("householdMemberFirstName", "John");
//    testPage.enter("householdMemberLastName", "Doe");
//    testPage.clickContinue();
//    // Household List
//    testPage.clickButton("+ Add a person");
//    // Housemate Info
//    testPage.enter("householdMemberFirstName", "Jane");
//    testPage.enter("householdMemberLastName", "Doe");
//    testPage.clickContinue();
//    // Two household members are present
//    assertThat(testPage.getCssSelectorText(".form-card__content")).contains("John Doe");
//    assertThat(testPage.getCssSelectorText(".form-card__content")).contains("Jane Doe");
//    // Delete Jane Doe
//    testPage.findElementsByClass("subflow-delete").get(1).click();
//    testPage.clickButton("Yes, remove them");
//    assertThat(testPage.getCssSelectorText(".form-card__content")).doesNotContain("Jane Doe");
//    assertThat(testPage.findElementsByClass("subflow-delete")).hasSize(1);
//    // Go back to delete confirmation and make sure someone else isn't deleted
//    testPage.goBack();
//    assertThat(testPage.getHeader()).contains("This entry has already been deleted");
//    testPage.clickButton("Return to the screen I was on before");
//    assertThat(testPage.getHeader()).contains("Is this everyone that lives with you?");
//    assertThat(testPage.findElementsByClass("subflow-delete")).hasSize(1);
//    // Delete final household member to go back to householdList
//    testPage.findElementsByClass("subflow-delete").get(0).click();
//    testPage.clickButton("Yes, remove them");
//    assertThat(testPage.getTitle()).isEqualTo("Housemates");
//    // Add back household members
//    testPage.enter("hasHousehold", YES.getDisplayValue());
//    // Housemate Info
//    testPage.enter("householdMemberFirstName", "John");
//    testPage.enter("householdMemberLastName", "Doe");
//    testPage.clickContinue();
//    // Household List
//    testPage.clickButton("+ Add a person");
//    // Housemate Info
//    testPage.enter("householdMemberFirstName", "Jane");
//    testPage.enter("householdMemberLastName", "Doe");
//    testPage.clickContinue();
//    // Edit a person
//    testPage.findElementsByClass("subflow-edit").get(0).click();
//    testPage.enter("householdMemberFirstName", "Anthony");
//    testPage.enter("householdMemberLastName", "Dee");
//    testPage.clickContinue();
//    assertThat(testPage.getCssSelectorText(".form-card__content")).contains("Anthony Dee");
//    assertThat(testPage.getCssSelectorText(".form-card__content")).doesNotContain("John Doe");
//    testPage.clickButton("Yes, this is everyone");
//
//    //click on No I already no....
//    assertThat(testPage.getTitle()).isEqualTo("Income");
//    testPage.clickLink("No, I already know my annual household pre-tax income - I prefer to enter it directly.");
//
//    assertThat(testPage.getTitle()).isEqualTo("Reported Annual Household Pre-Tax Income");
//
//    testPage.clickContinue();
//    assertThat(testPage.hasErrorText("Please enter a value"));
//    assertThat(testPage.hasErrorText("Please enter a valid amount"));
//
//    testPage.enter("reportedTotalAnnualHouseholdIncome", "a");
//    testPage.clickContinue();
//    assertThat(testPage.hasErrorText("Please enter a valid amount"));
//
//    testPage.enter("reportedTotalAnnualHouseholdIncome", "125");
//    testPage.clickContinue();
//    assertThat(testPage.getTitle()).isEqualTo("Income Complete");
//    testPage.goBack();
//    testPage.goBack();
//    testPage.goBack();
//    testPage.goBack();
//
//    assertThat(testPage.getTitle()).isEqualTo("Income");

  }
}
