package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Util {

    //By.xpath("//a[text()=\"Register\"]"));//home page
   // clickOnLink(By.xpath("//div[@class=\"gender\"]/span[2] "));//
    private  By _FirstName= By.id("FirstName");
    private By _LastName=By.id("LastName");
    private By _DateOfBirthDay= By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _DateOfBirthMonth=By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _DateOfBirthYear=By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _Email=By.xpath("//input[@id=\"Email\"]");

}
