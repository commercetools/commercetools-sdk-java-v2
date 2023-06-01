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
public class ByProjectKeyStoresRequestBuilder implements ByProjectKeyStoresRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyStoresRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyStoresGet get() {
        return new ByProjectKeyStoresGet(apiHttpClient, projectKey);
    }
    
    
    
    public ByProjectKeyStoresPost post(com.commercetools.api.models.store.StoreDraft storeDraft) {
        return new ByProjectKeyStoresPost(apiHttpClient, projectKey, storeDraft);
    }
    
    
    public ByProjectKeyStoresPostString post(final String storeDraft) {
        return new ByProjectKeyStoresPostString(apiHttpClient, projectKey, storeDraft);
    }
    public ByProjectKeyStoresPost post(UnaryOperator<com.commercetools.api.models.store.StoreDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.store.StoreDraftBuilder.of()).build());
    }

    
    public ByProjectKeyStoresKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyStoresKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyStoresByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyStoresByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
}
