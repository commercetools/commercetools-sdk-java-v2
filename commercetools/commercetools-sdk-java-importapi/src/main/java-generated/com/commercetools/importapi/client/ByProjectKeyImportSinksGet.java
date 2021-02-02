
package com.commercetools.importapi.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Retrieves all import sinks of a project key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImportSinksGet extends
        ApiMethod<ByProjectKeyImportSinksGet, com.commercetools.importapi.models.importsinks.ImportSinkPagedResponse>
        implements com.commercetools.importapi.client.Secured_by_view_import_sinksTrait<ByProjectKeyImportSinksGet> {

    private String projectKey;

    public ByProjectKeyImportSinksGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyImportSinksGet(ByProjectKeyImportSinksGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-sinks", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSinkPagedResponse> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSinkPagedResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.importapi.models.importsinks.ImportSinkPagedResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public ByProjectKeyImportSinksGet withLimit(final Double limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyImportSinksGet addLimit(final Double limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyImportSinksGet withOffset(final Double offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyImportSinksGet addOffset(final Double offset) {
        return copy().addQueryParam("offset", offset);
    }

    @Override
    protected ByProjectKeyImportSinksGet copy() {
        return new ByProjectKeyImportSinksGet(this);
    }
}
