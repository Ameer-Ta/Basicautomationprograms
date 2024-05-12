package com.sortable1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortable1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Downloads\\chromedriverwin\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Sortable']")).click();
		driver.switchTo().frame(0);
List<WebElement> list=driver.findElements(By.xpath("//ul[@id='sortable']"));	
WebElement e=driver.findElement(By.xpath("//li[normalize-space()='Item 2']"));
WebElement e1=driver.findElement(By.xpath("//li[normalize-space()='Item 1']"));
WebElement e2=driver.findElement(By.xpath("//li[normalize-space()='Item 4']"));
WebElement e3=driver.findElement(By.xpath("//li[normalize-space()='Item 3']"));
Actions a=new Actions(driver);
a.dragAndDrop(e, e1).build().perform();
Thread.sleep(3000);
Actions b=new Actions(driver);
b.dragAndDrop(e2, e3).build().perform();
Thread.sleep(3000);
a.release(e).build().perform();
b.release(e2).build().perform();

Thread.sleep(3000);
	}

}
