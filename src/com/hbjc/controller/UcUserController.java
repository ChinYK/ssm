package com.hbjc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.druid.filter.AutoLoad;

import oracle.net.aso.h;

@Controller
@RequestMapping(value = "uc_users")
public class UcUserController extends BaseController {
	
	@Autowired
	private HttpServletRequest request;
	
	
	@RequestMapping("/list")
	public String listUser() {
		
	}
	
	

}
