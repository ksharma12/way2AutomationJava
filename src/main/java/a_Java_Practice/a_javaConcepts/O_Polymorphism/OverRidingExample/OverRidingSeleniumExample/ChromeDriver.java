package a_Java_Practice.a_javaConcepts.O_Polymorphism.OverRidingExample.OverRidingSeleniumExample;

public class ChromeDriver extends WebDriver{
    public void click(){
        System.out.println("clicking on chrome");
    }

    public void sendKeys(){
        System.out.println("sendKeys on chrome");
    }

}
