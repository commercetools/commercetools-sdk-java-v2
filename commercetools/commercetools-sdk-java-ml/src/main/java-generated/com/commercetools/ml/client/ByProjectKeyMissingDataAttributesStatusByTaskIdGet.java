
package com.commercetools.ml.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/attributes/status/%s", this.projectKey, this.taskId);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.missing_data.MissingDataTaskStatus> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.ml.models.missing_data.MissingDataTaskStatus.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.missing_data.MissingDataTaskStatus>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.ml.models.missing_data.MissingDataTaskStatus.class);
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
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMissingDataAttributesStatusByTaskIdGet that = (ByProjectKeyMissingDataAttributesStatusByTaskIdGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(taskId, that.taskId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(taskId).toHashCode();
    }

    @Override
    protected ByProjectKeyMissingDataAttributesStatusByTaskIdGet copy() {
        return new ByProjectKeyMissingDataAttributesStatusByTaskIdGet(this);
    }
}
