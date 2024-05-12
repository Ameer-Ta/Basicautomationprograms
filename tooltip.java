package com.tooltip;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class tooltip {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Downloads\\chromedriverwin\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/demo.html");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("(//*[text()='Registration'])[1]"));
		if(e.isDisplayed())
		{
			System.out.print("element is displayed"+'\n');
		}
		else
			System.out.print("element is not displayed"+'\n');

		if(e.isEnabled())
		{
			System.out.print("element is enabled"+'\n');

		}
		else
			System.out.print("element is not enabled"+'\n');
		driver.findElement(By.xpath("(//*[text()='Registration'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Set<String> wh=driver.getWindowHandles();
		Iterator<String> i1=wh.iterator();
		ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
		System.out.print(win);
		String mainwin=driver.getWindowHandle();
			while(i1.hasNext())
			
			
		{
			String childwindow=i1.next();
				if(!mainwin.equalsIgnoreCase(childwindow))
				{
					
				
			String child=win.get(1);
			driver.switchTo().window(child);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ameer");
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9059590301");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mahammadameer0502@gmail.com");
			driver.findElement(By.xpath("//select[@name='country']")).sendKeys("India");
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hyderabad");
			driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']")).sendKeys("Ameer241");
			driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']")).sendKeys("Ameer@241");
			driver.findElement(By.xpath("//div[@id='load_box']//input[@value='Submit']")).click();
			driver.findElement(By.xpath("//div[@id='load_box']//a[@class='fancybox'][normalize-space()='ENTER TO THE TESTING WEBSITE']")).click();
			driver.findElement(By.xpath("//a[@href='tooltip.php']//figure")).click();
			
				
	}
}
	}
}
