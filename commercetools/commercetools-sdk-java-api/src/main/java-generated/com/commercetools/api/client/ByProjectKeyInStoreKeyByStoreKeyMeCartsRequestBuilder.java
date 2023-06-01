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
public class ByProjectKeyInStoreKeyByStoreKeyMeCartsRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(apiHttpClient, projectKey, storeKey);
    }
    
    
    
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost post(com.commercetools.api.models.me.MyCartDraft myCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsPost(apiHttpClient, projectKey, storeKey, myCartDraft);
    }
    
    
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPostString post(final String myCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsPostString(apiHttpClient, projectKey, storeKey, myCartDraft);
    }
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost post(UnaryOperator<com.commercetools.api.models.me.MyCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyCartDraftBuilder.of()).build());
    }

    
    public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
    }
    
}
