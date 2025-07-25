
package com.commercetools.importapi.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Retrieves an ImportSummary for the ImportContainer with the provided <code>importContainerKey</code>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importsummaries.ImportSummary>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .importContainers()
 *            .withImportContainerKeyValue("{importContainerKey}")
 *            .importSummaries()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyImportContainersByImportContainerKeyImportSummariesGet extends
        TypeApiMethod<ByProjectKeyImportContainersByImportContainerKeyImportSummariesGet, com.commercetools.importapi.models.importsummaries.ImportSummary>
        implements
        com.commercetools.importapi.client.Secured_by_view_import_containersTrait<ByProjectKeyImportContainersByImportContainerKeyImportSummariesGet> {

    @Override
    public TypeReference<com.commercetools.importapi.models.importsummaries.ImportSummary> resultType() {
        return new TypeReference<com.commercetools.importapi.models.importsummaries.ImportSummary>() {
        };
    }

    private String projectKey;
    private String importContainerKey;

    public ByProjectKeyImportContainersByImportContainerKeyImportSummariesGet(final ApiHttpClient apiHttpClient,
            String projectKey, String importContainerKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyImportContainersByImportContainerKeyImportSummariesGet(
            ByProjectKeyImportContainersByImportContainerKeyImportSummariesGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/import-containers/%s/import-summaries",
            encodePathParam(this.projectKey), encodePathParam(this.importContainerKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importsummaries.ImportSummary> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.importapi.models.importsummaries.ImportSummary.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importsummaries.ImportSummary>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importsummaries.ImportSummary.class);
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

        ByProjectKeyImportContainersByImportContainerKeyImportSummariesGet that = (ByProjectKeyImportContainersByImportContainerKeyImportSummariesGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importContainerKey).toHashCode();
    }

    @Override
    protected ByProjectKeyImportContainersByImportContainerKeyImportSummariesGet copy() {
        return new ByProjectKeyImportContainersByImportContainerKeyImportSummariesGet(this);
    }
}
