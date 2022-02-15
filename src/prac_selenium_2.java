import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class prac_selenium_2 {
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH ="/Users/soo/Downloads/chromedriver";

    public static void main(String[] args) {
        System.setProperty(WEB_DRIVER_ID,WEB_DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        String itemName = "울코트";
        String URL = "https://www.musinsa.com/search/musinsa/integration?type=&q="+itemName+"&list_kind=small&sortCode=pop&sub_sort=&page=1&display_cnt=0&saleGoods=false&includeSoldOut=false&popular=false&category1DepthCode=&category2DepthCodes=&category3DepthCodes=&selectedFilters=&category1DepthName=&category2DepthName=&brandIds=&price=&colorCodes=&contentType=&styleTypes=&includeKeywords=&excludeKeywords=&originalYn=N&tags=&saleCampaign=false&serviceType=&eventType=&type=&season=&measure=&openFilterLayout=N&selectedOrderMeasure=&d_cat_cd=";
        driver.get(URL);
        WebElement element = driver.findElement(new By.ByCssSelector(".lazyload.lazy"));
        System.out.println("image url : "+element.getAttribute("src"));
    }
}
//https://search.musinsa.com/search/musinsa/goods?q=울코트&list_kind=small&sortCode=pop&sub_sort=&page=1&display_cnt=0&saleGoods=false&includeSoldOut=false&popular=false&category1DepthCode=&category2DepthCodes=&category3DepthCodes=&selectedFilters=&category1DepthName=&category2DepthName=&brandIds=&price=&colorCodes=&contentType=&styleTypes=&includeKeywords=&excludeKeywords=&originalYn=N&tags=&saleCampaign=false&serviceType=&eventType=&type=&season=&measure=&openFilterLayout=N&selectedOrderMeasure=&d_cat_cd=