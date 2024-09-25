package org.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest extends BaseClass {
	
	WebDriver driver;
	TakesScreenshot ts;
	
	@Parameters("browser")	
	@BeforeTest
	private void tc(String browserName) {
	if (browserName.equals("chromebrowser")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if (browserName.equals("firefoxbrowser")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
}
	}
@Test
public void tc1() throws InterruptedException {
	driver.get("https://scentarts.ae/");
	driver.manage().window().maximize();
	 driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).click();
	 Thread.sleep(3000);
	 WebElement area = driver.findElement(By.xpath("//h2[text()='AREAS OF SCENTING']"));
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(true)", area);
    driver.findElement(By.xpath("//a[text()='Hotels']")).click();
	 driver.findElement(By.xpath("//a[text()='Offices']")).click();
	 driver.findElement(By.xpath("//a[text()='Airports Lounges']")).click();
	 Thread.sleep(3000);
	}
@Parameters("browser")
@AfterTest
private void tc2(String browserName) throws IOException {
	if (browserName.equals("chromebrowser")) {
		 ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File ("C:\\Users\\jana\\eclipse-workspace\\CucumProject1\\Screenshots\\chrome.png");
		FileUtils.copyFile(image, f);
		driver.quit();
	}
	else if (browserName.equals("firefoxbrowser")) {
		 ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File ("C:\\Users\\jana\\eclipse-workspace\\CucumProject1\\Screenshots\\firefox.png");
		FileUtils.copyFile(image, f);
		driver.quit();
	}
	else {
		 ts = (TakesScreenshot) driver;		
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File ("C:\\Users\\jana\\eclipse-workspace\\CucumProject1\\Screenshots\\edge.png");
		FileUtils.copyFile(image, f);
	    driver.quit();
}





}

}