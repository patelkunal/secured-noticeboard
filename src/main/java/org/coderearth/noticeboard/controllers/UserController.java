package org.coderearth.noticeboard.controllers;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.coderearth.noticeboard.pojo.Notice;
import org.coderearth.noticeboard.services.NoticesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private NoticesServiceImpl noticesService;

	public UserController() {
		System.out.println("Creating UserController !!!");
	}

	@RequestMapping(value = "/user/notice", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, String> getNotice() {
		final String aTitle = "notice1";
		HashMap<String, String> map = new HashMap<>();
		Notice notice = noticesService.get(aTitle);
		map.put("title", notice.getTitle());
		map.put("content", notice.getContent());
		return map;
	}

	@PostConstruct
	public void confirmServiceStatus() {
		Assert.notNull(noticesService, "Backend Notice Service is not ready yet !!");
	}

}
