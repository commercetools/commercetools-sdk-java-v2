
package com.commercetools.checkout.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import tools.jackson.core.type.TypeReference;

/**
 *  <p>Retrieves Recurring Payments in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
 *  <p>The results are <span>paginated</span>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.recurring_payment.PaginatedRecurringPayment>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .recurringPayments()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentsGet extends
        TypeApiMethod<ByProjectKeyRecurringPaymentsGet, com.commercetools.checkout.models.recurring_payment.PaginatedRecurringPayment>
        implements
        com.commercetools.checkout.client.Secured_by_view_recurring_paymentsTrait<ByProjectKeyRecurringPaymentsGet> {

    @Override
    public TypeReference<com.commercetools.checkout.models.recurring_payment.PaginatedRecurringPayment> resultType() {
        return new TypeReference<com.commercetools.checkout.models.recurring_payment.PaginatedRecurringPayment>() {
        };
    }

    private String projectKey;

    public ByProjectKeyRecurringPaymentsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyRecurringPaymentsGet(ByProjectKeyRecurringPaymentsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurring-payments", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.checkout.models.recurring_payment.PaginatedRecurringPayment> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.checkout.models.recurring_payment.PaginatedRecurringPayment.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.recurring_payment.PaginatedRecurringPayment>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.checkout.models.recurring_payment.PaginatedRecurringPayment.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }

    public List<String> getRecurringOrderId() {
        return this.getQueryParam("recurringOrderId");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set sort with the specified value
     * @param sort value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     * @param sort value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     * @param sort values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet withSort(final Collection<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     * @param sort values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet addSort(final Collection<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     * @param withTotal value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet withWithTotal(final TValue withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     * @param withTotal value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet addWithTotal(final TValue withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet withWithTotal(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet addWithTotal(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet withWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet addWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     * @param withTotal values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet withWithTotal(final Collection<TValue> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     * @param withTotal values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet addWithTotal(final Collection<TValue> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set recurringOrderId with the specified value
     * @param recurringOrderId value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet withRecurringOrderId(final TValue recurringOrderId) {
        return copy().withQueryParam("recurringOrderId", recurringOrderId);
    }

    /**
     * add additional recurringOrderId query parameter
     * @param recurringOrderId value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet addRecurringOrderId(final TValue recurringOrderId) {
        return copy().addQueryParam("recurringOrderId", recurringOrderId);
    }

    /**
     * set recurringOrderId with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet withRecurringOrderId(final Supplier<String> supplier) {
        return copy().withQueryParam("recurringOrderId", supplier.get());
    }

    /**
     * add additional recurringOrderId query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet addRecurringOrderId(final Supplier<String> supplier) {
        return copy().addQueryParam("recurringOrderId", supplier.get());
    }

    /**
     * set recurringOrderId with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet withRecurringOrderId(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("recurringOrderId", op.apply(new StringBuilder()));
    }

    /**
     * add additional recurringOrderId query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public ByProjectKeyRecurringPaymentsGet addRecurringOrderId(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("recurringOrderId", op.apply(new StringBuilder()));
    }

    /**
     * set recurringOrderId with the specified values
     * @param recurringOrderId values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet withRecurringOrderId(final Collection<TValue> recurringOrderId) {
        return copy().withoutQueryParam("recurringOrderId")
                .addQueryParams(recurringOrderId.stream()
                        .map(s -> new ParamEntry<>("recurringOrderId", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional recurringOrderId query parameters
     * @param recurringOrderId values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentsGet addRecurringOrderId(final Collection<TValue> recurringOrderId) {
        return copy().addQueryParams(recurringOrderId.stream()
                .map(s -> new ParamEntry<>("recurringOrderId", s.toString()))
                .collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurringPaymentsGet that = (ByProjectKeyRecurringPaymentsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyRecurringPaymentsGet copy() {
        return new ByProjectKeyRecurringPaymentsGet(this);
    }
}
