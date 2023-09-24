package SpecialistsPage;

import WebSetting.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SpecialistsPageElements {

    public static WebElement getPageName(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1"));
    }
    public static Boolean PageNameIsDisplayed(){
        return getPageName().isDisplayed();
    }
    public static WebElement getSpecialistsProfileButton(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/a[1]"));
    }
    public static Boolean SpecialistsProfileButtonIsDisplayed(){
        return getSpecialistsProfileButton().isDisplayed();
    }
    public static void clickSpecialistsProfileButton(){
        getSpecialistsProfileButton().click();
    }

}
