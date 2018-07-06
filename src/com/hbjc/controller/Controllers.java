
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
@RequestMapping(value="/regist")
public class Controllers extends BaseController{
	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	private UsersService service;

	@RequestMapping(value="/addUsers",method=RequestMethod.GET)
	public ModelAndView  save(Model model,Users users){
		try{
			service.saveUsers(users);
		}catch (Exception e) {
			return error();
		}
		return success();
	}

	@RequestMapping(value="/regist",method=RequestMethod.GET)
	public ModelAndView  regist(Model model){
		ModelAndView mv = new ModelAndView("/user/regist");
		return mv;
	}

}
