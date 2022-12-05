package prep.web;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import prep.Services.UserService;
import prep.model.binding.UserRegisterBindingModel;
import prep.model.service.UserServiceModel;

@Controller
@RequestMapping("/users")
public class UserController {
private final UserService userService;
private final ModelMapper modelMapper;

    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String registerConfirm(@Valid
              @ModelAttribute("userRegisterBindingModel")UserRegisterBindingModel userRegisterBindingModel,
                                  BindingResult bindingResult
    , RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "redirect:register";
        }
        //добавяме в базата
        this.userService.register(this.modelMapper.map(
                userRegisterBindingModel, UserServiceModel.class
        ));
        // редирект
        return "redirect:/";
    }
}
