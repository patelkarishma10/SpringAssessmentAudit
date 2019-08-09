package com.bae.entity;

public class SearchLog {

	private long userId;

	private String name;

	private int memberNumber;

	private String searchTerm;

	public SearchLog() {

	}

	public SearchLog(long userId, String name, int memberNumber, String searchTerm) {
		super();
		this.userId = userId;
		this.name = name;
		this.memberNumber = memberNumber;
		this.searchTerm = searchTerm;
	}

	public long getUserId() {
		return userId;
	}

	public void setId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchResult(String searchTerm) {
		this.searchTerm = searchTerm;
	}

}
