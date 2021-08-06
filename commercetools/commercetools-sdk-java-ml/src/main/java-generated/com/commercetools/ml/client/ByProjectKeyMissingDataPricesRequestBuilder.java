
package com.commercetools.ml.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMissingDataPricesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMissingDataPricesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMissingDataPricesPost post(
            com.commercetools.ml.models.missing_data.MissingPricesSearchRequest missingPricesSearchRequest) {
        return new ByProjectKeyMissingDataPricesPost(apiHttpClient, projectKey, missingPricesSearchRequest);
    }

    public ByProjectKeyMissingDataPricesStatusRequestBuilder status() {
        return new ByProjectKeyMissingDataPricesStatusRequestBuilder(apiHttpClient, projectKey);
    }
}
