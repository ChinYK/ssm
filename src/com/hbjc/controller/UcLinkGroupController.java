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
import com.hbjc.domain.UcLinkGroup;
import com.hbjc.domain.page.UcLinkGroupPage;
import com.hbjc.service.UcLinkGroupService;

@Controller
@RequestMapping(value = "uc_link_group")
public class UcLinkGroupController extends BaseController {

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private UcLinkGroupService ucLinkGroupService;

	@RequestMapping(value = "/addUcLinkGroup", method = RequestMethod.POST)
	public String addUcLinkgroup(Model model, UcLinkGroup ucLinkGroup) {
		ucLinkGroupService.addUcLinkGroup(ucLinkGroup);
		return "/uclinkgroup/success";
	}

	@RequestMapping(value = "/{linkgroupId}/delete", method = RequestMethod.DELETE)
	public String deleteUclinkgroup(Model model, @PathVariable Long linkgroupId) {
		ucLinkGroupService.deleteUcLinkGroup(linkgroupId);
		return "/uclinkgroup/success";
	}

	@RequestMapping(value = "updateUcLinkGroup", method = RequestMethod.POST)
	public String updateUclinkgroup(Model model, UcLinkGroup ucLinkGroup) {
		ucLinkGroupService.updateUcLinkGroup(ucLinkGroup);
		return "/uclinkgroup/success";
	}

	@RequestMapping(value = "/{linkgroupId}/get", method = RequestMethod.GET)
	public String getUclinkgroupById(@PathVariable Long linkgroupId, Model model) {
		UcLinkGroup ucLinkGroup = ucLinkGroupService.getUcLinkGroup(linkgroupId);
		model.addAttribute("uclinkgroup", ucLinkGroup);
		return "/uclinkgroup/detail";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String listUclinkgroup(Model model) {
		List<UcLinkGroup> ucLinkGroups = ucLinkGroupService.listlinkgroups();
		model.addAttribute("list", ucLinkGroups);
		return "/uclinkgroup/list";
	}

	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public String getPageUclinkgroup(Model model, @RequestBody UcLinkGroupPage ucLinkGroupPage) throws Exception {
		PageInfo<UcLinkGroup> pageInfo = ucLinkGroupService.pageUcLinkGroup(ucLinkGroupPage);
		model.addAttribute("page", pageInfo);
		return "/uclinkgroup/page";
	}

}
