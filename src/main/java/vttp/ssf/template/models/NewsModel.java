package vttp.ssf.template.models;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class NewsModel {

    private String id;
    private String title;
    private String body;
    private String tags;
    private String categories; //error when implementing in HTML
    private String imageurl; 
    private String url;
    private int published_on;

   
    public int getPublished_on() {
        return published_on;
    }
    public void setPublished_on(int published_on) {
        this.published_on = published_on;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getImageurl() {
        return imageurl;
    }
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
    public String getCategories() {
        return categories;
    }
    public void setCategories(String categories) {
        this.categories = categories;
    }
    public String getTags() {
        return tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    

    public static NewsModel create(JsonObject jo) {
        NewsModel w = new NewsModel();
        w.setId(jo.getString("id"));
        w.setTitle(jo.getString("title"));
        w.setBody(jo.getString("body"));
        w.setTags(jo.getString("tags"));
        w.setCategories(jo.getString("categories")); //error when implementing in html 
        w.setImageurl(jo.getString("imageurl"));
        w.setUrl(jo.getString("url"));
        w.setPublished_on(jo.getInt("published_on"));
        
       
        
      
      
        
        return w;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder()
            .add("id", id)
            .add("title",title)
            .add("body",body)
            .add("tags",tags)
            .add("categories",categories) //error when implementing in html 
            .add("imageurl",imageurl)
            .add("url", url)
            .add("published_on",published_on)
            
            
          
        
            .build();
    }



    


    
}
