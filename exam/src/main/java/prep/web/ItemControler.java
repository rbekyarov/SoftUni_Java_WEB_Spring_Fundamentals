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
import prep.Services.ItemService;
import prep.model.binding.ItemAddBindingModel;
import prep.model.service.ItemServiceModel;

@Controller
@RequestMapping("/items")
public class ItemControler {
    public final ItemService itemService;
    private ModelMapper modelMapper;

    public ItemControler(ItemService itemService, ModelMapper modelMapper) {
        this.itemService = itemService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/add")
    public String add(){
        return "add-item";
    }

    @PostMapping("/add")
    public String addConfirm(@Valid @ModelAttribute("itemAddBindingModel")
                          ItemAddBindingModel itemAddBindingModel, BindingResult bindingResult,
                             RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "redirect:add";
        }
        this.itemService.addItem(this.modelMapper.map(itemAddBindingModel,ItemServiceModel.class));

        return "redirect:/";
    }



}
