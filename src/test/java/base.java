
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
    public static void main(String[] args) {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 emulator");
        cap.setCapability(MobileCapabilityType.APP,"");

    }
}
