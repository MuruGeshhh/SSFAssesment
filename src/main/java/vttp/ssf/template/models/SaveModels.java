package vttp.ssf.template.models;

public class SaveModels {
    

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







    
}
