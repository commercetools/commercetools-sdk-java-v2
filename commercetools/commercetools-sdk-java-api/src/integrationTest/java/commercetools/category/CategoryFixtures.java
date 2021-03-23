
package commercetools.category;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryDraft;
import com.commercetools.api.models.category.CategoryDraftBuilder;
import com.commercetools.api.models.common.AssetDraftBuilder;
import com.commercetools.api.models.common.AssetSource;
import com.commercetools.api.models.common.AssetSourceBuilder;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.*;
import commercetools.utils.CommercetoolsTestUtils;

public class CategoryFixtures {

    public static void withCategory(final Consumer<Category> consumer) {
        Category category = createCategory();
        consumer.accept(category);
        deleteCategory(category.getId(), category.getVersion());
    }

    public static void withUpdateableCategory(final UnaryOperator<Category> operator) {
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

        Type type = CommercetoolsTestUtils.getProjectRoot().types().post(typeDraft).executeBlocking().getBody();

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
                        .type(TypeResourceIdentifierBuilder.of().id(type.getId()).build())
                        .build())
                .assets(Arrays.asList(AssetDraftBuilder.of()
                        .key(CommercetoolsTestUtils.getProjectKey())
                        .name(localizedString)
                        .sources(Arrays.asList(assetSource))
                        .build()))
                .build();

        return CommercetoolsTestUtils.getProjectRoot().categories().post(categoryDraft).executeBlocking().getBody();
    }

    public static Category deleteCategory(final String id, final Long version) {

        return CommercetoolsTestUtils.getProjectRoot()
                .categories()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();
    }
}
