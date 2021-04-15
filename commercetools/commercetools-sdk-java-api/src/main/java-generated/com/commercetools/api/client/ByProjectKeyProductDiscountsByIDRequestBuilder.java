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
public class ByProjectKeyProductDiscountsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyProductDiscountsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductDiscountsByIDGet get() {
        return new ByProjectKeyProductDiscountsByIDGet(apiHttpClient, projectKey, ID);
    }
    
    public ByProjectKeyProductDiscountsByIDPost post(com.commercetools.api.models.product_discount.ProductDiscountUpdate productDiscountUpdate) {
        return new ByProjectKeyProductDiscountsByIDPost(apiHttpClient, projectKey, ID, productDiscountUpdate);
    }
    
    public ByProjectKeyProductDiscountsByIDDelete delete() {
        return new ByProjectKeyProductDiscountsByIDDelete(apiHttpClient, projectKey, ID);
    }

}
