
package commercetools.category;

import static commercetools.category.CategoryFixtures.*;
import static commercetools.type.TypeFixtures.getFieldName;
import static commercetools.type.TypeFixtures.withType;

import java.util.Collections;
import java.util.Optional;

import com.commercetools.api.models.category.*;
import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.AssetSourceBuilder;
import com.commercetools.api.models.common.LocalizedString;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryIntegrationTests {

    @Test
    public void createAndDelete() {
        Category category = createCategory();
        Assertions.assertThat(category).isNotNull();
        Category deletedCategory = deleteCategory(category.getId(), category.getVersion());
        Assertions.assertThat(category.getId()).isEqualTo(deletedCategory.getId());
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
        Assertions.assertThat(category.getId()).isEqualTo(deletedCategory.getId());
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
        Assertions.assertThat(category.getId()).isEqualTo(deletedCategory.getId());
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
            Assertions.assertThat(category.getId()).isEqualTo(updatedCategory.getId());
            Assertions.assertThat(newName.values()).isEqualTo(updatedCategory.getName().values());

            return updatedCategory;
        });
    }

    @Test
    public void addAssetsAndCustomFields() {
        withType(type -> {
            withUpdateableCategory(category -> {
                final String ASSET_KEY = "test-asset";
                final CategoryAddAssetAction categoryAddAssetAction = CategoryAddAssetActionBuilder.of()
                        .asset(assetDraftBuilder -> assetDraftBuilder
                                .sources(AssetSourceBuilder.of().uri("www.myphoto.com").build())
                                .name(localizedStringBuilder -> localizedStringBuilder.addValue("test-photo",
                                    "test-photo"))
                                .key(ASSET_KEY))
                        .build();

                final String FIELD_NAME = getFieldName(type);
                final String FIELD_VALUE = "field value";

                final CategorySetCustomTypeAction setCustomTypeAction = CategorySetCustomTypeActionBuilder.of()
                        .type(type.toResourceIdentifier())
                        .fields(fieldsBuilder -> fieldsBuilder.addValue(FIELD_NAME, FIELD_VALUE))
                        .build();

                final Category updatedCategory = CommercetoolsTestUtils.getProjectApiRoot()
                        .categories()
                        .update(category)
                        .with(builder -> builder.plus(categoryAddAssetAction).plus(setCustomTypeAction))
                        .executeBlocking()
                        .getBody();

                Assertions.assertThat(updatedCategory.getCustom().getFields().values())
                        .isEqualTo(Collections.singletonMap(FIELD_NAME, FIELD_VALUE));
                final Optional<Asset> newAsset = updatedCategory.getAssets()
                        .stream()
                        .filter(asset -> asset.getKey().equals(ASSET_KEY))
                        .findAny();
                Assertions.assertThat(newAsset).isPresent();
                return updatedCategory;
            });
        });
    }
}
