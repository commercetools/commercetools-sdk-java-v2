package com.commercetools.ml.client;

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
public class ByProjectKeySimilaritiesProductsStatusRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeySimilaritiesProductsStatusRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }


    
    public ByProjectKeySimilaritiesProductsStatusByTaskIdRequestBuilder withTaskId(String taskId) {
        return new ByProjectKeySimilaritiesProductsStatusByTaskIdRequestBuilder(apiHttpClient, projectKey, taskId);
    }
    
}
