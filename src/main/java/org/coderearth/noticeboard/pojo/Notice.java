package org.coderearth.noticeboard.pojo;

public class Notice {

	private String title;
	private String content;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}

	public Notice(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public Notice setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getContent() {
		return content;
	}

	public Notice setContent(String content) {
		this.content = content;
		return this;
	}

}
