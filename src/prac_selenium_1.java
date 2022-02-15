import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class prac_selenium_1 {
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH ="/Users/soo/Downloads/chromedriver";

    public static void main(String[] args) {
        System.setProperty(WEB_DRIVER_ID,WEB_DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("아이유");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        if(driver != null){

        }
    }
}
