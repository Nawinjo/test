package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\org.demo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-login.php?redirect");
		driver.manage().window().maximize();
		driver.findElement(By.name("wp-submit")).click();
		driver.findElement(By.xpath("(//div[@class='wp-menu-image svg'])[1]")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='widefat post fixed wp-list-table']"));
		List<WebElement> allrow = table.findElements(By.tagName("tr"));
		for (WebElement x : allrow) {
			List<WebElement> alldata = x.findElements(By.tagName("td"));
			for (WebElement data : alldata) {
				String text = data.getText();
				System.out.println(text);
		System.out.println(allrow.size());
			}
			
			
		}
		
		
		
	}
}
