
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTaxCategoriesRequestBuilder implements ByProjectKeyTaxCategoriesRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyTaxCategoriesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyTaxCategoriesGet get() {
        return new ByProjectKeyTaxCategoriesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyTaxCategoriesPost post(
            com.commercetools.api.models.tax_category.TaxCategoryDraft taxCategoryDraft) {
        return new ByProjectKeyTaxCategoriesPost(apiHttpClient, projectKey, taxCategoryDraft);
    }

    public ByProjectKeyTaxCategoriesPost post(
            UnaryOperator<com.commercetools.api.models.tax_category.TaxCategoryDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.tax_category.TaxCategoryDraftBuilder.of()).build());
    }

    public ByProjectKeyTaxCategoriesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyTaxCategoriesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyTaxCategoriesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyTaxCategoriesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyTaxCategoriesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.tax_category.TaxCategory> taxCategory,
            java.util.List<com.commercetools.api.models.tax_category.TaxCategoryUpdateAction> actions) {
        return withId(taxCategory.getId())
                .post(builder -> com.commercetools.api.models.tax_category.TaxCategoryUpdate.builder()
                        .version(taxCategory.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyTaxCategoriesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.tax_category.TaxCategory> taxCategory,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.tax_category.TaxCategoryUpdateAction, com.commercetools.api.models.tax_category.TaxCategoryUpdateActionBuilder>> op) {
        return withId(taxCategory.getId()).post(builder -> com.commercetools.api.models.tax_category.TaxCategoryUpdate
                .builder()
                .version(taxCategory.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.tax_category.TaxCategoryUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.tax_category.TaxCategoryUpdateAction, com.commercetools.api.models.tax_category.TaxCategoryUpdateActionBuilder, ByProjectKeyTaxCategoriesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.tax_category.TaxCategory> taxCategory) {
        return builder -> withId(taxCategory.getId())
                .post(b -> com.commercetools.api.models.tax_category.TaxCategoryUpdate.builder()
                        .version(taxCategory.getVersion())
                        .actions(builder.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.tax_category.TaxCategoryUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyTaxCategoriesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.tax_category.TaxCategory> taxCategory) {
        return withId(taxCategory.getId()).delete().withVersion(taxCategory.getVersion());
    }

    public ByProjectKeyTaxCategoriesPost create(
            com.commercetools.api.models.tax_category.TaxCategoryDraft taxCategoryDraft) {
        return post(taxCategoryDraft);
    }

    public ByProjectKeyTaxCategoriesPost create(
            UnaryOperator<com.commercetools.api.models.tax_category.TaxCategoryDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.tax_category.TaxCategoryDraftBuilder.of()).build());
    }

}
