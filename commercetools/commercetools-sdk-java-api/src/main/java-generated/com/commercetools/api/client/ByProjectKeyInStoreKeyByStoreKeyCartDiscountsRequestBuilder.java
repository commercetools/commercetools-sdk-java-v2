
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartDiscountsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPost post(
            com.commercetools.api.models.cart_discount.CartDiscountDraft cartDiscountDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPost(apiHttpClient, projectKey, storeKey,
            cartDiscountDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString post(final String cartDiscountDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString(apiHttpClient, projectKey, storeKey,
            cartDiscountDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPost post(
            UnaryOperator<com.commercetools.api.models.cart_discount.CartDiscountDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart_discount.CartDiscountDraftBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyRequestBuilder(apiHttpClient, projectKey,
            storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsByIDRequestBuilder(apiHttpClient, projectKey, storeKey,
            ID);
    }

}
