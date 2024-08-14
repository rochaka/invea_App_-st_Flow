import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Real_device {
    static AppiumDriver driver;

    public static void main(String[] args) {
        try {
            openMobileApp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void openMobileApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Rochaka");
        cap.setCapability("udid", "R58T20MJGCN");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "13");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "com.ubercab");
        cap.setCapability("appActivity", "com.ubercab.presidio.app.core.root.RootActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url, cap);

        // Verify if the session was created successfully
        if (driver != null) {
            System.out.println("Session created successfully!");
        } else {
            System.out.println("Failed to create session.");
        }
    }
}
