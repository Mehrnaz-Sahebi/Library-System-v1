import javax.xml.namespace.QName;
import java.util.HashSet;

public class Categories {
    private HashSet<Category> categoriesSet;

    public Categories() {
        categoriesSet = new HashSet<Category>();
    }
    public void addCategory(String categoryId , String name) {
        Category category= new Category(categoryId, name);
        categoriesSet.add(category);
    }


    public Category getCategory(String categoryId){
        for (Category category:categoriesSet) {
            if(category.getCategoryId().equals(categoryId)){
                return category;
            }
        }
        return null;
    }
}
