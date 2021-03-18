
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
        extends ApiMethod<ByProjectKeyGet, com.commercetools.history.models.ChangeHistoryPagedQueryResponse> {

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
    public ApiHttpResponse<com.commercetools.history.models.ChangeHistoryPagedQueryResponse> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.history.models.ChangeHistoryPagedQueryResponse>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.history.models.ChangeHistoryPagedQueryResponse.class);
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

    public ByProjectKeyGet withResourceType(final ChangeHistoryResourceType resourceType) {
        return copy().withQueryParam("resourceType", resourceType);
    }

    public ByProjectKeyGet addResourceType(final ChangeHistoryResourceType resourceType) {
        return copy().addQueryParam("resourceType", resourceType);
    }

    public ByProjectKeyGet withDateFrom(final Object dateFrom) {
        return copy().withQueryParam("date.from", dateFrom);
    }

    public ByProjectKeyGet addDateFrom(final Object dateFrom) {
        return copy().addQueryParam("date.from", dateFrom);
    }

    public ByProjectKeyGet withDateTo(final Object dateTo) {
        return copy().withQueryParam("date.to", dateTo);
    }

    public ByProjectKeyGet addDateTo(final Object dateTo) {
        return copy().addQueryParam("date.to", dateTo);
    }

    public ByProjectKeyGet withLimit(final Integer limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyGet addLimit(final Integer limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyGet withOffset(final Integer offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyGet addOffset(final Integer offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyGet withUserId(final String userId) {
        return copy().withQueryParam("userId", userId);
    }

    public ByProjectKeyGet addUserId(final String userId) {
        return copy().addQueryParam("userId", userId);
    }

    public ByProjectKeyGet withClientId(final String clientId) {
        return copy().withQueryParam("clientId", clientId);
    }

    public ByProjectKeyGet addClientId(final String clientId) {
        return copy().addQueryParam("clientId", clientId);
    }

    public ByProjectKeyGet withResourceId(final String resourceId) {
        return copy().withQueryParam("resourceId", resourceId);
    }

    public ByProjectKeyGet addResourceId(final String resourceId) {
        return copy().addQueryParam("resourceId", resourceId);
    }

    public ByProjectKeyGet withSource(final String source) {
        return copy().withQueryParam("source", source);
    }

    public ByProjectKeyGet addSource(final String source) {
        return copy().addQueryParam("source", source);
    }

    public ByProjectKeyGet withChanges(final String changes) {
        return copy().withQueryParam("changes", changes);
    }

    public ByProjectKeyGet addChanges(final String changes) {
        return copy().addQueryParam("changes", changes);
    }

    public ByProjectKeyGet withCustomerId(final String customerId) {
        return copy().withQueryParam("customerId", customerId);
    }

    public ByProjectKeyGet addCustomerId(final String customerId) {
        return copy().addQueryParam("customerId", customerId);
    }

    public ByProjectKeyGet withExpand(final Boolean expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyGet addExpand(final Boolean expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyGet copy() {
        return new ByProjectKeyGet(this);
    }
}
