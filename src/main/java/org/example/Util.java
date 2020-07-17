package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Util extends BasePage {
    public static void clickOnElement(By by)//
    {
        driver.findElement(by).click();
    }

    public static void clickOnLink(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }

    public static void selectDropDownByIndex(By by, int text2) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(text2);
    }

    public static void selectDropdownByValue(By by, String value1) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value1);
    }

    public static void selectByVisibleText(By by, String text1) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text1);
    }

    public static String gettext1(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp(){
        return (System.currentTimeMillis());
    }



}