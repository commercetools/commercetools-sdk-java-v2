
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost post(
            com.commercetools.api.models.cart_discount.CartDiscountUpdate cartDiscountUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost(apiHttpClient, projectKey, storeKey, key,
            cartDiscountUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPostString post(final String cartDiscountUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPostString(apiHttpClient, projectKey, storeKey,
            key, cartDiscountUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.cart_discount.CartDiscountUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart_discount.CartDiscountUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyDelete(apiHttpClient, projectKey, storeKey,
            key);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
