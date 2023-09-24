package SpecialistsPage;

import HomePage.HomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clickSpecialistsButtonFromList {

    @Test(priority = 1)
    public void VerifyThatSpecialistsButtonFromListIsDisplayed(){
        Assert.assertTrue(HomePageElements.SpecialistsButtonFromListIsDisplayed());
        HomePageElements.clickSpecialistsButtonFromList();
    }
}
