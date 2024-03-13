import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class paralleltesting {
    public void form() throws Exception{
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
        driver.findElement(By.linkText("Click here to navigate to the home page")).click();
        Thread.sleep(5000);
        driver.close();
    }
    public void menus() throws Exception{
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
        driver.close();
    }
    public void file() throws Exception{
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
        driver.close();
    }
    public static void main(String[] args)throws Exception{
        paralleltesting pl = new paralleltesting();
        pl.form();
        pl.menus();
        pl.file();
    }
}