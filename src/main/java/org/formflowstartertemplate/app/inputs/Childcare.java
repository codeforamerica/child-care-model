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

    @NotBlank()
    private String dateofBirthDay;

    @NotBlank()
    private String dateofBirthMonth;

    @NotBlank()
    private String dateofBirthYear;
}
