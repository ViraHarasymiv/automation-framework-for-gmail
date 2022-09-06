package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TakeMeToGmailPage extends BasePage{

    @AndroidFindBy(id="com.google.android.gm:id/action_done")
    private MobileElement takeMeToGmailButton;

    @AndroidFindBy(id="android:id/message")
    private MobileElement actualMessage;

    public TakeMeToGmailPage selectTakeMeToGmailButton(){
        takeMeToGmailButton.click();
        return this;
    }
    public String getActualMessage(){
        return actualMessage.getText();
    }
}
