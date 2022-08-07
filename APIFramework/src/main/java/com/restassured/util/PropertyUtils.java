package com.restassured.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.restassured.constants.FrameworkConstants;
import com.restassured.enums.ConfigProperties;
import com.restassured.exceptions.PropertyFileUsageException;


public class PropertyUtils {

	private PropertyUtils() {

	}

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();

	static {
		try {
			FileInputStream file = new FileInputStream(FrameworkConstants.getConfigfilepath());
			property.load(file);

			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);

		}
	}

	public static String getValue(ConfigProperties key) {

		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
			throw new PropertyFileUsageException(
					"Property name " + key + " is not found. Please check config.properties");

		}

		return CONFIGMAP.get(key.name().toLowerCase());
	}

}
