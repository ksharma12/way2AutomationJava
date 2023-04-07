package a_Java_Practice.a_javaConcepts.O_Polymorphism.OverRidingExample.OverRidingSeleniumExample;

public class InternetExplorerDriver extends WebDriver{
    public void click(){
        System.out.println("clicking on IE");
    }

    public void sendKeys(){
        System.out.println("sendKeys on IE");
    }

}
