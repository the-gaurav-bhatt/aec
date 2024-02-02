import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class menus {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\AEC testing\\Practice\\testcases\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement dpm = driver.findElement(By.id("course"));

        Select sc = new Select(dpm);
        sc.selectByValue("java");
        Thread.sleep(1000);
        sc.selectByIndex(2);
        Thread.sleep(1000);
        sc.selectByVisibleText("Javascript");
        Thread.sleep(1000);
        
        WebElement scl = driver.findElement(By.id("ide"));

        Select lc = new Select(scl);
        lc.selectByValue("ec");
        Thread.sleep(1000);
        lc.selectByIndex(2);
        Thread.sleep(1000);
        lc.selectByVisibleText("NetBeans");
        Thread.sleep(1000);
        
        driver.quit();
    }
}