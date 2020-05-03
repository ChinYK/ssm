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
import com.hbjc.domain.UcLink;
import com.hbjc.domain.page.UcLinkPage;
import com.hbjc.service.UcLinkService;

@Controller
@RequestMapping(value = "uc_link")
public class UcLinkController extends BaseController {

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private UcLinkService ucLinkService;

	@RequestMapping(value = "/addUcLink", method = RequestMethod.POST)
	public String addUclink(Model model, UcLink ucLink) {
		ucLinkService.addUcLink(ucLink);
		return "/uclink/success";
	}

	@RequestMapping(value = "/{linkId}/delete", method = RequestMethod.DELETE)
	public String deleteUcLink(Model model, @PathVariable Long linkId) {
		ucLinkService.deleteUcLink(linkId);
		return "/uclink/success";
	}

	@RequestMapping(value = "updateuclink", method = RequestMethod.POST)
	public String updateUcLink(Model model, UcLink ucLink) {
		ucLinkService.updateUcLink(ucLink);
		return "/uclink/success";
	}

	@RequestMapping(value = "/{linkId}/get", method = RequestMethod.GET)
	public String getUcLinkById(@PathVariable Long linkId, Model model) {
		UcLink ucLink = ucLinkService.getUcLink(linkId);
		model.addAttribute("uclink", ucLink);
		return "/uclink/detail";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String listUcLink(Model model) {
		List<UcLink> ucLinks = ucLinkService.listlinks();
		model.addAttribute("list", ucLinks);
		return "/uclink/list";
	}

	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public String getPageUcLink(Model model, @RequestBody UcLinkPage ucLinkPage) throws Exception {
		PageInfo<UcLink> pageInfo = ucLinkService.pageUcLink(ucLinkPage);
		model.addAttribute("page", pageInfo);
		return "/uclink/page";
	}

}
