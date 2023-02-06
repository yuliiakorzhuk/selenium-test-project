import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
    HomePage homePage;

    @BeforeMethod
    public void beforeTest(){
        homePage = new HomePage(driver);
        homePage.open();
    }

    @Test
    public void verifyTest1Component() {
        softAssert.assertTrue(homePage.getLoginComponent().isEmailInputVisible(),
                "Email input should be present");
        softAssert.assertTrue(homePage.getLoginComponent().isPasswordInputVisible(),
                "Password input should be present");
        softAssert.assertTrue(homePage.getLoginComponent().isSignInButtonVisible(),
                "Sign in button should be present");

        homePage.getLoginComponent().fillEmail("test@gmail.com");
        homePage.getLoginComponent().fillPassword("password");
        //missing assert in requirements ?
        softAssert.assertAll();
    }

    @Test
    public void verifyTest2Component() {
        softAssert.assertEquals(homePage.getListComponent().getListItemsCount(), 3,
                "List item number should be 3");
        softAssert.assertTrue(homePage.getListComponent().getListItem(2).contains("List Item 2"),
                "List item 2 should be as expected");
        softAssert.assertTrue(homePage.getListComponent().getListItem(2).contains("6"),
                "List item 2 value should be as expected");
        softAssert.assertAll();
    }

    @Test
    public void verifyTest3Component() {
        softAssert.assertEquals(homePage.getOptionComponent().getSelectedOption(), "Option 1",
                "Selected Option should be as expected");

        homePage.getOptionComponent().selectOption("Option 3");

        //maybe following assertion should be added ?
        //softAssert.assertEquals(homePage.optionComponent.getSelectedOption(), "Option 3", "");
        softAssert.assertAll();
    }

    @Test
    public void verifyTest4Component() {
        softAssert.assertTrue(homePage.getButtonsComponent().isButtonEnabled(1),
                "Button should be enabled");
        softAssert.assertFalse(homePage.getButtonsComponent().isButtonEnabled(2),
                "Button should be disabled");
        softAssert.assertAll();
    }

    @Test
    public void verifyTest5Component() {
        homePage.getSingleButtonComponent().waitAndClickButton();

        softAssert.assertTrue(homePage.getSingleButtonComponent().isSuccessMessageDisplayed(),
                "Success message should be present");
        softAssert.assertFalse(homePage.getSingleButtonComponent().isButtonEnabled(),
                "Button should be enabled");
        softAssert.assertAll();
    }

    @Test
    public void verifyTest6Component() {
        Assert.assertEquals(homePage.getTableComponent().getCellValue(2,2), "Ventosanzap",
                "Cell value should be as expected");
    }
}
