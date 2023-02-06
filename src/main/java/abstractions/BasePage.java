package abstractions;

import org.openqa.selenium.WebDriver;

public class BasePage {
    private final WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

}
