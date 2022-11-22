
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductDiscountsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyProductDiscountsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductDiscountsByIDGet get() {
        return new ByProjectKeyProductDiscountsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductDiscountsByIDPost post(
            com.commercetools.api.models.product_discount.ProductDiscountUpdate productDiscountUpdate) {
        return new ByProjectKeyProductDiscountsByIDPost(apiHttpClient, projectKey, ID, productDiscountUpdate);
    }

    public ByProjectKeyProductDiscountsByIDPost post(
            UnaryOperator<com.commercetools.api.models.product_discount.ProductDiscountUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_discount.ProductDiscountUpdateBuilder.of()).build());
    }

    public ByProjectKeyProductDiscountsByIDDelete delete() {
        return new ByProjectKeyProductDiscountsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyProductDiscountsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
