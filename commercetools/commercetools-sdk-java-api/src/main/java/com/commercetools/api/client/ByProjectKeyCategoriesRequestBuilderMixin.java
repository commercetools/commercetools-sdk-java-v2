
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryUpdateActionBuilder;

public interface ByProjectKeyCategoriesRequestBuilderMixin {
    public ByProjectKeyCategoriesByIDRequestBuilder withId(String ID);

    public ByProjectKeyCategoriesPost post(com.commercetools.api.models.category.CategoryDraft categoryDraft);

    public default ByProjectKeyCategoriesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.category.Category> category,
            java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> actions) {
        return withId(category.getId()).post(builder -> com.commercetools.api.models.category.CategoryUpdate.builder()
                .version(category.getVersion())
                .actions(actions));
    }

    public default ByProjectKeyCategoriesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.category.Category> category,
            UnaryOperator<UpdateActionBuilder<CategoryUpdateAction, CategoryUpdateActionBuilder>> op) {
        return withId(category.getId()).post(builder -> com.commercetools.api.models.category.CategoryUpdate.builder()
                .version(category.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.category.CategoryUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<com.commercetools.api.models.category.CategoryUpdateAction, com.commercetools.api.models.category.CategoryUpdateActionBuilder, ByProjectKeyCategoriesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.category.Category> category) {
        return builder -> withId(category.getId())
                .post(b -> com.commercetools.api.models.category.CategoryUpdate.builder()
                        .version(category.getVersion())
                        .actions(builder.apply(UpdateActionBuilder
                                .of(com.commercetools.api.models.category.CategoryUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyCategoriesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.category.Category> category) {
        return withId(category.getId()).delete().withVersion(category.getVersion());
    }

    public default ByProjectKeyCategoriesPost create(
            com.commercetools.api.models.category.CategoryDraft categoryDraft) {
        return post(categoryDraft);
    }

    public default ByProjectKeyCategoriesPost create(
            UnaryOperator<com.commercetools.api.models.category.CategoryDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.category.CategoryDraftBuilder.of()).build());
    }
}
