package com.fitfeo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fitfeo.genric.Baseclass;

public class Homepage extends Baseclass {

	@FindBy(xpath = "(//div[text()='Revenue Calculator']")
	private WebElement Revenuecalculatoroption;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRevenuecalculator() {
		return Revenuecalculatoroption;
		
	}
}
