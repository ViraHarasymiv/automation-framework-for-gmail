import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ErrorMessageTest extends BaseTest{

    private static final String ERROR_MESSAGE = "Please add at least one email address";

    @Test
    public void checkMessageAboutAddingAtLeastOneEmail(){
        HomePage homePage = new HomePage();
        String actualMessage = homePage.selectGmailApp()
                .selectTakeMeToGmailButton()
                .getActualMessage();
        Assert.assertTrue(actualMessage.contains(ERROR_MESSAGE));
    }
}
