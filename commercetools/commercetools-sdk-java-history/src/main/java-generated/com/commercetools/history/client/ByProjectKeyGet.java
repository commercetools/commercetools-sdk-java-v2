
package com.commercetools.history.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.commercetools.history.models.ChangeHistoryResourceType;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyGet
        extends ApiMethod<ByProjectKeyGet, com.commercetools.history.models.RecordPagedQueryResponse> {

    private String projectKey;

    public ByProjectKeyGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyGet(ByProjectKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.history.models.RecordPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.history.models.RecordPagedQueryResponse.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.history.models.RecordPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.history.models.RecordPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getResourceType() {
        return this.getQueryParam("resourceType");
    }

    public List<String> getDateFrom() {
        return this.getQueryParam("date.from");
    }

    public List<String> getDateTo() {
        return this.getQueryParam("date.to");
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getUserId() {
        return this.getQueryParam("userId");
    }

    public List<String> getType() {
        return this.getQueryParam("type");
    }

    public List<String> getClientId() {
        return this.getQueryParam("clientId");
    }

    public List<String> getResourceId() {
        return this.getQueryParam("resourceId");
    }

    public List<String> getSource() {
        return this.getQueryParam("source");
    }

    public List<String> getChanges() {
        return this.getQueryParam("changes");
    }

    public List<String> getCustomerId() {
        return this.getQueryParam("customerId");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set resourceType with the specificied value
     */
    public ByProjectKeyGet withResourceType(final ChangeHistoryResourceType resourceType) {
        return copy().withQueryParam("resourceType", resourceType);
    }

    /**
     * add additional resourceType query parameter
     */
    public ByProjectKeyGet addResourceType(final ChangeHistoryResourceType resourceType) {
        return copy().addQueryParam("resourceType", resourceType);
    }

    /**
     * set dateFrom with the specificied value
     */
    public ByProjectKeyGet withDateFrom(final Object dateFrom) {
        return copy().withQueryParam("date.from", dateFrom);
    }

    /**
     * add additional dateFrom query parameter
     */
    public ByProjectKeyGet addDateFrom(final Object dateFrom) {
        return copy().addQueryParam("date.from", dateFrom);
    }

    /**
     * set dateTo with the specificied value
     */
    public ByProjectKeyGet withDateTo(final Object dateTo) {
        return copy().withQueryParam("date.to", dateTo);
    }

    /**
     * add additional dateTo query parameter
     */
    public ByProjectKeyGet addDateTo(final Object dateTo) {
        return copy().addQueryParam("date.to", dateTo);
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set userId with the specificied value
     */
    public ByProjectKeyGet withUserId(final String userId) {
        return copy().withQueryParam("userId", userId);
    }

    /**
     * add additional userId query parameter
     */
    public ByProjectKeyGet addUserId(final String userId) {
        return copy().addQueryParam("userId", userId);
    }

    /**
     * set type with the specificied value
     */
    public ByProjectKeyGet withType(final String type) {
        return copy().withQueryParam("type", type);
    }

    /**
     * add additional type query parameter
     */
    public ByProjectKeyGet addType(final String type) {
        return copy().addQueryParam("type", type);
    }

    /**
     * set clientId with the specificied value
     */
    public ByProjectKeyGet withClientId(final String clientId) {
        return copy().withQueryParam("clientId", clientId);
    }

    /**
     * add additional clientId query parameter
     */
    public ByProjectKeyGet addClientId(final String clientId) {
        return copy().addQueryParam("clientId", clientId);
    }

    /**
     * set resourceId with the specificied value
     */
    public ByProjectKeyGet withResourceId(final String resourceId) {
        return copy().withQueryParam("resourceId", resourceId);
    }

    /**
     * add additional resourceId query parameter
     */
    public ByProjectKeyGet addResourceId(final String resourceId) {
        return copy().addQueryParam("resourceId", resourceId);
    }

    /**
     * set source with the specificied value
     */
    public ByProjectKeyGet withSource(final String source) {
        return copy().withQueryParam("source", source);
    }

    /**
     * add additional source query parameter
     */
    public ByProjectKeyGet addSource(final String source) {
        return copy().addQueryParam("source", source);
    }

    /**
     * set changes with the specificied value
     */
    public ByProjectKeyGet withChanges(final String changes) {
        return copy().withQueryParam("changes", changes);
    }

    /**
     * add additional changes query parameter
     */
    public ByProjectKeyGet addChanges(final String changes) {
        return copy().addQueryParam("changes", changes);
    }

    /**
     * set customerId with the specificied value
     */
    public ByProjectKeyGet withCustomerId(final String customerId) {
        return copy().withQueryParam("customerId", customerId);
    }

    /**
     * add additional customerId query parameter
     */
    public ByProjectKeyGet addCustomerId(final String customerId) {
        return copy().addQueryParam("customerId", customerId);
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyGet withExpand(final boolean expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyGet addExpand(final boolean expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyGet copy() {
        return new ByProjectKeyGet(this);
    }
}
