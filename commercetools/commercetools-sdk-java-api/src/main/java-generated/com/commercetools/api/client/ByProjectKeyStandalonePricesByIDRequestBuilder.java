
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStandalonePricesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyStandalonePricesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyStandalonePricesByIDGet get() {
        return new ByProjectKeyStandalonePricesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyStandalonePricesByIDPost post(
            com.commercetools.api.models.standalone_price.StandalonePriceUpdate standalonePriceUpdate) {
        return new ByProjectKeyStandalonePricesByIDPost(apiHttpClient, projectKey, ID, standalonePriceUpdate);
    }

    public ByProjectKeyStandalonePricesByIDPost post(
            UnaryOperator<com.commercetools.api.models.standalone_price.StandalonePriceUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.standalone_price.StandalonePriceUpdateBuilder.of()).build());
    }

    public ByProjectKeyStandalonePricesByIDDelete delete() {
        return new ByProjectKeyStandalonePricesByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyStandalonePricesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
