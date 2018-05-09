
package com.hbjc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hbjc.domain.Users;
import com.hbjc.service.UsersService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	private UsersService service;

	@RequestMapping(value="/loginIn",method=RequestMethod.POST)
	public ModelAndView  login(Model model,Users users){
		String indicator = service.checkUser(users);
		ModelAndView mv ;
        if(indicator.equals("1"))
        {
	         mv= new ModelAndView("first");
        }
        else
        {
             mv = new ModelAndView("error");
        }
		logger.info("addUsers:"+users.getUserName());
		return mv;
	}
}
