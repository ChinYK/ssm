package com.hbjc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hbjc.domain.Users;
import com.hbjc.service.UcUserSerivce;
import com.hbjc.service.UsersService;

@Controller
@RequestMapping(value = "/login")
public class LoginController extends BaseController{
	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	private UcUserSerivce ucUserSerivce;

	@RequestMapping(value="/loginIn",method=RequestMethod.POST)
	public ModelAndView  login(Model model,Users users){
		String indicator = ucUserSerivce.checkUser(users);
		ModelAndView mv ;
        if(indicator.equals("1"))
        {
	         return success();
        }
        else
        {
             return error();
        }
	}
	@RequestMapping(value="/logout")
	public String logout(Model model,Users users){


		return "redirect:/" ;

	}
}
