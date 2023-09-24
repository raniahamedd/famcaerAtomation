package Search;

import HomePage.HomePageElements;
import WebSetting.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchElements {
    public static WebElement getContactUsButton(){

        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[4]/div/div/div/a"));
    }
    public static boolean ContactUsButtonIsDisplayed(){
        return getContactUsButton().isDisplayed();
    }
    public static void ClickContactUsButton(){
        getContactUsButton().click();
    }

    public static WebElement getPageName(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1"));
    }
    public static Boolean PageNameIsDisplayed(){
        return getPageName().isDisplayed();
    }
    public static WebElement getSearchInput(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/label/input"));
    }
    public static boolean SearchInputIsDisplayed(){
        return getSearchInput().isDisplayed();
    }
    public static void sendKeysSearchInput(String name){
        getSearchInput().sendKeys(name);
    }

    public static WebElement getName(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/h2/a"));
    }
    public static boolean NameIsDisplayed(){
        return getName().isDisplayed();
    }




}
