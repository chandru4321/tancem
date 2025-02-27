package usermanagement;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class master {
	//git updated status checking 
	
	
	
// masters will be updated  Asap
	// Method to perform login and workflow actions
    public static void grade(WebDriver driver) {
        try {
            // Initialize WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Perform sign-in
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()=' Sign In '])"))).click();
            System.out.println("Login successful");

            // Wait for the 'WORKFLOW' section to be clickable
            WebElement workflowElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='WORKFLOW']")));
            Actions actions = new Actions(driver);
            actions.moveToElement(workflowElement).click().perform();

            // Click on the 'Create' button in the workflow section
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']"))).click();

            // Fill out the form
            driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("GradeT");
            driver.findElement(By.xpath("//input[@formcontrolname='sortOrder']")).sendKeys("1");

            // Click on the 'Approval' button
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();

            // Wait for the alert to be visible and clickable
            WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm')]")));
            okButton.click();

            System.out.println("OK button clicked on alert!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void section(WebDriver driver) {
        try {
            // Initialize WebDriverWait with increased wait time (20 seconds)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Wait for the 'WORKFLOW' section to be visible (using a flexible XPath with contains)

            // Wait for the 'Section' link to be clickable and click it
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Section ']"))).click();

            // Wait for the 'Create' button to be clickable and click it
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']"))).click();

            // Fill out the form fields
            driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("GradeT");
            driver.findElement(By.xpath("//input[@formcontrolname='mail']")).sendKeys("kumar@gmail.com");
            driver.findElement(By.xpath("//input[@formcontrolname='sortOrder']")).sendKeys("2");
            // Wait and click the 'Approval' button
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();

            // Wait for the alert to appear and click the 'OK' button
           
            WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm swal2-styled')]")));
            okButton.click();

            System.out.println("OK button clicked on alert!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public static void designation(WebDriver driver) {
            try {
                // Initialize WebDriverWait with a timeout of 20 seconds
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".swal2-container.swal2-center.swal2-backdrop-show")));
    			System.out.println("Modal is not visible anymore.");

                // Wait for the 'Designation' link to be clickable and click it
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Designation ']"))).click();
                System.out.println("Designation clicked.");

                // Wait for the 'Create' button to be clickable and click it
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']"))).click();
                System.out.println("Create button clicked.");

                // Fill out the form fields
                driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("GradeT");
                Thread.sleep(1000); // Optional wait for 1 second for form field completion
                System.out.println("Name field filled.");

                // Wait for the 'Grade' dropdown to become visible and select 'Grade A'
                WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p-dropdown[@formcontrolname='gradeId']")));
                element2.click();
                Actions actions22 = new Actions(driver);
                actions22.moveToElement(driver.findElement(By.xpath("//span[text()='Grade A']"))).click().build().perform();
                System.out.println("Grade A selected.");

                // Fill the 'sortOrder' field
                driver.findElement(By.xpath("//input[@formcontrolname='sortOrder']")).sendKeys("2");
                System.out.println("Sort Order filled.");

                // Wait for the 'Approval' button to be clickable and click it
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();
                System.out.println("Approval button clicked.");

                // Wait for the alert to appear and click the 'OK' button
                WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm swal2-styled')]")));
                okButton.click();
                System.out.println("OK button clicked on alert!");

            } catch (StaleElementReferenceException e) {
                System.out.println("Stale Element Reference Exception caught: " + e.getMessage());
                // Refetch the element and retry
                // Retry logic: Refetch and click again
                WebElement retryElement = driver.findElement(By.xpath("//a[text()=' Designation ']"));
                retryElement.click();
                System.out.println("Retry: Designation clicked.");
            } catch (ElementClickInterceptedException e) {
                System.out.println("Element Click Intercepted Exception caught: " + e.getMessage());
                // Retry with JavaScript execution to bypass blocking elements
                WebElement elementToClick = driver.findElement(By.xpath("//a[text()=' Designation ']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementToClick);
                System.out.println("JavaScript click triggered.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public static void sectionDesignation(WebDriver driver) {
            try {
                // Initialize WebDriverWait with a timeout of 10 seconds
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

                // Wait for the 'Section Designation' link to be clickable and click it
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Section Designation ']"))).click();
                System.out.println("Section Designation clicked.");

                // Wait for the 'Create' button to be clickable and click it
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']"))).click();
                System.out.println("Create button clicked.");

                // Fill out the 'Name' field
                driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("user");
                System.out.println("Name field filled.");
                
                // Wait for the 'Section' dropdown to be clickable, then select 'Marketing'
                WebElement sectionDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p-dropdown[@formcontrolname='sectionId']")));
                sectionDropdown.click();
                Actions actions = new Actions(driver);
                actions.moveToElement(driver.findElement(By.xpath("//span[text()='Marketing']"))).click().build().perform();
                System.out.println("Section 'Marketing' selected.");

                // Wait for the 'Designation' dropdown to be clickable, then select 'Permanent Employee'
                WebElement designationDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p-dropdown[@formcontrolname='designationId']")));
                designationDropdown.click();
                actions.moveToElement(driver.findElement(By.xpath("//span[text()='Permanent Employee']"))).click().build().perform();
                System.out.println("Designation 'Permanent Employee' selected.");

                // Wait for the 'Reporting Section Designation' dropdown to be clickable, then select 'Finance Hod'
                Thread.sleep(1000);
                WebElement reportingSectionDesignationDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p-dropdown[@formcontrolname='reportingSectionDesignationId']")));
                reportingSectionDesignationDropdown.click();
                actions.moveToElement(driver.findElement(By.xpath("//span[text()='Finance Hod']"))).click().build().perform();
                System.out.println("Reporting Section Designation 'Finance Hod' selected.");
                
                Thread.sleep(1000);
                WebElement office = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p-dropdown[@formcontrolname='officeId']")));
                reportingSectionDesignationDropdown.click();
                actions.moveToElement(driver.findElement(By.xpath("//span[text()='Alangulam']"))).click().build().perform();
                System.out.println("Reporting Section Designation 'Finance Hod' selected.");
                
                
                
                
                
                
                
                
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-text='Approval']"))).click();
                System.out.println("Approval button clicked.");
                
                
                
                

                // Wait for the alert to appear and click the 'OK' button
                WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm swal2-styled')]")));
                okButton.click();
                System.out.println("OK button clicked on alert!");

            } catch (StaleElementReferenceException e) {
                System.out.println("Stale Element Reference Exception caught: " + e.getMessage());
                // Refetch and retry logic here (if needed)
                // Retry the action after refetching elements
            } catch (ElementClickInterceptedException e) {
                System.out.println("Element Click Intercepted Exception caught: " + e.getMessage());
                // Retry with JavaScript execution to bypass blocking elements
                WebElement elementToClick = driver.findElement(By.xpath("//a[text()=' Section Designation ']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementToClick);
                System.out.println("JavaScript click triggered.");
            } catch (Exception e) {
                e.printStackTrace();
                // General exception handling
            }
        }
        
        
}

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

