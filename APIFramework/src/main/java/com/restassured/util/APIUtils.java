package com.restassured.util;
import static io.restassured.RestAssured.given;

import com.restassured.enums.ConfigProperties;

import io.restassured.specification.RequestSpecification;

public final class APIUtils {

	private APIUtils() {

	}

	
	public static RequestSpecification buildRequestForGetCalls() {
		
		return given().baseUri(PropertyUtils.getValue(ConfigProperties.BASEURI));
		
	}
}
