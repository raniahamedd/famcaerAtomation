package Blogs;

import HomePage.HomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest {

    @Test(priority = 1)
    public  void VerifyThatBlogsSectionIsDisplayed()  {
        Assert.assertTrue(BlogElements.BlogsSectionIsDisplayed());
    }

    @Test(priority = 1)
    public  void VerifyDetailesButtonIsDisplayed()  {
        Assert.assertTrue(BlogElements.DetailsButtonIsDisplayed());
    }


}
