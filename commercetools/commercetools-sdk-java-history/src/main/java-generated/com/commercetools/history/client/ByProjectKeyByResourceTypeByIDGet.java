
package com.commercetools.history.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import com.commercetools.history.models.PlatformInitiatedChange;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

    public List<String> getExcludePlatformInitiatedChanges() {
        return this.getQueryParam("excludePlatformInitiatedChanges");
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

    /**
     * set dateFrom with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withDateFrom(final Object dateFrom) {
        return copy().withQueryParam("date.from", dateFrom);
    }

    /**
     * add additional dateFrom query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addDateFrom(final Object dateFrom) {
        return copy().addQueryParam("date.from", dateFrom);
    }

    /**
     * set dateFrom with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withDateFrom(final List<Object> dateFrom) {
        return copy().withoutQueryParam("date.from")
                .addQueryParams(dateFrom.stream()
                        .map(s -> new ParamEntry<>("date.from", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional dateFrom query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addDateFrom(final List<Object> dateFrom) {
        return copy().addQueryParams(
            dateFrom.stream().map(s -> new ParamEntry<>("date.from", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set dateTo with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withDateTo(final Object dateTo) {
        return copy().withQueryParam("date.to", dateTo);
    }

    /**
     * add additional dateTo query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addDateTo(final Object dateTo) {
        return copy().addQueryParam("date.to", dateTo);
    }

    /**
     * set dateTo with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withDateTo(final List<Object> dateTo) {
        return copy().withoutQueryParam("date.to")
                .addQueryParams(
                    dateTo.stream().map(s -> new ParamEntry<>("date.to", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional dateTo query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addDateTo(final List<Object> dateTo) {
        return copy().addQueryParams(
            dateTo.stream().map(s -> new ParamEntry<>("date.to", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withLimit(final List<Integer> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addLimit(final List<Integer> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withOffset(final List<Integer> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addOffset(final List<Integer> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set userId with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withUserId(final String userId) {
        return copy().withQueryParam("userId", userId);
    }

    /**
     * add additional userId query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addUserId(final String userId) {
        return copy().addQueryParam("userId", userId);
    }

    /**
     * set userId with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withUserId(final List<String> userId) {
        return copy().withoutQueryParam("userId")
                .addQueryParams(
                    userId.stream().map(s -> new ParamEntry<>("userId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional userId query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addUserId(final List<String> userId) {
        return copy().addQueryParams(
            userId.stream().map(s -> new ParamEntry<>("userId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set type with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withType(final String type) {
        return copy().withQueryParam("type", type);
    }

    /**
     * add additional type query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addType(final String type) {
        return copy().addQueryParam("type", type);
    }

    /**
     * set type with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withType(final List<String> type) {
        return copy().withoutQueryParam("type")
                .addQueryParams(
                    type.stream().map(s -> new ParamEntry<>("type", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional type query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addType(final List<String> type) {
        return copy().addQueryParams(
            type.stream().map(s -> new ParamEntry<>("type", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set clientId with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withClientId(final String clientId) {
        return copy().withQueryParam("clientId", clientId);
    }

    /**
     * add additional clientId query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addClientId(final String clientId) {
        return copy().addQueryParam("clientId", clientId);
    }

    /**
     * set clientId with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withClientId(final List<String> clientId) {
        return copy().withoutQueryParam("clientId")
                .addQueryParams(clientId.stream()
                        .map(s -> new ParamEntry<>("clientId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional clientId query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addClientId(final List<String> clientId) {
        return copy().addQueryParams(
            clientId.stream().map(s -> new ParamEntry<>("clientId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set source with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withSource(final String source) {
        return copy().withQueryParam("source", source);
    }

    /**
     * add additional source query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addSource(final String source) {
        return copy().addQueryParam("source", source);
    }

    /**
     * set source with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withSource(final List<String> source) {
        return copy().withoutQueryParam("source")
                .addQueryParams(
                    source.stream().map(s -> new ParamEntry<>("source", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional source query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addSource(final List<String> source) {
        return copy().addQueryParams(
            source.stream().map(s -> new ParamEntry<>("source", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set changes with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withChanges(final String changes) {
        return copy().withQueryParam("changes", changes);
    }

    /**
     * add additional changes query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addChanges(final String changes) {
        return copy().addQueryParam("changes", changes);
    }

    /**
     * set changes with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withChanges(final List<String> changes) {
        return copy().withoutQueryParam("changes")
                .addQueryParams(
                    changes.stream().map(s -> new ParamEntry<>("changes", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional changes query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addChanges(final List<String> changes) {
        return copy().addQueryParams(
            changes.stream().map(s -> new ParamEntry<>("changes", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set customerId with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withCustomerId(final String customerId) {
        return copy().withQueryParam("customerId", customerId);
    }

    /**
     * add additional customerId query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addCustomerId(final String customerId) {
        return copy().addQueryParam("customerId", customerId);
    }

    /**
     * set customerId with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withCustomerId(final List<String> customerId) {
        return copy().withoutQueryParam("customerId")
                .addQueryParams(customerId.stream()
                        .map(s -> new ParamEntry<>("customerId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional customerId query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addCustomerId(final List<String> customerId) {
        return copy().addQueryParams(
            customerId.stream().map(s -> new ParamEntry<>("customerId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set excludePlatformInitiatedChanges with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withExcludePlatformInitiatedChanges(
            final PlatformInitiatedChange excludePlatformInitiatedChanges) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", excludePlatformInitiatedChanges);
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addExcludePlatformInitiatedChanges(
            final PlatformInitiatedChange excludePlatformInitiatedChanges) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", excludePlatformInitiatedChanges);
    }

    /**
     * set excludePlatformInitiatedChanges with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withExcludePlatformInitiatedChanges(
            final List<PlatformInitiatedChange> excludePlatformInitiatedChanges) {
        return copy().withoutQueryParam("excludePlatformInitiatedChanges")
                .addQueryParams(excludePlatformInitiatedChanges.stream()
                        .map(s -> new ParamEntry<>("excludePlatformInitiatedChanges", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addExcludePlatformInitiatedChanges(
            final List<PlatformInitiatedChange> excludePlatformInitiatedChanges) {
        return copy().addQueryParams(excludePlatformInitiatedChanges.stream()
                .map(s -> new ParamEntry<>("excludePlatformInitiatedChanges", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyByResourceTypeByIDGet withExpand(final boolean expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyByResourceTypeByIDGet addExpand(final boolean expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyByResourceTypeByIDGet withExpand(final List<Boolean> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyByResourceTypeByIDGet addExpand(final List<Boolean> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyByResourceTypeByIDGet that = (ByProjectKeyByResourceTypeByIDGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(resourceType, that.resourceType)
                .append(ID, that.ID)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(resourceType).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyByResourceTypeByIDGet copy() {
        return new ByProjectKeyByResourceTypeByIDGet(this);
    }
}
