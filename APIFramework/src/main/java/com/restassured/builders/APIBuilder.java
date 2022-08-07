package com.restassured.builders;
import static io.restassured.RestAssured.given;

import com.restassured.enums.ConfigProperties;
import com.restassured.util.PropertyUtils;

import io.restassured.specification.RequestSpecification;

public final class APIBuilder {

	private APIBuilder() {

	}

	
	public static RequestSpecification buildRequestForGetCalls() {
		
		return given().baseUri(PropertyUtils.getValue(ConfigProperties.BASEURI));
		
	}
}
