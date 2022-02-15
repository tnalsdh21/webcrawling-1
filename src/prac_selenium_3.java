import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;


public class prac_selenium_3 {


    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH ="/Users/soo/Downloads/chromedriver";

    public static void main(String[] args) {
        System.setProperty(WEB_DRIVER_ID,WEB_DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        String itemName_coldest[] = {"패딩", "울코트","누빔","기모","목도리"};
        String pattern = "yyyyMMdd";
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat(pattern);
        String dateOfToday = simpleDateFormat.format(new Date());

        for(int i=0;i< itemName_coldest.length;i++){

            String URL = "https://www.musinsa.com/search/musinsa/integration?type=&q="+itemName_coldest[i]+"&list_kind=small&sortCode=pop&sub_sort=&page=1&display_cnt=0&saleGoods=false&includeSoldOut=false&popular=false&category1DepthCode=&category2DepthCodes=&category3DepthCodes=&selectedFilters=&category1DepthName=&category2DepthName=&brandIds=&price=&colorCodes=&contentType=&styleTypes=&includeKeywords=&excludeKeywords=&originalYn=N&tags=&saleCampaign=false&serviceType=&eventType=&type=&season=&measure=&openFilterLayout=N&selectedOrderMeasure=&d_cat_cd=";
            driver.get(URL);
            WebElement element = driver.findElement(new By.ByCssSelector("#coordi_list li a div img.lazyload"));
            WebElement element2 = driver.findElement(new By.ByCssSelector("#coordi_list li a"));

            String img_url;
            img_url=element.getAttribute("src");

            String coordi_link;
            coordi_link = element2.getAttribute("href");

            BufferedImage saveImage = null;
            try{
                saveImage = ImageIO.read(new URL(img_url));
            }catch (IOException e){
                e.printStackTrace();
            }

            if(saveImage !=null){
                try{
//                String fileName = img_url[0].split("/")[3];
//                fileName=fileName.split("\\?")[0];
                    String fileName = "image"+Integer.toString(i);
                    String imageDirPath ="/Users/soo/Downloads/musinsa_"+dateOfToday;
                    File imageDir = new File(imageDirPath);
                    if(imageDir.exists()==false){
                        try{
                            imageDir.mkdir();
                        }catch (Exception e){
                            e.getStackTrace();
                        }
                    }
                    ImageIO.write(saveImage, "jpg", new File(imageDirPath+"/"+fileName+".jpg"));

                }catch (IOException e){

                }
                System.out.println(img_url);
                System.out.println(coordi_link);
            }
        }

        //imgurl = https://image.msscdn.net/images/goods_img/20200917/1609490/1609490_4_220.jpg
        //예시 이미지 url= https://images.unsplash.com/photo-1602524815375-a54449bb00fb?ixid=MXwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHw5fHx8ZW58MHx8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80


    }
}
