
package com.commercetools.ml.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class ByProjectKeyMissingDataAttributesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMissingDataAttributesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMissingDataAttributesPost post(
            com.commercetools.ml.models.missing_data.MissingAttributesSearchRequest missingAttributesSearchRequest) {
        return new ByProjectKeyMissingDataAttributesPost(apiHttpClient, projectKey, missingAttributesSearchRequest);
    }

    public ByProjectKeyMissingDataAttributesPost post(
            UnaryOperator<com.commercetools.ml.models.missing_data.MissingAttributesSearchRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.ml.models.missing_data.MissingAttributesSearchRequestBuilder.of()).build());
    }

    @Deprecated
    public ByProjectKeyMissingDataAttributesStatusRequestBuilder status() {
        return new ByProjectKeyMissingDataAttributesStatusRequestBuilder(apiHttpClient, projectKey);
    }
}
