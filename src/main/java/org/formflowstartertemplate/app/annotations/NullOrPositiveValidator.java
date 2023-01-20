package org.formflowstartertemplate.app.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NullOrPositiveValidator implements ConstraintValidator<NullOrPositiveValidation, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.isEmpty() || Integer.parseInt(s) > 0;
    }
}
