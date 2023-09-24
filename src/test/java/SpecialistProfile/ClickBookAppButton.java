package SpecialistProfile;

import SpecialistsPage.SpecialistsPageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickBookAppButton {

    @Test
    public void VerifyBookAppButtonIsDisplayed(){
        Assert.assertTrue(SpecialistProfileElements.BookAppButtonIsDisplayed());
        SpecialistProfileElements.clickBookAppButtonButton();
    }
}
