package br.com.mundo.hoje.controllers;

import br.com.mundo.hoje.models.Item;
import br.com.mundo.hoje.services.IbgeScrapingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/news")
public class IbgeNoticeWebScrapingController {

    private final IbgeScrapingService service;

    public IbgeNoticeWebScrapingController(IbgeScrapingService service) {
        this.service = service;
    }

    @PostMapping("/scraping-article")
    public ResponseEntity<Item> get(@RequestBody Item item){
        try{
            Item response = service.get(item);
            if(response == null){
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }

}
