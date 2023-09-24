package Search;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchSenarioAfterClickTest {
    @Test(priority = 1)
    public void VerifyHeaderContentIsDisplayed(){
        Assert.assertTrue(SearchElements.PageNameIsDisplayed());
    }
    @Test(priority = 2)
    public void VerifySearchInputIsDisplayed(){
        Assert.assertTrue(SearchElements.SearchInputIsDisplayed());
    }
    @Test(priority = 3)
    public void VerifyDataSendCorrectly(){
        SearchElements.sendKeysSearchInput("عفاف احمد");
        SearchElements.getSearchInput().sendKeys(Keys.ENTER);
    }

    @Test(priority = 4)
    public void VerifyNameIsDisplayed(){
        Assert.assertTrue(SearchElements.NameIsDisplayed());
    }

    @Test(priority = 5)
    public void VerifyNameIsMatched(){
        Assert.assertEquals(SearchElements.getName().getText(),"عفاف احمد");
    }
    @Test(priority = 6)
    public void ClickName(){
        SearchElements.getName().click();
    }
}
