
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStandalonePricesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyStandalonePricesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyStandalonePricesGet get() {
        return new ByProjectKeyStandalonePricesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyStandalonePricesPost post(
            com.commercetools.api.models.standalone_price.StandalonePriceDraft standalonePriceDraft) {
        return new ByProjectKeyStandalonePricesPost(apiHttpClient, projectKey, standalonePriceDraft);
    }

    public ByProjectKeyStandalonePricesPost post(
            UnaryOperator<com.commercetools.api.models.standalone_price.StandalonePriceDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.standalone_price.StandalonePriceDraftBuilder.of()).build());
    }

    public ByProjectKeyStandalonePricesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyStandalonePricesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStandalonePricesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyStandalonePricesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
