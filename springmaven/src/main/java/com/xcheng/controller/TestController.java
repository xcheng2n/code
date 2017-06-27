/**
 * Copyright(c) 2013 版权所有：广州远程教育中心 www.969300.com
 */
package com.xcheng.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能说明：
 * 
 * @author 王城
 * @Date 2017年5月21日
 * @version 1.0
 *
 */
@Controller
public class TestController {

	@RequestMapping(value = "index.do")
	public void index_jsp(Model model, @DateTimeFormat String d) {
		// model.addAttribute("str0121",
		// "Hellow
		// world");
		System.out.println("index.jsp");
	}

}
