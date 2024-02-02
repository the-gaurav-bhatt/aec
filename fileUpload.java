import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class file {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\AEC testing\\Practice\\testcases\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/upload/");

        WebElement fp = driver.findElement(By.name("uploadfile_0"));
        fp.sendKeys("C:\\Users\\muham\\OneDrive\\Documents\\5th SEm\\CN\\CN Lab program 4.txt");
        Thread.sleep(1000);

        driver.findElement(By.id("terms")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("submitbutton")).click();
        Thread.sleep(1000);
        
        driver.quit();
    }
}