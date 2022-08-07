package com.restassured.constants;

public class FrameworkConstants {

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String TESTDATASHEETPATH = RESOURCEPATH + "/TestData/PostApiTestData.xlsx";
	private static final String CONFIGFILEPATH = RESOURCEPATH + "/Configuration/config.properties";
	
	public static String getTestdatasheetpath() {
		return TESTDATASHEETPATH;
	}

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

}
