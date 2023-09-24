package Search;

import HomePage.HomePageElements;
import org.testng.annotations.Test;

public class ClickContactUsButton {

    @Test
    public void clickContactUsButton(){
//        HomePageElements.scrollDownToVisibleElement(SearchElements.getContactUsButton());
        SearchElements.ClickContactUsButton();
    }
}
