import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class dragAndDrop extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();

        TouchAction touch = new TouchAction(driver);

        WebElement first = driver.findElementsByClassName("android.view.View").get(0);
        WebElement last = driver.findElementsByClassName("android.view.View").get(1);

        touch.longPress(longPressOptions().withElement(element(first))).moveTo(element(last)).release().perform();
    }
}
