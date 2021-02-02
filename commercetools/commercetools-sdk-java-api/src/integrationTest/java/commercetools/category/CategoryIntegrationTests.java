
package commercetools.category;

import com.commercetools.api.models.category.*;
import com.commercetools.api.models.common.LocalizedString;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class CategoryIntegrationTests {

    @Test
    public void createAndDelete() {
        Category category = CategoryFixtures.createCategory();
        Assert.assertNotNull(category);
        Category deletedCategory = CategoryFixtures.deleteCategory(category.getId(), category.getVersion());
        Assert.assertEquals(category.getId(), deletedCategory.getId());
    }

    @Test
    public void getById() {
        CategoryFixtures.withCategory(category -> {
            Category queriedCategory = CommercetoolsTestUtils.getProjectRoot().categories().withId(
                category.getId()).get().executeBlocking().getBody();
            Assert.assertEquals(category.getId(), queriedCategory.getId());
        });
    }

    @Test
    public void getByKey() {
        CategoryFixtures.withCategory(category -> {
            Category queriedCategory = CommercetoolsTestUtils.getProjectRoot().categories().withKey(
                category.getKey()).get().executeBlocking().getBody();
            Assert.assertEquals(category.getId(), queriedCategory.getId());
            Assert.assertEquals(category.getKey(), queriedCategory.getKey());
        });
    }

    @Test
    public void deleteById() {
        Category category = CategoryFixtures.createCategory();
        Category deletedCategory = CommercetoolsTestUtils.getProjectRoot().categories().withId(
            category.getId()).delete().withVersion(category.getVersion()).executeBlocking().getBody();
        Assert.assertEquals(category.getId(), deletedCategory.getId());
    }

    @Test
    public void deleteByKey() {
        Category category = CategoryFixtures.createCategory();
        Category deletedCategory = CommercetoolsTestUtils.getProjectRoot().categories().withKey(
            category.getKey()).delete().withVersion(category.getVersion()).executeBlocking().getBody();
        Assert.assertEquals(category.getId(), deletedCategory.getId());
    }

    @Test
    public void queryCategories() {
        Category category = CategoryFixtures.createCategory();
        CategoryPagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot().categories().get().withWhere(
            "id=" + "\"" + category.getId() + "\"").executeBlocking().getBody();
        Assert.assertEquals(response.getResults().size(), 1);
        Assert.assertEquals(response.getResults().get(0).getId(), category.getId());
        CategoryFixtures.deleteCategory(category.getId(), category.getVersion());
    }

    @Test
    public void updateCategory() {
        CategoryFixtures.withUpdateableCategory(category -> {
            LocalizedString newName = LocalizedString.of();
            newName.setValue("key-Temp", "value-Temp");

            CategoryUpdate categoryUpdate = CategoryUpdateBuilder.of().version(category.getVersion()).actions(
                CategoryChangeNameActionBuilder.of().name(newName).build()).build();
            Category updatedCategory = CommercetoolsTestUtils.getProjectRoot().categories().withId(
                category.getId()).post(categoryUpdate).executeBlocking().getBody();
            Assert.assertEquals(category.getId(), updatedCategory.getId());
            Assert.assertEquals(newName.values(), updatedCategory.getName().values());

            return updatedCategory;
        });
    }
}
