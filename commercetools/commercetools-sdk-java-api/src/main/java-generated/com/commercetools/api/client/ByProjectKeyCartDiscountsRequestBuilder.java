
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCartDiscountsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCartDiscountsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCartDiscountsGet get() {
        return new ByProjectKeyCartDiscountsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCartDiscountsPost post(
            com.commercetools.api.models.cart_discount.CartDiscountDraft cartDiscountDraft) {
        return new ByProjectKeyCartDiscountsPost(apiHttpClient, projectKey, cartDiscountDraft);
    }

    public ByProjectKeyCartDiscountsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCartDiscountsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCartDiscountsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCartDiscountsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
