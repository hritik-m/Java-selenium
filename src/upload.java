import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class upload {
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
       // caps.setCapability("browserstack.local", "true");

        driver = new RemoteWebDriver(new URL(URL), caps);

        //        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
//        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement upload= driver.findElement(By.id("file-upload"));
        upload.sendKeys("/Users/hritikmishra/Desktop/my website/pic/browserstackpic.png");

        WebElement done = driver.findElement(By.id("file-submit"));
        done.click();
        Thread.sleep(4000);

        driver.quit();
    }
}



