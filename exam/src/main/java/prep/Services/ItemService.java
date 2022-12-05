package prep.Services;

import prep.model.service.ItemServiceModel;
import prep.view.ItemViewModel;

import java.util.List;

public interface ItemService {
    void addItem(ItemServiceModel itemServiceModel);

    List<ItemViewModel> findAllItems();
}
