package vttp.ssf.template.Services;

import java.io.Reader;
import java.io.StringReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import vttp.ssf.template.Repo.NewsRepo;
import vttp.ssf.template.models.NewsModel;
import vttp.ssf.template.models.SaveModels;


@Service
public class NewsService {

    private static final String URL =  "https://min-api.cryptocompare.com/data/v2/news/?lang=EN" ;

    @Value("${API_KEY}")
    private String key;


    public List<NewsModel> getArticles(){

        
        String payload;
        System.out.println("Getting Data FROM API >>>>");
        
        try {
            // Create the url with query string
            String url = UriComponentsBuilder.fromUriString(URL)
                .toUriString();


                // Create the GET request, GET url
                RequestEntity<Void> req = RequestEntity.get(url).build();

                // Make the call to the api
                RestTemplate template = new RestTemplate();
                ResponseEntity<String> resp;

                // Throws an exception if status code not in between 200 - 399
                resp = template.exchange(req, String.class);

                // Get the payload and do something with it
                payload = resp.getBody();
                System.out.println("payload: " + payload);
 
          
          
            } catch (Exception ex) {
                System.err.printf("Error: %s\n", ex.getMessage());
                return Collections.emptyList();
            }

            Reader strReader = new StringReader(payload);
             // Create a JsonReader from Reader
            JsonReader jsonReader = Json.createReader(strReader);
        // Read the payload as Json object
            JsonObject payloadResult = jsonReader.readObject();
            JsonArray array = payloadResult.getJsonArray("Data");


            List<NewsModel> list = new LinkedList<>();
           
            for (int i = 0; i < array.size(); i++) {
               
                JsonObject jo = array.getJsonObject(i);
                list.add(NewsModel.create(jo));
            }
            
            return list;

  }


  public List<SaveModels> saveArticles(){
   
   
   
   
    return null;
    
    
        
}


}