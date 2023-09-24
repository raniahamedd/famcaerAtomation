package Search;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchSenarioTest {
    @Test
    public void VerifyContactUsButtonIsDisplayed(){
        Assert.assertTrue(SearchElements.ContactUsButtonIsDisplayed());
    }

}
