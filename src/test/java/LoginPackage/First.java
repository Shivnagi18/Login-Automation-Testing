package LoginPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String args[]){
        /*Steps to automate
         * 1) Open chrome
         * 2)navigate the url
         * 3)find user name and enter user name
         * 3)Enter username
         * 4)enter password
         * 5)click on login button
         * 6)Validation (login successful?)
         *        -user should able to see their user name and functionalities
         *         like delete account, go to book store, type to search
         *         -the title of website will come as profile */
        // 1)open chrome
        WebDriver driver = new ChromeDriver();
        //2)navigate the url
        driver.get("https://demoqa.com/login");
        //3) enter username
        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("Shivangi_18");
        //4) enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Shivangi@123");
        //5) submit
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
    }
}
