package com.restassured.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.response.Response;

public final class APIUtils {

	private APIUtils() {
	}

	public static String readJsonAndGetAsString(String filepath) throws IOException {

		return new String(Files.readAllBytes(Paths.get(filepath)));

	}

	public static void storeStringAsJsonFile(String filepath, Response response) throws IOException {
		Files.write(Paths.get(filepath), response.asByteArray());
	}

}
