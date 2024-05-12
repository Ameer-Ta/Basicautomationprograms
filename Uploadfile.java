package com.Uploadfile;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	private static final ClipboardOwner winsat = null;

	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Dropbox\\PC\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://blueimp.github.io/jQuery-File-Upload");
		Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@id='fileupload']/div/div[1]/span[1]")).click();
			driver.manage().window().maximize();
		
		     
		      Robot rb = new Robot();
		     rb.delay(2000);
		     StringSelection x=new StringSelection("C:\\Windows\\Performance\\WinSAT\\winsat");
		      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		      rb.keyPress(KeyEvent.VK_CONTROL);
		      rb.keyPress(KeyEvent.VK_V);
			     rb.delay(2000);

		      rb.keyRelease(KeyEvent.VK_CONTROL);
		      rb.keyRelease(KeyEvent.VK_V);
			     rb.delay(2000);

		      rb.keyPress(KeyEvent.VK_ENTER);
		      rb.keyRelease(KeyEvent.VK_ENTER);

			     rb.delay(2000);

	}

}
