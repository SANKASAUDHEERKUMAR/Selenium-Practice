package com.src.log;

import java.util.logging.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.util.log.Log;

public class Tc_Login{
	private static Logger logger=Logger.getLogger(Tc_Login.class.getName());
	public static void main(String[] args) throws Exception {
	
		DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk=new FirefoxDriver();
		log.info("browser opened");
		ssk.get("http://localhost/orangehrm-2.6/");
		Thread.sleep(2000);
		ssk.findElement(By.name("txtUserName")).sendKeys("admin");
		ssk.findElement(By.name("txtPassword")).sendKeys("admin");
		WebElement we=ssk.findElement(By.name("Submit"));
		Thread.sleep(2000);
		JavascriptExecutor jse= (JavascriptExecutor)ssk;
		jse.executeScript("arguments[0].click();",we);
		WebElement we1=ssk.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a"));
		jse.executeScript("arguments[0].click();",we1);
		
		ssk.close();
	}

}
