
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public ByProjectKeyStandalonePricesByIDDelete delete() {
        return new ByProjectKeyStandalonePricesByIDDelete(apiHttpClient, projectKey, ID);
    }

}
