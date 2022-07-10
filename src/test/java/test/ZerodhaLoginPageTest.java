package test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Excel;

public class ZerodhaLoginPageTest {
WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
	driver =Browser.chromeBrowser();
	}
	
	@Test
	public void loginTest(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userId =Excel.getData("Credentials", 0, 1);
		String pass = Excel.getData("Credentials", 1, 1);
		String pin = Excel.getData("Credentials", 2, 1);
		boolean status =zerodhaLoginPage.isImageDisplayed();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertFalse(status);
		zerodhaLoginPage.enterUserId(userId);
		zerodhaLoginPage.enterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
		zerodhaLoginPage.enterPin(pin,driver);
		zerodhaLoginPage.clickOnContinue();
		softAssert.assertAll();
	
		
	}
	
	
	
}
