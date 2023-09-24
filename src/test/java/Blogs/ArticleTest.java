package Blogs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArticleTest {
    @Test
    public void VerifyThatArticleDetailsSectionIsDisplayed(){
        Assert.assertTrue(BlogElements.ArticleDetailsIsDisplayed());
    }

}
