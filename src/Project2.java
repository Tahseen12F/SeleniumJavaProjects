//Let us consider a test case in which we will try to automate the following scenarios in Google Chrome browser.
//Launch Chrome browser.
//Maximize the browser.
//Open URL: https://www.geeksforgeeks.org
//Maximize the screen
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Project2 {

    public static void main(String[] args) {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch website
        driver.get("https://www.geeksforgeeks.org/");

        //Maximize the browser
        driver.manage().window().maximize();

    }
}
