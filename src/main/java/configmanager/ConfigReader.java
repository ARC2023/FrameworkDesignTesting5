package configmanager;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;

	public Properties loadPropertyFile() {
		prop= new Properties();
		try {
			FileInputStream fileIn = new FileInputStream(
					"C:\\Users\\glend\\eclipse-workspace\\CucumberFrameworkTesting5\\src\\main\\resources\\configuration\\config.properties");
			prop.load(fileIn);
			System.out.println("Properties File Loaded");
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop;

	}

}
