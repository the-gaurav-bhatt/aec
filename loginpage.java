import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
      public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\AEC testing\\Practice\\testcases\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lms.nmit.ac.in/moodle/login/index.php");
        
        WebElement name = driver.findElement(By.id("username"));
        name.sendKeys("1NT21CS109");
        Thread.sleep(1000);

        WebElement pswd = driver.findElement(By.id("password"));
        pswd.sendKeys("Nihaal@190306");
        Thread.sleep(1000);

        WebElement btn = driver.findElement(By.id("loginbtn"));
        btn.click();
        Thread.sleep(5000);

        driver.quit();
      }
}