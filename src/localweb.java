import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class localweb {
    public static RemoteWebDriver driver;

    public static  String AUTOMATE_USERNAME = "hritikmishra_Mb75Nr";
    public static  String AUTOMATE_ACCESS_KEY = "HtqCHwsiwHKpUycpLKbv";
    public static  String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1920x1080");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("os", "Windows");
        caps.setCapability("name", "Sample Test");
        caps.setCapability("build", "BStack test");
        caps.setCapability("browserstack.local", "true");

        driver = new RemoteWebDriver(new URL(URL), caps);

        //        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
//        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/test.html");
        Thread.sleep(5000);
         WebElement radio = driver.findElement(By.xpath("/html/body/form[1]/input[2]"));
         radio.click();
        driver.findElement(By.xpath("/html/body/form[1]/input[5]")).click();
        driver.findElement(By.xpath("/html/body/form[1]/input[6]")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,1300)");
        driver.findElement(By.xpath("/html/body/a")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}




