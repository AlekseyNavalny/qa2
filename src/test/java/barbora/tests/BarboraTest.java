package barbora.tests;

import barbora.pages.LoginPopup;
import barbora.pages.MainFunc;
import barbora.pages.MainPage;
import barbora.pages.RegistrationPopup;
import org.junit.jupiter.api.Test;

public class BarboraTest {
    private MainFunc mainFunc = new MainFunc();
    private final String HOME_PAGE = "www.barbora.lv";

    @Test
    public void registrationTest() {
        mainFunc.goToURL(HOME_PAGE);

        MainPage mainPage = new MainPage(mainFunc);
        LoginPopup loginPopup = mainPage.clickOnProductByName("Apelsīni NAVELINA mazie sver.1.šķ.");
        RegistrationPopup registrationPopup = loginPopup.goToRegistration();
        registrationPopup.fillName("NAME");

    }

}
