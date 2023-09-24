package JoinAsSpecialistPopup;

import HomePage.HomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinsAsSpecialistPopupTest {
    @Test (priority = 1)
    public void verifyThatDataSentCorrectly(){
        JoinsAsSpecialistPopupElements.sendKeysFullName("Rania Hamed");
        JoinsAsSpecialistPopupElements.sendKeysPhoneField("0597981050");
        JoinsAsSpecialistPopupElements.sendKeysDegreeField("master degree");
        JoinsAsSpecialistPopupElements.sendKeysSpecialistField("Engineering");
        JoinsAsSpecialistPopupElements.sendKeysYearsField("3");
        JoinsAsSpecialistPopupElements.sendKeysSocialField("Yes");
        JoinsAsSpecialistPopupElements.clickSendButton();
    }
    @Test (priority = 2)
    public void VerifySuccessMessageIsDisplayed(){
        HomePageElements.scrollDownToVisibleElement(JoinsAsSpecialistPopupElements.getSuccessMessageAlret());
        Assert.assertTrue(JoinsAsSpecialistPopupElements.getSuccessMessageAlret().isDisplayed());
    }
}
