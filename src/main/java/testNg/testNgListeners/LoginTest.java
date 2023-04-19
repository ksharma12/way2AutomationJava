package testNg.testNgListeners;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static testNg.testNgListeners.TestBase.driver;

public class LoginTest extends TestBase{
    @Test
    public void doLogin(){
        driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
        driver.findElement(By.id("next")).click();
    }
}
