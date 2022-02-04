package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By Homepage = By.id("menu_dashboard_index");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void DashBoard(){
        driver.findElement(Homepage).click();
    }

}
