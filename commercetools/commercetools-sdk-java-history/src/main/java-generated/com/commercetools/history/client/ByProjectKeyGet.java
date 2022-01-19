
package com.commercetools.history.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import com.commercetools.history.models.ChangeHistoryResourceType;
import com.commercetools.history.models.PlatformInitiatedChange;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.history.models.RecordPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.history.models.RecordPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.history.models.RecordPagedQueryResponse.class);
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

    public List<String> getExcludePlatformInitiatedChanges() {
        return this.getQueryParam("excludePlatformInitiatedChanges");
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
     * set resourceType with the specificied values
     */
    public ByProjectKeyGet withResourceType(final List<ChangeHistoryResourceType> resourceType) {
        return copy().withoutQueryParam("resourceType")
                .addQueryParams(resourceType.stream()
                        .map(s -> new ParamEntry<>("resourceType", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceType query parameters
     */
    public ByProjectKeyGet addResourceType(final List<ChangeHistoryResourceType> resourceType) {
        return copy().addQueryParams(resourceType.stream()
                .map(s -> new ParamEntry<>("resourceType", s.toString()))
                .collect(Collectors.toList()));
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
     * set dateFrom with the specificied values
     */
    public ByProjectKeyGet withDateFrom(final List<Object> dateFrom) {
        return copy().withoutQueryParam("date.from")
                .addQueryParams(dateFrom.stream()
                        .map(s -> new ParamEntry<>("date.from", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional dateFrom query parameters
     */
    public ByProjectKeyGet addDateFrom(final List<Object> dateFrom) {
        return copy().addQueryParams(
            dateFrom.stream().map(s -> new ParamEntry<>("date.from", s.toString())).collect(Collectors.toList()));
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
     * set dateTo with the specificied values
     */
    public ByProjectKeyGet withDateTo(final List<Object> dateTo) {
        return copy().withoutQueryParam("date.to")
                .addQueryParams(
                    dateTo.stream().map(s -> new ParamEntry<>("date.to", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional dateTo query parameters
     */
    public ByProjectKeyGet addDateTo(final List<Object> dateTo) {
        return copy().addQueryParams(
            dateTo.stream().map(s -> new ParamEntry<>("date.to", s.toString())).collect(Collectors.toList()));
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
     * set limit with the specificied values
     */
    public ByProjectKeyGet withLimit(final List<Integer> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyGet addLimit(final List<Integer> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
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
     * set offset with the specificied values
     */
    public ByProjectKeyGet withOffset(final List<Integer> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyGet addOffset(final List<Integer> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
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
     * set userId with the specificied values
     */
    public ByProjectKeyGet withUserId(final List<String> userId) {
        return copy().withoutQueryParam("userId")
                .addQueryParams(
                    userId.stream().map(s -> new ParamEntry<>("userId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional userId query parameters
     */
    public ByProjectKeyGet addUserId(final List<String> userId) {
        return copy().addQueryParams(
            userId.stream().map(s -> new ParamEntry<>("userId", s.toString())).collect(Collectors.toList()));
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
     * set type with the specificied values
     */
    public ByProjectKeyGet withType(final List<String> type) {
        return copy().withoutQueryParam("type")
                .addQueryParams(
                    type.stream().map(s -> new ParamEntry<>("type", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional type query parameters
     */
    public ByProjectKeyGet addType(final List<String> type) {
        return copy().addQueryParams(
            type.stream().map(s -> new ParamEntry<>("type", s.toString())).collect(Collectors.toList()));
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
     * set clientId with the specificied values
     */
    public ByProjectKeyGet withClientId(final List<String> clientId) {
        return copy().withoutQueryParam("clientId")
                .addQueryParams(clientId.stream()
                        .map(s -> new ParamEntry<>("clientId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional clientId query parameters
     */
    public ByProjectKeyGet addClientId(final List<String> clientId) {
        return copy().addQueryParams(
            clientId.stream().map(s -> new ParamEntry<>("clientId", s.toString())).collect(Collectors.toList()));
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
     * set resourceId with the specificied values
     */
    public ByProjectKeyGet withResourceId(final List<String> resourceId) {
        return copy().withoutQueryParam("resourceId")
                .addQueryParams(resourceId.stream()
                        .map(s -> new ParamEntry<>("resourceId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceId query parameters
     */
    public ByProjectKeyGet addResourceId(final List<String> resourceId) {
        return copy().addQueryParams(
            resourceId.stream().map(s -> new ParamEntry<>("resourceId", s.toString())).collect(Collectors.toList()));
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
     * set source with the specificied values
     */
    public ByProjectKeyGet withSource(final List<String> source) {
        return copy().withoutQueryParam("source")
                .addQueryParams(
                    source.stream().map(s -> new ParamEntry<>("source", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional source query parameters
     */
    public ByProjectKeyGet addSource(final List<String> source) {
        return copy().addQueryParams(
            source.stream().map(s -> new ParamEntry<>("source", s.toString())).collect(Collectors.toList()));
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
     * set changes with the specificied values
     */
    public ByProjectKeyGet withChanges(final List<String> changes) {
        return copy().withoutQueryParam("changes")
                .addQueryParams(
                    changes.stream().map(s -> new ParamEntry<>("changes", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional changes query parameters
     */
    public ByProjectKeyGet addChanges(final List<String> changes) {
        return copy().addQueryParams(
            changes.stream().map(s -> new ParamEntry<>("changes", s.toString())).collect(Collectors.toList()));
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
     * set customerId with the specificied values
     */
    public ByProjectKeyGet withCustomerId(final List<String> customerId) {
        return copy().withoutQueryParam("customerId")
                .addQueryParams(customerId.stream()
                        .map(s -> new ParamEntry<>("customerId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional customerId query parameters
     */
    public ByProjectKeyGet addCustomerId(final List<String> customerId) {
        return copy().addQueryParams(
            customerId.stream().map(s -> new ParamEntry<>("customerId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set excludePlatformInitiatedChanges with the specificied value
     */
    public ByProjectKeyGet withExcludePlatformInitiatedChanges(
            final PlatformInitiatedChange excludePlatformInitiatedChanges) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", excludePlatformInitiatedChanges);
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     */
    public ByProjectKeyGet addExcludePlatformInitiatedChanges(
            final PlatformInitiatedChange excludePlatformInitiatedChanges) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", excludePlatformInitiatedChanges);
    }

    /**
     * set excludePlatformInitiatedChanges with the specificied values
     */
    public ByProjectKeyGet withExcludePlatformInitiatedChanges(
            final List<PlatformInitiatedChange> excludePlatformInitiatedChanges) {
        return copy().withoutQueryParam("excludePlatformInitiatedChanges")
                .addQueryParams(excludePlatformInitiatedChanges.stream()
                        .map(s -> new ParamEntry<>("excludePlatformInitiatedChanges", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameters
     */
    public ByProjectKeyGet addExcludePlatformInitiatedChanges(
            final List<PlatformInitiatedChange> excludePlatformInitiatedChanges) {
        return copy().addQueryParams(excludePlatformInitiatedChanges.stream()
                .map(s -> new ParamEntry<>("excludePlatformInitiatedChanges", s.toString()))
                .collect(Collectors.toList()));
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

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyGet withExpand(final List<Boolean> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyGet addExpand(final List<Boolean> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyGet that = (ByProjectKeyGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyGet copy() {
        return new ByProjectKeyGet(this);
    }
}
