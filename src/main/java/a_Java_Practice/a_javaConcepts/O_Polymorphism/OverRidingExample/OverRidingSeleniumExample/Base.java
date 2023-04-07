package a_Java_Practice.a_javaConcepts.O_Polymorphism.OverRidingExample.OverRidingSeleniumExample;

public class Base {

    public WebDriver getBrowserInstance(String browserName){
        if (browserName.equals("firefox")){
            return new FireFoxDriver();
        } else if (browserName.equals("chrome")) {
            return new ChromeDriver();
        } else if (browserName.equals("ie")) {
            return new InternetExplorerDriver();
        }
        return null;
    }
}
