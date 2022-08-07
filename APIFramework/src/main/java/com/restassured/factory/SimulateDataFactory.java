package com.restassured.factory;

import com.github.javafaker.Faker;

public class SimulateDataFactory {

	static Faker fakeData;

	public static String createSentence(int wordCount) {
		fakeData = new Faker();

		return fakeData.lorem().sentence(wordCount);
	}

	public static int createID(int min, int max) {
		fakeData = new Faker();

		return fakeData.number().numberBetween(min, max);

	}

}
