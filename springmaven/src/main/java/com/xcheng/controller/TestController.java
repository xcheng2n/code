/**
 * Copyright(c) 2013 ��Ȩ���У�����Զ�̽������� www.969300.com
 */
package com.xcheng.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ����˵����
 * 
 * @author ����
 * @Date 2017��5��21��
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
