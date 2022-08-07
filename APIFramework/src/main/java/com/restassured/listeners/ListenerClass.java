package com.restassured.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.restassured.reports.ExtentReport;

public class ListenerClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {

		ExtentReport.test.pass(result.getMethod().getMethodName() + " is passed");
		ExtentReport.test.log(Status.PASS, MarkupHelper.createCodeBlock(result.getTestContext()
				.getAttribute("JSONResponse").toString(),CodeLanguage.JSON));

	}

	public void onTestFailure(ITestResult result) {

		ExtentReport.test.fail(result.getMethod().getMethodName() + " is failed");
		ExtentReport.test.log(Status.FAIL, result.getThrowable().toString());

	
	}

	public void onTestSkipped(ITestResult result) {

		ExtentReport.test.skip(result.getMethod().getMethodName() + " is skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
