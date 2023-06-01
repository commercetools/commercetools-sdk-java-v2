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
public class ByProjectKeyCategoriesKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyCategoriesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyCategoriesKeyByKeyGet get() {
        return new ByProjectKeyCategoriesKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyCategoriesKeyByKeyPost post(com.commercetools.api.models.category.CategoryUpdate categoryUpdate) {
        return new ByProjectKeyCategoriesKeyByKeyPost(apiHttpClient, projectKey, key, categoryUpdate);
    }
    
    
    public ByProjectKeyCategoriesKeyByKeyPostString post(final String categoryUpdate) {
        return new ByProjectKeyCategoriesKeyByKeyPostString(apiHttpClient, projectKey, key, categoryUpdate);
    }
    public ByProjectKeyCategoriesKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.category.CategoryUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.category.CategoryUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyCategoriesKeyByKeyDelete delete() {
        return new ByProjectKeyCategoriesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyCategoriesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
