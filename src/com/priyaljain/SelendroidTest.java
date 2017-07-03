package com.priyaljain;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class SelendroidTest {

    @Test
    public void testShouldCheckVariousFeaturesPresentInTheAppAreWorkingFine() throws Exception {

            AppiumDriver appiumDriver;

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "Moto G3");
            capabilities.setCapability("app", "C:/Appium/sample-code-master/sample-code-master/sample-code/apps/selendroid-test-app.apk");
            AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            driver.findElementById("io.selendroid.testapp:id/buttonTest").click();
            String button_text = driver.findElement(By.id("android:id/button2")).getText();
            Assert.assertEquals("No, no",button_text);
            driver.findElement(By.id("android:id/button2")).click();
            driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();
            driver.findElement(By.id("io.selendroid.testapp:id/goBack")).click();
            driver.findElement(By.id("io.selendroid.testapp:id/input_adds_check_box")).click();
            driver.findElement(By.id("io.selendroid.testapp:id/visibleButtonTest")).click();
            String st2=driver.findElement(By.id("io.selendroid.testapp:id/visibleTextView")).getText();
            Assert.assertEquals("Text is sometimes displayed",st2);
            driver.findElement(By.id("io.selendroid.testapp:id/exceptionTestButton")).click();
            String st3=driver.findElement(By.id("android:id/message")).getText();
            Assert.assertEquals("Unfortunately, selendroid-test-app has stopped.",st3);

            /*driver.findElement(By.id("io.selendroid.testapp:id/goBack")).click();
            driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("Hi i am Priyal");
            String st1=driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).getText();
            Assert.assertEquals("Hi I am Priyal",st1);*/

        }


}
