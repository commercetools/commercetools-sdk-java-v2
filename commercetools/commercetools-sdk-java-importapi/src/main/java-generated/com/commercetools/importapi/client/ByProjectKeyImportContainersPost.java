
package com.commercetools.importapi.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Creates a new import container.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportContainersPost extends
        BodyApiMethod<ByProjectKeyImportContainersPost, com.commercetools.importapi.models.importcontainers.ImportContainer, com.commercetools.importapi.models.importcontainers.ImportContainerDraft>
        implements
        com.commercetools.importapi.client.Secured_by_manage_import_containersTrait<ByProjectKeyImportContainersPost> {

    private String projectKey;

    private com.commercetools.importapi.models.importcontainers.ImportContainerDraft importContainerDraft;

    public ByProjectKeyImportContainersPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.importapi.models.importcontainers.ImportContainerDraft importContainerDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerDraft = importContainerDraft;
    }

    public ByProjectKeyImportContainersPost(ByProjectKeyImportContainersPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerDraft = t.importContainerDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-containers", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(importContainerDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainer> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.importapi.models.importcontainers.ImportContainer.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importcontainers.ImportContainer>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importcontainers.ImportContainer.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.importapi.models.importcontainers.ImportContainerDraft getBody() {
        return importContainerDraft;
    }

    public ByProjectKeyImportContainersPost withBody(
            com.commercetools.importapi.models.importcontainers.ImportContainerDraft importContainerDraft) {
        ByProjectKeyImportContainersPost t = copy();
        t.importContainerDraft = importContainerDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportContainersPost that = (ByProjectKeyImportContainersPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerDraft, that.importContainerDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importContainerDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyImportContainersPost copy() {
        return new ByProjectKeyImportContainersPost(this);
    }
}
