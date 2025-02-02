package usermanagement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {
//login 
    //git ahead set 
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Testing started");

        // Initialize WebDriver  
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://vividtranstech.com/tancem/#/login");

        // Perform sign-in
        driver.findElement(By.xpath("(//span[text()='Sign In'])")).click();
        System.out.println("Login successful");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        
        
        WebElement workflowElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='WORKFLOW']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(workflowElement).click().perform();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        // Perform sign-in
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Sign In'])"))).click();
       // System.out.println("Login successful");

        // Navigate to the 'WORKFLOW' section
		
	// Thread.sleep(2000);
		//  Actions actions22 = new Actions(driver);
	//	 actions22.moveToElement(driver.findElement(By.xpath("//span[text()=' Template']"))).click().perform();
		 
		 
        // Navigate to the 'WORKFLOW' section
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        Actions actions2 = new Actions(driver);

        // driver.findElement(By.xpath("//span[text()='boiler stage']")).click();
	        //actions22.moveToElement(driver.findElement(By.xpath("//span[text()='Marketing']"))).click().build().perform();
     wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Template']"))).click();
     
     Thread.sleep(2000);
     Actions actions23= new Actions(driver);

     // driver.findElement(By.xpath("//span[text()='boiler stage']")).click();
	        actions2.moveToElement(driver.findElement(By.xpath("(//a[normalize-space()='Process State'])[1]"))).click().build().perform();
     
     
     
     
     
        Thread.sleep(2000);
        Actions actions39 = new Actions(driver);

        // driver.findElement(By.xpath("//span[text()='boiler stage']")).click();
	        actions39.moveToElement(driver.findElement(By.xpath("//button[text()=' Create ']"))).click().build().perform();
	        Thread.sleep(2000);
                    
	        Actions actions28 = new Actions(driver);
	        driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("kumar");
	        
	        Thread.sleep(2000);
	        
	        WebElement element49 =driver.findElement(By.xpath("//p-dropdown[@formcontrolname='appModuleId']"));
	        		 element49.click(); 
	        		 actions28.moveToElement(driver.findElement(By.xpath("//span[text()='name']"))).click().build().perform();
	        		 
	        
	        
	        		 Thread.sleep(2000);
	     	        
	     	        WebElement element50 =driver.findElement(By.xpath("//p-dropdown[@formcontrolname='stateId']"));
	     	        		 element50.click(); 
	     	        		 actions28.moveToElement(driver.findElement(By.xpath("//span[text()='hold']"))).click().build().perform();
	     	        		 
	        
	        
	     	        		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();

	     	   	        WebElement okButton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm swal2-styled')]")));

	     	   	        okButton.click();
	     	       }
	        
	        

	        
}
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
/*
 * driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys(
 * "colour");
 * driver.findElement(By.xpath("//input[@formcontrolname='postLabel']")).
 * sendKeys("colour");
 * 
 * 
 * wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
 * "//button[@data-text='Approval']"))).click();
 * 
 * WebElement okButton = wait1.until(ExpectedConditions.elementToBeClickable(By.
 * xpath("//button[contains(@class, 'swal2-confirm swal2-styled')]")));
 * 
 * okButton.click(); } }
 */
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
/*
 * WebElement element49 =
 * driver.findElement(By.xpath("//p-dropdown[@formcontrolname='appModuleId']"));
 * element49.click(); actions28.moveToElement(driver.findElement(By.
 * xpath("//span[text()='Supplier Requisition']"))).click().build().perform();
 * 
 * 
 * wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
 * "//button[@data-text='Approval']"))).click();
 * 
 * WebElement okButton = wait1.until(ExpectedConditions.elementToBeClickable(By.
 * xpath("//button[contains(@class, 'swal2-confirm swal2-styled')]")));
 * 
 * okButton.click(); } }
 * 
 */
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
        
	     //   actions24.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Create']"))).click();

     // Wait for the 'Create' button to be clickable and click it
       /*wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']"))).click();
       
        
        // Fill out the form fields
        driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("uer1");
        driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("s");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("ker");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Keet23@gmail.com");

        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();

        WebElement okButton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm swal2-styled')]")));

        okButton.click();
    }
}
        System.out.println("OK button clicked on alert!");
        WebElement element44 = driver.findElement(By.xpath("//p-dropdown[@formcontrolname='userId']"));
        element44.click();

        // Wait and click the 'Approval' button
        actions22.moveToElement(driver.findElement(By.xpath("//span[text()='kumar']"))).click().build().perform();
        
        
        WebElement element49 = driver.findElement(By.xpath("//p-dropdown[@formcontrolname='roleId']"));
        element49.click();

        // Wait and click the 'Approval' button
        actions22.moveToElement(driver.findElement(By.xpath("//span[text()='Material User']"))).click().build().perform();
        
        
         driver.findElement(By.xpath("//textarea[@formcontrolname='description']")).sendKeys("This is Proccessed");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();

        
        WebElement okButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'btn btn-success btn-label waves-effect waves-light rounded-pill')]")));
        okButton1.click();

        System.out.println("OK button clicked on alert!");
    }
}






*/