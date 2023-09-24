package Intercom;

import HomePage.HomePageElements;
import WebSetting.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IntercomElements {
    public static WebElement getHelpButton(){
        HomePageElements.waitForElementToBeVisibleBy(By.xpath("//*[@id=\"intercom-container\"]/div/div/div/div[1]/button[3]/div"));
        return SetUp.driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div/div/div[1]/button[3]/div"));
    }
    public static Boolean helpButtonIsDisplayed(){
        return getHelpButton().isDisplayed();
    }
    public static void clickHelpButton(){
        getHelpButton().click();
    }
public static WebElement getHelpContentButton(){
    return SetUp.driver.findElement(By.xpath("//*[@id=\"spaces-help\"]/div[2]/div/div/div/div[1]/div/div/div/nav/div[1]/h1\n"));
}
    public static Boolean helpContentIsDisplayed(){
        return getHelpContentButton().isDisplayed();
    }

}
