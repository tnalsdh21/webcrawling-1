//import org.jsoup.Connection;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//
//public class crawling_mu {
//    public static void main(String[] args) {
//        System.out.println("it starts");
//        //String URL = "https://www.musinsa.com/search/musinsa/coordi?q=%EC%9A%B8+%EC%BD%94%ED%8A%B8&list_kind=small&sortCode=term_date&sub_sort=&page=1&display_cnt=0&saleGoods=&includeSoldOut=&setupGoods=&popular=&category1DepthCode=&category2DepthCodes=&category3DepthCodes=&selectedFilters=&category1DepthName=&category2DepthName=&brandIds=&price=&colorCodes=&contentType=&styleTypes=&includeKeywords=&excludeKeywords=&originalYn=N&tags=&campaignId=&serviceType=&eventType=&type=&season=&measure=&openFilterLayout=N&selectedOrderMeasure=&shoeSizeOption=&groupSale=&d_cat_cd=&attribute=";
//        //String GOODSURL="https://www.musinsa.com/search/musinsa/goods?q=%EC%9A%B8+%EC%BD%94%ED%8A%B8&list_kind=small&sortCode=pop&sub_sort=&page=1&display_cnt=0&saleGoods=&includeSoldOut=&setupGoods=&popular=&category1DepthCode=&category2DepthCodes=&category3DepthCodes=&selectedFilters=&category1DepthName=&category2DepthName=&brandIds=&price=&colorCodes=&contentType=&styleTypes=&includeKeywords=&excludeKeywords=&originalYn=N&tags=&campaignId=&serviceType=&eventType=&type=&season=&measure=&openFilterLayout=N&selectedOrderMeasure=&shoeSizeOption=&groupSale=&d_cat_cd=&attribute=";
//
//        String URL_onegoods ="https://store.musinsa.com/app/goods/2120656?utm_source=google_shopping&utm_medium=sh&source=GOSHSAP001";
//        Connection connection = Jsoup.connect(URL_onegoods);
//
//        try {
//            Document document = connection.get();
//            Elements imageUrlElements = document.getElementsByClass("plus_cursor");
//            for(Element element : imageUrlElements) {
//                System.out.println(imageUrlElements.attr("src"));
//            }
//            //System.out.println(document.html());
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//}
