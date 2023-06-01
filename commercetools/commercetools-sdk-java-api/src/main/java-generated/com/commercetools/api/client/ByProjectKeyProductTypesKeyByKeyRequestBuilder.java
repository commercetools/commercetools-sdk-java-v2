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
public class ByProjectKeyProductTypesKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyProductTypesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductTypesKeyByKeyGet get() {
        return new ByProjectKeyProductTypesKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyProductTypesKeyByKeyHead head() {
        return new ByProjectKeyProductTypesKeyByKeyHead(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyProductTypesKeyByKeyPost post(com.commercetools.api.models.product_type.ProductTypeUpdate productTypeUpdate) {
        return new ByProjectKeyProductTypesKeyByKeyPost(apiHttpClient, projectKey, key, productTypeUpdate);
    }
    
    
    public ByProjectKeyProductTypesKeyByKeyPostString post(final String productTypeUpdate) {
        return new ByProjectKeyProductTypesKeyByKeyPostString(apiHttpClient, projectKey, key, productTypeUpdate);
    }
    public ByProjectKeyProductTypesKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.product_type.ProductTypeUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_type.ProductTypeUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyProductTypesKeyByKeyDelete delete() {
        return new ByProjectKeyProductTypesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyProductTypesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
