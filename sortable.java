package com.sortable;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sortable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Downloads\\chromedriverwin\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Sortable']")).click();
		driver.switchTo().frame(0);
List<WebElement> list=driver.findElements(By.xpath("//ul[@id='sortable']"));	
String[] beforeSort_list=new String[list.size()];
for(int i=0;i<list.size();i++) {
	beforeSort_list[i]=list.get(i).getText().trim();
}
		System.out.println("****Before sort function****");
		Print(beforeSort_list);
		Thread.sleep(3000);
		Arrays.sort(beforeSort_list);
		System.out.println("****After sort function****");
		Print(beforeSort_list);
	}
	public static void Print(String[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
	
}
