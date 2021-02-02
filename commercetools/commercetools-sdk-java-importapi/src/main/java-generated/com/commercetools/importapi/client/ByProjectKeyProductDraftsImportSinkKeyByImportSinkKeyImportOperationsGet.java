
package com.commercetools.importapi.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.commercetools.importapi.models.common.ProcessingState;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Retrieves all import operations of an import sink key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet extends
        ApiMethod<ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet, com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>
        implements
        com.commercetools.importapi.client.Secured_by_view_productsTrait<ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet> {

    private String projectKey;
    private String importSinkKey;

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet(final ApiHttpClient apiHttpClient,
            String projectKey, String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet(
            ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-drafts/importSinkKey=%s/import-operations", this.projectKey,
            this.importSinkKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public List<String> getResourceKey() {
        return this.getQueryParam("resourceKey");
    }

    public List<String> getState() {
        return this.getQueryParam("state");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(final Double limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addLimit(final Double limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(final Double offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addOffset(final Double offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(
            final String resourceKey) {
        return copy().withQueryParam("resourceKey", resourceKey);
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addResourceKey(
            final String resourceKey) {
        return copy().addQueryParam("resourceKey", resourceKey);
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet withState(
            final ProcessingState state) {
        return copy().withQueryParam("state", state);
    }

    public ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet addState(
            final ProcessingState state) {
        return copy().addQueryParam("state", state);
    }

    @Override
    protected ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet copy() {
        return new ByProjectKeyProductDraftsImportSinkKeyByImportSinkKeyImportOperationsGet(this);
    }
}
