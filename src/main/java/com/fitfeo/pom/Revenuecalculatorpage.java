package com.fitfeo.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fitfeo.genric.Baseclass;

public class Revenuecalculatorpage extends Baseclass {
	@FindBy(xpath = "//h4[text()='Medicare Eligible Patients']")
	private WebElement medicaleligible_patientsoption;

	@FindBy(xpath = "//input[@type=\"range\"]")
	private WebElement slideroption;

	@FindBy(xpath = "//input[@aria-invalid='false']")
	private WebElement numberinputfield;

	@FindBy(xpath = "//p[text()='CPT-99454']")
	private WebElement cptcolumn;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement checkbox1;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkbox2;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkbox3;

	public Revenuecalculatorpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMedicaleligible_patientsoption() {
		return medicaleligible_patientsoption;
	}

	public WebElement getSlideroption() {
		return slideroption;
	}

	public WebElement getNumberinputfield() {
		return numberinputfield;
	}

	public WebElement getCptcolumn() {
		return cptcolumn;
	}

	public WebElement getCheckbox1() {
		return checkbox1;
	}

	public WebElement getCheckbox2() {
		return checkbox2;
	}

	public WebElement getCheckbox3() {
		return checkbox3;
	}
}
