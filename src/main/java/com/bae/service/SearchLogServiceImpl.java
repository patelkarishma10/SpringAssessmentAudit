package com.bae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.entity.SearchLog;
import com.bae.repository.SearchLogRepository;

@Service
public class SearchLogServiceImpl implements SearchLogService {

	private SearchLogRepository repository;

	@Autowired
	public SearchLogServiceImpl(SearchLogRepository repository) {

		this.repository = repository;
	}

	@Override
	public Collection<SearchLog> getAllLogs() {
		Collection<SearchLog> newList = repository.findAll();
		return newList;
	}

}
