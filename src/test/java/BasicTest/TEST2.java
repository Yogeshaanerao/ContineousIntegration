package BasicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TEST2{
	
	@Test
	public void jenkins(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace111\\ContineousIntegration\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.close();
	}
	
	@Test
	public void jenkins1(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace111\\ContineousIntegration\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");	
		driver.close();
	}
	
	@Test
	public void jenkins2(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace111\\ContineousIntegration\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");	
		driver.close();
	}
	
	@Test
	public void jenkins3(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace111\\ContineousIntegration\\WEB BROWSER\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");	
		driver.close();
	}

}
