package login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Successful Login

public class Login {

	private void testSuccessfulLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Applications/Seleniumlibrary/chromedriver");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("file:///Applications/login.html");
		Thread.sleep(2000);
		c1.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("coding@project.com");
		Thread.sleep(2000);
		c1.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("Coding@123");;
		c1.findElement(By.xpath("/html/body/form/input[3]")).click();
		System.out.println("You have logged in successfully");
		
		
	}
	
	//• If you enter wrong email address, Show message ‘Wrong email address’
	
	private void testFailedUserName() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Applications/Seleniumlibrary/chromedriver");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("file:///Applications/login.html");
		Thread.sleep(2000);
		c1.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("coding@projectcom");
		Thread.sleep(2000);
		c1.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("Coding@123");;
		c1.findElement(By.xpath("/html/body/form/input[3]")).click();
		System.out.println("Wrong Email address");
		
		
	}
	//If you enter wrong password, Show message ‘Email address and password doesn’t match’
	
	private void testFailedPassword() throws Exception 
	{System.setProperty("webdriver.chrome.driver", "/Applications/Seleniumlibrary/chromedriver");
	ChromeDriver c1 = new ChromeDriver();
	c1.get("file:///Applications/login.html");
	Thread.sleep(2000);
	c1.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("coding@project.com");
	Thread.sleep(2000);
	c1.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("Coding123");;
	c1.findElement(By.xpath("/html/body/form/input[3]")).click();
	System.out.println("Email address and password doesn’t match");
	
		
	}
	
	//If you enter wrong password three times, Show message ‘Email address and password doesn’t
	//match. You only have one more chance. Please contact RightEye Support at 800-301-0803.’
	
	
	private void testfailedLogin() throws Exception {
		
			System.setProperty("webdriver.chrome.driver", "/Applications/Seleniumlibrary/chromedriver");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("file:///Applications/login.html");

		for(int i=0;i<=2;i++) {
		 c1.findElement(By.xpath("/html/body/form/input[3]")).click();
		 Thread.sleep(2000);
		 c1.switchTo().alert().accept();
		 
		 if(i==2) {
			 System.out.println("Email address and password doesn’t match. You only have one more chance. Please contact RightEye Support at 800-301-0803."+ i);
		 }	
		 }
		
		}
	
	//If you enter wrong password four times, Show message ‘Your Email address is locked and
	//invalid. Please contact RightEye Support at 800-301-0803.
		
		private void testfailedLogin4() throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "/Applications/Seleniumlibrary/chromedriver");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("file:///Applications/login.html");

		for(int i=0;i<=3;i++) {
		 c1.findElement(By.xpath("/html/body/form/input[3]")).click();
		 Thread.sleep(2000);
		 c1.switchTo().alert().accept();
		 
		 if(i==3) {
			 System.out.println("Your Email address is locked and invalid. Please contact RightEye Support at 800-301-0803."+ i);
		 }	
		
		}
		
		
		
		
	}

	
	
	public static void main(String[] args) throws Exception {
		Login login=new Login();
		login.testSuccessfulLogin();
		login.testFailedUserName();
		login.testFailedPassword();
		login.testfailedLogin();
		login.testfailedLogin4();
		
	}

}
