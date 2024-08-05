package com.fitfeo.genric;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

	public class Baseclass {
		public static WebDriver driver;
		@BeforeTest
		public void openBrowser() throws IOException {
			Reporter.log("openBrowser", true);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://www.fitpeo.com/");
		}
			@AfterTest()
			public void closeBrowser() {
				Reporter.log("closeBrowser", true);
				driver.quit();
		}
}