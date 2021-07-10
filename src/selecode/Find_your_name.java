package selecode;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_your_name {
	
	@Test
	public void test1() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Only Graphics\\Platform Project\\libs\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Sahaj Ravindra Balgunde",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div[1]/a/h3")).click();
	WebElement name = driver.findElement(By.xpath("/html/body"));
	String bodyText = name.getText();

	int count = 0;

	while (bodyText.contains("Sahaj")){

	    count++;

	    bodyText = bodyText.substring(bodyText.indexOf("Sahaj") + "Sahaj".length());
	}
	System.out.println("Times the text has been seen: "+count);
	
	driver.quit();
	
	}
	
	@Test
	public void test2() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Only Graphics\\Platform Project\\libs\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Sachin",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/a/h3")).click();
	
	WebElement name = driver.findElement(By.xpath("//*[@id='content']"));
	
	String bodyText = name.getText();

	int count = 0;

	while (bodyText.contains("Sachin")){

	    count++;

	    bodyText = bodyText.substring(bodyText.indexOf("Sachin") + "Sachin".length());
	}
	System.out.println("Times the text has been seen: "+count);
	
	
	driver.quit();	
	}

}