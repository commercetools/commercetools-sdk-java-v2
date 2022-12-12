
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCategoriesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCategoriesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCategoriesGet get() {
        return new ByProjectKeyCategoriesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCategoriesPost post(com.commercetools.api.models.category.CategoryDraft categoryDraft) {
        return new ByProjectKeyCategoriesPost(apiHttpClient, projectKey, categoryDraft);
    }

    public ByProjectKeyCategoriesPost post(
            UnaryOperator<com.commercetools.api.models.category.CategoryDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.category.CategoryDraftBuilder.of()).build());
    }

    public ByProjectKeyCategoriesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCategoriesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCategoriesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCategoriesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyCategoriesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.category.Category> category,
            java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> actions) {
        return withId(category.getId()).post(builder -> com.commercetools.api.models.category.CategoryUpdate.builder()
                .version(category.getVersion())
                .actions(actions));
    }

    public ByProjectKeyCategoriesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.category.Category> category,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.category.CategoryUpdateAction, com.commercetools.api.models.category.CategoryUpdateActionBuilder>> op) {
        return withId(category.getId()).post(builder -> com.commercetools.api.models.category.CategoryUpdate.builder()
                .version(category.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.category.CategoryUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.category.CategoryUpdateAction, com.commercetools.api.models.category.CategoryUpdateActionBuilder, ByProjectKeyCategoriesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.category.Category> category) {
        return builder -> withId(category.getId())
                .post(b -> com.commercetools.api.models.category.CategoryUpdate.builder()
                        .version(category.getVersion())
                        .actions(builder.apply(UpdateActionBuilder
                                .of(com.commercetools.api.models.category.CategoryUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyCategoriesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.category.Category> category) {
        return withId(category.getId()).delete().withVersion(category.getVersion());
    }

    public ByProjectKeyCategoriesPost create(com.commercetools.api.models.category.CategoryDraft categoryDraft) {
        return post(categoryDraft);
    }

    public ByProjectKeyCategoriesPost create(
            UnaryOperator<com.commercetools.api.models.category.CategoryDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.category.CategoryDraftBuilder.of()).build());
    }

}
