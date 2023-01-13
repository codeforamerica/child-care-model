package org.formflowstartertemplate.app.inputs;

import lombok.Data;

import javax.validation.constraints.NotBlank;

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

    @NotBlank()
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

}