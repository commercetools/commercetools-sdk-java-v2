
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

import com.commercetools.history.models.change_history.ChangeHistoryResourceType;
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
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyGet extends
        TypeApiMethod<ByProjectKeyGet, com.commercetools.history.models.change_history.RecordPagedQueryResponse> {

    @Override
    public TypeReference<com.commercetools.history.models.change_history.RecordPagedQueryResponse> resultType() {
        return new TypeReference<com.commercetools.history.models.change_history.RecordPagedQueryResponse>() {
        };
    }

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
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s", encodePathParam(this.projectKey));
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

    public List<String> getResourceTypes() {
        return this.getQueryParam("resourceTypes");
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

    public List<String> getResourceId() {
        return this.getQueryParam("resourceId");
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

    /**
     * set resourceTypes with the specified value
     * @param resourceTypes value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withResourceTypes(final TValue resourceTypes) {
        return copy().withQueryParam("resourceTypes", resourceTypes);
    }

    /**
     * add additional resourceTypes query parameter
     * @param resourceTypes value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addResourceTypes(final TValue resourceTypes) {
        return copy().addQueryParam("resourceTypes", resourceTypes);
    }

    /**
     * set resourceTypes with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withResourceTypes(final Supplier<ChangeHistoryResourceType> supplier) {
        return copy().withQueryParam("resourceTypes", supplier.get());
    }

    /**
     * add additional resourceTypes query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addResourceTypes(final Supplier<ChangeHistoryResourceType> supplier) {
        return copy().addQueryParam("resourceTypes", supplier.get());
    }

    /**
     * set resourceTypes with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withResourceTypes(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("resourceTypes", op.apply(new StringBuilder()));
    }

    /**
     * add additional resourceTypes query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addResourceTypes(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("resourceTypes", op.apply(new StringBuilder()));
    }

    /**
     * set resourceTypes with the specified values
     * @param resourceTypes values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withResourceTypes(final Collection<TValue> resourceTypes) {
        return copy().withoutQueryParam("resourceTypes")
                .addQueryParams(resourceTypes.stream()
                        .map(s -> new ParamEntry<>("resourceTypes", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceTypes query parameters
     * @param resourceTypes values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addResourceTypes(final Collection<TValue> resourceTypes) {
        return copy().addQueryParams(resourceTypes.stream()
                .map(s -> new ParamEntry<>("resourceTypes", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set dateFrom with the specified value
     * @param dateFrom value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withDateFrom(final TValue dateFrom) {
        return copy().withQueryParam("date.from", dateFrom);
    }

    /**
     * add additional dateFrom query parameter
     * @param dateFrom value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addDateFrom(final TValue dateFrom) {
        return copy().addQueryParam("date.from", dateFrom);
    }

    /**
     * set dateFrom with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withDateFrom(final Supplier<Object> supplier) {
        return copy().withQueryParam("date.from", supplier.get());
    }

    /**
     * add additional dateFrom query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addDateFrom(final Supplier<Object> supplier) {
        return copy().addQueryParam("date.from", supplier.get());
    }

    /**
     * set dateFrom with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withDateFrom(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("date.from", op.apply(new StringBuilder()));
    }

    /**
     * add additional dateFrom query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addDateFrom(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("date.from", op.apply(new StringBuilder()));
    }

    /**
     * set dateFrom with the specified values
     * @param dateFrom values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withDateFrom(final Collection<TValue> dateFrom) {
        return copy().withoutQueryParam("date.from")
                .addQueryParams(dateFrom.stream()
                        .map(s -> new ParamEntry<>("date.from", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional dateFrom query parameters
     * @param dateFrom values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addDateFrom(final Collection<TValue> dateFrom) {
        return copy().addQueryParams(
            dateFrom.stream().map(s -> new ParamEntry<>("date.from", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set dateTo with the specified value
     * @param dateTo value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withDateTo(final TValue dateTo) {
        return copy().withQueryParam("date.to", dateTo);
    }

    /**
     * add additional dateTo query parameter
     * @param dateTo value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addDateTo(final TValue dateTo) {
        return copy().addQueryParam("date.to", dateTo);
    }

    /**
     * set dateTo with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withDateTo(final Supplier<Object> supplier) {
        return copy().withQueryParam("date.to", supplier.get());
    }

    /**
     * add additional dateTo query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addDateTo(final Supplier<Object> supplier) {
        return copy().addQueryParam("date.to", supplier.get());
    }

    /**
     * set dateTo with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withDateTo(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("date.to", op.apply(new StringBuilder()));
    }

    /**
     * add additional dateTo query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addDateTo(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("date.to", op.apply(new StringBuilder()));
    }

    /**
     * set dateTo with the specified values
     * @param dateTo values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withDateTo(final Collection<TValue> dateTo) {
        return copy().withoutQueryParam("date.to")
                .addQueryParams(
                    dateTo.stream().map(s -> new ParamEntry<>("date.to", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional dateTo query parameters
     * @param dateTo values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addDateTo(final Collection<TValue> dateTo) {
        return copy().addQueryParams(
            dateTo.stream().map(s -> new ParamEntry<>("date.to", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set userId with the specified value
     * @param userId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withUserId(final TValue userId) {
        return copy().withQueryParam("userId", userId);
    }

    /**
     * add additional userId query parameter
     * @param userId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addUserId(final TValue userId) {
        return copy().addQueryParam("userId", userId);
    }

    /**
     * set userId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withUserId(final Supplier<String> supplier) {
        return copy().withQueryParam("userId", supplier.get());
    }

    /**
     * add additional userId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addUserId(final Supplier<String> supplier) {
        return copy().addQueryParam("userId", supplier.get());
    }

    /**
     * set userId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withUserId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("userId", op.apply(new StringBuilder()));
    }

    /**
     * add additional userId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addUserId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("userId", op.apply(new StringBuilder()));
    }

    /**
     * set userId with the specified values
     * @param userId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withUserId(final Collection<TValue> userId) {
        return copy().withoutQueryParam("userId")
                .addQueryParams(
                    userId.stream().map(s -> new ParamEntry<>("userId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional userId query parameters
     * @param userId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addUserId(final Collection<TValue> userId) {
        return copy().addQueryParams(
            userId.stream().map(s -> new ParamEntry<>("userId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set clientId with the specified value
     * @param clientId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withClientId(final TValue clientId) {
        return copy().withQueryParam("clientId", clientId);
    }

    /**
     * add additional clientId query parameter
     * @param clientId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addClientId(final TValue clientId) {
        return copy().addQueryParam("clientId", clientId);
    }

    /**
     * set clientId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withClientId(final Supplier<String> supplier) {
        return copy().withQueryParam("clientId", supplier.get());
    }

    /**
     * add additional clientId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addClientId(final Supplier<String> supplier) {
        return copy().addQueryParam("clientId", supplier.get());
    }

    /**
     * set clientId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withClientId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("clientId", op.apply(new StringBuilder()));
    }

    /**
     * add additional clientId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addClientId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("clientId", op.apply(new StringBuilder()));
    }

    /**
     * set clientId with the specified values
     * @param clientId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withClientId(final Collection<TValue> clientId) {
        return copy().withoutQueryParam("clientId")
                .addQueryParams(clientId.stream()
                        .map(s -> new ParamEntry<>("clientId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional clientId query parameters
     * @param clientId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addClientId(final Collection<TValue> clientId) {
        return copy().addQueryParams(
            clientId.stream().map(s -> new ParamEntry<>("clientId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set customerId with the specified value
     * @param customerId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withCustomerId(final TValue customerId) {
        return copy().withQueryParam("customerId", customerId);
    }

    /**
     * add additional customerId query parameter
     * @param customerId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addCustomerId(final TValue customerId) {
        return copy().addQueryParam("customerId", customerId);
    }

    /**
     * set customerId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withCustomerId(final Supplier<String> supplier) {
        return copy().withQueryParam("customerId", supplier.get());
    }

    /**
     * add additional customerId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addCustomerId(final Supplier<String> supplier) {
        return copy().addQueryParam("customerId", supplier.get());
    }

    /**
     * set customerId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withCustomerId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("customerId", op.apply(new StringBuilder()));
    }

    /**
     * add additional customerId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addCustomerId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("customerId", op.apply(new StringBuilder()));
    }

    /**
     * set customerId with the specified values
     * @param customerId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withCustomerId(final Collection<TValue> customerId) {
        return copy().withoutQueryParam("customerId")
                .addQueryParams(customerId.stream()
                        .map(s -> new ParamEntry<>("customerId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional customerId query parameters
     * @param customerId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addCustomerId(final Collection<TValue> customerId) {
        return copy().addQueryParams(
            customerId.stream().map(s -> new ParamEntry<>("customerId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set associateId with the specified value
     * @param associateId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withAssociateId(final TValue associateId) {
        return copy().withQueryParam("associateId", associateId);
    }

    /**
     * add additional associateId query parameter
     * @param associateId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addAssociateId(final TValue associateId) {
        return copy().addQueryParam("associateId", associateId);
    }

    /**
     * set associateId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withAssociateId(final Supplier<String> supplier) {
        return copy().withQueryParam("associateId", supplier.get());
    }

    /**
     * add additional associateId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addAssociateId(final Supplier<String> supplier) {
        return copy().addQueryParam("associateId", supplier.get());
    }

    /**
     * set associateId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withAssociateId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("associateId", op.apply(new StringBuilder()));
    }

    /**
     * add additional associateId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addAssociateId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("associateId", op.apply(new StringBuilder()));
    }

    /**
     * set associateId with the specified values
     * @param associateId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withAssociateId(final Collection<TValue> associateId) {
        return copy().withoutQueryParam("associateId")
                .addQueryParams(associateId.stream()
                        .map(s -> new ParamEntry<>("associateId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional associateId query parameters
     * @param associateId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addAssociateId(final Collection<TValue> associateId) {
        return copy().addQueryParams(
            associateId.stream().map(s -> new ParamEntry<>("associateId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set businessUnit with the specified value
     * @param businessUnit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withBusinessUnit(final TValue businessUnit) {
        return copy().withQueryParam("businessUnit", businessUnit);
    }

    /**
     * add additional businessUnit query parameter
     * @param businessUnit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addBusinessUnit(final TValue businessUnit) {
        return copy().addQueryParam("businessUnit", businessUnit);
    }

    /**
     * set businessUnit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withBusinessUnit(final Supplier<String> supplier) {
        return copy().withQueryParam("businessUnit", supplier.get());
    }

    /**
     * add additional businessUnit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addBusinessUnit(final Supplier<String> supplier) {
        return copy().addQueryParam("businessUnit", supplier.get());
    }

    /**
     * set businessUnit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withBusinessUnit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("businessUnit", op.apply(new StringBuilder()));
    }

    /**
     * add additional businessUnit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addBusinessUnit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("businessUnit", op.apply(new StringBuilder()));
    }

    /**
     * set businessUnit with the specified values
     * @param businessUnit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withBusinessUnit(final Collection<TValue> businessUnit) {
        return copy().withoutQueryParam("businessUnit")
                .addQueryParams(businessUnit.stream()
                        .map(s -> new ParamEntry<>("businessUnit", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional businessUnit query parameters
     * @param businessUnit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addBusinessUnit(final Collection<TValue> businessUnit) {
        return copy().addQueryParams(businessUnit.stream()
                .map(s -> new ParamEntry<>("businessUnit", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set type with the specified value
     * @param type value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withType(final TValue type) {
        return copy().withQueryParam("type", type);
    }

    /**
     * add additional type query parameter
     * @param type value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addType(final TValue type) {
        return copy().addQueryParam("type", type);
    }

    /**
     * set type with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withType(final Supplier<String> supplier) {
        return copy().withQueryParam("type", supplier.get());
    }

    /**
     * add additional type query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addType(final Supplier<String> supplier) {
        return copy().addQueryParam("type", supplier.get());
    }

    /**
     * set type with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withType(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("type", op.apply(new StringBuilder()));
    }

    /**
     * add additional type query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addType(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("type", op.apply(new StringBuilder()));
    }

    /**
     * set type with the specified values
     * @param type values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withType(final Collection<TValue> type) {
        return copy().withoutQueryParam("type")
                .addQueryParams(
                    type.stream().map(s -> new ParamEntry<>("type", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional type query parameters
     * @param type values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addType(final Collection<TValue> type) {
        return copy().addQueryParams(
            type.stream().map(s -> new ParamEntry<>("type", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set resourceId with the specified value
     * @param resourceId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withResourceId(final TValue resourceId) {
        return copy().withQueryParam("resourceId", resourceId);
    }

    /**
     * add additional resourceId query parameter
     * @param resourceId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addResourceId(final TValue resourceId) {
        return copy().addQueryParam("resourceId", resourceId);
    }

    /**
     * set resourceId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withResourceId(final Supplier<String> supplier) {
        return copy().withQueryParam("resourceId", supplier.get());
    }

    /**
     * add additional resourceId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addResourceId(final Supplier<String> supplier) {
        return copy().addQueryParam("resourceId", supplier.get());
    }

    /**
     * set resourceId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withResourceId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("resourceId", op.apply(new StringBuilder()));
    }

    /**
     * add additional resourceId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addResourceId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("resourceId", op.apply(new StringBuilder()));
    }

    /**
     * set resourceId with the specified values
     * @param resourceId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withResourceId(final Collection<TValue> resourceId) {
        return copy().withoutQueryParam("resourceId")
                .addQueryParams(resourceId.stream()
                        .map(s -> new ParamEntry<>("resourceId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceId query parameters
     * @param resourceId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addResourceId(final Collection<TValue> resourceId) {
        return copy().addQueryParams(
            resourceId.stream().map(s -> new ParamEntry<>("resourceId", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set resourceKey with the specified value
     * @param resourceKey value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withResourceKey(final TValue resourceKey) {
        return copy().withQueryParam("resourceKey", resourceKey);
    }

    /**
     * add additional resourceKey query parameter
     * @param resourceKey value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addResourceKey(final TValue resourceKey) {
        return copy().addQueryParam("resourceKey", resourceKey);
    }

    /**
     * set resourceKey with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withResourceKey(final Supplier<String> supplier) {
        return copy().withQueryParam("resourceKey", supplier.get());
    }

    /**
     * add additional resourceKey query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addResourceKey(final Supplier<String> supplier) {
        return copy().addQueryParam("resourceKey", supplier.get());
    }

    /**
     * set resourceKey with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withResourceKey(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("resourceKey", op.apply(new StringBuilder()));
    }

    /**
     * add additional resourceKey query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addResourceKey(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("resourceKey", op.apply(new StringBuilder()));
    }

    /**
     * set resourceKey with the specified values
     * @param resourceKey values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withResourceKey(final Collection<TValue> resourceKey) {
        return copy().withoutQueryParam("resourceKey")
                .addQueryParams(resourceKey.stream()
                        .map(s -> new ParamEntry<>("resourceKey", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional resourceKey query parameters
     * @param resourceKey values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addResourceKey(final Collection<TValue> resourceKey) {
        return copy().addQueryParams(
            resourceKey.stream().map(s -> new ParamEntry<>("resourceKey", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set source with the specified value
     * @param source value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withSource(final TValue source) {
        return copy().withQueryParam("source", source);
    }

    /**
     * add additional source query parameter
     * @param source value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addSource(final TValue source) {
        return copy().addQueryParam("source", source);
    }

    /**
     * set source with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withSource(final Supplier<Source> supplier) {
        return copy().withQueryParam("source", supplier.get());
    }

    /**
     * add additional source query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addSource(final Supplier<Source> supplier) {
        return copy().addQueryParam("source", supplier.get());
    }

    /**
     * set source with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withSource(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("source", op.apply(new StringBuilder()));
    }

    /**
     * add additional source query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addSource(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("source", op.apply(new StringBuilder()));
    }

    /**
     * set source with the specified values
     * @param source values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withSource(final Collection<TValue> source) {
        return copy().withoutQueryParam("source")
                .addQueryParams(
                    source.stream().map(s -> new ParamEntry<>("source", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional source query parameters
     * @param source values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addSource(final Collection<TValue> source) {
        return copy().addQueryParams(
            source.stream().map(s -> new ParamEntry<>("source", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set changes with the specified value
     * @param changes value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withChanges(final TValue changes) {
        return copy().withQueryParam("changes", changes);
    }

    /**
     * add additional changes query parameter
     * @param changes value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addChanges(final TValue changes) {
        return copy().addQueryParam("changes", changes);
    }

    /**
     * set changes with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withChanges(final Supplier<String> supplier) {
        return copy().withQueryParam("changes", supplier.get());
    }

    /**
     * add additional changes query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addChanges(final Supplier<String> supplier) {
        return copy().addQueryParam("changes", supplier.get());
    }

    /**
     * set changes with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withChanges(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("changes", op.apply(new StringBuilder()));
    }

    /**
     * add additional changes query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addChanges(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("changes", op.apply(new StringBuilder()));
    }

    /**
     * set changes with the specified values
     * @param changes values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withChanges(final Collection<TValue> changes) {
        return copy().withoutQueryParam("changes")
                .addQueryParams(
                    changes.stream().map(s -> new ParamEntry<>("changes", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional changes query parameters
     * @param changes values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addChanges(final Collection<TValue> changes) {
        return copy().addQueryParams(
            changes.stream().map(s -> new ParamEntry<>("changes", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set stores with the specified value
     * @param stores value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withStores(final TValue stores) {
        return copy().withQueryParam("stores", stores);
    }

    /**
     * add additional stores query parameter
     * @param stores value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addStores(final TValue stores) {
        return copy().addQueryParam("stores", stores);
    }

    /**
     * set stores with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withStores(final Supplier<String> supplier) {
        return copy().withQueryParam("stores", supplier.get());
    }

    /**
     * add additional stores query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addStores(final Supplier<String> supplier) {
        return copy().addQueryParam("stores", supplier.get());
    }

    /**
     * set stores with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withStores(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("stores", op.apply(new StringBuilder()));
    }

    /**
     * add additional stores query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addStores(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("stores", op.apply(new StringBuilder()));
    }

    /**
     * set stores with the specified values
     * @param stores values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withStores(final Collection<TValue> stores) {
        return copy().withoutQueryParam("stores")
                .addQueryParams(
                    stores.stream().map(s -> new ParamEntry<>("stores", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional stores query parameters
     * @param stores values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addStores(final Collection<TValue> stores) {
        return copy().addQueryParams(
            stores.stream().map(s -> new ParamEntry<>("stores", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set excludePlatformInitiatedChanges with the specified value
     * @param excludePlatformInitiatedChanges value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withExcludePlatformInitiatedChanges(final TValue excludePlatformInitiatedChanges) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", excludePlatformInitiatedChanges);
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     * @param excludePlatformInitiatedChanges value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addExcludePlatformInitiatedChanges(final TValue excludePlatformInitiatedChanges) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", excludePlatformInitiatedChanges);
    }

    /**
     * set excludePlatformInitiatedChanges with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withExcludePlatformInitiatedChanges(final Supplier<PlatformInitiatedChange> supplier) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", supplier.get());
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addExcludePlatformInitiatedChanges(final Supplier<PlatformInitiatedChange> supplier) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", supplier.get());
    }

    /**
     * set excludePlatformInitiatedChanges with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withExcludePlatformInitiatedChanges(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("excludePlatformInitiatedChanges", op.apply(new StringBuilder()));
    }

    /**
     * add additional excludePlatformInitiatedChanges query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addExcludePlatformInitiatedChanges(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("excludePlatformInitiatedChanges", op.apply(new StringBuilder()));
    }

    /**
     * set excludePlatformInitiatedChanges with the specified values
     * @param excludePlatformInitiatedChanges values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withExcludePlatformInitiatedChanges(
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
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addExcludePlatformInitiatedChanges(
            final Collection<TValue> excludePlatformInitiatedChanges) {
        return copy().addQueryParams(excludePlatformInitiatedChanges.stream()
                .map(s -> new ParamEntry<>("excludePlatformInitiatedChanges", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withExpand(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addExpand(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyGet
     */
    public ByProjectKeyGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyGet
     */
    public <TValue> ByProjectKeyGet addExpand(final Collection<TValue> expand) {
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
