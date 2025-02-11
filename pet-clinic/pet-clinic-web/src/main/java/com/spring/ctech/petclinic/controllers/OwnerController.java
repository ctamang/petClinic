package com.spring.ctech.petclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ctech.petclinic.service.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

	@Autowired
	private OwnerService ownerService;


	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
}
