package com.mycompany.Tget_mini_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class Ch01Controller {
	@RequestMapping("")
	public String index() {
		log.info("index()");
		return "ch01/index";
	}

}
