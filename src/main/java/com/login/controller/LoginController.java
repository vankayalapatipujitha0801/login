package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.model.Login;
import com.login.repository.LoginRepo;

@Controller
public class LoginController {
	
	@Autowired
	private LoginRepo repo;
	@RequestMapping("/login")
	public String formpage()
	{
		return "login";
	}
	
	@RequestMapping("/submit-form")
	public String saveuser(Login login)
	{
		Login s = repo.save(login);
		
		if(s!= null)
		{
			return "success";
		}
		else
		{
			return "unsuccess";
		}
	}

}
