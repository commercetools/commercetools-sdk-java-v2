
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

    public ByProjectKeyTaxCategoriesHead head() {
        return new ByProjectKeyTaxCategoriesHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyTaxCategoriesPost post(
            com.commercetools.api.models.tax_category.TaxCategoryDraft taxCategoryDraft) {
        return new ByProjectKeyTaxCategoriesPost(apiHttpClient, projectKey, taxCategoryDraft);
    }

    public ByProjectKeyTaxCategoriesPostString post(final String taxCategoryDraft) {
        return new ByProjectKeyTaxCategoriesPostString(apiHttpClient, projectKey, taxCategoryDraft);
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

}
