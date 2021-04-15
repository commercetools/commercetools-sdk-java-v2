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
public class ByProjectKeyExtensionsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyExtensionsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyExtensionsKeyByKeyGet get() {
        return new ByProjectKeyExtensionsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyExtensionsKeyByKeyPost post(com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate) {
        return new ByProjectKeyExtensionsKeyByKeyPost(apiHttpClient, projectKey, key, extensionUpdate);
    }
    
    public ByProjectKeyExtensionsKeyByKeyDelete delete() {
        return new ByProjectKeyExtensionsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
