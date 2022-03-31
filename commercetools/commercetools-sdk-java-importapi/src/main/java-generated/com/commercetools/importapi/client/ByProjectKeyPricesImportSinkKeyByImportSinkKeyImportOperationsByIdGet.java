
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
*  <p>Retrieves the import operation with the given id.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet extends
        ApiMethod<ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet, com.commercetools.importapi.models.importoperations.ImportOperation>
        implements
        com.commercetools.importapi.client.Secured_by_view_productsTrait<ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet> {

    private String projectKey;
    private String importSinkKey;
    private String id;

    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(final ApiHttpClient apiHttpClient,
            String projectKey, String importSinkKey, String id) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.id = id;
    }

    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(
            ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.id = t.id;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/prices/importSinkKey=%s/import-operations/%s", this.projectKey,
            this.importSinkKey, this.id);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.importapi.models.importoperations.ImportOperation.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importoperations.ImportOperation.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public String getId() {
        return this.id;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet that = (ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .append(id, that.id)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(importSinkKey).append(id).toHashCode();
    }

    @Override
    protected ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet copy() {
        return new ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(this);
    }
}
