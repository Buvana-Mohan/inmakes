package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Project1 extends BaseClass{
	//WebDriver driver;
	@Given("User need to open the chrome browser")
	public void user_need_to_open_the_chrome_browser() {
		launchBrowser();
		windowMaximize();
	}
	@When("Navigate to the given website")
	public void navigate_to_the_given_website() {
		launchUrl("https://scentarts.ae/");
		String title = pageTitle();
		Assert.assertTrue("Check your page title", title.contains("Scent"));

	}

	@When("To click the contact us button and scroll down and fill form fields empty")
	public void to_click_the_contact_us_button_and_scroll_down_and_fill_form_fields_empty() {
		 WebElement area = driver.findElement(By.xpath("//h2[text()='AREAS OF SCENTING']"));
		 String text = area.getText();
		 System.out.println("Text:"+text);
		 scrollThePage(area);
		 Assert.assertTrue("Check your page", text.contains("AREAS OF SCENTING"));
	}
	
	@When("To click the about us button")
	public void to_click_the_about_us_button() {
	    driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).click();
	}

	@When("To scroll down to the bottom of the page to find areas of scenting")
	public void to_scroll_down_to_the_bottom_of_the_page_to_find_areas_of_scenting() throws InterruptedException {
	Thread.sleep(30000);
		 WebElement area = driver.findElement(By.xpath("//h2[text()='AREAS OF SCENTING']"));
		 String text = area.getText();
		 System.out.println("Text:"+text);
		 scrollThePage(area);
		 Assert.assertTrue("Check your page", text.contains("AREAS OF SCENTING"));
	}
	@When("click hotel,offices,airports button and Verify the description")
	public void click_hotel_offices_airports_button_and_Verify_the_description() {
		 driver.findElement(By.xpath("//a[text()='Hotels']")).click();
		 driver.findElement(By.xpath("//a[text()='Offices']")).click();
		 driver.findElement(By.xpath("//a[text()='Airports Lounges']")).click();
	}
	@When("Take screenshot to verify the description")
	public void take_screenshot_to_verify_the_description() throws IOException {
		screenShot("pic1.png");
		
	}
	@When("To click the Our Services button")
	public void to_click_the_Our_Services_button() {
		 driver.findElement(By.xpath("(//a[text()='Our Services'])[1]")).click();
		 String title1 = pageTitle();
		 Assert.assertTrue("Check your page", title1.contains("Services"));
		 }

	@When("To scroll down to the bottom of the page to find Contact us button and click")
	public void to_scroll_down_to_the_bottom_of_the_page_to_find_Contact_us_button_and_click() {
		 WebElement contact = driver.findElement(By.xpath("(//span[text()='Contact Us'])[1]"));
		 scrollThePage(contact);
		 contact.click();
	}

	@When("Take screenshot to verify the contact us page")
	public void take_screenshot_to_verify_the_contact_us_page() throws IOException, InterruptedException {
		Thread.sleep(3000);
		screenShot("pic2.png");
	}

	@When("Verify the page is contact us")
	public void verify_the_page_is_contact_us() {
	   String pageUrl = pageUrl();
	   Assert.assertTrue("Check your page", pageUrl.contains("contact"));
	}


	@Then("Close the chrome browser after completion")
	public void close_the_chrome_browser_after_completion() {
	   closeEntireBrowser();
	}


}
