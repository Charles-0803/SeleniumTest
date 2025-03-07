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
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseSetup {
    private static WebDriver driver;

    protected static HomePage homePage;
    protected static ManagerDashboard managerDashboard;
    protected static AddCustomer addCustomer;
    protected static OpenAccount openAccount;
    protected static DeleteAccount deleteAccount;


    @BeforeAll
    public static void setUp(){
        ChromeOptions options = new ChromeOptions();

        // Ensuring Chrome runs in a clean session
        options.addArguments("--incognito"); // Runs in Incognito mode to prevent user data conflicts
        options.addArguments("--disable-gpu"); 
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage"); // Helps with limited memory environments
        options.addArguments("--headless=new"); // Runs in headless mode (newer version)

        driver = new ChromeDriver(options);
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
