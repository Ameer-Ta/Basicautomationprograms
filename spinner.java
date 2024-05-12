package com.spinner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class spinner {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Downloads\\chromedriverwin\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Spinner']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='spinner']")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
		driver.findElement(By.xpath("//button[@id='disable']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='destroy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='getvalue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='setvalue']")).click();
		driver.findElement(By.xpath("//input[@id='spinner']")).clear();
		driver.findElement(By.xpath("(//input[@id='spinner'])[1]")).sendKeys("5");
		Thread.sleep(3000);
	}

}
