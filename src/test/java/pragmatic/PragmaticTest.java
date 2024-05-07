package pragmatic;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.pragmatic.PragmaticPage;

public class PragmaticTest extends BaseTest {

    @Test

    public void testCreateRegistration() {
        PragmaticPage.goToPragmaticPage();
        PragmaticPage.clickAccountDropdownMenu();
        PragmaticPage.clickRegisterOption();
        PragmaticPage.writeInFirstNameField();
        PragmaticPage.writeInLastNameField();
        PragmaticPage.writeInEmailField();
        PragmaticPage.writeInTelephoneField();
        PragmaticPage.writeInPasswordField();
        PragmaticPage.writeInPasswordConfirmationField();
        PragmaticPage.clickCheckboxAgree();
        PragmaticPage.clickContinueButton();
        PragmaticPage.getTextAccountCreated();

    }



}
