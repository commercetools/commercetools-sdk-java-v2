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
public class ByProjectKeyProductDiscountsKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyProductDiscountsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductDiscountsKeyByKeyGet get() {
        return new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyProductDiscountsKeyByKeyPost post(com.commercetools.api.models.product_discount.ProductDiscountUpdate productDiscountUpdate) {
        return new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClient, projectKey, key, productDiscountUpdate);
    }
    
    
    public ByProjectKeyProductDiscountsKeyByKeyPostString post(final String productDiscountUpdate) {
        return new ByProjectKeyProductDiscountsKeyByKeyPostString(apiHttpClient, projectKey, key, productDiscountUpdate);
    }
    public ByProjectKeyProductDiscountsKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.product_discount.ProductDiscountUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_discount.ProductDiscountUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyProductDiscountsKeyByKeyDelete delete() {
        return new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyProductDiscountsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
