package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {


    private static AppiumDriver<MobileElement> appiumDriver;

    public static AppiumDriver getAppiumDriver() throws InterruptedException {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
           desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));

          //  desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, ConfigReader.getProperty("browserName"));
         //  desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\asus\\IdeaProjects\\AppiumTasks\\Drivers\\chromedriver.exe");

           desiredCapabilities.setCapability(MobileCapabilityType.APP, ConfigReader.getProperty("appPath"));
         desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            desiredCapabilities.setCapability("autoAcceptAlert",true);
            desiredCapabilities.setCapability("newCommandTimeout",0);



            if (ConfigReader.getProperty("platformName").equals("android")) {
                //if you do not provide app path so you should provide "appPackage" and "appActivity"
       //  desiredCapabilities.setCapability("appPackage","com.touchboarder.android.api.demos");
       //desiredCapabilities.setCapability("appActivity","com.touchboarder.androidapidemos.mainActivity");
                assert appiumServerURL != null;
                appiumDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);
                appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }

            else if (ConfigReader.getProperty("platformName").equals("ios")) {
                //if you do not provide app path so you should use "bundleId"
                desiredCapabilities.setCapability("bundleId",ConfigReader.getProperty("iosBundleId"));
                appiumDriver = new IOSDriver(appiumServerURL,desiredCapabilities);
                appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
            else {
                throw new UnsupportedOperationException("Invalid Platform Name " + ConfigReader.getProperty("platformName"));
            }
        }



        return appiumDriver;
    }


    public static void quitAppiumDriver(){
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }
    }
}
