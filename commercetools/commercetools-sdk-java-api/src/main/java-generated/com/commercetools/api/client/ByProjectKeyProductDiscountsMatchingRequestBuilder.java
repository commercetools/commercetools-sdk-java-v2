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
public class ByProjectKeyProductDiscountsMatchingRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyProductDiscountsMatchingRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductDiscountsMatchingPost post(com.commercetools.api.models.product_discount.ProductDiscountMatchQuery productDiscountMatchQuery) {
        return new ByProjectKeyProductDiscountsMatchingPost(apiHttpClient, projectKey, productDiscountMatchQuery);
    }
    
    
    public ByProjectKeyProductDiscountsMatchingPostString post(final String productDiscountMatchQuery) {
        return new ByProjectKeyProductDiscountsMatchingPostString(apiHttpClient, projectKey, productDiscountMatchQuery);
    }
    public ByProjectKeyProductDiscountsMatchingPost post(UnaryOperator<com.commercetools.api.models.product_discount.ProductDiscountMatchQueryBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_discount.ProductDiscountMatchQueryBuilder.of()).build());
    }

    
}
