package br.com.mundo.hoje.services;

import br.com.mundo.hoje.models.Article;
import br.com.mundo.hoje.models.Item;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class IbgeScrapingService {
    public Item get(Item item){
      try{
          item.setArticle(scrapingItem(item));
          return item;
      }catch (Exception e){
        return null;
      }
    }
    private Article scrapingItem(Item item) throws IOException {
        Document document = Jsoup.connect(item.getLink()).get();
        Element element = document.getElementsByClass("envolve_main").get(1);
        try{
            var title = element.getElementsByTag("h2").text();
            var subtitle = element.getElementsByClass("subeditoria").text();
            var metadata = element.getElementsByClass("metadados metadados--single").text();

            StringBuilder text = new StringBuilder();
            for(Element paragraph: element.getElementsByClass("texto--single ").get(0).getElementsByTag("p")){
                text.append("<p>");
                text.append(paragraph.text());
                text.append("</p>");
            }

            return new Article(title, subtitle, metadata, text.toString());
        }catch (Exception e){
            return null;
        }
    }

}
