package com.github.jrecipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jrecipes.models.Recipe;

@Controller
public class InsertRecipeController {

	/**
	 * @return this page return the page with a dynamic form to insert a recipe. 
	 */
	@RequestMapping("/insertNewRecipe")
	public String showPage(Model model){
		
		model.addAttribute("recipe", new Recipe());
		return "insertNewRecipe";
	}
}
