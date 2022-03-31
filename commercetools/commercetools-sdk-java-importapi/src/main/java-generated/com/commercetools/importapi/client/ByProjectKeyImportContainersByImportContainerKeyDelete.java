
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
*  <p>Deletes the import container given by the key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportContainersByImportContainerKeyDelete extends
        ApiMethod<ByProjectKeyImportContainersByImportContainerKeyDelete, com.commercetools.importapi.models.importcontainers.ImportContainer>
        implements
        com.commercetools.importapi.client.Secured_by_manage_import_containersTrait<ByProjectKeyImportContainersByImportContainerKeyDelete> {

    private String projectKey;
    private String importContainerKey;

    public ByProjectKeyImportContainersByImportContainerKeyDelete(final ApiHttpClient apiHttpClient, String projectKey,
            String importContainerKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyImportContainersByImportContainerKeyDelete(
            ByProjectKeyImportContainersByImportContainerKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-containers/%s", this.projectKey, this.importContainerKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportContainersByImportContainerKeyDelete that = (ByProjectKeyImportContainersByImportContainerKeyDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importContainerKey).toHashCode();
    }

    @Override
    protected ByProjectKeyImportContainersByImportContainerKeyDelete copy() {
        return new ByProjectKeyImportContainersByImportContainerKeyDelete(this);
    }
}
