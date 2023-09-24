package JoinFamcareCommunity;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriptionSuccessfullyTest {

    @Test(priority = 1)
    public void VerifySuccessMsgIsDisplayed(){
        Assert.assertTrue(JoinFamcareElements.SuccessMsgIsDisplayed());
    }

}
