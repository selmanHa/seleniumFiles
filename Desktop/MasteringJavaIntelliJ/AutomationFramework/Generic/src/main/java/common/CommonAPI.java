package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver wd = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp( String url){

        System.setProperty("webdriver.chrome.driver",
                "/Users/sams/Desktop/MasteringJavaIntelliJ/seleniumProject1/browser-driver/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/Users/sams/Downloads/chromedriver");
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS.SECONDS);
        //wd.get("https://www.amazon.com");
        //wd.get("https://www.cnn.com");
        //wd.get("https://khanacademy.org");
        //wd.get("https://www.youtube.com");
        //wd.get("https://www.stackoverflow.com");
        wd.get(url);

    }

    @AfterMethod
    public void doCleanUp(){
        wd.close();
    }

}
