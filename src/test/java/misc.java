import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class misc extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Current Activity : " + driver.currentActivity());
        System.out.println("Context : " + driver.getContext());
        System.out.println("Phone orientation : " + driver.getOrientation());
        System.out.println("Is Locked? " + driver.isDeviceLocked());

    }
}
