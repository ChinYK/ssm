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

import com.github.pagehelper.PageInfo;
import com.hbjc.domain.UcLinkWxManager;
import com.hbjc.domain.page.UcLinkWxManagerPage;
import com.hbjc.service.UcLinkWxManagerService;


@Controller
@RequestMapping(value = "uc_link_wx_manager")
public class UcLinkWxManagerController extends BaseController {

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private UcLinkWxManagerService ucLinkWxManagerService;

	@RequestMapping(value = "/addUclinkwxmanager", method = RequestMethod.POST)
	public String addUcLinkwxmanager(Model model, UcLinkWxManager ucLinkWxManager) {
		ucLinkWxManagerService.addUcLinkWxManager(ucLinkWxManager);
		return "/uclinkwxmanager/success";
	}

	@RequestMapping(value = "/{linkwxManagerId}/delete", method = RequestMethod.DELETE)
	public String deleteUclinkwxmanager(Model model, @PathVariable Long linkwxManagerId) {
		ucLinkWxManagerService.deleteUcLinkWxManager(linkwxManagerId);
		return "/uclinkwxmanager/success";
	}

	@RequestMapping(value = "updateUclinkwxManager", method = RequestMethod.POST)
	public String updateUclinkwxmanager(Model model, UcLinkWxManager ucLinkWxManagerc) {
		ucLinkWxManagerService.updateUcLinkWxManager(ucLinkWxManagerc);
		return "/uclinkwxmanager/success";
	}

	@RequestMapping(value = "/{linkwxManagerId}/get", method = RequestMethod.GET)
	public String getUclinkwxmanagerById(@PathVariable Long linkwxManagerId, Model model) {
		UcLinkWxManager ucLinkWxManager = ucLinkWxManagerService.getUcLinkWxManager(linkwxManagerId);
		model.addAttribute("uclinkwxmanager", ucLinkWxManager);
		return "/uclinkwxmanager/detail";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String listUclinkwxmanager(Model model) {
		List<UcLinkWxManager> ucLinkWxManagers = ucLinkWxManagerService.listlinkwxManager();
		model.addAttribute("list", ucLinkWxManagers);
		return "/uclinkwxmanager/list";
	}

	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public String getPageUclinkwxmanager(Model model, @RequestBody UcLinkWxManagerPage ucLinkWxManagerPage) throws Exception {
		PageInfo<UcLinkWxManager> pageInfo = ucLinkWxManagerService.pageUcLinkWxManager(ucLinkWxManagerPage);
		model.addAttribute("page", pageInfo);
		return "/uclinkwxmanager/page";
	}

}
