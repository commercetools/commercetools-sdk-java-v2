
package com.commercetools.ml.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

public class ByProjectKeyMissingDataImagesStatusRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMissingDataImagesStatusRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMissingDataImagesStatusByTaskIdRequestBuilder withTaskId(String taskId) {
        return new ByProjectKeyMissingDataImagesStatusByTaskIdRequestBuilder(apiHttpClient, projectKey, taskId);
    }
}
