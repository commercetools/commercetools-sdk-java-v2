package commercetools.category;



import com.commercetools.api.generated.models.category.Category;
import com.commercetools.api.generated.models.category.CategoryDraft;
import com.commercetools.api.generated.models.category.CategoryDraftBuilder;
import com.commercetools.api.generated.models.common.AssetDraftBuilder;
import com.commercetools.api.generated.models.common.AssetSource;
import com.commercetools.api.generated.models.common.AssetSourceBuilder;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.FieldContainer;
import commercetools.utils.CommercetoolsTestUtils;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class CategoryFixtures {
    
    public static void withCategory(final Consumer<Category> consumer) {
        Category category = createCategory();
        consumer.accept(category);
        deleteCategory(category.getId(), category.getVersion());
    }
    
    public static void withUpdateableCategory(final UnaryOperator<Category> operator){
        Category category = createCategory();
        category = operator.apply(category);
        deleteCategory(category.getId(), category.getVersion());
    }
    
    public static Category createCategory() {
        String key = CommercetoolsTestUtils.randomKey();
        String value = "value-" + CommercetoolsTestUtils.randomString();
        LocalizedString localizedString = LocalizedString.of();
        localizedString.setValue(key, value);
        FieldContainer fieldContainer = FieldContainer.of();
        fieldContainer.setValue(key, value);
        AssetSource assetSource = AssetSourceBuilder.of().uri("www.commercetools.com").build();
        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .name(localizedString)
                .slug(localizedString)
                .assets(Arrays.asList(AssetDraftBuilder.of()
                        .key(CommercetoolsTestUtils.getProjectKey())
                        .name(localizedString)
                        .sources(Arrays.asList(assetSource))
                        .build()))
                .description(localizedString)
                .externalId(CommercetoolsTestUtils.randomId())
                .key(CommercetoolsTestUtils.randomKey())
                .metaDescription(localizedString)
                .metaKeywords(localizedString)
                .metaTitle(localizedString)
                .orderHint(CommercetoolsTestUtils.randomString())
                .build();

        return CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .categories()
                .post(categoryDraft)
                .executeBlocking().getBody();
    }
    
    public static Category deleteCategory(final String id, final Long version){
        return CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .categories()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();
    }
}
