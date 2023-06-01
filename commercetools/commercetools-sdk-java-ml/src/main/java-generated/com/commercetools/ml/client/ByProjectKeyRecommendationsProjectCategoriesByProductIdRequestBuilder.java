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
public class ByProjectKeyRecommendationsProjectCategoriesByProductIdRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String productId;
    

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String productId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.productId = productId;
    }

    public ByProjectKeyRecommendationsProjectCategoriesByProductIdGet get() {
        return new ByProjectKeyRecommendationsProjectCategoriesByProductIdGet(apiHttpClient, projectKey, productId);
    }
    
    

    
}
