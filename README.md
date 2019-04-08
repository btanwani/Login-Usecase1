Hi,
Please find the Login Scenario script as per requirements

• Created a working HTML page for login. It includes two fields Username, Password, a login button and a link for FAQs.
.It can accept only one email address as ‘coding@project.com’ (to make project simple)
. It can accept only one password as ‘Coding@123’ (to make project simple)
. Click on the login button and it shows the message ‘You have logged in successfully’

• Created an HTML page for help needed(FAQs), with three helping points.
• If you click on ‘Need Help?’ link, takes to FAQs page.

• Login Failure scenario:-- Used Selenium to create the script for Login- use-case.

 . If you enter the wrong email address, Shows message ‘Wrong email address’
. If you enter the wrong password, Show message ‘Email address and password doesn’t match’
. If you enter the wrong password three times, Show message ‘Email address and password doesn’t match. You only have one more chance. Please contact RightEye Support at 800-301-0803.’
. If you enter the wrong password four times, Show message ‘Your Email address is locked and invalid. Please contact RightEye         Support at 800-301-0803.’

 Question:- How you will enhance testing if we extend this functionality in future such as... we accept different email addresses and passwords etc.? 
The script can be parametrized as well as can be made reusable. Parameterize test to execute the same test over and over again using different values. It to save time in recreating the same script which differs only in their inputs and expected results.
