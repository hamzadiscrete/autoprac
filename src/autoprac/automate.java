package autoprac;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;



public class automate {
	public static WebDriver driver;
	public static void main(String[] args) {


      
      
		//WebDriver driver;
        
		
		
	//	Test1();
	//	Test2();
		Test3();
	}
	




public static void Test1 () {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Discretelogix\\Desktop\\geckodriver.exe");
    driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php?");
	WebElement element=driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
	if(element.isDisplayed())
	{
	System.out.println("Image displayed");
	
	driver.quit();
	}
}

public static void Test2 () {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Discretelogix\\Desktop\\geckodriver.exe");
    driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php?");
	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("test2@gm.com");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("testian");
	driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("naitset");
	driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("1234567");
	driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Pakistan house");
	driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("york");
	driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("york");
	Select state = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
	state.selectByVisibleText("Arizona");
	driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("45600");
	driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("1231253142");
	driver.findElement(By.xpath("//*[@id=\"alias\"]")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("alais@gg.com");
	//*[@id="SubmitCreate"]
	
	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span")).click();
	
	driver.quit();
}


public static void Test3 () 

{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Discretelogix\\Desktop\\geckodriver.exe");
    driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php?");
	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test2@gm.com");
	driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("1234567");
	driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
	
	Actions hover = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));
    Actions action = new Actions(driver);
    action.moveToElement(ele).build().perform();
   try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a")).click();
   
    //WebElement ele2 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a"));
  //  Actions action2 = new Actions(driver);
   // action2.moveToElement(ele2).click().build().perform();
   String ss=  driver.findElement(By.xpath(" /html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/h5/a")).getText();
   System.out.println(ss);
   List <WebElement> listings = driver.findElements(By.cssSelector(".product_list"));
   Random r = new Random();
   int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
   listings.get(randomValue).click();
   
   driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")).click();
   driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/b")).click(); 
  String s=  driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a")).getText();
   System.out.println(s);
   System.out.println(s.equalsIgnoreCase(ss));//true 
   
}




}