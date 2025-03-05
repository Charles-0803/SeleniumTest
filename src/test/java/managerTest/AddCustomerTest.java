package managerTest;

import basetests.BaseSetup;
import org.junit.jupiter.api.Test;




public class AddCustomerTest extends BaseSetup {

    @Test
    public void SucceedAddCustomer(){

        addCustomer.setFirstName("Kelvin");
        addCustomer.setLastName("Smith");
        addCustomer.setPostCode("122");
        addCustomer.clickAddCustomer();
        addCustomer.acceptAlert();
    }


    @Test
    public void FailNameWithNumbers(){
        addCustomer.setFirstName("Kelvin322");
        addCustomer.setLastName("Smith2132");
        addCustomer.setPostCode("162");
        addCustomer.clickAddCustomer();
        addCustomer.acceptAlert();
    }
    @Test
    public void FailNameWithSpecialCharacters(){
        homePage.clickBankManagerLogin();
        managerDashboard.clickAddCustomerButton();
        addCustomer.setFirstName("s%$^&");
        addCustomer.setLastName("ew#$%^$%");
        addCustomer.setPostCode("822");
        addCustomer.clickAddCustomer();
        addCustomer.acceptAlert();
    }
    @Test
    public void FailPostCodeWithOutNumbers(){
        addCustomer.setFirstName("John");
        addCustomer.setLastName("Koo");
        addCustomer.setPostCode("xjnsbn");
        addCustomer.clickAddCustomer();
        addCustomer.acceptAlert();
    }
    @Test
    public void PassPostCodeWithNumbers(){
        addCustomer.setFirstName("Cal");
        addCustomer.setLastName("Adoo");
        addCustomer.setPostCode("22");
        addCustomer.clickAddCustomer();
        addCustomer.acceptAlert();
    }
}
