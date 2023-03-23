
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartDiscountsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyCartDiscountsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyCartDiscountsByIDGet get() {
        return new ByProjectKeyCartDiscountsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyCartDiscountsByIDPost post(
            com.commercetools.api.models.cart_discount.CartDiscountUpdate cartDiscountUpdate) {
        return new ByProjectKeyCartDiscountsByIDPost(apiHttpClient, projectKey, ID, cartDiscountUpdate);
    }

    public ByProjectKeyCartDiscountsByIDPostString post(final String cartDiscountUpdate) {
        return new ByProjectKeyCartDiscountsByIDPostString(apiHttpClient, projectKey, ID, cartDiscountUpdate);
    }

    public ByProjectKeyCartDiscountsByIDPost post(
            UnaryOperator<com.commercetools.api.models.cart_discount.CartDiscountUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart_discount.CartDiscountUpdateBuilder.of()).build());
    }

    public ByProjectKeyCartDiscountsByIDDelete delete() {
        return new ByProjectKeyCartDiscountsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyCartDiscountsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
