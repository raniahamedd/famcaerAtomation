package JoinAsSpecialistPopup;

import HomePage.HomePageElements;
import SpecialistProfile.SpecialistProfileElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickJoinAsSpecialistButton {

    @Test (priority = 1)
    public void VerifyJoinAsSpecialistIsDisplayed(){
        Assert.assertTrue(HomePageElements.getJoinAsSpecialistButton().isDisplayed());
        HomePageElements.clickJoinAsSpecialistButton();
    }

}
