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
public class ByProjectKeyExtensionsByIDRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyExtensionsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyExtensionsByIDGet get() {
        return new ByProjectKeyExtensionsByIDGet(apiHttpClient, projectKey, ID);
    }
    
    
    
    public ByProjectKeyExtensionsByIDPost post(com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate) {
        return new ByProjectKeyExtensionsByIDPost(apiHttpClient, projectKey, ID, extensionUpdate);
    }
    
    
    public ByProjectKeyExtensionsByIDPostString post(final String extensionUpdate) {
        return new ByProjectKeyExtensionsByIDPostString(apiHttpClient, projectKey, ID, extensionUpdate);
    }
    public ByProjectKeyExtensionsByIDPost post(UnaryOperator<com.commercetools.api.models.extension.ExtensionUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.extension.ExtensionUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyExtensionsByIDDelete delete() {
        return new ByProjectKeyExtensionsByIDDelete(apiHttpClient, projectKey, ID);
    }
    public <TValue> ByProjectKeyExtensionsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
