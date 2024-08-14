import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class Test_Launch {
    static AndroidDriver driver;

    public static void main(String[] args) {
        try {
            openMobileApp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void openMobileApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "sdk_gphone64_x86_64");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "15");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "com.ubercab");
        cap.setCapability("appActivity", "com.ubercab.presidio.app.core.root.RootActivity");

        // Add more capabilities if needed
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);

        // Verify if the session was created successfully
        System.out.println("Session created successfully!");
    }
}
