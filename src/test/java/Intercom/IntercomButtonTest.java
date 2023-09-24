package Intercom;

import HomePage.HomePageElements;
import WebSetting.SetUp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntercomButtonTest {

    @Test(priority = 1)
    public  void VerifyThatIntercomIsDisplayed()  {
        Assert.assertTrue(HomePageElements.IntercomButtonIsDisplayed());
    }

    @Test(priority = 2)
    public void ClickIntercomButton(){
        HomePageElements.clickIntercomButton();
    }

//
//    @Test(priority = 3)
//    public void ClickHelpButton(){
//       Assert.assertTrue(IntercomElements.helpButtonIsDisplayed());
//        IntercomElements.clickHelpButton();
//    }
//
//    @Test(priority = 4)
//    public void VerifyHelpContentIsDisplayed(){
//        Assert.assertTrue(IntercomElements.helpContentIsDisplayed());
//    }
}
