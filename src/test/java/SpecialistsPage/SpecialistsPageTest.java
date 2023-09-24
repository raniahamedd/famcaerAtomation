package SpecialistsPage;

import HomePage.HomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpecialistsPageTest {

    @Test (priority = 1)
    public  void VerifyThatPageNameIsDisplayed(){
        Assert.assertTrue(SpecialistsPageElements.PageNameIsDisplayed());
    }
    @Test
    public void VerifySpecialistsProfileButtonIsDisplayed(){
        Assert.assertTrue(SpecialistsPageElements.SpecialistsProfileButtonIsDisplayed());
    }
}
