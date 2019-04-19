package com.fighting.spirit.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SampleController {
	
	@PostMapping("sample")
	public String sample() {
		return "sample";
	}

}
