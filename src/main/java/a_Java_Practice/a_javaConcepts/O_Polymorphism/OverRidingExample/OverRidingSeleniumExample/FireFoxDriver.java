package a_Java_Practice.a_javaConcepts.O_Polymorphism.OverRidingExample.OverRidingSeleniumExample;

public class FireFoxDriver extends WebDriver {

    public void click(){
        System.out.println("clicking on firefox");
    }

    public void sendKeys(){
        System.out.println("sendKeys on firefox");
    }

}
