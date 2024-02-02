import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.safari.driver", "/Users/mukeshrajshah/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        java.util.List<WebElement> searchResults = driver.findElements(By.cssSelector("h3"));
        for(WebElement result: searchResults){
            System.out.println(result.getText());
        }
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        
        for(WebElement link : links){
            System.out.println(link.getText());
        }
    driver.quit();
    }
}