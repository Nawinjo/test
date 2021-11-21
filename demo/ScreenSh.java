package org.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenSh {
	
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\org.demo\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	TakesScreenshot tk = (TakesScreenshot) driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File des = new File("D:\\video songs\\new.jpg");
 FileUtils.copyFile(src, des);
}
}
