package first_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBaseURL {
	
	static WebDriver driver;
	 static String baseURL="http://143.198.127.220/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sadma\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.id("login")).sendKeys("carpediem@example.com");
		driver.findElement(By.id("password")).sendKeys("carpediem");
		driver.findElement(By.xpath("//*[@id=\"formContent\"]/form/input[3]")).click();
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		
	

	}

}
