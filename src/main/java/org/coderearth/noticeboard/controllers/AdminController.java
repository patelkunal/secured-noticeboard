package org.coderearth.noticeboard.controllers;

import java.util.List;

import org.coderearth.noticeboard.pojo.Notice;
import org.coderearth.noticeboard.services.NoticesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	@Autowired
	private NoticesServiceImpl noticesService;

	public AdminController() {
		System.out.println("Creating AdminController !!");
	}
	
	@RequestMapping(value = "/admin/notices", method = RequestMethod.GET) 
	public @ResponseBody List<Notice> getAllNotices() {
		return noticesService.get();
	}
	
	@RequestMapping(value = "/admin/notice", method = RequestMethod.POST)
	public void postNotice() {
		System.out.println("Admin is posting a notice !!");
	}

}
