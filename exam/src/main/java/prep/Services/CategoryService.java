package prep.Services;

import prep.model.entity.Category;
import prep.model.entity.CategoryName;
import prep.model.service.CategoryServiceModel;

public interface CategoryService {
    void initCategories();

    Category find(CategoryName name);
}
