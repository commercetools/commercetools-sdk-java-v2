package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeShoppingListsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyMeShoppingListsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMeShoppingListsByIDGet get() {
        return new ByProjectKeyMeShoppingListsByIDGet(apiHttpClient, projectKey, ID);
    }
    
    public ByProjectKeyMeShoppingListsByIDPost post(com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate) {
        return new ByProjectKeyMeShoppingListsByIDPost(apiHttpClient, projectKey, ID, myShoppingListUpdate);
    }
    
    public ByProjectKeyMeShoppingListsByIDDelete delete() {
        return new ByProjectKeyMeShoppingListsByIDDelete(apiHttpClient, projectKey, ID);
    }

}
