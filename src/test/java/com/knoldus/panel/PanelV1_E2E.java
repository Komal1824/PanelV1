package com.knoldus.panel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.knoldus.panel.InputOutputObjects;



@Test
public class PanelV1_E2E extends InputOutputObjects {
	
	

	public void checkLoginAndVerifyDashboardElements()
	{
		System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Automation/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(panelv1Url);
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//login form presence 
		driver.findElement(loginSection).isDisplayed();
		driver.findElement(emailTextbox).isDisplayed();
		driver.findElement(emailTextbox).sendKeys("knoldus@knoldus.com");
		driver.findElement(pswdTextbox).isDisplayed();
		driver.findElement(pswdTextbox).sendKeys("knol@2017");
		driver.findElement(buttonLogin).isDisplayed();
		driver.findElement(buttonLogin).click();
		url = driver.getCurrentUrl();
		url.equals("http://35.166.64.76:9002/#!/getstarted");
		System.out.println("Login successful");
		
		//verify Navigation Bar Elements
		driver.findElement(linkDashboard).isDisplayed();
		driver.findElement(linkEngage).isDisplayed();
		driver.findElement(linkRewards).isDisplayed();
		driver.findElement(linkPurchases).isDisplayed();
		driver.findElement(linkInsights).isDisplayed();
		driver.findElement(linkSettings).isDisplayed();
		
		
		//driver.close();	
	}
	
	

}
