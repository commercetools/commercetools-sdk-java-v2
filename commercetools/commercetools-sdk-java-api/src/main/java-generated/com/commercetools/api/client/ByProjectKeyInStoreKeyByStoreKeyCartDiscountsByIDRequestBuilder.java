
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDPost post(
            com.commercetools.api.models.cart_discount.CartDiscountUpdate cartDiscountUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDPost(apiHttpClient, projectKey, storeKey, ID,
            cartDiscountUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDPostString post(final String cartDiscountUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDPostString(apiHttpClient, projectKey, storeKey, ID,
            cartDiscountUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDPost post(
            UnaryOperator<com.commercetools.api.models.cart_discount.CartDiscountUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart_discount.CartDiscountUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
