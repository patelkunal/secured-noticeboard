package org.coderearth.noticeboard.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	public DummyController() {
		System.out.println("Creating DummyController !!");
	}

	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public @ResponseBody String greet() {
		return "greeting secured hello\n";
	}
}
