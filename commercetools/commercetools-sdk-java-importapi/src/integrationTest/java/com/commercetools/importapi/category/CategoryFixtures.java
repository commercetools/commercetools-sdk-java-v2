
package com.commercetools.importapi.category;

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
import com.commercetools.importapi.utils.CommercetoolsTestUtils;

public class CategoryFixtures {

    public static void withCategory(final Consumer<Category> consumer) {
        Category category = createCategory();
        try {
            consumer.accept(category);
        }
        finally {
            deleteCategory(category.getId(), category.getVersion());
        }
    }

    public static void withUpdateableCategory(final UnaryOperator<Category> operator) {
        Category category = createCategory();
        try {
            category = operator.apply(category);
        }
        finally {
            deleteCategory(category.getId(), category.getVersion());
        }
    }

    public static Category createCategory() {
        String key = CommercetoolsTestUtils.randomKey();
        String value = "value-" + CommercetoolsTestUtils.randomString();
        LocalizedString localizedString = LocalizedString.of();
        localizedString.setValue(key, value);

        AssetSource assetSource = AssetSourceBuilder.of().uri("www.commercetools.com").build();

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
                .assets(Arrays.asList(AssetDraftBuilder.of()
                        .key(CommercetoolsTestUtils.getProjectKey())
                        .name(localizedString)
                        .sources(Arrays.asList(assetSource))
                        .build()))
                .build();

        return CommercetoolsTestUtils.getProjectApiRoot().categories().post(categoryDraft).executeBlocking().getBody();
    }

    public static Category deleteCategory(final String id, final Long version) {

        return CommercetoolsTestUtils.getProjectApiRoot()
                .categories()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();
    }
}
