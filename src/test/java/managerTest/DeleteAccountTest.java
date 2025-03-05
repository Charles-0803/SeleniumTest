package managerTest;

import basetests.BaseSetup;
import org.junit.jupiter.api.Test;

public class DeleteAccountTest extends BaseSetup {
    @Test
    public void successfulDeleteAccountWithFirstname(){
        homePage.clickBankManagerLogin();
        managerDashboard.clickDeleteAccountButton();
        deleteAccount.setSearchCustomer("Harry");
        deleteAccount.clickDeleteButton();
        deleteAccount.clearSearchCustomer();
    }
    @Test
    public void successfulDeleteAccountWithLastname(){
        deleteAccount.setSearchCustomer("Granger");
        deleteAccount.clickDeleteButton();
        deleteAccount.clearSearchCustomer();
    }
}
