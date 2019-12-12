package commercetools.category;


import com.commercetools.api.generated.models.category.Category;
import com.commercetools.api.generated.models.category.CategoryDraft;
import com.commercetools.api.generated.models.category.CategoryDraftBuilder;
import com.commercetools.api.generated.models.common.AssetDraftBuilder;
import com.commercetools.api.generated.models.common.AssetSource;
import com.commercetools.api.generated.models.common.AssetSourceBuilder;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.*;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

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

        AssetSource assetSource = AssetSourceBuilder.of().uri("www.commercetools.com").build();

        TypeDraft typeDraft = TypeDraftBuilder.of()
                .key(key)
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .resourceTypeIds(Arrays.asList(ResourceTypeId.CATEGORY))
                .fieldDefinitions(Arrays.asList(FieldDefinitionBuilder.of()
                        .type(CustomFieldStringType.of())
                        .name(value)
                        .label(localizedString)
                        .required(false)
                        .inputHint(TypeTextInputHint.SINGLE_LINE)
                        .build()))
                .build();
        
        Type type = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .types()
                .post(typeDraft)
                .executeBlocking().getBody();
        
        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .name(localizedString)
                .description(localizedString)
                .slug(localizedString)
                .orderHint(CommercetoolsTestUtils.randomString())
                .externalId(CommercetoolsTestUtils.randomId())
                .metaTitle(localizedString)
                .metaDescription(localizedString)
                .metaKeywords(localizedString)
                .custom(CustomFieldsDraftBuilder.of()
                        .type(TypeResourceIdentifierBuilder.of()
                                .id(type.getId())
                                .build())
                        .build())
                .assets(Arrays.asList(AssetDraftBuilder.of()
                        .key(CommercetoolsTestUtils.getProjectKey())
                        .name(localizedString)
                        .sources(Arrays.asList(assetSource))
                        .build()))
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
