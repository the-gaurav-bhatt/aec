import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class form {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\AEC testing\\Practice\\testcases\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.findElement(By.id("firstName")).sendKeys("Muhammad Nihaal");
        driver.findElement(By.id("lastName")).sendKeys("ur Rahmaan");
        
        driver.findElement(By.id("malerb")).click();
        
        driver.findElement(By.id("englishchbx")).click();
        driver.findElement(By.id("hindichbx")).click();
        driver.findElement(By.id("frenchchbx")).click();

        driver.findElement(By.id("email")).sendKeys("muhammadnihaal1903@gmail.com");
        driver.findElement(By.id("password")).sendKeys("nihaal@190306");

        Thread.sleep(5000);
        driver.findElement(By.linkText("Click here to navigate to the home page")).click();
        Thread.sleep(5000);

        driver.quit();
    }   
}