package SeleniumOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_Browsers {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();

        if (driver.getTitle().toLowerCase().contains("Selenium".toLowerCase())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        driver.quit();
    }
}
