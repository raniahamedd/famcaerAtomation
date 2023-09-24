package JoinFamcareCommunity;

import HomePage.HomePageElements;
import WebSetting.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;;

public class JoinFamcareElements {

//Email Input Elements
    public static WebElement getEmailInputField(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/div/input[1]"));
    }
    public static Boolean EmailInputFieldIsDisplayed(){

        return getEmailInputField().isDisplayed();
    }
    public static void sendKeysEmailField(String Email){
        getEmailInputField().sendKeys(Email);
    }

//  Subscription Button Elements
    public static WebElement getSubscriptionButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/div/input[2]"));
    }

    public static Boolean SubscriptionButtonIsDisplayed(){

        return getSubscriptionButton().isDisplayed();
    }
    public static void clickSubscriptionButton(){

        getSubscriptionButton().click();
    }

    public static WebElement getSuccessMsg(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[2]/div/h2/strong"));
    }

    public static Boolean SuccessMsgIsDisplayed(){

        return getSuccessMsg().isDisplayed();
    }


}
