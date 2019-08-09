package com.bae.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.entity.SearchLog;
import com.bae.repository.SearchLogRepository;

@Component
public class SearchLogReceiver {

	private SearchLogRepository repository;

	@Autowired
	public SearchLogReceiver(SearchLogRepository repository) {

		this.repository = repository;
	}

	@JmsListener(destination = "UserQueue", containerFactory = "myFactory")
	public void receiveMessage(SearchLog searchLog) {
		repository.save(searchLog);
	}
}
