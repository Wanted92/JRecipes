package com.github.jrecipes.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.jrecipes.models.User;
import com.github.jrecipes.services.SigninService;

@Controller
public class SigninController {
	
	private SigninService signinService;

	/**
	 * Method mapper to the form of sign in.
	 * @param model linked to form.
	 * @return the page of signin
	 */
	@RequestMapping("/signin")
	public String showPage(Model model){
		model.addAttribute("user", new User());
		
		return "signin";
	}
	
	/**
	 * Method handler of sign in processing. It manage the validation.
	 * @param model linked to form.
	 * @param user user to set to save in database.
	 * @param result that contains eventual errors.
	 * @return
	 */
	@RequestMapping(value="/doNewUser", method=RequestMethod.POST)
	public String doNewUser(Model model, @Valid User user, BindingResult result) {
		
		signinService.create(user);
		if(!result.hasErrors()){
			return "userInsert";
		}else{
			return "userNotInsert";
		}
	}

	/**Method to set the service
	 * @param signinService the signinService to set
	 */
	@Autowired
	public void setSigninService(SigninService signinService) {
		this.signinService = signinService;
	}
}
