package JoinAsSpecialistPopup;

import HomePage.HomePageElements;
import WebSetting.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class JoinsAsSpecialistPopupElements {

    public static WebElement getFullNameField(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[2]/input"));
    }
    public static void sendKeysFullName(String fullName){
        //enter the text to the field
        getFullNameField().sendKeys(fullName);
    }
    //Phone
    public static WebElement getPhoneField(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[3]/input"));
    }
    public static void sendKeysPhoneField(String Phone){
        getPhoneField().sendKeys(Phone);
    }
    //
    public static WebElement getDegreeField(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[4]/input"));
    }
    public static void sendKeysDegreeField(String Degree){
        getDegreeField().sendKeys(Degree);
    }
    //Specialization
    public static WebElement getSpecialistField(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[5]/input"));
    }
    public static void sendKeysSpecialistField(String Specialization){
        getSpecialistField().sendKeys(Specialization);
//        getSuccessMessageAlret().sendKeys(Keys.ENTER);
    }

    public static WebElement getYearsField(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[6]/input"));
    }
    public static void sendKeysYearsField(String Years){
        getYearsField().sendKeys(Years);
    }
    public static WebElement getSocialField(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[7]/input"));
    }
    public static void sendKeysSocialField(String Social){
        getSocialField().sendKeys(Social);
    }
    public static WebElement getSendButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/input"));
    }
    public static void clickSendButton(){
        getSendButton().click();
    }

    public static WebElement getSuccessMessageAlret(){
        HomePageElements.waitForElementToBeVisibleBy(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[8]"));
        return SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[8]"));
    }
}
