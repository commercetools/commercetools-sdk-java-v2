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
public class ByProjectKeyCartDiscountsRequestBuilder implements ByProjectKeyCartDiscountsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyCartDiscountsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCartDiscountsGet get() {
        return new ByProjectKeyCartDiscountsGet(apiHttpClient, projectKey);
    }
    
    
    
    public ByProjectKeyCartDiscountsPost post(com.commercetools.api.models.cart_discount.CartDiscountDraft cartDiscountDraft) {
        return new ByProjectKeyCartDiscountsPost(apiHttpClient, projectKey, cartDiscountDraft);
    }
    
    
    public ByProjectKeyCartDiscountsPostString post(final String cartDiscountDraft) {
        return new ByProjectKeyCartDiscountsPostString(apiHttpClient, projectKey, cartDiscountDraft);
    }
    public ByProjectKeyCartDiscountsPost post(UnaryOperator<com.commercetools.api.models.cart_discount.CartDiscountDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart_discount.CartDiscountDraftBuilder.of()).build());
    }

    
    public ByProjectKeyCartDiscountsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCartDiscountsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyCartDiscountsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCartDiscountsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
}
