package jenkin;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jenk {
public void main(String args[]) 

{
	System.out.println("Hello JAR Hw are you.");
}
    @Test
    public void yourTestMethod() {
        // Set up Chrome driver
        WebDriverManager.chromedriver().setup();
        
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Navigate to Google
        driver.get("http://www.google.com");
        
        // Print a message
        System.out.println("Test Passed");
        
        // Close the driver
        driver.quit();
    
}
}