
package com.commercetools.ml.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class ByProjectKeyMissingDataImagesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMissingDataImagesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMissingDataImagesPost post(
            com.commercetools.ml.models.missing_data.MissingImagesSearchRequest missingImagesSearchRequest) {
        return new ByProjectKeyMissingDataImagesPost(apiHttpClient, projectKey, missingImagesSearchRequest);
    }

    public ByProjectKeyMissingDataImagesPost post(
            UnaryOperator<com.commercetools.ml.models.missing_data.MissingImagesSearchRequestBuilder> op) {
        return post(op.apply(com.commercetools.ml.models.missing_data.MissingImagesSearchRequestBuilder.of()).build());
    }

    @Deprecated
    public ByProjectKeyMissingDataImagesStatusRequestBuilder status() {
        return new ByProjectKeyMissingDataImagesStatusRequestBuilder(apiHttpClient, projectKey);
    }
}
