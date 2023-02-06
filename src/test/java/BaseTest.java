import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    WebDriver driver;
    SoftAssert softAssert;

    @BeforeMethod
    public void createDriver(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.softAssert = new SoftAssert();
    }

    @AfterMethod
    public void quitDriver() {
        this.driver.quit();
    }
}
