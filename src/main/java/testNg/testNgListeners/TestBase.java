package testNg.testNgListeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;
    @BeforeSuite
    public void setup(){
        if(driver == null) {
            driver = new ChromeDriver();
            driver.get("https://www.gmail.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
