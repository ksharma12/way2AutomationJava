package a_Java_Practice.a_javaConcepts.O_Polymorphism.OverRidingExample.OverRidingSeleniumExample;

public class TestCase1 extends Base{
    String browserName = "chrome";
    public void initBrowser(String browserName){
        WebDriver driver = getBrowserInstance(browserName);
    }
    public static void main(String[] args) {
        TestCase1 tc = new TestCase1();
        WebDriver driver = tc.getBrowserInstance(tc.browserName);
        driver.sendKeys();
        driver.click();
    }
}
