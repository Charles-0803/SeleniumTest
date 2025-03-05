package managerTest;

import basetests.BaseSetup;
import org.junit.jupiter.api.Test;

public class OpenAccountTest extends BaseSetup {
    @Test
    public void SucceedOpenAccount(){
        homePage.clickBankManagerLogin();
        managerDashboard.clickOpenAccountButton();
        openAccount.setCustomerDropDown("Harry Potter");
        openAccount.setCurrencyDropDown("Dollar");
        openAccount.clickProccessButton();
    }
    @Test
    public void FailNonExistentCustomer(){
        openAccount.setCustomerDropDown("Isaac Addo");
        openAccount.setCurrencyDropDown("Dollar");
        openAccount.clickProccessButton();
    }

}
