import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App13{
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\AEC testing\\Testing\\testing\\loginpage\\src\\chromedriver.exe");
        System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        //prompt alert
        driver.findElement(By.id("promptBox")).click();
        Alert pmt = driver.switchTo().alert();
        System.out.println(pmt.getText());
        pmt.sendKeys("Muhammad Nihaal ur Rahmaan");
        pmt.accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("promptBox")).getText());
        driver.quit();
    }
}