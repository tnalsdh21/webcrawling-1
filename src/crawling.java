//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//
//public class crawling {
//    public static void main(String[] args) throws IOException {
//        String URL= "http://www.djbusterminal.co.kr/?module=Board&action=SiteBoard&iBrdNo=6&sMdode=SELECT_FORM";
//        Document doc= Jsoup.connect(URL).get();
//        //글자를 모두 출력
//        //System.out.println(doc.text());
//        //html코드를 모두 출력
//        //System.out.println(doc.html());
//
//        Elements element = doc.select("td[class=\" pl \"]");
//
//        for(Element e: element.select("a")){
//            System.out.println(e.text());
//        }
//    }
//}
