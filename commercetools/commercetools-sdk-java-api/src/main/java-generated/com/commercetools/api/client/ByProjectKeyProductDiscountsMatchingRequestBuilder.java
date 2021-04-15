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
public class ByProjectKeyProductDiscountsMatchingRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyProductDiscountsMatchingRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductDiscountsMatchingPost post(com.commercetools.api.models.product_discount.ProductDiscountMatchQuery productDiscountMatchQuery) {
        return new ByProjectKeyProductDiscountsMatchingPost(apiHttpClient, projectKey, productDiscountMatchQuery);
    }

}
