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
public class ByProjectKeyCategoriesByIDRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyCategoriesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyCategoriesByIDGet get() {
        return new ByProjectKeyCategoriesByIDGet(apiHttpClient, projectKey, ID);
    }
    
    
    
    public ByProjectKeyCategoriesByIDPost post(com.commercetools.api.models.category.CategoryUpdate categoryUpdate) {
        return new ByProjectKeyCategoriesByIDPost(apiHttpClient, projectKey, ID, categoryUpdate);
    }
    
    
    public ByProjectKeyCategoriesByIDPostString post(final String categoryUpdate) {
        return new ByProjectKeyCategoriesByIDPostString(apiHttpClient, projectKey, ID, categoryUpdate);
    }
    public ByProjectKeyCategoriesByIDPost post(UnaryOperator<com.commercetools.api.models.category.CategoryUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.category.CategoryUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyCategoriesByIDDelete delete() {
        return new ByProjectKeyCategoriesByIDDelete(apiHttpClient, projectKey, ID);
    }
    public <TValue> ByProjectKeyCategoriesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
