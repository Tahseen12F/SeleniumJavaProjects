import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Project1 {
    public static void main(String[] args) {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

// Launch website
        driver.navigate().to("https://www.google.co.in/");

        // Click on the search text box and send value
        driver.findElement(By.name("q")).sendKeys("Geeks for Geeks", Keys.ENTER);

        // Click on the search button
        driver.findElement(By.className("gNO89b")).click();

    }

}
