
package com.commercetools.history.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyByResourceTypeGet
        extends ApiMethod<ByProjectKeyByResourceTypeGet, com.commercetools.history.models.RecordPagedQueryResponse> {

    private String projectKey;
    private String resourceType;

    public ByProjectKeyByResourceTypeGet(final ApiHttpClient apiHttpClient, String projectKey, String resourceType) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.resourceType = resourceType;
    }

    public ByProjectKeyByResourceTypeGet(ByProjectKeyByResourceTypeGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.resourceType = t.resourceType;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/%s", this.projectKey, this.resourceType);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.history.models.RecordPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        return blockingWait(execute(client), timeout);
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

    public String getResourceType() {
        return this.resourceType;
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

    public void setResourceType(final String resourceType) {
        this.resourceType = resourceType;
    }

    public ByProjectKeyByResourceTypeGet withDateFrom(final Object dateFrom) {
        return copy().withQueryParam("date.from", dateFrom);
    }

    public ByProjectKeyByResourceTypeGet addDateFrom(final Object dateFrom) {
        return copy().addQueryParam("date.from", dateFrom);
    }

    public ByProjectKeyByResourceTypeGet withDateTo(final Object dateTo) {
        return copy().withQueryParam("date.to", dateTo);
    }

    public ByProjectKeyByResourceTypeGet addDateTo(final Object dateTo) {
        return copy().addQueryParam("date.to", dateTo);
    }

    public ByProjectKeyByResourceTypeGet withLimit(final Integer limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyByResourceTypeGet addLimit(final Integer limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyByResourceTypeGet withOffset(final Integer offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyByResourceTypeGet addOffset(final Integer offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyByResourceTypeGet withUserId(final String userId) {
        return copy().withQueryParam("userId", userId);
    }

    public ByProjectKeyByResourceTypeGet addUserId(final String userId) {
        return copy().addQueryParam("userId", userId);
    }

    public ByProjectKeyByResourceTypeGet withType(final String type) {
        return copy().withQueryParam("type", type);
    }

    public ByProjectKeyByResourceTypeGet addType(final String type) {
        return copy().addQueryParam("type", type);
    }

    public ByProjectKeyByResourceTypeGet withClientId(final String clientId) {
        return copy().withQueryParam("clientId", clientId);
    }

    public ByProjectKeyByResourceTypeGet addClientId(final String clientId) {
        return copy().addQueryParam("clientId", clientId);
    }

    public ByProjectKeyByResourceTypeGet withResourceId(final String resourceId) {
        return copy().withQueryParam("resourceId", resourceId);
    }

    public ByProjectKeyByResourceTypeGet addResourceId(final String resourceId) {
        return copy().addQueryParam("resourceId", resourceId);
    }

    public ByProjectKeyByResourceTypeGet withSource(final String source) {
        return copy().withQueryParam("source", source);
    }

    public ByProjectKeyByResourceTypeGet addSource(final String source) {
        return copy().addQueryParam("source", source);
    }

    public ByProjectKeyByResourceTypeGet withChanges(final String changes) {
        return copy().withQueryParam("changes", changes);
    }

    public ByProjectKeyByResourceTypeGet addChanges(final String changes) {
        return copy().addQueryParam("changes", changes);
    }

    public ByProjectKeyByResourceTypeGet withCustomerId(final String customerId) {
        return copy().withQueryParam("customerId", customerId);
    }

    public ByProjectKeyByResourceTypeGet addCustomerId(final String customerId) {
        return copy().addQueryParam("customerId", customerId);
    }

    public ByProjectKeyByResourceTypeGet withExpand(final Boolean expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyByResourceTypeGet addExpand(final Boolean expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyByResourceTypeGet copy() {
        return new ByProjectKeyByResourceTypeGet(this);
    }
}
