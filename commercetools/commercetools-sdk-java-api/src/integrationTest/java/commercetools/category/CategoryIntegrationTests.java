
package commercetools.category;

import static commercetools.category.CategoryFixtures.*;

import com.commercetools.api.models.category.*;
import com.commercetools.api.models.common.LocalizedString;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryIntegrationTests {

    @Test
    public void createAndDelete() {
        Category category = createCategory();
        Assertions.assertNotNull(category);
        Category deletedCategory = deleteCategory(category.getId(), category.getVersion());
        Assertions.assertEquals(category.getId(), deletedCategory.getId());
    }

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
    public void deleteById() {
        Category category = createCategory();
        Category deletedCategory = CommercetoolsTestUtils.getProjectApiRoot()
                .categories()
                .withId(category.getId())
                .delete()
                .withVersion(category.getVersion())
                .executeBlocking()
                .getBody();
        Assertions.assertEquals(category.getId(), deletedCategory.getId());
    }

    @Test
    public void deleteByKey() {
        Category category = createCategory();
        Category deletedCategory = CommercetoolsTestUtils.getProjectApiRoot()
                .categories()
                .withKey(category.getKey())
                .delete()
                .withVersion(category.getVersion())
                .executeBlocking()
                .getBody();
        Assertions.assertEquals(category.getId(), deletedCategory.getId());
    }

    @Test
    public void queryCategories() {
        Category category = createCategory();
        CategoryPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                .categories()
                .get()
                .withWhere("id=" + "\"" + category.getId() + "\"")
                .executeBlocking()
                .getBody();
        Assertions.assertEquals(response.getResults().size(), 1);
        Assertions.assertEquals(response.getResults().get(0).getId(), category.getId());
        deleteCategory(category.getId(), category.getVersion());
    }

    @Test
    public void updateCategory() {
        withUpdateableCategory(category -> {
            LocalizedString newName = LocalizedString.of();
            newName.setValue("key-Temp", "value-Temp");

            CategoryUpdate categoryUpdate = CategoryUpdateBuilder.of()
                    .version(category.getVersion())
                    .actions(CategoryChangeNameActionBuilder.of().name(newName).build())
                    .build();
            Category updatedCategory = CommercetoolsTestUtils.getProjectApiRoot()
                    .categories()
                    .withId(category.getId())
                    .post(categoryUpdate)
                    .executeBlocking()
                    .getBody();
            Assertions.assertEquals(category.getId(), updatedCategory.getId());
            Assertions.assertEquals(newName.values(), updatedCategory.getName().values());

            return updatedCategory;
        });
    }
}
