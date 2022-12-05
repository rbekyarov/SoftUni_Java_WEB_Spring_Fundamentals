package prep.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import prep.Services.ItemService;

@Controller
public class HomeController {
    private final ItemService itemService;

    public HomeController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/")
    public ModelAndView index(HttpSession httpSession, ModelAndView modelAndView){
        if(httpSession.getAttribute("user")==null){
            modelAndView.setViewName("index");
        }else {
            modelAndView.addObject("items", this.itemService.findAllItems());
            modelAndView.setViewName("home");
        }


        return modelAndView;
    }

}
