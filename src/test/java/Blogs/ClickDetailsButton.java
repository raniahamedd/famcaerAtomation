package Blogs;

import HomePage.HomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickDetailsButton {
    @Test
    public void ClickDetailsButton(){
        Assert.assertTrue(BlogElements.DetailsButtonIsDisplayed());
        BlogElements.clickHelpButton();
    }
}
