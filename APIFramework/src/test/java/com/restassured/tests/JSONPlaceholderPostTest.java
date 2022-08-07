package com.restassured.tests;

import org.testng.annotations.Test;

import com.restassured.enums.ConfigProperties;
import com.restassured.factory.SimulateDataFactory;
import com.restassured.pojo.JSONPlaceholderPost;
import com.restassured.util.APIUtils;
import com.restassured.util.PropertyUtils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class JSONPlaceholderPostTest {

	@Test
	public void postTest() {

		JSONPlaceholderPost post = new JSONPlaceholderPost();

		post
			.setUserId(SimulateDataFactory.createID(1, 100))
			.setTitle(SimulateDataFactory.createSentence(8))
			.setBody(SimulateDataFactory.createSentence(16));

		Response response = APIUtils.buildRequestForGetCalls()
				.header("Content-Type", ContentType.JSON).log().all()
				.body(post)
				.post(PropertyUtils.getValue(ConfigProperties.POST));

		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
		Assert.assertEquals(response.jsonPath().getString("id"), "101");
		Assert.assertEquals(response.jsonPath().getString("userId"), Integer.toString(post.getUserId()));
		Assert.assertEquals(response.jsonPath().getString("title"), post.getTitle());
		Assert.assertEquals(response.jsonPath().getString("body"), post.getBody());

	}

}
