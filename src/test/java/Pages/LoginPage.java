package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By username = By.id("txtUsername");
    By password = By.id("txtPassword");

    By login = By.id("btnLogin");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String strUsername){
        driver.findElement(username).sendKeys(strUsername);
    }
    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }
    public void setLogin(){
        driver.findElement(login).submit();
    }

    public void getTitle(){
        driver.getTitle();
    }
    public void loginToHrm(String strUsername,String strPassword){
        this.setUsername(strUsername);
        this.setPassword(strPassword);
        this.getTitle();
        this.setLogin();
    }
}
