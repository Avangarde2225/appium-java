import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;

public class gestures extends base {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        TouchActions touch = new TouchActions(driver);

    }
}
