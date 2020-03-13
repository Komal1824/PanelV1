package com.knoldus.panel;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputOutputObjects {
	
	
	protected String panelv1Url= "http://35.166.64.76:9002/login";
	By loginSection = By.xpath("//div[@class='normal-signin']");
	By emailTextbox = By.xpath("//input[@id='username']");
	By pswdTextbox = By.xpath("//input[@id='password']");
	By buttonLogin= By.xpath("//button[contains(text(),'Sign In')]");
	
	
	//Dashboard objects
	
	By linkDashboard = By.xpath("//a[contains(.,'Dashboard')]");
	By linkEngage = By.xpath("//a[contains(.,'Engage')]");
	By linkRewards = By.xpath("//a[contains(.,'Rewards')]");
	By linkPurchases = By.xpath("//a[contains(.,'Purchases')]");
	By linkUsers = By.xpath("//a[contains(.,'Users')]");
	By linkInsights = By.xpath("//a[contains(.,'Insights')]");
	By linkSettings = By.xpath("//a[contains(.,'Settings')]");
	
	public void highLighterMethod(WebDriver driver, WebElement element){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		 }

}
