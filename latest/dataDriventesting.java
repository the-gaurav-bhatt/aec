import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class datatesting {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\AEC testing\\Practice\\testcases\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String[] user = {"1NT21CS109","1NT21CS110","1NT21CS109"};
        String[] pass = {"Nihaal@190306","Nihaal@190306","Nitte123"};
        for (int i = 0; i < user.length; i++) {
            // Navigate to login page
            driver.get("http://lms.nmit.ac.in/moodle/login/index.php");
            // Enter username and password
            WebElement usernameInput = driver.findElement(By.id("username"));
            WebElement passwordInput = driver.findElement(By.id("password"));
            usernameInput.sendKeys(user[i]);
            passwordInput.sendKeys(pass[i]);
 
            // Click login button
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();
        }
    }
}