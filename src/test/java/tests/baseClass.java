import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class chromeExecute {
    DesiredCapabilities dc = new DesiredCapabilities();

    @BeforeTest
    public void setup() {

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
    }

    @Test
    public void calculator() throws InterruptedException, MalformedURLException {
        dc.setCapability("appPackage", "com.oneplus.calculator");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);
        Thread.sleep(4000);

        String num1 = "com.oneplus.calculator:id/digit_5";
        String num2 = "com.oneplus.calculator:id/digit_9";
        String add = "com.oneplus.calculator:id/op_add";
        String eq = "com.oneplus.calculator:id/eq";
        String result = "com.oneplus.calculator:id/result";

        WebElement addNum1 = driver.findElement(By.id(num1));
        addNum1.click();

        WebElement plus = driver.findElement(By.id(add));
        plus.click();

        WebElement addNum2 = driver.findElement(By.id(num2));
        addNum2.click();

        WebElement equals = driver.findElement(By.id(eq));
        equals.click();

        String checkResult = driver.findElement(By.id(result)).getText();

        if (checkResult.equals("14")) {
            System.out.println("Test case Passed");
        } else {
            System.out.println("Test case Failed");
        }
    };

    @Test
    public void chromeCheck() throws InterruptedException, MalformedURLException {
        dc.setCapability("appPackage", "com.flipkart.android");
        dc.setCapability("appActivity", "com.flipkart.android.SplashActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);
        Thread.sleep(4000);

        WebElement selectLang = driver.findElement(By.xpath(("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout")));
        selectLang.click();

        WebElement clickContinue = driver.findElement(By.id("com.flipkart.android:id/select_btn"));
        clickContinue.click();

        Thread.sleep(3000);
        WebElement selectNum = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc='074340 70262']/android.widget.LinearLayout"));
        selectNum.click();

        WebElement continueBt = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
        continueBt.click();

        Thread.sleep(7000);
        WebElement searchForProducts = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
        searchForProducts.click();
    }
}
