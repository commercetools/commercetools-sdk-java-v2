
package commercetools.category;

import static commercetools.category.CategoryFixtures.*;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryQueryTests {
    @Test
    public void getById() {
        withCategory(category -> {
            Category queriedCategory = CommercetoolsTestUtils.getProjectApiRoot()
                    .categories()
                    .withId(category.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertEquals(category.getId(), queriedCategory.getId());
        });
    }

    @Test
    public void getByKey() {
        withCategory(category -> {
            Category queriedCategory = CommercetoolsTestUtils.getProjectApiRoot()
                    .categories()
                    .withKey(category.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertEquals(category.getId(), queriedCategory.getId());
            Assertions.assertEquals(category.getKey(), queriedCategory.getKey());
        });
    }

    @Test
    public void queryCategories() {
        Category category = createCategory();
        CategoryPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                .categories()
                .get()
                .withWhere("id=:categoryId", "categoryId", category.getId())
                .executeBlocking()
                .getBody();
        Assertions.assertEquals(response.getResults().size(), 1);
        Assertions.assertEquals(response.getResults().get(0).getId(), category.getId());
        deleteCategory(category.getId(), category.getVersion());
    }
}
