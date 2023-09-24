package Blogs;

import HomePage.HomePageElements;
import SpecialistProfile.SpecialistProfileElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickBlogButton {
    @Test
    public void ClickBlogButton(){
        Assert.assertTrue(HomePageElements.BlogButtonButtonIsDisplayed());
        HomePageElements.clickBlogButtonButton();
    }
}
