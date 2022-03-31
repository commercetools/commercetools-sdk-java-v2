
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
*  <p>Retrieves an import summary for the given import sink.</p>
*  <p>The import summary is calculated on demand.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet extends
        ApiMethod<ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet, com.commercetools.importapi.models.importsummaries.ImportSummary>
        implements
        com.commercetools.importapi.client.Secured_by_view_import_sinksTrait<ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet> {

    private String projectKey;
    private String importSinkKey;

    public ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet(final ApiHttpClient apiHttpClient,
            String projectKey, String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet(
            ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-summaries/importSinkKey=%s", this.projectKey,
            this.importSinkKey);
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

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet that = (ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importSinkKey).toHashCode();
    }

    @Override
    protected ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet copy() {
        return new ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet(this);
    }
}
