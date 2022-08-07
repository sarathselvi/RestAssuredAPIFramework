package com.restassured.tests;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.restassured.reports.ExtentReport;

public class BaseTest {

	@BeforeSuite
	public void beforeSuite() {
		ExtentReport.initReports();
	}

	@AfterSuite
	public void afterSuite() throws IOException {

		ExtentReport.flushReports();

	}

}
