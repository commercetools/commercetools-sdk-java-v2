
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
*  <p>Updates the import container given by the key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportContainersByImportContainerKeyPut extends
        BodyApiMethod<ByProjectKeyImportContainersByImportContainerKeyPut, com.commercetools.importapi.models.importcontainers.ImportContainer, com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraft>
        implements
        com.commercetools.importapi.client.Secured_by_manage_import_containersTrait<ByProjectKeyImportContainersByImportContainerKeyPut> {

    private String projectKey;
    private String importContainerKey;

    private com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraft importContainerUpdateDraft;

    public ByProjectKeyImportContainersByImportContainerKeyPut(final ApiHttpClient apiHttpClient, String projectKey,
            String importContainerKey,
            com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraft importContainerUpdateDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
        this.importContainerUpdateDraft = importContainerUpdateDraft;
    }

    public ByProjectKeyImportContainersByImportContainerKeyPut(ByProjectKeyImportContainersByImportContainerKeyPut t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
        this.importContainerUpdateDraft = t.importContainerUpdateDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-containers/%s", this.projectKey, this.importContainerKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.PUT, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(importContainerUpdateDraft)));

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

    public String getImportContainerKey() {
        return this.importContainerKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
    }

    public com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraft getBody() {
        return importContainerUpdateDraft;
    }

    public ByProjectKeyImportContainersByImportContainerKeyPut withBody(
            com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraft importContainerUpdateDraft) {
        ByProjectKeyImportContainersByImportContainerKeyPut t = copy();
        t.importContainerUpdateDraft = importContainerUpdateDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportContainersByImportContainerKeyPut that = (ByProjectKeyImportContainersByImportContainerKeyPut) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .append(importContainerUpdateDraft, that.importContainerUpdateDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importContainerKey)
                .append(importContainerUpdateDraft)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyImportContainersByImportContainerKeyPut copy() {
        return new ByProjectKeyImportContainersByImportContainerKeyPut(this);
    }
}
