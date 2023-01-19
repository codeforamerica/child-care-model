package org.formflowstartertemplate.app.journeys;

import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.WebElement;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ChildCareJourneyTest extends JourneyTest {

  @Test
  void fullChildCareFlow() {
    // Landing screen
    assertThat(testPage.getTitle()).isEqualTo("Get child care assistance");
    testPage.clickButton("Apply For Child Care Benefits");
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

    // Add another child
    testPage.clickButton("+ Add another child");
    testPage.enter("childFirstName", "oscar");
    testPage.enter("childLastName", "the grouch");
    testPage.enter("childDateofBirthDay", "02");
    testPage.enter("childDateofBirthMonth", "03 - March");
    testPage.enter("childDateofBirthYear", "2019");
    WebElement childSelector = driver.findElement(By.id("childRelationship-My biological child"));
    childSelector.click();

    WebElement noDisabilitySelector = driver.findElement(By.id("childHasDisability-No"));
    noDisabilitySelector.click();

    WebElement inFosterCareSelector = driver.findElement(By.id("childInFosterCare-Yes"));
    inFosterCareSelector.click();
    testPage.clickButton("Next");

    assertThat(testPage.getCssSelectorText(".content-card")).contains("oscar the grouch");

    // edit child
    testPage.findElementsByClass("subflow-edit").get(0).click();
    WebElement siblingSelector = driver.findElement(By.id("childRelationship-My sibling"));
    siblingSelector.click();
    testPage.clickButton("Next");

    assertThat(testPage.getCssSelectorText(".content-card")).contains("My sibling");

    // delete child
    testPage.findElementsByClass("subflow-delete").get(1).click();
    testPage.clickButton("Yes, remove them");
    assertThat(testPage.getCssSelectorText(".content-card")).doesNotContain("oscar the grouch");

    // continue
    testPage.clickButton("That's all children needing care");
    WebElement hasChildrenNotNeedingCare = driver.findElement(By.id("childrenNotNeedingCare-Yes"));
    hasChildrenNotNeedingCare.click();

    testPage.enter("numChildrenNotNeedingCare", "2");
    testPage.clickButton("Next");

    // more about client + children
    WebElement receivesCashAssistance = driver.findElement(By.id("receiveCashAssistance-Yes"));
    receivesCashAssistance.click();

    WebElement livingInShelter = driver.findElement(By.id("currentLivingSituation-Staying in an emergency or transitional shelter"));
    livingInShelter.click();

    WebElement noDomesticViolence = driver.findElement(By.id("experiencingDomesticViolence-No"));
    noDomesticViolence.click();

    WebElement impactedByEmergency = driver.findElement(By.id("impactedByEmergency-Yes"));
    impactedByEmergency.click();

    WebElement noChildrenUnderCourtSupervision = driver.findElement(By.id("childrenUnderCourtSupervision-No"));
    noChildrenUnderCourtSupervision.click();

    testPage.clickButton("Next");

    WebElement currentlyWorking = driver.findElement(By.id("currentlyWorking-Yes"));
    currentlyWorking.click();



    testPage.clickButton("Next");

    testPage.enter("employerName", "code for america");
    WebElement hasFreelanceJob = driver.findElement(By.id("freelanceJob-No"));
    hasFreelanceJob.click();
    testPage.enter("incomeLast30Days", "500");
    WebElement lessMoneyNextMonth = driver.findElement(By.id("lessMoneyNextMonth-Yes"));
    lessMoneyNextMonth.click();
    testPage.clickButton("Next");
    testPage.clickButton("That's all the jobs I worked this year");



    assertThat(testPage.getCssSelectorText(".spacing-above-15")).contains("End of Childcare Flow");

  }
}
