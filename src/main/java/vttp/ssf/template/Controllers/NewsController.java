package vttp.ssf.template.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import vttp.ssf.template.Services.NewsService;
import vttp.ssf.template.models.NewsModel;
import vttp.ssf.template.models.SaveModels;


@Controller

public class NewsController {

    @Autowired
    private NewsService NewSvc;

    @RequestMapping(value={"/", "/accept",""," "}, method=RequestMethod.GET)
    @GetMapping
    public String index(Model model) 
    {
        List<NewsModel> em = NewSvc.getArticles();
        model.addAttribute("hello", em);

        return "news";
    }

   
   
   
   
    @PostMapping("/articles")
    public String button(Model model, @RequestParam (value = "checkboxName", required = false) String[] checkboxValue 
    ,String id, String title, String url,String imageurl,String body,
    String tags, String published_on ){

     //   List<SaveModel> fm = NewSvc.saveArticles(String b ,String a);
          if(checkboxValue != null)
     {
          List<SaveModels> sm = NewSvc.saveArticles();
          System.out.println("checkbox is checked");
      }
    
      else {

      System.out.println("hello");
      }
      
      return "redirect:/";

      }





   


    
}
