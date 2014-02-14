package com.github.jrecipes.validation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.validator.routines.EmailValidator;

public class ValidPasswordImpl implements ConstraintValidator<ValidPassword, String> {

	private String password2;

	@Override
	public void initialize(ValidPassword constraintAnnotation) {
		password2 = constraintAnnotation.password2();

	}

	@Override
	public boolean isValid(String password, ConstraintValidatorContext context) {
		if(email.length() < min) {
			return false;
		}
		
		if(!EmailValidator.getInstance(false).isValid(email)){
			return false;
		}
		
		return true;
	}


}
