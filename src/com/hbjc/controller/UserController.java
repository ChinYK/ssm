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

    		return "/user/userInfo";
    }

    @RequestMapping(value="/userAreaAnalysis")
    public String userAreaAnalysis(HttpServletRequest req, HttpServletResponse res, ModelMap modelAndView)
    {

    	  List <UserArea> pieChartList =new ArrayList<UserArea>();
          pieChartList=service.getUserArea();
          modelAndView.addAttribute("pieChartList",pieChartList);
          String huabei = "0";
          String huadong= "0";
          String huanan = "0";
          String xibei = "0";
          String xinan = "0";
          String dongbei = "0";
          String huazhong = "0";
          for(UserArea item : pieChartList)
          {
        	  if(item.getArea().equals("华北"))
        	  {
        		  huabei = item.getCount();
        	  }
        	  if(item.getArea().equals("华东"))
        	  {
        		  huadong = item.getCount();
        	  }
        	  if(item.getArea().equals("华南"))
        	  {
        		  huanan = item.getCount();
        	  }
        	  if(item.getArea().equals("西北"))
        	  {
        		  xibei = item.getCount();
        	  }
        	  if(item.getArea().equals("西南"))
        	  {
        		  xinan = item.getCount();
        	  }
        	  if(item.getArea().equals("东北"))
        	  {
        		  dongbei = item.getCount();
        	  }
        	  if(item.getArea().equals("华中"))
        	  {
        		  huazhong = item.getCount();
        	  }
          }
          modelAndView.addAttribute("huabei", huabei);
          modelAndView.addAttribute("huadong", huadong);
          modelAndView.addAttribute("huanan", huanan);
          modelAndView.addAttribute("xibei", xibei);
          modelAndView.addAttribute("xinan", xinan);
          modelAndView.addAttribute("dongbei", dongbei);
          modelAndView.addAttribute("huazhong", huazhong);
          List<String> xzhou = new ArrayList<String>();

          return "/user/userAreaAnalysis";

    }




}
