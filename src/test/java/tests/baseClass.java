////package tests;
////
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
//
//import java.net.MalformedURLException;
//import java.net.URL;
////
//public class baseClass {
////
//    @BeforeTest
//    public void setup() throws MalformedURLException, InterruptedException {
//
//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
//        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
//
//        dc.setCapability("appPackage", "com.android.chrome");
//        dc.setCapability("appActivity", "com.google.android.gms.common.api.GoogleApiActivity");
//
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//
//        AndroidDriver driver = new AndroidDriver(url, dc);
//        Thread.sleep(4000);
//
////        String googleLogo = "com.oneplus.calculator:id/digit_5";
////        String num2 = "com.oneplus.calculator:id/digit_9";
////        String add = "com.oneplus.calculator:id/op_add";
////        String eq = "com.oneplus.calculator:id/eq";
////        String result = "com.oneplus.calculator:id/result";
////
////        WebElement addNum1 = driver.findElement(By.id(num1));
////        addNum1.click();
////
////        WebElement plus = driver.findElement(By.id(add));
////        plus.click();
////
////        WebElement addNum2 = driver.findElement(By.id(num2));
////        addNum2.click();
////
////        WebElement equals = driver.findElement(By.id(eq));
////        equals.click();
////
////        WebElement results = driver.findElement(By.id(result));
////        String checkResult = driver.findElement(By.id(result)).getText();
//////        if(assert checkResult == "14" : "Passed"){
//////    }
////        if (checkResult.equals("14")) {
////            System.out.println("Test case Passed");
////        } else {
////            System.out.println("Test case Failed");
////        }
////    }
////
////    @Test
////    public void sampleTest() {
////        System.out.println("i am inside sample test");
////    }
////
////    @AfterTest
////    public void tearDown() {
////
////    }
////}
