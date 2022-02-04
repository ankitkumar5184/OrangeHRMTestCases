package Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
    WebDriver driver;
    LoginPage objLogin;

    @BeforeTest
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php");
    }
    @Test(priority = 0)
    public void Login_Test(){
        objLogin = new LoginPage(driver);
        objLogin.loginToHrm("Admin","admin123");
    }

}
