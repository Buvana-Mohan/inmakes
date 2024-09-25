$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Project1.feature");
formatter.feature({
  "name": "Verify the functionality of scent Arts",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the description of different areas",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User need to open the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Project1.user_need_to_open_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the given website",
  "keyword": "When "
});
formatter.match({
  "location": "Project1.navigate_to_the_given_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the about us button",
  "keyword": "And "
});
formatter.match({
  "location": "Project1.to_click_the_about_us_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To scroll down to the bottom of the page to find areas of scenting",
  "keyword": "And "
});
formatter.match({
  "location": "Project1.to_scroll_down_to_the_bottom_of_the_page_to_find_areas_of_scenting()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click hotel,offices,airports button and Verify the description",
  "keyword": "And "
});
formatter.match({
  "location": "Project1.click_hotel_offices_airports_button_and_Verify_the_description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take screenshot to verify the description",
  "keyword": "And "
});
formatter.match({
  "location": "Project1.take_screenshot_to_verify_the_description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the chrome browser after completion",
  "keyword": "Then "
});
formatter.match({
  "location": "Project1.close_the_chrome_browser_after_completion()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigate to Contact Us from Our Service",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User need to open the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Project1.user_need_to_open_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the given website",
  "keyword": "When "
});
formatter.match({
  "location": "Project1.navigate_to_the_given_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the Our Services button",
  "keyword": "And "
});
formatter.match({
  "location": "Project1.to_click_the_Our_Services_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To scroll down to the bottom of the page to find Contact us button and click",
  "keyword": "And "
});
formatter.match({
  "location": "Project1.to_scroll_down_to_the_bottom_of_the_page_to_find_Contact_us_button_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take screenshot to verify the contact us page",
  "keyword": "And "
});
formatter.match({
  "location": "Project1.take_screenshot_to_verify_the_contact_us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the page is contact us",
  "keyword": "And "
});
formatter.match({
  "location": "Project1.verify_the_page_is_contact_us()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the chrome browser after completion",
  "keyword": "Then "
});
formatter.match({
  "location": "Project1.close_the_chrome_browser_after_completion()"
});
formatter.result({
  "status": "passed"
});
});