package com.geepznet.geepznet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeepzController {

	@RequestMapping("/getname")
	public String getName() {
		return "Geepz is here";
	}
}
