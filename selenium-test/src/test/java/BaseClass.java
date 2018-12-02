import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    private final static String pathToDriver ="C:\\Users\\kshegolev\\IdeaProjects\\seleniumStudy\\selenium-test\\drivers\\chromedriver.exe";
    private final static String prop = "webdriver.chrome.driver";
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty(prop,pathToDriver);
    }

    @BeforeMethod(description = "Инициализация браузера")
    public void beforeMethod(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("disable-popup-blocking");
        options.addArguments("--disable-notifications");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @AfterMethod(description = "Закрытие браузера")
    public void afterMethod(){
        driver.close();
    }

}
