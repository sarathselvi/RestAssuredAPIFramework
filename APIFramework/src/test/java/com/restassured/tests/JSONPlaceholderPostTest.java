package com.restassured.tests;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.restassured.builders.APIBuilder;
import com.restassured.constants.FrameworkConstants;
import com.restassured.enums.ConfigProperties;
import com.restassured.factory.SimulateDataFactory;
import com.restassured.pojo.JSONPlaceholderPost;
import com.restassured.util.APIUtils;
import com.restassured.util.PropertyUtils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class JSONPlaceholderPostTest extends BaseTest {

	@Test
	public void postTest(ITestContext context) throws IOException {

		JSONPlaceholderPost post = new JSONPlaceholderPost();

		post.setUserId(SimulateDataFactory.createID(1, 100)).setTitle(SimulateDataFactory.createSentence(8))
				.setBody(SimulateDataFactory.createSentence(16));

		Response response = APIBuilder.buildRequestForGetCalls().header("Content-Type", ContentType.JSON).log().all()
				.body(post).post(PropertyUtils.getValue(ConfigProperties.POST));

		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
		Assert.assertEquals(response.jsonPath().getString("id"), "101");
		Assert.assertEquals(response.jsonPath().getString("userId"), Integer.toString(post.getUserId()));
		Assert.assertEquals(response.jsonPath().getString("title"), post.getTitle());
		Assert.assertEquals(response.jsonPath().getString("body"), post.getBody());
		APIUtils.storeStringAsJsonFile(FrameworkConstants.getOutputjson(), response);

		context.setAttribute("JSONResponse", response.asPrettyString());

	}

}
