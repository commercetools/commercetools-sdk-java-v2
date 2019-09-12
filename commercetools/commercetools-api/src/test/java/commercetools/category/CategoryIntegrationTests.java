package commercetools.category;

import com.commercetools.models.Category.*;
import com.commercetools.models.Common.LocalizedString;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CategoryIntegrationTests {
    
    @Test
    public void createAndDelete() {
        Category category = CategoryFixtures.createCategory();
        Assertions.assertNotNull(category);
        Category deletedCategory = CategoryFixtures.deleteCategory(category.getId(), category.getVersion());
        Assertions.assertEquals(category.getId(), deletedCategory.getId());
    }
    
    @Test
    public void getById() {
        CategoryFixtures.withCategory(category -> {
            Category queriedCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .categories()
                    .withId(category.getId())
                    .get()
                    .executeBlocking().getBody();
            Assertions.assertEquals(category.getId(), queriedCategory.getId());
        });
    }
    
    @Test
    public void getByKey() {
        CategoryFixtures.withCategory(category -> {
            Category queriedCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .categories()
                    .withKey(category.getKey())
                    .get()
                    .executeBlocking().getBody();
            Assertions.assertEquals(category.getId(), queriedCategory.getId());
            Assertions.assertEquals(category.getKey(), queriedCategory.getKey());
        });
    }
    
    @Test
    public void deleteById() {
        Category category = CategoryFixtures.createCategory();
        Category deletedCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .categories()
                .withId(category.getId())
                .delete()
                .addVersion(category.getVersion())
                .executeBlocking().getBody();
        Assertions.assertEquals(category.getId(), deletedCategory.getId());
    }
    
    @Test
    public void deleteByKey() {
        Category category = CategoryFixtures.createCategory();
        Category deletedCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .categories()
                .withKey(category.getKey())
                .delete()
                .addVersion(category.getVersion())
                .executeBlocking().getBody();
        Assertions.assertEquals(category.getId(), deletedCategory.getId());
    }

    @Test
    public void queryCategories() {
        Category category = CategoryFixtures.createCategory();
        CategoryPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .categories()
                .get()
                .addWhere("id=" + "\"" + category.getId() + "\"")
                .executeBlocking().getBody();
        Assertions.assertEquals(response.getResults().size(), 1);
        Assertions.assertEquals(response.getResults().get(0).getId(), category.getId());
        CategoryFixtures.deleteCategory(category.getId(), category.getVersion());
    }

    @Test
    public void updateCategory() {
        CategoryFixtures.withUpdateableCategory(category -> {
            List<CategoryUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = LocalizedString.of();
            newName.setValue("key-Temp", "value-Temp");
            updateActions.add(CategoryChangeNameActionBuilder.of()
                    .name(newName)
                    .build());
            CategoryUpdate categoryUpdate = CategoryUpdateBuilder.of()
                    .version(category.getVersion())
                    .actions(updateActions)
                    .build();
            Category updatedCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .categories()
                    .withId(category.getId())
                    .post(categoryUpdate)
                    .executeBlocking().getBody();
            Assertions.assertEquals(category.getId(), updatedCategory.getId());
            Assertions.assertEquals(newName.values(), updatedCategory.getName().values());
            
            return updatedCategory;
        });
    }
}