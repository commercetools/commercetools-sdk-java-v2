
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStandalonePricesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyStandalonePricesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyStandalonePricesKeyByKeyGet get() {
        return new ByProjectKeyStandalonePricesKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStandalonePricesKeyByKeyHead head() {
        return new ByProjectKeyStandalonePricesKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStandalonePricesKeyByKeyPost post(
            com.commercetools.api.models.standalone_price.StandalonePriceUpdate standalonePriceUpdate) {
        return new ByProjectKeyStandalonePricesKeyByKeyPost(apiHttpClient, projectKey, key, standalonePriceUpdate);
    }

    public ByProjectKeyStandalonePricesKeyByKeyPostString post(final String standalonePriceUpdate) {
        return new ByProjectKeyStandalonePricesKeyByKeyPostString(apiHttpClient, projectKey, key,
            standalonePriceUpdate);
    }

    public ByProjectKeyStandalonePricesKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.standalone_price.StandalonePriceUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.standalone_price.StandalonePriceUpdateBuilder.of()).build());
    }

    public ByProjectKeyStandalonePricesKeyByKeyDelete delete() {
        return new ByProjectKeyStandalonePricesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyStandalonePricesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
