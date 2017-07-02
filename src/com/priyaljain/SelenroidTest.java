package com.priyaljain;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

public class SelenroidTest {

    package com.priyaljain;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

    public class Main {

        public static void main(String[] args) throws IOException {

            AppiumDriver appiumDriver;

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "Moto G3");
            capabilities.setCapability("app", "C:/Appium/sample-code-master/sample-code-master/sample-code/apps/selendroid-test-app.apk");
            AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            driver.findElementById("io.selendroid.testapp:id/buttonTest").click();
            driver.findElement(By.id("android:id/button2")).click();

        }
    }

}
