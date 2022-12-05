package prep.web;

import jakarta.servlet.http.HttpSession;
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
import prep.model.binding.UserLoginBindingModel;
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
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginConfirm(@Valid @ModelAttribute("userLoginBindingModel") UserLoginBindingModel userLoginBindingModel,
                               BindingResult bindingResult
            , RedirectAttributes redirectAttributes,
                               HttpSession httpSession) {
        //проверка на входните данни
        if (bindingResult.hasErrors()) {
            return "redirect:login";
        }
        //проверки за юзера
        UserServiceModel user = this.userService.findByUserName(userLoginBindingModel.getUsername());

        //проверка дали паролата на юзера съвпада и дали съществува
        if (user == null || !user.getPassword().equals(userLoginBindingModel.getPassword())) {

            redirectAttributes.addFlashAttribute("notFound", true);
            //редирект обратно
            return "redirect:login";
        }
        //логване на юзера
        httpSession.setAttribute("user", user);

        // редирект при валидност
        return "redirect:/";
    }

    @GetMapping("/register")
    public String register() {
        return "register";

    }

    @PostMapping("/register")
    public String registerConfirm(@Valid
                                  @ModelAttribute("userRegisterBindingModel") UserRegisterBindingModel userRegisterBindingModel,
                                  BindingResult bindingResult
            , RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors() || !userRegisterBindingModel.getPassword().equals(userRegisterBindingModel.getConfirmPassword())) {
            return "redirect:register";
        }
        //добавяме в базата
        this.userService.register(this.modelMapper.map(
                userRegisterBindingModel, UserServiceModel.class
        ));
        // редирект
        return "redirect:login";
    }
}
