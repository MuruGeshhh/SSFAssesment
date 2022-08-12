package vttp.ssf.template.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import vttp.ssf.template.Services.NewsService;

@RestController
@RequestMapping(path="/news/{id}")
public class NewsRestController {

    @Autowired
    private NewsService NewSvc;

   
        @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<String> gettask(
            @PathVariable("id") String id ) {
    
          
                JsonObject errResp = Json
                        .createObjectBuilder()
                       .add("error", "Cannot find news article %{id}")
                       .build();
                String output = errResp.toString();
                // Return 400
                return ResponseEntity
                        
                        .badRequest() 
                        .body(output);
                        
                    
            }
        
    }




    

  







    

