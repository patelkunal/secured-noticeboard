package org.coderearth.noticeboard.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.coderearth.noticeboard.pojo.Notice;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryNoticesHolder {

	private Collection<Notice> noticeCollection;

	public InMemoryNoticesHolder() {
		this.noticeCollection = new ArrayList<>();
	}

	public void put(Notice aNotice) {
		this.noticeCollection.add(aNotice);
	}

	public Notice get(final String aTitle) {
		return noticeCollection
				.parallelStream()
				.filter(aNotice -> aNotice.getTitle().equals(aTitle))
				.findFirst()
				.get();
	}

}
