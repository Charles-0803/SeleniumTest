package basetests;

import org.example.manager.AddCustomer;
import org.example.HomePage;
import org.example.manager.DeleteAccount;
import org.example.manager.ManagerDashboard;
import org.example.manager.OpenAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetup {
    private static WebDriver driver;

    protected static HomePage homePage;
    protected static ManagerDashboard managerDashboard;
    protected static AddCustomer addCustomer;
    protected static OpenAccount openAccount;
    protected static DeleteAccount deleteAccount;


    @BeforeAll
    public static void setUp(){
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        homePage = new HomePage(driver);
        managerDashboard = new ManagerDashboard(driver);
        addCustomer = new AddCustomer(driver);
        openAccount = new OpenAccount(driver);
        deleteAccount = new DeleteAccount(driver);


    }
    @AfterAll
    public static void tearDown(){
       driver.quit();
    }
}
