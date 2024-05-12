package com.way2automation3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class way2automation3 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Dropbox\\PC\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.way2automation.com/demo.html");
		String title=driver.getTitle();
		System.out.print(title+'\n');
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
		Set<String> wh=driver.getWindowHandles();
		Iterator<String> i1=wh.iterator();
		
		ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
		System.out.print(win);
		String mainwin=driver.getWindowHandle();
		for(int i=0;i<win.size();i++)
		{
			String child=win.get(1);
			driver.switchTo().window(child);
			//driver.getWindowHandle().indexOf(1);
			driver.findElement(By.xpath("(//*[@id=\"load_form\"]/fieldset[1]/input)[2]")).sendKeys("ameer");
			
		}
	//	driver.switchTo().window
		
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

			String child_window=I1.next();


		if(!parent.equals(child_window))
		{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();

		}

		}
		

	}

}
