package SpecialistsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class clickSpecialistsProfileButton {

    @Test
    public void VerifySpecialistsProfileButtonIsDisplayed(){
        Assert.assertTrue(SpecialistsPageElements.SpecialistsProfileButtonIsDisplayed());
        SpecialistsPageElements.clickSpecialistsProfileButton();
    }
}
