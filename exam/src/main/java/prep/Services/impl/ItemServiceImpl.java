package prep.Services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import prep.Repository.ItemRepository;
import prep.Services.CategoryService;
import prep.Services.ItemService;
import prep.model.entity.Item;
import prep.model.service.CategoryServiceModel;
import prep.model.service.ItemServiceModel;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;
    private final ModelMapper modelMapper;
    private final CategoryService categoryService;

    public ItemServiceImpl(ItemRepository itemRepository, ModelMapper modelMapper, CategoryService categoryService) {
        this.itemRepository = itemRepository;
        this.modelMapper = modelMapper;
        this.categoryService = categoryService;
    }

    @Override
    public void addItem(ItemServiceModel itemServiceModel) {
       Item item = this.modelMapper
               .map(itemServiceModel,Item.class);

       item.setCategory(this.categoryService
               .find(itemServiceModel.getCategory().getName()));
       this.itemRepository.saveAndFlush(item);

    }
}
