
package com.commercetools.history.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.commercetools.history.models.change_history.PlatformInitiatedChange;
import com.commercetools.history.models.change_history.Source;
import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>The <code>view_audit_log:{projectKey}</code> scope is required, and depending on the <a href="https://docs.commercetools.com/apis/ctp:history:type:ChangeHistoryResourceType" rel="nofollow">resource type</a> queried, their respective scopes must be granted.</p>
 *  <p>If the request exceeds the rate limit, a <a href="https://docs.commercetools.com/apis/ctp:history:type:TooManyRequestsError" rel="nofollow">TooManyRequests</a> error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.history.models.change_history.RecordPagedQueryResponse>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .withResourceTypeValue("{resourceType}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyByResourceTypeGet extends
        TypeApiMethod<ByProjectKeyByResourceTypeGet, com.commercetools.history.models.change_history.RecordPagedQueryResponse> {

    @Override
    public TypeReference<com.commercetools.history.models.change_history.RecordPagedQueryResponse> resultType() {
        return new TypeReference<com.commercetools.history.models.change_history.RecordPagedQueryResponse>() {
        };
    }

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
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/%s", encodePathParam(this.projectKey),
            encodePathParam(this.resourceType));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.history.models.change_history.RecordPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.history.models.change_history.RecordPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.history.models.change_history.RecordPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.history.models.change_history.RecordPagedQueryResponse.class);
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

    public List<String> getClientId() {
        return this.getQueryParam("clientId");
    }

    public List<String> getCustomerId() {
        return this.getQueryParam("customerId");
    }

    public List<String> getAssociateId() {
        return this.getQueryParam("associateId");
    }

    public List<String> getBusinessUnit() {
        return this.getQueryParam("businessUnit");
    }

    public List<String> getType() {
        return this.getQueryParam("type");
    }

    public List<String> getResourceKey() {
        return this.getQueryParam("resourceKey");
    }

    public List<String> getSource() {
        return this.getQueryParam("source");
    }

    public List<String> getChanges() {
        return this.getQueryParam("changes");
    }

    public List<String> getStores() {
        return this.getQueryParam("stores");
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

    /**
     * set dateFrom with the specified value
     * @param dateFrom value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withDateFrom(final TValue dateFrom) {
        return copy().withQueryParam("date.from", dateFrom);
    }

    /**
     * add additional dateFrom query parameter
     * @param dateFrom value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addDateFrom(final TValue dateFrom) {
        return copy().addQueryParam("date.from", dateFrom);
    }

    /**
     * set dateFrom with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withDateFrom(final Supplier<Object> supplier) {
        return copy().withQueryParam("date.from", supplier.get());
    }

    /**
     * add additional dateFrom query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addDateFrom(final Supplier<Object> supplier) {
        return copy().addQueryParam("date.from", supplier.get());
    }

    /**
     * set dateFrom with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withDateFrom(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("date.from", op.apply(new StringBuilder()));
    }

    /**
     * add additional dateFrom query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addDateFrom(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("date.from", op.apply(new StringBuilder()));
    }

    /**
     * set dateFrom with the specified values
     * @param dateFrom values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withDateFrom(final Collection<TValue> dateFrom) {
        return copy().withoutQueryParam("date.from")
                .addQueryParams(dateFrom.stream()
                        .map(s -> new ParamEntry<>("date.from", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional dateFrom query parameters
     * @param dateFrom values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addDateFrom(final Collection<TValue> dateFrom) {
        return copy().addQueryParams(
            dateFrom.stream().map(s -> new ParamEntry<>("date.from", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set dateTo with the specified value
     * @param dateTo value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withDateTo(final TValue dateTo) {
        return copy().withQueryParam("date.to", dateTo);
    }

    /**
     * add additional dateTo query parameter
     * @param dateTo value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addDateTo(final TValue dateTo) {
        return copy().addQueryParam("date.to", dateTo);
    }

    /**
     * set dateTo with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withDateTo(final Supplier<Object> supplier) {
        return copy().withQueryParam("date.to", supplier.get());
    }

    /**
     * add additional dateTo query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addDateTo(final Supplier<Object> supplier) {
        return copy().addQueryParam("date.to", supplier.get());
    }

    /**
     * set dateTo with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withDateTo(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("date.to", op.apply(new StringBuilder()));
    }

    /**
     * add additional dateTo query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addDateTo(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("date.to", op.apply(new StringBuilder()));
    }

    /**
     * set dateTo with the specified values
     * @param dateTo values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withDateTo(final Collection<TValue> dateTo) {
        return copy().withoutQueryParam("date.to")
                .addQueryParams(
                    dateTo.stream().map(s -> new ParamEntry<>("date.to", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional dateTo query parameters
     * @param dateTo values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addDateTo(final Collection<TValue> dateTo) {
        return copy().addQueryParams(
            dateTo.stream().map(s -> new ParamEntry<>("date.to", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set userId with the specified value
     * @param userId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withUserId(final TValue userId) {
        return copy().withQueryParam("userId", userId);
    }

    /**
     * add additional userId query parameter
     * @param userId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addUserId(final TValue userId) {
        return copy().addQueryParam("userId", userId);
    }

    /**
     * set userId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withUserId(final Supplier<String> supplier) {
        return copy().withQueryParam("userId", supplier.get());
    }

    /**
     * add additional userId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addUserId(final Supplier<String> supplier) {
        return copy().addQueryParam("userId", supplier.get());
    }

    /**
     * set userId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withUserId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("userId", op.apply(new StringBuilder()));
    }

    /**
     * add additional userId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addUserId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("userId", op.apply(new StringBuilder()));
    }

    /**
     * set userId with the specified values
     * @param userId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withUserId(final Collection<TValue> userId) {
        return copy().withoutQueryParam("userId")
                .addQueryParams(
                    userId.stream().map(s -> new ParamEntry<>("userId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional userId query parameters
     * @param userId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addUserId(final Collection<TValue> userId) {
        return copy().addQueryParams(
            userId.stream().map(s -> new ParamEntry<>("userId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set clientId with the specified value
     * @param clientId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withClientId(final TValue clientId) {
        return copy().withQueryParam("clientId", clientId);
    }

    /**
     * add additional clientId query parameter
     * @param clientId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addClientId(final TValue clientId) {
        return copy().addQueryParam("clientId", clientId);
    }

    /**
     * set clientId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withClientId(final Supplier<String> supplier) {
        return copy().withQueryParam("clientId", supplier.get());
    }

    /**
     * add additional clientId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addClientId(final Supplier<String> supplier) {
        return copy().addQueryParam("clientId", supplier.get());
    }

    /**
     * set clientId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withClientId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("clientId", op.apply(new StringBuilder()));
    }

    /**
     * add additional clientId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addClientId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("clientId", op.apply(new StringBuilder()));
    }

    /**
     * set clientId with the specified values
     * @param clientId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withClientId(final Collection<TValue> clientId) {
        return copy().withoutQueryParam("clientId")
                .addQueryParams(clientId.stream()
                        .map(s -> new ParamEntry<>("clientId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional clientId query parameters
     * @param clientId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addClientId(final Collection<TValue> clientId) {
        return copy().addQueryParams(
            clientId.stream().map(s -> new ParamEntry<>("clientId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set customerId with the specified value
     * @param customerId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withCustomerId(final TValue customerId) {
        return copy().withQueryParam("customerId", customerId);
    }

    /**
     * add additional customerId query parameter
     * @param customerId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addCustomerId(final TValue customerId) {
        return copy().addQueryParam("customerId", customerId);
    }

    /**
     * set customerId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withCustomerId(final Supplier<String> supplier) {
        return copy().withQueryParam("customerId", supplier.get());
    }

    /**
     * add additional customerId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addCustomerId(final Supplier<String> supplier) {
        return copy().addQueryParam("customerId", supplier.get());
    }

    /**
     * set customerId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withCustomerId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("customerId", op.apply(new StringBuilder()));
    }

    /**
     * add additional customerId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addCustomerId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("customerId", op.apply(new StringBuilder()));
    }

    /**
     * set customerId with the specified values
     * @param customerId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withCustomerId(final Collection<TValue> customerId) {
        return copy().withoutQueryParam("customerId")
                .addQueryParams(customerId.stream()
                        .map(s -> new ParamEntry<>("customerId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional customerId query parameters
     * @param customerId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addCustomerId(final Collection<TValue> customerId) {
        return copy().addQueryParams(
            customerId.stream().map(s -> new ParamEntry<>("customerId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set associateId with the specified value
     * @param associateId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withAssociateId(final TValue associateId) {
        return copy().withQueryParam("associateId", associateId);
    }

    /**
     * add additional associateId query parameter
     * @param associateId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addAssociateId(final TValue associateId) {
        return copy().addQueryParam("associateId", associateId);
    }

    /**
     * set associateId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withAssociateId(final Supplier<String> supplier) {
        return copy().withQueryParam("associateId", supplier.get());
    }

    /**
     * add additional associateId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addAssociateId(final Supplier<String> supplier) {
        return copy().addQueryParam("associateId", supplier.get());
    }

    /**
     * set associateId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withAssociateId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("associateId", op.apply(new StringBuilder()));
    }

    /**
     * add additional associateId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addAssociateId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("associateId", op.apply(new StringBuilder()));
    }

    /**
     * set associateId with the specified values
     * @param associateId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withAssociateId(final Collection<TValue> associateId) {
        return copy().withoutQueryParam("associateId")
                .addQueryParams(associateId.stream()
                        .map(s -> new ParamEntry<>("associateId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional associateId query parameters
     * @param associateId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addAssociateId(final Collection<TValue> associateId) {
        return copy().addQueryParams(
            associateId.stream().map(s -> new ParamEntry<>("associateId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set businessUnit with the specified value
     * @param businessUnit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withBusinessUnit(final TValue businessUnit) {
        return copy().withQueryParam("businessUnit", businessUnit);
    }

    /**
     * add additional businessUnit query parameter
     * @param businessUnit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addBusinessUnit(final TValue businessUnit) {
        return copy().addQueryParam("businessUnit", businessUnit);
    }

    /**
     * set businessUnit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withBusinessUnit(final Supplier<String> supplier) {
        return copy().withQueryParam("businessUnit", supplier.get());
    }

    /**
     * add additional businessUnit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addBusinessUnit(final Supplier<String> supplier) {
        return copy().addQueryParam("businessUnit", supplier.get());
    }

    /**
     * set businessUnit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withBusinessUnit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("businessUnit", op.apply(new StringBuilder()));
    }

    /**
     * add additional businessUnit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addBusinessUnit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("businessUnit", op.apply(new StringBuilder()));
    }

    /**
     * set businessUnit with the specified values
     * @param businessUnit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withBusinessUnit(final Collection<TValue> businessUnit) {
        return copy().withoutQueryParam("businessUnit")
                .addQueryParams(businessUnit.stream()
                        .map(s -> new ParamEntry<>("businessUnit", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional businessUnit query parameters
     * @param businessUnit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addBusinessUnit(final Collection<TValue> businessUnit) {
        return copy().addQueryParams(businessUnit.stream()
                .map(s -> new ParamEntry<>("businessUnit", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set type with the specified value
     * @param type value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withType(final TValue type) {
        return copy().withQueryParam("type", type);
    }

    /**
     * add additional type query parameter
     * @param type value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addType(final TValue type) {
        return copy().addQueryParam("type", type);
    }

    /**
     * set type with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withType(final Supplier<String> supplier) {
        return copy().withQueryParam("type", supplier.get());
    }

    /**
     * add additional type query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addType(final Supplier<String> supplier) {
        return copy().addQueryParam("type", supplier.get());
    }

    /**
     * set type with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withType(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("type", op.apply(new StringBuilder()));
    }

    /**
     * add additional type query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addType(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("type", op.apply(new StringBuilder()));
    }

    /**
     * set type with the specified values
     * @param type values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withType(final Collection<TValue> type) {
        return copy().withoutQueryParam("type")
                .addQueryParams(
                    type.stream().map(s -> new ParamEntry<>("type", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional type query parameters
     * @param type values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addType(final Collection<TValue> type) {
        return copy().addQueryParams(
            type.stream().map(s -> new ParamEntry<>("type", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set resourceKey with the specified value
     * @param resourceKey value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withResourceKey(final TValue resourceKey) {
        return copy().withQueryParam("resourceKey", resourceKey);
    }

    /**
     * add additional resourceKey query parameter
     * @param resourceKey value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addResourceKey(final TValue resourceKey) {
        return copy().addQueryParam("resourceKey", resourceKey);
    }

    /**
     * set resourceKey with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withResourceKey(final Supplier<String> supplier) {
        return copy().withQueryParam("resourceKey", supplier.get());
    }

    /**
     * add additional resourceKey query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addResourceKey(final Supplier<String> supplier) {
        return copy().addQueryParam("resourceKey", supplier.get());
    }

    /**
     * set resourceKey with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withResourceKey(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("resourceKey", op.apply(new StringBuilder()));
    }

    /**
     * add additional resourceKey query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addResourceKey(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("resourceKey", op.apply(new StringBuilder()));
    }

    /**
     * set resourceKey with the specified values
     * @param resourceKey values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withResourceKey(final Collection<TValue> resourceKey) {
        return copy().withoutQueryParam("resourceKey")
                .addQueryParams(resourceKey.stream()
                        .map(s -> new ParamEntry<>("resourceKey", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceKey query parameters
     * @param resourceKey values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addResourceKey(final Collection<TValue> resourceKey) {
        return copy().addQueryParams(
            resourceKey.stream().map(s -> new ParamEntry<>("resourceKey", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set source with the specified value
     * @param source value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withSource(final TValue source) {
        return copy().withQueryParam("source", source);
    }

    /**
     * add additional source query parameter
     * @param source value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addSource(final TValue source) {
        return copy().addQueryParam("source", source);
    }

    /**
     * set source with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withSource(final Supplier<Source> supplier) {
        return copy().withQueryParam("source", supplier.get());
    }

    /**
     * add additional source query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addSource(final Supplier<Source> supplier) {
        return copy().addQueryParam("source", supplier.get());
    }

    /**
     * set source with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withSource(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("source", op.apply(new StringBuilder()));
    }

    /**
     * add additional source query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addSource(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("source", op.apply(new StringBuilder()));
    }

    /**
     * set source with the specified values
     * @param source values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withSource(final Collection<TValue> source) {
        return copy().withoutQueryParam("source")
                .addQueryParams(
                    source.stream().map(s -> new ParamEntry<>("source", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional source query parameters
     * @param source values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addSource(final Collection<TValue> source) {
        return copy().addQueryParams(
            source.stream().map(s -> new ParamEntry<>("source", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set changes with the specified value
     * @param changes value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withChanges(final TValue changes) {
        return copy().withQueryParam("changes", changes);
    }

    /**
     * add additional changes query parameter
     * @param changes value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addChanges(final TValue changes) {
        return copy().addQueryParam("changes", changes);
    }

    /**
     * set changes with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withChanges(final Supplier<String> supplier) {
        return copy().withQueryParam("changes", supplier.get());
    }

    /**
     * add additional changes query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addChanges(final Supplier<String> supplier) {
        return copy().addQueryParam("changes", supplier.get());
    }

    /**
     * set changes with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withChanges(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("changes", op.apply(new StringBuilder()));
    }

    /**
     * add additional changes query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addChanges(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("changes", op.apply(new StringBuilder()));
    }

    /**
     * set changes with the specified values
     * @param changes values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withChanges(final Collection<TValue> changes) {
        return copy().withoutQueryParam("changes")
                .addQueryParams(
                    changes.stream().map(s -> new ParamEntry<>("changes", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional changes query parameters
     * @param changes values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addChanges(final Collection<TValue> changes) {
        return copy().addQueryParams(
            changes.stream().map(s -> new ParamEntry<>("changes", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set stores with the specified value
     * @param stores value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withStores(final TValue stores) {
        return copy().withQueryParam("stores", stores);
    }

    /**
     * add additional stores query parameter
     * @param stores value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addStores(final TValue stores) {
        return copy().addQueryParam("stores", stores);
    }

    /**
     * set stores with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withStores(final Supplier<String> supplier) {
        return copy().withQueryParam("stores", supplier.get());
    }

    /**
     * add additional stores query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addStores(final Supplier<String> supplier) {
        return copy().addQueryParam("stores", supplier.get());
    }

    /**
     * set stores with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withStores(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("stores", op.apply(new StringBuilder()));
    }

    /**
     * add additional stores query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addStores(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("stores", op.apply(new StringBuilder()));
    }

    /**
     * set stores with the specified values
     * @param stores values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withStores(final Collection<TValue> stores) {
        return copy().withoutQueryParam("stores")
                .addQueryParams(
                    stores.stream().map(s -> new ParamEntry<>("stores", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional stores query parameters
     * @param stores values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addStores(final Collection<TValue> stores) {
        return copy().addQueryParams(
            stores.stream().map(s -> new ParamEntry<>("stores", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set excludePlatformInitiatedChanges with the specified value
     * @param excludePlatformInitiatedChanges value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withExcludePlatformInitiatedChanges(
            final TValue excludePlatformInitiatedChanges) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", excludePlatformInitiatedChanges);
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     * @param excludePlatformInitiatedChanges value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addExcludePlatformInitiatedChanges(
            final TValue excludePlatformInitiatedChanges) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", excludePlatformInitiatedChanges);
    }

    /**
     * set excludePlatformInitiatedChanges with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withExcludePlatformInitiatedChanges(
            final Supplier<PlatformInitiatedChange> supplier) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", supplier.get());
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addExcludePlatformInitiatedChanges(
            final Supplier<PlatformInitiatedChange> supplier) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", supplier.get());
    }

    /**
     * set excludePlatformInitiatedChanges with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withExcludePlatformInitiatedChanges(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", op.apply(new StringBuilder()));
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addExcludePlatformInitiatedChanges(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", op.apply(new StringBuilder()));
    }

    /**
     * set excludePlatformInitiatedChanges with the specified values
     * @param excludePlatformInitiatedChanges values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withExcludePlatformInitiatedChanges(
            final Collection<TValue> excludePlatformInitiatedChanges) {
        return copy().withoutQueryParam("excludePlatformInitiatedChanges")
                .addQueryParams(excludePlatformInitiatedChanges.stream()
                        .map(s -> new ParamEntry<>("excludePlatformInitiatedChanges", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameters
     * @param excludePlatformInitiatedChanges values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addExcludePlatformInitiatedChanges(
            final Collection<TValue> excludePlatformInitiatedChanges) {
        return copy().addQueryParams(excludePlatformInitiatedChanges.stream()
                .map(s -> new ParamEntry<>("excludePlatformInitiatedChanges", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withExpand(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addExpand(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeGet
     */
    public ByProjectKeyByResourceTypeGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeGet
     */
    public <TValue> ByProjectKeyByResourceTypeGet addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyByResourceTypeGet that = (ByProjectKeyByResourceTypeGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(resourceType, that.resourceType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(resourceType).toHashCode();
    }

    @Override
    protected ByProjectKeyByResourceTypeGet copy() {
        return new ByProjectKeyByResourceTypeGet(this);
    }
}
