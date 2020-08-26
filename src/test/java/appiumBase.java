import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class appiumBase {



    public static void main(String[] args) throws MalformedURLException {
        Capabilities();
    }

    public static AndroidDriver<AndroidElement> Capabilities () throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Android Device");
        cap.setCapability("udid", "61c2be7e");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","6.0.1");
        cap.setCapability("appPackage", "com.oneplus.calculator");
        cap.setCapability("appActivity","com.oneplus.calculator.Calculator");

        AndroidDriver<AndroidElement>driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;

    }
}
