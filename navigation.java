import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nav {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\AEC testing\\Practice\\testcases\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        WebElement sb = driver.findElement(By.name("q"));
        sb.sendKeys("nmit");
        sb.submit();

        driver.navigate().to("http://lms.nmit.ac.in/moodle/login/index.php");
        driver.findElement(By.name("username")).sendKeys("1NT21CS109");
        driver.findElement(By.name("password")).sendKeys("Nihaal@190306");
        driver.findElement(By.id("loginbtn")).click();
        Thread.sleep(6000);

        driver.navigate().refresh();
        Thread.sleep(6000);

        driver.navigate().back();
        Thread.sleep(6000);

        driver.navigate().forward();
        Thread.sleep(6000);

        driver.quit();
        }
}