
package com.commercetools.ml.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
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

    public ByProjectKeyMissingDataPricesPost post(
            UnaryOperator<com.commercetools.ml.models.missing_data.MissingPricesSearchRequestBuilder> op) {
        return post(op.apply(com.commercetools.ml.models.missing_data.MissingPricesSearchRequestBuilder.of()).build());
    }

    @Deprecated
    public ByProjectKeyMissingDataPricesStatusRequestBuilder status() {
        return new ByProjectKeyMissingDataPricesStatusRequestBuilder(apiHttpClient, projectKey);
    }
}
