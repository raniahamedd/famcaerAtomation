package SpecialistProfile;

import WebSetting.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SpecialistProfileElements {

    public static WebElement getPageName(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/h2"));
    }
    public static Boolean PageNameIsDisplayed(){
        return getPageName().isDisplayed();
    }

    public static WebElement getSpecialistProfileImage(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/img"));
    }
    public static Boolean SpecialistProfileImageIsDisplayed(){
        return getSpecialistProfileImage().isDisplayed();
    }
    public static WebElement getBookAppButton(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/a"));
    }
    public static Boolean BookAppButtonIsDisplayed(){
        return getBookAppButton().isDisplayed();
    }
    public static void clickBookAppButtonButton(){
        getBookAppButton().click();
    }
}
