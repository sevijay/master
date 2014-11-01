package poi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * 
 * @author vijay
 * @since 11/1/2014
 *
 */
public class WrapperMethods {

	WebDriver driver = null;

	public WrapperMethods(WebDriver driver) {
		this.driver = driver;

	}

	/*
	 * intent of this method is to launch the driver with a specific urll
	 */
	public void invokeApp(String url) {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
			ExcelReporter.reortStep("Application is launched", "PASS");
		} catch (WebDriverException e) {
			ExcelReporter.reortStep("Application is not launched", "FAIL");
		}
	}

	/*
	 * intent of this method is to enter a text to a web-element using ID
	 * locator
	 */
	public void setValueById(String id, String data) {
		try {
			driver.findElement(By.id(id)).sendKeys(data);
			ExcelReporter.reortStep("The ELement with id: " + id + "is found",
					"PASS");

		} catch (WebDriverException e) {
			ExcelReporter.reortStep("The ELement with id: " + id
					+ "is not found", "FAIL");

		}

	}

	/*
	 * intent of this method is to enter a text to a web-element using name
	 * locator
	 */
	public void setValueByName(String name, String data) {
		try {
			driver.findElement(By.name(name)).sendKeys(data);
			ExcelReporter.reortStep("The ELement with name: " + name + "is found",
					"PASS");

		} catch (WebDriverException e) {
			ExcelReporter.reortStep("The ELement with name: " + name
					+ "is not found", "FAIL");

		}

	}

}
