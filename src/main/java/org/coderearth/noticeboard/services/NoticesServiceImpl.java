package org.coderearth.noticeboard.services;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.coderearth.noticeboard.dao.InMemoryNoticesHolder;
import org.coderearth.noticeboard.pojo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticesServiceImpl {

	@Autowired
	private InMemoryNoticesHolder noticesHolder;
	
	public NoticesServiceImpl() {
		System.out.println("Creating NoticeService !!");
	}
	
	public Notice get(final String aTitle) {
		return noticesHolder.get(aTitle);
	}
	
	public List<Notice> get() {
		return Arrays.asList(new Notice().setTitle("notice1").setContent("content for notice 1"), new Notice().setTitle("notice2").setContent("content for notice 2"));
	}
	
	@PostConstruct
	private void loadInitialNotices() {
		System.out.println("Started loading notices !!");
		noticesHolder.put(new Notice().setTitle("notice1").setContent("content for notice 1"));
		noticesHolder.put(new Notice().setTitle("notice2").setContent("content for notice 2"));
		noticesHolder.put(new Notice().setTitle("notice3").setContent("content for notice 3"));
		noticesHolder.put(new Notice().setTitle("notice4").setContent("content for notice 4"));
		System.out.println("Finished loading notices !!");
	}
	
}
