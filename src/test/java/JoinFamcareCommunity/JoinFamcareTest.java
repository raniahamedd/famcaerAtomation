package JoinFamcareCommunity;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinFamcareTest {

//    @Test(priority = 1)
//    public void VerifyEmailInputIsDisplayed(){
//        Assert.assertTrue(JoinFamcareElements.EmailInputFieldIsDisplayed());
//    }
    @Test(priority = 2)
    public void CheckSendInputCorrectly(){
        JoinFamcareElements.sendKeysEmailField("raniahameddd2001@gmail.com");
    }
//    @Test(priority = 3)
//    public void VerifySubscriptionButtonIsDisplayed(){
//        Assert.assertTrue(JoinFamcareElements.SubscriptionButtonIsDisplayed());
//    }
    @Test(priority = 4)
    public void ClickSubscriptionButton(){
        JoinFamcareElements.clickSubscriptionButton();
    }
}
