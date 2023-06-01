package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyTaxCategoriesKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyTaxCategoriesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyTaxCategoriesKeyByKeyGet get() {
        return new ByProjectKeyTaxCategoriesKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyTaxCategoriesKeyByKeyPost post(com.commercetools.api.models.tax_category.TaxCategoryUpdate taxCategoryUpdate) {
        return new ByProjectKeyTaxCategoriesKeyByKeyPost(apiHttpClient, projectKey, key, taxCategoryUpdate);
    }
    
    
    public ByProjectKeyTaxCategoriesKeyByKeyPostString post(final String taxCategoryUpdate) {
        return new ByProjectKeyTaxCategoriesKeyByKeyPostString(apiHttpClient, projectKey, key, taxCategoryUpdate);
    }
    public ByProjectKeyTaxCategoriesKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.tax_category.TaxCategoryUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.tax_category.TaxCategoryUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyTaxCategoriesKeyByKeyDelete delete() {
        return new ByProjectKeyTaxCategoriesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyTaxCategoriesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
