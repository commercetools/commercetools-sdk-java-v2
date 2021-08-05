
package com.commercetools.ml.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

public class ByProjectKeySimilaritiesProductsStatusByTaskIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String taskId;

    public ByProjectKeySimilaritiesProductsStatusByTaskIdRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String taskId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.taskId = taskId;
    }

    public ByProjectKeySimilaritiesProductsStatusByTaskIdGet get() {
        return new ByProjectKeySimilaritiesProductsStatusByTaskIdGet(apiHttpClient, projectKey, taskId);
    }

}
