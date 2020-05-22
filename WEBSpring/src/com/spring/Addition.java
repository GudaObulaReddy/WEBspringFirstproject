package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Addition {

	@RequestMapping("/")
	public void display()
	{
		System.out.println("hi");
	}
}

