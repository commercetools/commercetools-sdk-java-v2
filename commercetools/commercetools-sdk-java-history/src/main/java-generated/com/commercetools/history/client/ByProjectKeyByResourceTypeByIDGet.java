
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
public class ByProjectKeyByResourceTypeByIDGet extends
        ApiMethod<ByProjectKeyByResourceTypeByIDGet, com.commercetools.history.models.RecordPagedQueryResponse> {

    private String projectKey;
    private String resourceType;
    private String ID;

    public ByProjectKeyByResourceTypeByIDGet(final ApiHttpClient apiHttpClient, String projectKey, String resourceType,
            String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.resourceType = resourceType;
        this.ID = ID;
    }

    public ByProjectKeyByResourceTypeByIDGet(ByProjectKeyByResourceTypeByIDGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.resourceType = t.resourceType;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/%s/%s", this.projectKey, this.resourceType, this.ID);
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

    public String getID() {
        return this.ID;
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

    public void setID(final String ID) {
        this.ID = ID;
    }

    public ByProjectKeyByResourceTypeByIDGet withDateFrom(final Object dateFrom) {
        return copy().withQueryParam("date.from", dateFrom);
    }

    public ByProjectKeyByResourceTypeByIDGet addDateFrom(final Object dateFrom) {
        return copy().addQueryParam("date.from", dateFrom);
    }

    public ByProjectKeyByResourceTypeByIDGet withDateTo(final Object dateTo) {
        return copy().withQueryParam("date.to", dateTo);
    }

    public ByProjectKeyByResourceTypeByIDGet addDateTo(final Object dateTo) {
        return copy().addQueryParam("date.to", dateTo);
    }

    public ByProjectKeyByResourceTypeByIDGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    public ByProjectKeyByResourceTypeByIDGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    public ByProjectKeyByResourceTypeByIDGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    public ByProjectKeyByResourceTypeByIDGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    public ByProjectKeyByResourceTypeByIDGet withUserId(final String userId) {
        return copy().withQueryParam("userId", userId);
    }

    public ByProjectKeyByResourceTypeByIDGet addUserId(final String userId) {
        return copy().addQueryParam("userId", userId);
    }

    public ByProjectKeyByResourceTypeByIDGet withType(final String type) {
        return copy().withQueryParam("type", type);
    }

    public ByProjectKeyByResourceTypeByIDGet addType(final String type) {
        return copy().addQueryParam("type", type);
    }

    public ByProjectKeyByResourceTypeByIDGet withClientId(final String clientId) {
        return copy().withQueryParam("clientId", clientId);
    }

    public ByProjectKeyByResourceTypeByIDGet addClientId(final String clientId) {
        return copy().addQueryParam("clientId", clientId);
    }

    public ByProjectKeyByResourceTypeByIDGet withSource(final String source) {
        return copy().withQueryParam("source", source);
    }

    public ByProjectKeyByResourceTypeByIDGet addSource(final String source) {
        return copy().addQueryParam("source", source);
    }

    public ByProjectKeyByResourceTypeByIDGet withChanges(final String changes) {
        return copy().withQueryParam("changes", changes);
    }

    public ByProjectKeyByResourceTypeByIDGet addChanges(final String changes) {
        return copy().addQueryParam("changes", changes);
    }

    public ByProjectKeyByResourceTypeByIDGet withCustomerId(final String customerId) {
        return copy().withQueryParam("customerId", customerId);
    }

    public ByProjectKeyByResourceTypeByIDGet addCustomerId(final String customerId) {
        return copy().addQueryParam("customerId", customerId);
    }

    public ByProjectKeyByResourceTypeByIDGet withExpand(final boolean expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyByResourceTypeByIDGet addExpand(final boolean expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyByResourceTypeByIDGet copy() {
        return new ByProjectKeyByResourceTypeByIDGet(this);
    }
}
