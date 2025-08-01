
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
 *  <p>The <code>view_audit_log:{projectKey}</code> scope is required, and depending on the resource type queried, their respective scopes must be granted.</p>
 *  <p>If the request exceeds the rate limit, a TooManyRequests error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.history.models.change_history.RecordPagedQueryResponse>> result = apiRoot
 *            .withProjectKeyValue("{projectKey}")
 *            .withResourceTypeValue("{resourceType}")
 *            .withIDValue("{ID}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyByResourceTypeByIDGet extends
        TypeApiMethod<ByProjectKeyByResourceTypeByIDGet, com.commercetools.history.models.change_history.RecordPagedQueryResponse> {

    @Override
    public TypeReference<com.commercetools.history.models.change_history.RecordPagedQueryResponse> resultType() {
        return new TypeReference<com.commercetools.history.models.change_history.RecordPagedQueryResponse>() {
        };
    }

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
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/%s/%s", encodePathParam(this.projectKey),
            encodePathParam(this.resourceType), encodePathParam(this.ID));
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

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set dateFrom with the specified value
     * @param dateFrom value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withDateFrom(final TValue dateFrom) {
        return copy().withQueryParam("date.from", dateFrom);
    }

    /**
     * add additional dateFrom query parameter
     * @param dateFrom value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addDateFrom(final TValue dateFrom) {
        return copy().addQueryParam("date.from", dateFrom);
    }

    /**
     * set dateFrom with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withDateFrom(final Supplier<Object> supplier) {
        return copy().withQueryParam("date.from", supplier.get());
    }

    /**
     * add additional dateFrom query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addDateFrom(final Supplier<Object> supplier) {
        return copy().addQueryParam("date.from", supplier.get());
    }

    /**
     * set dateFrom with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withDateFrom(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("date.from", op.apply(new StringBuilder()));
    }

    /**
     * add additional dateFrom query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addDateFrom(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("date.from", op.apply(new StringBuilder()));
    }

    /**
     * set dateFrom with the specified values
     * @param dateFrom values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withDateFrom(final Collection<TValue> dateFrom) {
        return copy().withoutQueryParam("date.from")
                .addQueryParams(dateFrom.stream()
                        .map(s -> new ParamEntry<>("date.from", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional dateFrom query parameters
     * @param dateFrom values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addDateFrom(final Collection<TValue> dateFrom) {
        return copy().addQueryParams(
            dateFrom.stream().map(s -> new ParamEntry<>("date.from", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set dateTo with the specified value
     * @param dateTo value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withDateTo(final TValue dateTo) {
        return copy().withQueryParam("date.to", dateTo);
    }

    /**
     * add additional dateTo query parameter
     * @param dateTo value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addDateTo(final TValue dateTo) {
        return copy().addQueryParam("date.to", dateTo);
    }

    /**
     * set dateTo with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withDateTo(final Supplier<Object> supplier) {
        return copy().withQueryParam("date.to", supplier.get());
    }

    /**
     * add additional dateTo query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addDateTo(final Supplier<Object> supplier) {
        return copy().addQueryParam("date.to", supplier.get());
    }

    /**
     * set dateTo with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withDateTo(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("date.to", op.apply(new StringBuilder()));
    }

    /**
     * add additional dateTo query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addDateTo(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("date.to", op.apply(new StringBuilder()));
    }

    /**
     * set dateTo with the specified values
     * @param dateTo values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withDateTo(final Collection<TValue> dateTo) {
        return copy().withoutQueryParam("date.to")
                .addQueryParams(
                    dateTo.stream().map(s -> new ParamEntry<>("date.to", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional dateTo query parameters
     * @param dateTo values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addDateTo(final Collection<TValue> dateTo) {
        return copy().addQueryParams(
            dateTo.stream().map(s -> new ParamEntry<>("date.to", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set userId with the specified value
     * @param userId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withUserId(final TValue userId) {
        return copy().withQueryParam("userId", userId);
    }

    /**
     * add additional userId query parameter
     * @param userId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addUserId(final TValue userId) {
        return copy().addQueryParam("userId", userId);
    }

    /**
     * set userId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withUserId(final Supplier<String> supplier) {
        return copy().withQueryParam("userId", supplier.get());
    }

    /**
     * add additional userId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addUserId(final Supplier<String> supplier) {
        return copy().addQueryParam("userId", supplier.get());
    }

    /**
     * set userId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withUserId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("userId", op.apply(new StringBuilder()));
    }

    /**
     * add additional userId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addUserId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("userId", op.apply(new StringBuilder()));
    }

    /**
     * set userId with the specified values
     * @param userId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withUserId(final Collection<TValue> userId) {
        return copy().withoutQueryParam("userId")
                .addQueryParams(
                    userId.stream().map(s -> new ParamEntry<>("userId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional userId query parameters
     * @param userId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addUserId(final Collection<TValue> userId) {
        return copy().addQueryParams(
            userId.stream().map(s -> new ParamEntry<>("userId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set clientId with the specified value
     * @param clientId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withClientId(final TValue clientId) {
        return copy().withQueryParam("clientId", clientId);
    }

    /**
     * add additional clientId query parameter
     * @param clientId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addClientId(final TValue clientId) {
        return copy().addQueryParam("clientId", clientId);
    }

    /**
     * set clientId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withClientId(final Supplier<String> supplier) {
        return copy().withQueryParam("clientId", supplier.get());
    }

    /**
     * add additional clientId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addClientId(final Supplier<String> supplier) {
        return copy().addQueryParam("clientId", supplier.get());
    }

    /**
     * set clientId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withClientId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("clientId", op.apply(new StringBuilder()));
    }

    /**
     * add additional clientId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addClientId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("clientId", op.apply(new StringBuilder()));
    }

    /**
     * set clientId with the specified values
     * @param clientId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withClientId(final Collection<TValue> clientId) {
        return copy().withoutQueryParam("clientId")
                .addQueryParams(clientId.stream()
                        .map(s -> new ParamEntry<>("clientId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional clientId query parameters
     * @param clientId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addClientId(final Collection<TValue> clientId) {
        return copy().addQueryParams(
            clientId.stream().map(s -> new ParamEntry<>("clientId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set customerId with the specified value
     * @param customerId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withCustomerId(final TValue customerId) {
        return copy().withQueryParam("customerId", customerId);
    }

    /**
     * add additional customerId query parameter
     * @param customerId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addCustomerId(final TValue customerId) {
        return copy().addQueryParam("customerId", customerId);
    }

    /**
     * set customerId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withCustomerId(final Supplier<String> supplier) {
        return copy().withQueryParam("customerId", supplier.get());
    }

    /**
     * add additional customerId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addCustomerId(final Supplier<String> supplier) {
        return copy().addQueryParam("customerId", supplier.get());
    }

    /**
     * set customerId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withCustomerId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("customerId", op.apply(new StringBuilder()));
    }

    /**
     * add additional customerId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addCustomerId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("customerId", op.apply(new StringBuilder()));
    }

    /**
     * set customerId with the specified values
     * @param customerId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withCustomerId(final Collection<TValue> customerId) {
        return copy().withoutQueryParam("customerId")
                .addQueryParams(customerId.stream()
                        .map(s -> new ParamEntry<>("customerId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional customerId query parameters
     * @param customerId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addCustomerId(final Collection<TValue> customerId) {
        return copy().addQueryParams(
            customerId.stream().map(s -> new ParamEntry<>("customerId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set associateId with the specified value
     * @param associateId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withAssociateId(final TValue associateId) {
        return copy().withQueryParam("associateId", associateId);
    }

    /**
     * add additional associateId query parameter
     * @param associateId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addAssociateId(final TValue associateId) {
        return copy().addQueryParam("associateId", associateId);
    }

    /**
     * set associateId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withAssociateId(final Supplier<String> supplier) {
        return copy().withQueryParam("associateId", supplier.get());
    }

    /**
     * add additional associateId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addAssociateId(final Supplier<String> supplier) {
        return copy().addQueryParam("associateId", supplier.get());
    }

    /**
     * set associateId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withAssociateId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("associateId", op.apply(new StringBuilder()));
    }

    /**
     * add additional associateId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addAssociateId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("associateId", op.apply(new StringBuilder()));
    }

    /**
     * set associateId with the specified values
     * @param associateId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withAssociateId(final Collection<TValue> associateId) {
        return copy().withoutQueryParam("associateId")
                .addQueryParams(associateId.stream()
                        .map(s -> new ParamEntry<>("associateId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional associateId query parameters
     * @param associateId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addAssociateId(final Collection<TValue> associateId) {
        return copy().addQueryParams(
            associateId.stream().map(s -> new ParamEntry<>("associateId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set businessUnit with the specified value
     * @param businessUnit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withBusinessUnit(final TValue businessUnit) {
        return copy().withQueryParam("businessUnit", businessUnit);
    }

    /**
     * add additional businessUnit query parameter
     * @param businessUnit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addBusinessUnit(final TValue businessUnit) {
        return copy().addQueryParam("businessUnit", businessUnit);
    }

    /**
     * set businessUnit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withBusinessUnit(final Supplier<String> supplier) {
        return copy().withQueryParam("businessUnit", supplier.get());
    }

    /**
     * add additional businessUnit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addBusinessUnit(final Supplier<String> supplier) {
        return copy().addQueryParam("businessUnit", supplier.get());
    }

    /**
     * set businessUnit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withBusinessUnit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("businessUnit", op.apply(new StringBuilder()));
    }

    /**
     * add additional businessUnit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addBusinessUnit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("businessUnit", op.apply(new StringBuilder()));
    }

    /**
     * set businessUnit with the specified values
     * @param businessUnit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withBusinessUnit(final Collection<TValue> businessUnit) {
        return copy().withoutQueryParam("businessUnit")
                .addQueryParams(businessUnit.stream()
                        .map(s -> new ParamEntry<>("businessUnit", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional businessUnit query parameters
     * @param businessUnit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addBusinessUnit(final Collection<TValue> businessUnit) {
        return copy().addQueryParams(businessUnit.stream()
                .map(s -> new ParamEntry<>("businessUnit", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set type with the specified value
     * @param type value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withType(final TValue type) {
        return copy().withQueryParam("type", type);
    }

    /**
     * add additional type query parameter
     * @param type value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addType(final TValue type) {
        return copy().addQueryParam("type", type);
    }

    /**
     * set type with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withType(final Supplier<String> supplier) {
        return copy().withQueryParam("type", supplier.get());
    }

    /**
     * add additional type query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addType(final Supplier<String> supplier) {
        return copy().addQueryParam("type", supplier.get());
    }

    /**
     * set type with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withType(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("type", op.apply(new StringBuilder()));
    }

    /**
     * add additional type query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addType(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("type", op.apply(new StringBuilder()));
    }

    /**
     * set type with the specified values
     * @param type values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withType(final Collection<TValue> type) {
        return copy().withoutQueryParam("type")
                .addQueryParams(
                    type.stream().map(s -> new ParamEntry<>("type", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional type query parameters
     * @param type values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addType(final Collection<TValue> type) {
        return copy().addQueryParams(
            type.stream().map(s -> new ParamEntry<>("type", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set source with the specified value
     * @param source value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withSource(final TValue source) {
        return copy().withQueryParam("source", source);
    }

    /**
     * add additional source query parameter
     * @param source value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addSource(final TValue source) {
        return copy().addQueryParam("source", source);
    }

    /**
     * set source with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withSource(final Supplier<Source> supplier) {
        return copy().withQueryParam("source", supplier.get());
    }

    /**
     * add additional source query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addSource(final Supplier<Source> supplier) {
        return copy().addQueryParam("source", supplier.get());
    }

    /**
     * set source with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withSource(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("source", op.apply(new StringBuilder()));
    }

    /**
     * add additional source query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addSource(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("source", op.apply(new StringBuilder()));
    }

    /**
     * set source with the specified values
     * @param source values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withSource(final Collection<TValue> source) {
        return copy().withoutQueryParam("source")
                .addQueryParams(
                    source.stream().map(s -> new ParamEntry<>("source", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional source query parameters
     * @param source values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addSource(final Collection<TValue> source) {
        return copy().addQueryParams(
            source.stream().map(s -> new ParamEntry<>("source", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set changes with the specified value
     * @param changes value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withChanges(final TValue changes) {
        return copy().withQueryParam("changes", changes);
    }

    /**
     * add additional changes query parameter
     * @param changes value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addChanges(final TValue changes) {
        return copy().addQueryParam("changes", changes);
    }

    /**
     * set changes with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withChanges(final Supplier<String> supplier) {
        return copy().withQueryParam("changes", supplier.get());
    }

    /**
     * add additional changes query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addChanges(final Supplier<String> supplier) {
        return copy().addQueryParam("changes", supplier.get());
    }

    /**
     * set changes with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withChanges(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("changes", op.apply(new StringBuilder()));
    }

    /**
     * add additional changes query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addChanges(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("changes", op.apply(new StringBuilder()));
    }

    /**
     * set changes with the specified values
     * @param changes values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withChanges(final Collection<TValue> changes) {
        return copy().withoutQueryParam("changes")
                .addQueryParams(
                    changes.stream().map(s -> new ParamEntry<>("changes", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional changes query parameters
     * @param changes values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addChanges(final Collection<TValue> changes) {
        return copy().addQueryParams(
            changes.stream().map(s -> new ParamEntry<>("changes", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set stores with the specified value
     * @param stores value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withStores(final TValue stores) {
        return copy().withQueryParam("stores", stores);
    }

    /**
     * add additional stores query parameter
     * @param stores value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addStores(final TValue stores) {
        return copy().addQueryParam("stores", stores);
    }

    /**
     * set stores with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withStores(final Supplier<String> supplier) {
        return copy().withQueryParam("stores", supplier.get());
    }

    /**
     * add additional stores query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addStores(final Supplier<String> supplier) {
        return copy().addQueryParam("stores", supplier.get());
    }

    /**
     * set stores with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withStores(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("stores", op.apply(new StringBuilder()));
    }

    /**
     * add additional stores query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addStores(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("stores", op.apply(new StringBuilder()));
    }

    /**
     * set stores with the specified values
     * @param stores values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withStores(final Collection<TValue> stores) {
        return copy().withoutQueryParam("stores")
                .addQueryParams(
                    stores.stream().map(s -> new ParamEntry<>("stores", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional stores query parameters
     * @param stores values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addStores(final Collection<TValue> stores) {
        return copy().addQueryParams(
            stores.stream().map(s -> new ParamEntry<>("stores", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set excludePlatformInitiatedChanges with the specified value
     * @param excludePlatformInitiatedChanges value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withExcludePlatformInitiatedChanges(
            final TValue excludePlatformInitiatedChanges) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", excludePlatformInitiatedChanges);
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     * @param excludePlatformInitiatedChanges value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addExcludePlatformInitiatedChanges(
            final TValue excludePlatformInitiatedChanges) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", excludePlatformInitiatedChanges);
    }

    /**
     * set excludePlatformInitiatedChanges with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withExcludePlatformInitiatedChanges(
            final Supplier<PlatformInitiatedChange> supplier) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", supplier.get());
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addExcludePlatformInitiatedChanges(
            final Supplier<PlatformInitiatedChange> supplier) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", supplier.get());
    }

    /**
     * set excludePlatformInitiatedChanges with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withExcludePlatformInitiatedChanges(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", op.apply(new StringBuilder()));
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addExcludePlatformInitiatedChanges(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", op.apply(new StringBuilder()));
    }

    /**
     * set excludePlatformInitiatedChanges with the specified values
     * @param excludePlatformInitiatedChanges values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withExcludePlatformInitiatedChanges(
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
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addExcludePlatformInitiatedChanges(
            final Collection<TValue> excludePlatformInitiatedChanges) {
        return copy().addQueryParams(excludePlatformInitiatedChanges.stream()
                .map(s -> new ParamEntry<>("excludePlatformInitiatedChanges", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withExpand(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addExpand(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public ByProjectKeyByResourceTypeByIDGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyByResourceTypeByIDGet
     */
    public <TValue> ByProjectKeyByResourceTypeByIDGet addExpand(final Collection<TValue> expand) {
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
