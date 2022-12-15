package br.com.mundo.hoje.controllers;

import br.com.mundo.hoje.models.Item;
import br.com.mundo.hoje.services.IbgeScrapingService;
import io.swagger.annotations.*;
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

    @ApiOperation(value = "It receives an object of type item and from the link of the item this endpoint accesses the news corresponding to the item, converts it into an object of type article and returns the item with the article filled in.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad request"),
    })
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
