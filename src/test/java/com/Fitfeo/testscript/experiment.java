package com.Fitfeo.testscript;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class experiment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fitpeo.com/");
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Mep = driver.findElement(By.xpath("//h4[text()='Medicare Eligible Patients']"));
		js.executeScript("arguments[0].scrollIntoView();", Mep);
		WebElement slider = driver.findElement(By.xpath("//input[@type=\"range\"]"));
		for (int i = 0; i < 620; i++) {
			slider.sendKeys(Keys.ARROW_RIGHT);
		}
		Thread.sleep(3000);
		WebElement numberInputField = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		numberInputField.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		Thread.sleep(2000);
		numberInputField.sendKeys("560");
		Thread.sleep(2000);
		WebElement toscroll = driver.findElement(By.xpath("//p[text()='CPT-99454']"));
		js.executeScript("arguments[0].scrollIntoView();", toscroll);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);
	}
}
