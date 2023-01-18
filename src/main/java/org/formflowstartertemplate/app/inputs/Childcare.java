package org.formflowstartertemplate.app.inputs;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
@Data
public class Childcare {

    private String _csrf;
    @NotBlank()

    private String firstTimeApplying;

    @NotBlank()
    private String firstName;

    @NotBlank()
    private String lastName;

    private String middleName;

    private String hasChildren;

    @NotBlank()
    private String dateofBirthDay;

    @NotBlank()
    private String dateofBirthMonth;

    @NotBlank()
    private String dateofBirthYear;
    @NotBlank()
    private String childFirstName;

    private String childMiddleName;

    @NotBlank()
    private String childLastName;

    @NotBlank()
    private String childDateofBirthDay;

    @NotBlank()
    private String childDateofBirthMonth;

    @NotBlank()
    private String childDateofBirthYear;

    @NotBlank()
    private String childInFosterCare;

    @NotBlank()
    private String childRelationship;

    @NotBlank()
    private String childHasDisability;


    @PositiveOrZero()
    private String numChildrenNotNeedingCare;

    @NotBlank()
    private String childrenNotNeedingCare;

    @NotBlank()
    private String receiveCashAssistance;

    @NotBlank()
    private String currentLivingSituation;

    @NotBlank()
    private String experiencingDomesticViolence;

    @NotBlank()
    private String impactedByEmergency;

    @NotBlank()
    private String childrenUnderCourtSupervision;

    @NotBlank()
    private String currentlyWorking;

    @NotBlank()
    private String searchingForEmployment;

    @NotBlank()
    private String freelanceJob;

    @PositiveOrZero()
    private String incomeLast30Days;

    @NotBlank()
    private String employerName;

    @NotBlank()
    private String lessMoneyNextMonth;

    private String anythingElseAboutJob;

    @NotBlank()
    private String attestToCorrectInfo;

    @NotBlank()
    private String digitalSignature;

}
