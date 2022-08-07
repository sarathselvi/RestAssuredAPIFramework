package com.restassured.constants;

public class FrameworkConstants {

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String TESTDATASHEETPATH = RESOURCEPATH + "/TestData/PostApiTestData.xlsx";
	private static final String CONFIGFILEPATH = RESOURCEPATH + "/Configuration/config.properties";
	private static final String OUTPUTJSON = System.getProperty("user.dir")+"/json-output/reponse.json";
	private static final String EXTENTREPORTPATH = System.getProperty("user.dir")
			+ "/extent-test-output/swagLabsExtentReport.html";
	
	public static String getTestdatasheetpath() {
		return TESTDATASHEETPATH;
	}

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

	public static String getOutputjson() {
		return OUTPUTJSON;
	}

	public static String getExtentreportpath() {
		return EXTENTREPORTPATH;
	}

}
