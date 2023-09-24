package SpecialistProfile;

import SpecialistsPage.SpecialistsPageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpecialistProfileTest {


    @Test(priority = 1)
    public  void VerifyThatPageNameIsDisplayed(){
        Assert.assertTrue(SpecialistProfileElements.PageNameIsDisplayed());
    }
    @Test(priority = 1)
    public  void VerifySpecialistProfileImageIsDisplayed(){
        Assert.assertTrue(SpecialistProfileElements.SpecialistProfileImageIsDisplayed());
    }
    @Test(priority = 1)
    public  void VerifyThatBookAppButtonIsDisplayed(){
        Assert.assertTrue(SpecialistProfileElements.BookAppButtonIsDisplayed());
    }

}
