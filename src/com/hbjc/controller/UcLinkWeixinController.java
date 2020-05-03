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
import com.hbjc.domain.UcLinkWeixin;
import com.hbjc.domain.page.UcLinkWeixinPage;
import com.hbjc.service.UcLinkWeixinService;


@Controller
@RequestMapping(value = "uc_link_weixin")
public class UcLinkWeixinController extends BaseController {

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private UcLinkWeixinService ucLinkWeixinService;

	@RequestMapping(value = "/addUcLinkWeixin", method = RequestMethod.POST)
	public String addUcLinkWeixin(Model model, UcLinkWeixin ucLinkWeixinc) {
		ucLinkWeixinService.addUcLinkWeixin(ucLinkWeixinc);
		return "/uclinkweixin/success";
	}

	@RequestMapping(value = "/{linkweixinId}/delete", method = RequestMethod.DELETE)
	public String deleteUcLinkWeixin(Model model, @PathVariable Long linkweixinId) {
		ucLinkWeixinService.deleteUcLinkWeixin(linkweixinId);
		return "/uclinkweixin/success";
	}

	@RequestMapping(value = "updateUcLinkWeixin", method = RequestMethod.POST)
	public String updateUcLinkWeixin(Model model, UcLinkWeixin ucLinkWeixin) {
		ucLinkWeixinService.updateUcLinkWeixin(ucLinkWeixin);
		return "/uclinkweixin/success";
	}

	@RequestMapping(value = "/{linkweixinId}/get", method = RequestMethod.GET)
	public String getUcLinkWeixinById(@PathVariable Long linkweixinId, Model model) {
		UcLinkWeixin ucLinkWeixin = ucLinkWeixinService.getUcLinkWeixin(linkweixinId);
		model.addAttribute("uclinkweixin", ucLinkWeixin);
		return "/uclinkweixin/detail";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String listUcLinkWeixin(Model model) {
		List<UcLinkWeixin> ucLinkWeixins = ucLinkWeixinService.listlinkweixins();
		model.addAttribute("list", ucLinkWeixins);
		return "/uclinkweixin/list";
	}

	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public String getPageUcLinkWexin(Model model, @RequestBody UcLinkWeixinPage ucLinkWeixinPage) throws Exception {
		PageInfo<UcLinkWeixin> pageInfo = ucLinkWeixinService.pageUcLinkWeixin(ucLinkWeixinPage);
		model.addAttribute("page", pageInfo);
		return "/uclinkweixin/page";
	}

}
