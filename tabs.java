package com.tabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabs  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Downloads\\chromedriverwin\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[text()='Registration'])[1]")).click();

		Set<String> wh=driver.getWindowHandles();
		Iterator<String> i1=wh.iterator();
		String mainwindow=driver.getWindowHandle();
		System.out.print(mainwindow);
		System.out.print(wh);

		while(i1.hasNext())
		{
			String childwindow=i1.next(); 
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='load_box']//a[@class='fancybox'][normalize-space()='ENTER TO THE TESTING WEBSITE']")).click();
				driver.findElement(By.xpath("//*[@id='wrapper']/div/div/div[2]/ul/li[6]/a/figure")).click();
				Set<String> wh1=driver.getWindowHandles();
				Iterator<String> i2=wh1.iterator();
				while(i2.hasNext())
				{
					String childwindow1=i2.next(); 
					if(!mainwindow.equalsIgnoreCase(childwindow1) && !childwindow.equalsIgnoreCase(childwindow1))
					{
						driver.switchTo().window(childwindow1);
						driver.switchTo().frame(0);
						driver.findElement(By.xpath("//*[@id='tabs']/ul/li[1]/a")).sendKeys(Keys.CONTROL,Keys.ENTER);
						driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/p")).getText();
						String ta= driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/p")).getText();
						System.out.print(ta);
						driver.switchTo().defaultContent();

						Set<String> wh2=driver.getWindowHandles();
						Iterator<String> i3=wh2.iterator();
						while(i3.hasNext())
						{
							String childwindow2=i3.next(); 
							if(!mainwindow.equalsIgnoreCase(childwindow2) && !childwindow.equalsIgnoreCase(childwindow2) && !childwindow1.equalsIgnoreCase(childwindow2) )
							{
								driver.switchTo().window(childwindow2);

								driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[2]/a")).sendKeys(Keys.CONTROL,Keys.ENTER);
								driver.findElement(By.xpath("//*[@id=\"tabs-2\"]/p")).getText();
								String tb= driver.findElement(By.xpath("//*[@id=\"tabs-2\"]/p")).getText();
								System.out.print(tb);
								driver.switchTo().defaultContent();
								Set<String> wh3=driver.getWindowHandles();
								Iterator<String> i4=wh3.iterator();
								while(i4.hasNext())
								{
									String childwindow3=i4.next(); 
									if(!mainwindow.equalsIgnoreCase(childwindow3) && !childwindow.equalsIgnoreCase(childwindow3) && !childwindow2.equalsIgnoreCase(childwindow3)&& !childwindow1.equalsIgnoreCase(childwindow3)  )
									{
										driver.switchTo().window(childwindow3);
										driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[3]/a")).sendKeys(Keys.CONTROL,Keys.ENTER);
										driver.findElement(By.xpath("//*[@id=\"tabs-3\"]/p[1]")).getText();
										String tc= driver.findElement(By.xpath("//*[@id=\"tabs-3\"]/p[1]")).getText();
										driver.findElement(By.xpath("//*[@id=\"tabs-3\"]/p[2]")).getText();
										String tc1= driver.findElement(By.xpath("//*[@id=\"tabs-3\"]/p[2]")).getText();
										System.out.print(tc1);
										driver.switchTo().defaultContent();

									}

								}
							}
						}
					}
				}
			}

		}
	}
}
