package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    @AndroidFindBy(accessibility = "Gmail")
    private MobileElement gmailApp;

    public TakeMeToGmailPage selectGmailApp(){
        gmailApp.click();
        return new TakeMeToGmailPage();
    }
}
