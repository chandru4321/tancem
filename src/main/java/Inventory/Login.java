package Inventory;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login{
	//login pannel
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Testing started");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://vividtranstech.com/tancem/#/login");

        // Perform sign-in
        driver.findElement(By.xpath("(//span[text()='Sign In'])")).click();
        System.out.println("Login successful");
        Thread.sleep(2000);

        // Navigate to the 'WORKFLOW' section
        Actions actions84 = new Actions(driver);
        actions84.moveToElement(driver.findElement(By.xpath("//h5[text()='WORKFLOW']"))).click().build().perform();
        Thread.sleep(2000);

        // Click on the 'Create' button in the workflow section
        Actions actions8 = new Actions(driver);
        actions8.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Create']"))).click().build().perform();

        // Fill out the form
        driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("GradeT");
        driver.findElement(By.xpath("//input[@formcontrolname='sortOrder']")).sendKeys("1");
        Thread.sleep(1000);

        // Click on the 'Approval' button
        driver.findElement(By.xpath("//button[@data-text='Approval']")).click();

        // Wait for the alert to be visible and clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'swal2-confirm')]")));

        // Click on the 'OK' button in the alert
        okButton.click();

        System.out.println("OK button clicked on alert!");

        // Optionally, you can close the browser after completion
        driver.quit();
    }
}
