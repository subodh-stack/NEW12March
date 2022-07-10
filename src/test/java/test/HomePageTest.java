package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.ZerodhaHomePage;
import pom.ZerodhaLoginPage;
import utility.BaseClass;
import utility.Excel;

@Listeners(utility.Listeners.class)
public class HomePageTest extends BaseClass {
	
	
	
	@BeforeMethod
	public void OpenBrowserAndLoginToZerodha() throws EncryptedDocumentException, IOException {
		driver =Browser.chromeBrowser();
		
	
	}
	
	@Test(timeOut = 1000)
	public void buyFromWatchListTest() throws InterruptedException {
//		ZerodhaHomePage zerodhaHomePage = new ZerodhaHomePage(driver);
//		zerodhaHomePage.selectShareFromWatchListAndBuy("RELIANCE", driver);
		Thread.sleep(2000);
		
		
	}
	
	@Test(timeOut = 2000)
	public void test() throws InterruptedException {
		Thread.sleep(4000);
	}
}
