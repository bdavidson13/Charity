package com.UnderTheSettingSun.Vincent.Controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.faux.Models.*;
import com.faux.Service.*;
import com.UnderTheSettingSun.Vincent.Models.UserModel;

@Controller
public class AccountsController {

	@RequestMapping(value = "/CreateUser", method = RequestMethod.GET)
	public String Index(Locale locale, Model model) {
		model.addAttribute("userForm", new UserModel());
		return "Accounts/CreateUser";
	}
	@RequestMapping(value = "/CreateUser", method = RequestMethod.POST)
	public String saveOrUpdateUser(@ModelAttribute("userForm") UserModel userForm) {

		createUser(userForm);
			return "redirect:/";

		}
	private boolean createUser(UserModel model){
		UserService service = new UserService();
		User user = new User(
				model.getFirstName(),
				model.getLastName(),
				model.getEmail(),
				model.getUserName(),
				model.getPassword()
				);
		service.SaveUser(user);
		return true;
	}
}
