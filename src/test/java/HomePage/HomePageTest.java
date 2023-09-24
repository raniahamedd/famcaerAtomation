package HomePage;
import SpecialistsPage.SpecialistsPageElements;
import WebSetting.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
    WebElement NavbarContentButton,FormHeader,HeaderContent,subHeaderContent,BookFirstSessionButton,
            SpecialistsButtonFromList,scrollTopButton;
    JavascriptExecutor jse;


@Test (priority = 1)
public void verifyLogoImgIsDisplayed(){
    Assert.assertTrue(HomePageElements.getLogoImg().isDisplayed());
}

@Test
public void verifyNavbarContentButtonIsDisplayed(){
    NavbarContentButton = HomePageElements.getNavbarContentButton();
    Assert.assertTrue(NavbarContentButton.isDisplayed());
}

@Test
public void verifyNavbarContentButtonIsCorrect(){
    NavbarContentButton = HomePageElements.getNavbarContentButton();
    Assert.assertEquals(NavbarContentButton.getText(),"انضم كأخصائي");
}

//@Test
//public void verifyClickingNavbarContentButtonOpensForm(){
//    NavbarContentButton = HomePageElements.getNavbarContentButton();
//    NavbarContentButton.click();
//    FormHeader = HomePageElements.getFormHeader();
//    Assert.assertTrue(FormHeader.isDisplayed());
//}

@Test
    public void verifyHeaderContentIsDisplayed(){
    HeaderContent = HomePageElements.getHeaderContent();
    subHeaderContent = HomePageElements.getSubHeaderContent();
    Assert.assertEquals(HeaderContent.getText(),"ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
//    Assert.assertEquals(subHeaderContent.getText(),"لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن");
}

//@Test
//public void verifyFirstSessionButtonIsDisplayed(){
//    Assert.assertTrue(HomePageElements.FirstSessionButtonIsDisplayed());
//    Assert.assertEquals(HomePageElements.getFirstSessionButton().getText(),"احجز جلستك الأولى");
//}

//@Test
//public void verifyClickingBookFirstSessionButtonOpensApp(){
//    BookFirstSessionButton = HomePageElements.getBookFirstSessionButton();
//    BookFirstSessionButton.click();
//    Assert.assertFalse(HeaderContent.isDisplayed());
//}

//@Test
//    public void verifySpecialistsButtonTransformToSpecialistsPage(){
//    SpecialistsButtonFromList = HomePageElements.getSpecialistsButtonFromList();
//    Assert.assertTrue(SpecialistsButtonFromList.isDisplayed());
//    Assert.assertEquals(SpecialistsButtonFromList.getText(),"الأخصائيين");
//}

//@Test
//public void scrollTopIsDisplayed() throws InterruptedException{
//    scrollTopButton = HomePageElements.getscrollTopButton();
//    jse.executeScript("window.scrollBy(0,500)");
//}

//*Specialists
@Test (priority = 1)
public  void VerifyThatSpecialistsButtonFromListIsDisplayed(){
    Assert.assertTrue(HomePageElements.SpecialistsButtonFromListIsDisplayed());
}
}
