package testNg.parallelTest;

import a_Java_Practice.a_javaConcepts.O_Polymorphism.OverRidingExample.OverRidingSeleniumExample.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {
    // this means this test would run 5 times
    // parallel testNg is not supported thus using the threadPoolSize
    @Test(invocationCount = 5,threadPoolSize = 5)
    public void executeTest(){
        driver = getDriver("chrome");
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
