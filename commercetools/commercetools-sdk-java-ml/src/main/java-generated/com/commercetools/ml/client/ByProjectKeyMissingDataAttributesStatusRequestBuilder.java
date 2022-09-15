
package com.commercetools.ml.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class ByProjectKeyMissingDataAttributesStatusRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMissingDataAttributesStatusRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    @Deprecated
    public ByProjectKeyMissingDataAttributesStatusByTaskIdRequestBuilder withTaskId(String taskId) {
        return new ByProjectKeyMissingDataAttributesStatusByTaskIdRequestBuilder(apiHttpClient, projectKey, taskId);
    }
}
