package com.hbjc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hbjc.domain.Users;
import com.hbjc.domain.UserArea;
import com.hbjc.service.UsersService;
/**
 * com.hbjc.controller
 * @author wangx
 * 2018年5月17日下午3:37:54
 * @version v1.0
 */
@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UsersService service;


    @RequestMapping(value="/userInfo")
    public String UserInfo(HttpServletRequest req , HttpServletResponse res, ModelMap modelAndView){
            List<Users> users = service.getAll();
            modelAndView.addAttribute("users", users);
            List <UserArea> pieChartList =new ArrayList<UserArea>();
            pieChartList=service.getUserArea();
            modelAndView.addAttribute("pieChartList",pieChartList);
    		return "/user/userInfo";
    }

}
