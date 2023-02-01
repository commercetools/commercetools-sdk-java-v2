
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryDraft;
import com.commercetools.api.models.category.CategoryDraftBuilder;
import com.commercetools.api.models.category.CategoryUpdate;
import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryUpdateActionBuilder;

public interface ByProjectKeyCategoriesRequestBuilderMixin {
    public ByProjectKeyCategoriesByIDRequestBuilder withId(String ID);

    public ByProjectKeyCategoriesPost post(CategoryDraft categoryDraft);

    public default ByProjectKeyCategoriesByIDPost update(Versioned<Category> category,
            List<CategoryUpdateAction> actions) {
        return withId(category.getId())
                .post(builder -> CategoryUpdate.builder().version(category.getVersion()).actions(actions));
    }

    public default ByProjectKeyCategoriesByIDPost update(Versioned<Category> category,
            UnaryOperator<UpdateActionBuilder<CategoryUpdateAction, CategoryUpdateActionBuilder>> op) {
        return withId(category.getId()).post(builder -> CategoryUpdate.builder()
                .version(category.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(() -> CategoryUpdateActionBuilder.of())).actions));
    }

    public default WithUpdateActionBuilder<CategoryUpdateAction, CategoryUpdateActionBuilder, ByProjectKeyCategoriesByIDPost> update(
            Versioned<Category> category) {
        return builder -> withId(category.getId()).post(b -> CategoryUpdate.builder()
                .version(category.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(CategoryUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyCategoriesByIDDelete delete(Versioned<Category> category) {
        return withId(category.getId()).delete().withVersion(category.getVersion());
    }

    public default ByProjectKeyCategoriesPost create(CategoryDraft categoryDraft) {
        return post(categoryDraft);
    }

    public default ByProjectKeyCategoriesPost create(UnaryOperator<CategoryDraftBuilder> op) {
        return post(op.apply(CategoryDraftBuilder.of()).build());
    }
}
