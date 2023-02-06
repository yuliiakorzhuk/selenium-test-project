import abstractions.BasePage;
import components.*;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

@Setter
@Getter
public class HomePage extends BasePage {
    private static final String HOME_PAGE_URL = "http://localhost:63342/selenium-test-project/src/testapplication/QE-index.html";

    private LoginComponent loginComponent;
    private ListComponent listComponent;
    private OptionComponent optionComponent;
    private ButtonsComponent buttonsComponent;
    private SingleButtonComponent singleButtonComponent;
    private TableComponent tableComponent;

    public HomePage(WebDriver driver) {
        super(driver);
        this.setLoginComponent(new LoginComponent(driver));
        this.setListComponent(new ListComponent(driver));
        this.setOptionComponent(new OptionComponent(driver));
        this.setButtonsComponent(new ButtonsComponent(driver));
        this.setSingleButtonComponent(new SingleButtonComponent(driver));
        this.setTableComponent(new TableComponent(driver));
    }

    public void open() {
        super.open(HOME_PAGE_URL);
    }

}
