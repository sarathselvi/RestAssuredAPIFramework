package com.restassured.constants;

public class FrameworkConstants {

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String TESTDATASHEETPATH = RESOURCEPATH + "/TestData/PostApiTestData.xlsx";
	public static String getTestdatasheetpath() {
		return TESTDATASHEETPATH;
	}

}
