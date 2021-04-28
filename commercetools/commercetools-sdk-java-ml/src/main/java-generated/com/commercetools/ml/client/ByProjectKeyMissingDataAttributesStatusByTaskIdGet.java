
package com.commercetools.ml.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMissingDataAttributesStatusByTaskIdGet extends
        ApiMethod<ByProjectKeyMissingDataAttributesStatusByTaskIdGet, com.commercetools.ml.models.missing_data.MissingDataTaskStatus> {

    private String projectKey;
    private String taskId;

    public ByProjectKeyMissingDataAttributesStatusByTaskIdGet(final ApiHttpClient apiHttpClient, String projectKey,
            String taskId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.taskId = taskId;
    }

    public ByProjectKeyMissingDataAttributesStatusByTaskIdGet(ByProjectKeyMissingDataAttributesStatusByTaskIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.taskId = t.taskId;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/attributes/status/%s", this.projectKey, this.taskId);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.missing_data.MissingDataTaskStatus> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.ml.models.missing_data.MissingDataTaskStatus.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.missing_data.MissingDataTaskStatus>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.ml.models.missing_data.MissingDataTaskStatus.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setTaskId(final String taskId) {
        this.taskId = taskId;
    }

    @Override
    protected ByProjectKeyMissingDataAttributesStatusByTaskIdGet copy() {
        return new ByProjectKeyMissingDataAttributesStatusByTaskIdGet(this);
    }
}
