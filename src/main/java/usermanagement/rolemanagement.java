package usermanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class rolemanagement {

	public    static  void rolemaster(WebDriver driver) {
	    try {
	    	// the process is completed 
	        // Initialize WebDriverWait with a timeout of 10 seconds
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Perform sign-in
	        driver.findElement(By.xpath("(//span[text()='Sign In'])")).click();
	        System.out.println("Login successful");

	        // Wait for the 'WORKFLOW' section and click it
	        Thread.sleep(2000);
	        Actions actions = new Actions(driver);
	        actions.moveToElement(driver.findElement(By.xpath("//h5[text()='WORKFLOW']"))).click().perform();

	        // Wait for 'Role Management' section to be clickable and click it
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Role Management']"))).click();
	        Thread.sleep(2000); // Wait for page load

	        // Wait for 'Role Master' and click it
	        actions.moveToElement(driver.findElement(By.xpath("//a[text()=' Role Master ']"))).click().perform();
	        Thread.sleep(2000); // Wait for page load

	        // Wait for the 'Create' button to be clickable and click it
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']"))).click();

	        // Fill out the 'Name' field
	        driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("user");

	        // Select 'Section Designation' from the dropdown
	        WebElement sectionDesignationDropdown = driver.findElement(By.xpath("//p-dropdown[@formcontrolname='sectionDesignationId']"));
	        sectionDesignationDropdown.click();
	        actions.moveToElement(driver.findElement(By.xpath("//span[text()='Finance Hod']"))).click().build().perform();

	        // Fill out the 'Description' field
	        driver.findElement(By.xpath("//textarea[@formcontrolname='description']")).sendKeys("This is Processed");

	        // Wait for 'Approval' button to be clickable and click it
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();

	        // Wait for the alert and click the 'OK' button
	        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm swal2-styled')]")));
	        okButton.click();

	        System.out.println("OK button clicked on alert!");

	    } catch (StaleElementReferenceException e) {
	        System.out.println("Stale Element Reference Exception caught: " + e.getMessage());
	        // Refetch and retry logic here (if needed)
	    } catch (ElementClickInterceptedException e) {
	        System.out.println("Element Click Intercepted Exception caught: " + e.getMessage());
	        // Retry with JavaScript execution to bypass blocking elements
	        WebElement elementToClick = driver.findElement(By.xpath("(//span[text()='Sign In'])"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementToClick);
	        System.out.println("JavaScript click triggered.");
	    } catch (Exception e) {
	        e.printStackTrace();
	        // General exception handling
	    }
	}
	public static void userole(WebDriver driver) {
	    try {
	        // Initialize WebDriverWait with a timeout of 10 seconds
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Initialize Actions class for mouse movements and clicks
	        Actions actions = new Actions(driver);

	        // Wait for the 'Role Management' section to be clickable and click it
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Role Management']"))).click();
	        Thread.sleep(2000); // Wait for page load

	        // Wait for 'User Role' link and click it
	        actions.moveToElement(driver.findElement(By.xpath("//a[text()=' User Role ']"))).click().build().perform();
	        Thread.sleep(2000); // Wait for page load

	        // Wait for the 'Create' button to be clickable and click it
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']"))).click();

	        // Fill out the 'Name' field with 'user'
	        driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("uer");

	        // Select 'User' from the 'User' dropdown
	        WebElement userDropdown = driver.findElement(By.xpath("//p-dropdown[@formcontrolname='userId']"));
	        userDropdown.click();
	        actions.moveToElement(driver.findElement(By.xpath("//span[text()='chandran']"))).click().build().perform();

	        // Select 'Material User' from the 'Role' dropdown
	        WebElement roleDropdown = driver.findElement(By.xpath("//p-dropdown[@formcontrolname='roleId']"));
	        roleDropdown.click();
	        actions.moveToElement(driver.findElement(By.xpath("//span[text()='Material HOD']"))).click().build().perform();

	        // Fill out the 'Description' field
	        driver.findElement(By.xpath("//textarea[@formcontrolname='description']")).sendKeys("This is roessed");

	        // Wait for the 'Approval' button to be clickable and click it
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();

	        // Wait for the OK button on the confirmation alert and click it
	        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm swal2-styled')]")));
	        okButton.click();

	        System.out.println("OK button clicked on alert!");

	    } catch (StaleElementReferenceException e) {
	        System.out.println("Stale Element Reference Exception caught: " + e.getMessage());
	        // You can add retry logic or element re-fetching here
	    } catch (ElementClickInterceptedException e) {
	        System.out.println("Element Click Intercepted Exception caught: " + e.getMessage());
	        // Retry with JavaScript execution to bypass blocking elements
	        WebElement elementToClick = driver.findElement(By.xpath("//span[text()=' Role Management']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementToClick);
	        System.out.println("JavaScript click triggered.");
	    } catch (Exception e) {
	        e.printStackTrace();
	        // General exception handling
	    }
	}
	
	
	
	
	


	    // Method to perform the entire process of creating a user
  static  void createuser(WebDriver driver) throws InterruptedException {
	        // Initialize WebDriverWait

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	      
	        Actions actions = new Actions(driver);
	        actions.moveToElement(driver.findElement(By.xpath("//a[text()=' Create User ']"))).click().build().perform();
	        Thread.sleep(2000);  // Add a short wait for page load

	        // Wait for the 'Create' button to be clickable and click it
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']"))).click();

	        // Fill out the form fields
	        driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("er1");
	        driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("s2");
	        Thread.sleep(1000);  // Add a short wait for form field input
	        driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("ker");
	        Thread.sleep(1000);  // Add a short wait for form field input
	        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Keet23@gmail.com");

	        // Wait for the 'Approval' button and click it
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();

	        // Wait for the confirmation button and click it
	        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm') and contains(@class, 'swal2-styled')]")));
	        okButton.click();
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

    	
    	
    	
    	
    
    
