package pages.pragmatic;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import pages.base.BasePage;

public class PragmaticPage extends BasePage {

    private static final String PRAGMATIC_PAGE = "https://shop.pragmatic.bg/";
    private static final By ACCOUNT_DROPDOWN_MENU = By.cssSelector(".dropdown .hidden-xs.hidden-sm.hidden-md");
    private static final By REGISTER_OPTION = By.cssSelector(".dropdown-menu.dropdown-menu-right a");
    private static final By FIRST_NAME_FIELD = By.id("input-firstname");
    private static final By LAST_NAME_FIELD = By.id("input-lastname");
    private static final By EMAIL_FIELD = By.id("input-email");
    private static final By TELEPHONE_FIELD = By.id("input-telephone");
    private static final By PASSWORD_FIELD = By.id("input-password");
    private static final By PASSWORD_CONFIRMATION_FIELD = By.id("input-confirm");
    private static final By CHECKBOX_AGREE = By.cssSelector("[name='agree']");
    private static final By CONTINUE_BUTTON = By.cssSelector(".btn.btn-primary");
    private static final By TEXT_ACCOUNT_CREATED = By.xpath("//h1[contains(text(), 'Your Account Has Been Created!')]");

    public static void goToPragmaticPage() {
        driver.get(PRAGMATIC_PAGE);
    }

    public static void clickAccountDropdownMenu() {
        clickOnWebElementByLocator(ACCOUNT_DROPDOWN_MENU);
    }

    public static void clickRegisterOption() {
        clickOnWebElementByLocator(REGISTER_OPTION);
    }

    public static void writeInFirstNameField() {
        writeTextInWebElement(FIRST_NAME_FIELD, "Paulina");
    }

    public static void writeInLastNameField() {
        writeTextInWebElement(LAST_NAME_FIELD, "Deneva");
    }

    public static void writeInEmailField() {
        String sufix = RandomStringUtils.randomAlphabetic(10);
        String prefix = RandomStringUtils.randomAlphabetic(5);
        String emailAddress = sufix + "@" + prefix + ".com";
        writeTextInWebElement(EMAIL_FIELD, emailAddress);
    }

    public static void writeInTelephoneField() {
        String lastDigits = RandomStringUtils.randomNumeric(8);
        String telephoneNumber = "08" + lastDigits;
        writeTextInWebElement(TELEPHONE_FIELD, telephoneNumber);
    }

    public static void writeInPasswordField() {
        writeTextInWebElement(PASSWORD_FIELD, "parola123!");
    }

    public static void writeInPasswordConfirmationField() {
        writeTextInWebElement(PASSWORD_CONFIRMATION_FIELD, "parola123!");
    }

    public static void clickCheckboxAgree() {
        clickOnWebElementByLocator(CHECKBOX_AGREE);
    }

    public static void clickContinueButton() {
        clickOnWebElementByLocator(CONTINUE_BUTTON);
    }

    public static String getTextAccountCreated() {
        return driver.findElement(TEXT_ACCOUNT_CREATED).getText();
    }

}
