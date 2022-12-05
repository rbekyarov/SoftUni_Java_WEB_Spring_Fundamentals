package prep.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity{
    private CategoryName categoryName;
    private String description;

    public Category(CategoryName categoryName, String description) {
        this.categoryName = categoryName;
        this.description = description;
    }

    public Category() {
    }
@Enumerated
    public CategoryName getName() {
        return categoryName;
    }

    public void setName(CategoryName name) {
        this.categoryName = name;
    }
@Column(name = "description", columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
