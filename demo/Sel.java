package org.demo;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\org.demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone11");
		
		WebElement btclick = driver.findElement(By.id("nav-search-submit-button"));
		btclick.click();
		WebElement iphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		iphone.click();
	
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		for (String x : all) {
			if (!parent.equals(x)) {
				driver.switchTo().window(x);	
			}
		}
WebElement cost = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-price priceBlockBuyingPriceString']"));
String text = cost.getText();
System.out.println(text);

driver.switchTo().window(parent);

WebElement btnred = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - (Product) RED']"));
btnred.click();
Set<String> All2 = driver.getWindowHandles();
int count=0;
for (String x : All2) {
	if (count==2) {
		driver.switchTo().window(x);
	}
	count++;
}
WebElement redprice = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
String text2 = redprice.getText();
System.out.println(text2);
	}
}
	
