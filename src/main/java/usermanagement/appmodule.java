package usermanagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class appmodule {


	public static void moduleform(WebDriver driver) throws InterruptedException {
	    // Initialize WebDriverWait for waiting for elements
	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Step 1: Navigate to 'App Module' and click on it
	    Thread.sleep(2000); // Wait for 2 seconds
	    Actions actions22 = new Actions(driver);
	    actions22.moveToElement(driver.findElement(By.xpath("//span[text()=' App Module']"))).click().perform();

	    // Step 2: Wait for 'App Module Form' to be clickable and click on it
	    wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' App Module Form ']"))).click();
	    Thread.sleep(2000); // Wait for 2 seconds

	    // Step 3: Click on the 'Create' button
	    Actions actions23 = new Actions(driver);
	    actions23.moveToElement(driver.findElement(By.xpath("//button[text()=' Create ']"))).click().perform();
	    Thread.sleep(2000); // Wait for 2 seconds

	    // Step 4: Enter 'name' in the input field
	    driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("kumar");

	    // Step 5: Select 'parentModuleId' dropdown and choose an option
	    WebElement element49 = driver.findElement(By.xpath("//p-dropdown[@formcontrolname='parentModuleId']"));
	    element49.click();
	    Actions actions28 = new Actions(driver);
	    actions28.moveToElement(driver.findElement(By.xpath("//span[text()='Supplier Requisition']"))).click().perform();

	    // Step 6: Enter description in the textarea
	    driver.findElement(By.xpath("//textarea[@formcontrolname='description']")).sendKeys("This is roessed");

	    // Step 7: Wait for the 'Approval' button to be clickable and click it
	    wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();

	    // Step 8: Wait for the confirmation button and click it
	    WebElement okButton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm swal2-styled')]")));
	    okButton.click();
	}
		
		
		
		
		
		
		
		
		
		

	}


        
        