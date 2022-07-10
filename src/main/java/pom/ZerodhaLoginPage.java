package pom;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {

	@FindBy (xpath = "//input[@id='userid']") private WebElement userId;
	@FindBy (xpath = "//input[@id='password']") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement login;
	@FindBy	(xpath = "//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy (xpath = "//a[text()=\"Don't have an account? Signup now!\"] ") private WebElement signUp;
	@FindBy (xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement submit;
	@FindBy (xpath = "//img[@alt='Kite']") private WebElement logo;

	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserId(String user) {
		userId.sendKeys(user);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void clickOnForgotLink() {
		forgot.click();
	}
	
	public void clickOnSignUp() {
		signUp.click();
	}
	
	public void enterPin(String pinNumber, WebDriver driver) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(2000));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinNumber);
		
		//will check the visibility of element every 500 millisec
	
	}
	
	public void clickOnContinue() {
		submit.click();
	}
	
	public boolean isImageDisplayed() {
		return logo.isDisplayed();	
	}
	
}
