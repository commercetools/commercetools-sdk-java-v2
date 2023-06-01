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
public class ByProjectKeyCartDiscountsKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyCartDiscountsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyCartDiscountsKeyByKeyGet get() {
        return new ByProjectKeyCartDiscountsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyCartDiscountsKeyByKeyPost post(com.commercetools.api.models.cart_discount.CartDiscountUpdate cartDiscountUpdate) {
        return new ByProjectKeyCartDiscountsKeyByKeyPost(apiHttpClient, projectKey, key, cartDiscountUpdate);
    }
    
    
    public ByProjectKeyCartDiscountsKeyByKeyPostString post(final String cartDiscountUpdate) {
        return new ByProjectKeyCartDiscountsKeyByKeyPostString(apiHttpClient, projectKey, key, cartDiscountUpdate);
    }
    public ByProjectKeyCartDiscountsKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.cart_discount.CartDiscountUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart_discount.CartDiscountUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyCartDiscountsKeyByKeyDelete delete() {
        return new ByProjectKeyCartDiscountsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyCartDiscountsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
