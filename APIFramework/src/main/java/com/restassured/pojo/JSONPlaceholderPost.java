package com.restassured.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class JSONPlaceholderPost {

	private int userId;
	private String title;
	private String body;



	public int getUserId() {
		return userId;
	}

	public JSONPlaceholderPost setUserId(int userId) {
		this.userId = userId;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public JSONPlaceholderPost setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getBody() {
		return body;
	}

	public JSONPlaceholderPost setBody(String body) {
		this.body = body;
		return this;
	}
	


}
