package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


	@ResponseBody
	@RequestMapping(value = "test",method = RequestMethod.GET)
	public String say(){
		String a = "ffffdddf";
		return a+"aaaas";
	}

}
