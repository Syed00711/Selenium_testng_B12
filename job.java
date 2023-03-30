package seleniumB12;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class job extends Common {
	


	
@Test(priority=1)
	 public void step1() throws InterruptedException {
	 driver.get("https://myjobs.com.mm/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class=\"navbar-header\"]")).click();
	 Assert.assertEquals(driver.getCurrentUrl(), "https://myjobs.com.mm/");
		}
		
		
		@Test(priority=2)
		public void step2() throws IOException, InterruptedException {
			 
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=\"Sign Up\"]")));
			 driver.findElement(By.xpath("//a[text()=\"Sign Up\"]")).click();
			 screenshot("signup.png");
			 Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"#candidate\"]")).click();
		 screenshot("Candidate.png");
		 Thread.sleep(2000);
		 Assert.assertEquals(driver.getCurrentUrl(), "https://myjobs.com.mm/register");
		}
		
		@Test(priority=3)
		public void step3() throws InterruptedException {
		driver.get("https://myjobs.com.mm/register"); 
		Thread.sleep(4000);
		Actions action =new Actions(driver);
		action.scrollByAmount(0, 300).perform();
		
		wait.until(driver-> driver.findElement(By.xpath("//a[text()=\"Candidate\"]")));
		driver.findElement(By.xpath("//a[text()=\"Candidate\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Shaik");
		Thread.sleep(3000);
		//Assert.assertEquals(driver.findElement(By.xpath("//input[@name=\"first_name\"]")).get, "Shaik");
		}
		@Test(priority=4)
		public void step4() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Rizwana");
			Thread.sleep(2000);
		//Assert.assertEquals(driver.findElement(By.xpath("//input[@name=\"last_name\"]")).getText(), "Rizwana");
		}
		
		@Test(priority=5)
	      public void step5() throws InterruptedException {
			Thread.sleep(2000);
	   
	          driver.findElement(By.xpath("//div[@id=\"candidate\"]//input[@id=\"email\"]")).sendKeys("rizzuriyaz2001@gmail.com");
	          Thread.sleep(2000);
		
		}
		
		@Test(priority=6)
	      public void step6() throws InterruptedException  {
	    	  
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("//div[@id=\"candidate\"]//input[@name=\"password\"]")).sendKeys("rizwana7869");
	          Thread.sleep(2000);
	          
}
		@Test(priority=7)
	      public void step7() throws InterruptedException {
	    	   driver.findElement(By.xpath("//div[@id=\"candidate\"]//input[@name=\"password_confirmation\"]")).sendKeys("rizwana7869");
	          Thread.sleep(2000);
	          
	      }
		
		@Test (priority=8)
	      public void step8() throws InterruptedException {
	    	  
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("//input[@name=\"date_of_birth\"]")).sendKeys("2001-10-21 ");
	          Thread.sleep(2000);
		
		}
		
		@Test (priority=9)
	      public void step9()throws InterruptedException {
	    	  
	          Thread.sleep(2000);
	          //driver.findElement(By.xpath("//select[@id=\"gender_id\"] "));
	          Select select=new Select(driver.findElement(By.id("gender_id")));
	          Thread.sleep(2000);
	          select.selectByValue("1");
	          
		}
		
		@Test(priority=10)
		public void step10() throws InterruptedException {
			Thread.sleep(2000);
			Actions action =new Actions(driver);
			action.scrollByAmount(0, 300).perform();
		Select select = new Select(driver.findElement(By.xpath("//select[@id=\"country_id\"]")));
		select.selectByValue("101");
		Thread.sleep(2000);
		}
		@Test(priority=11)
		public void step11() throws InterruptedException {
			Actions action =new Actions(driver);
			action.scrollByAmount(0, 300).perform();
		Select select = new Select(driver.findElement(By.xpath("//select[@id=\"state_id\"]")));
		select.selectByValue("2537");
		Thread.sleep(2000);
		}
		@Test(priority=12)
		public void step12() throws InterruptedException {

		Select select = new Select(driver.findElement(By.xpath("//select[@id=\"city_id\"]")));
		select.selectByValue("133");
		Thread.sleep(2000);
		}
		@Test(priority=13)
		public void step13() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"mobile_num\"]")).sendKeys("9849569316");
		Thread.sleep(2000);
		}
				
		@Test(priority=14)
		public void step14() throws InterruptedException {
			Actions action =new Actions(driver);
			action.scrollByAmount(0, 300).perform();
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"functional_area_id\"]")));
		select.selectByValue("614");
		Thread.sleep(2000);
		}
		@Test(priority=15)
		public void step15() throws InterruptedException {
		Select select = new Select(driver.findElement(By.xpath("//select[@id=\"career_level_id\"]")));
		select.selectByValue("3");
		Thread.sleep(2000);
		}
           
		@Test(priority=16)
	      public void step16()throws InterruptedException {
	    	  
			Thread.sleep(2000);
	         driver.findElement(By.xpath("//div[@id=\"candidate\"]//input[@name=\"is_subscribed\"]//following-sibling::span")).click();

	         
	         Thread.sleep(2000);
	         
	      	
		}

		@Test(priority=17)
	      public void step17()throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id=\"candidate\"]//input[@name=\"terms_of_use\"]//following-sibling::span")).click();
			Thread.sleep(2000);
		}
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
	          
	          
		
