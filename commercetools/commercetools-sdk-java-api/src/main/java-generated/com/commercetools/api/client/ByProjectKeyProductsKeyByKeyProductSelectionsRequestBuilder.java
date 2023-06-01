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
public class ByProjectKeyProductsKeyByKeyProductSelectionsRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyProductsKeyByKeyProductSelectionsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductsKeyByKeyProductSelectionsGet get() {
        return new ByProjectKeyProductsKeyByKeyProductSelectionsGet(apiHttpClient, projectKey, key);
    }
    
    

    
}
