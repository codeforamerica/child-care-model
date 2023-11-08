package org.formflowstartertemplate.app.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NullOrPositiveValidator implements ConstraintValidator<NullOrPositiveValidation, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.isEmpty() || Integer.parseInt(s) > 0;
    }
}
