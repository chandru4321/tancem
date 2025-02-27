package usermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testrunner {

    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        //sampath
        // Navigate to the login page
       driver.get("https://vividtranstech.com/tancem/#/login"); 

        // Call the grade and section methods from the master class
		
		  master.grade(driver); // Calling the method for 'GradeT' workflow
		  master.section(driver);
		  master.designation(driver);
		  //hthe header
		  /*
		 * master.sectionDesignation(driver); rolemanagement.rolemaster(driver);
		 * rolemanagement.userole(driver); rolemanagement.createuser(driver);
		 * appmodule.moduleform(driver); workflowprocess.workflowprocess1(driver);
		 * workflowprocess.workflowstate(driver);
		 */
	    
	    
        // Calling the method for 'Section' workflow

        // Optionally, you can close the browser after performing the actions
     //   driver.quit();
    }
}
