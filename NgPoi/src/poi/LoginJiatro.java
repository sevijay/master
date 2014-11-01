package poi;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginJiatro {

	public static void main(String args[]) throws IOException {

		// Start the reporting
		new ExcelReporter("Jiatro");

		// Launch the browser
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Dell\\workspace\\NgPoi\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		// Object reference for wm
		WrapperMethods wM = new WrapperMethods(driver);
		wM.invokeApp("http://test.jiatro.com/mhs");
		wM.setValueByName("txtUsername", "vijay");
		wM.setValueByName("txtPassword", "vijay");
		driver.quit();

		// Write the stream to excel
		ExcelReporter.flushWorkbook();

	}

}
