Feature: Verify the functionality of scent Arts
@sanity
Scenario: Check the description of different areas
Given User need to open the chrome browser
When  Navigate to the given website
And To click the about us button
And To scroll down to the bottom of the page to find areas of scenting
And click hotel,offices,airports button and Verify the description
And Take screenshot to verify the description
Then Close the chrome browser after completion

@smoke
Scenario: 	Navigate to Contact Us from Our Service
Given User need to open the chrome browser
When  Navigate to the given website
And To click the Our Services button
And To scroll down to the bottom of the page to find Contact us button and click
And Take screenshot to verify the contact us page
And Verify the page is contact us 
Then Close the chrome browser after completion








