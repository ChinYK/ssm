package com.hbjc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.druid.filter.AutoLoad;
import com.github.pagehelper.PageInfo;
import com.hbjc.domain.UcUsers;
import com.hbjc.domain.page.UcUsersPage;
import com.hbjc.service.UcUserSerivce;

import oracle.net.aso.h;

@Controller
@RequestMapping(value = "uc_users")
public class UcUserController extends BaseController {

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private UcUserSerivce ucUserService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(Model model, UcUsers ucUsers) {
		ucUserService.addUcUser(ucUsers);
		return "user/success";
	}

	@RequestMapping(value = "/{userId}/delete", method = RequestMethod.DELETE)
	public String deleteUser(Model model, @PathVariable Long userId) {
		ucUserService.deleteUcUser(userId);
		return "/user/success";
	}

	@RequestMapping(value = "updateUser", method = RequestMethod.POST)
	public String updateUser(Model model, UcUsers ucUsers) {
		ucUserService.updateUcUser(ucUsers);
		return "/user/success";
	}

	@RequestMapping(value = "/{userId}/get", method = RequestMethod.GET)
	public String getUserById(@PathVariable Long userId, Model model) {
		UcUsers ucUsers = ucUserService.getUcUsers(userId);
		model.addAttribute("user", ucUsers);
		return "user/detail";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String listUser(Model model) {
		List<UcUsers> uisList = ucUserService.listUsers();
		model.addAttribute("list", uisList);
		return "/user/list";
	}

	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public String getPageUser(Model model, @RequestBody UcUsersPage ucUsersPage) throws Exception {
		PageInfo<UcUsers> pageInfo = ucUserService.pageUcUser(ucUsersPage);
		model.addAttribute("page", pageInfo);
		return "/user/page";
	}

}
