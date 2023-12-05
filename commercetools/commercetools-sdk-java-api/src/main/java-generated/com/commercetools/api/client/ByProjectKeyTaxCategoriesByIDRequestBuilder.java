
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTaxCategoriesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyTaxCategoriesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyTaxCategoriesByIDGet get() {
        return new ByProjectKeyTaxCategoriesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyTaxCategoriesByIDHead head() {
        return new ByProjectKeyTaxCategoriesByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyTaxCategoriesByIDPost post(
            com.commercetools.api.models.tax_category.TaxCategoryUpdate taxCategoryUpdate) {
        return new ByProjectKeyTaxCategoriesByIDPost(apiHttpClient, projectKey, ID, taxCategoryUpdate);
    }

    public ByProjectKeyTaxCategoriesByIDPostString post(final String taxCategoryUpdate) {
        return new ByProjectKeyTaxCategoriesByIDPostString(apiHttpClient, projectKey, ID, taxCategoryUpdate);
    }

    public ByProjectKeyTaxCategoriesByIDPost post(
            UnaryOperator<com.commercetools.api.models.tax_category.TaxCategoryUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.tax_category.TaxCategoryUpdateBuilder.of()).build());
    }

    public ByProjectKeyTaxCategoriesByIDDelete delete() {
        return new ByProjectKeyTaxCategoriesByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyTaxCategoriesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
