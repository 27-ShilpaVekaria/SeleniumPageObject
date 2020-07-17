package org.example;

import org.openqa.selenium.By;

public class EmailAFriend {

    private By _EnterFriendsEmail=By.xpath("//input[@placeholder=\"Enter friend's email.\"]");
    private By _EnterYourEmail=By.xpath("//input[@placeholder=\"Enter your email address.");
    private By _PersonalMessage=By.xpath("//textarea[@name=\"PersonalMessage\"]");
    private  By _SendEmail=By.xpath("//input[@name=\"send-email\"]");
    private By _ExpectedMessage =By.className("//div[@class=\"result\"]");//variable expectedtext defined

}
