package com.hw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
		
	@RequestMapping("/productlist.do")
	public String main(Model m) {
		//View�� ������ Model�� ���� �� ����
		m.addAttribute("center", "product/list");
		return "main";
	}
	
	@RequestMapping("/productadd.do")
	public String main2(Model m) {
		//View�� ������ Model�� ���� �� ����
		m.addAttribute("center", "product/add");
		return "main";
	}
	
}