
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
 *  <p>Retrieves Recurring Payment Jobs in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
 *  <p>The results are <span>paginated</span>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.recurring_payment_job.PaginatedRecurringPaymentJob>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .recurringPaymentJobs()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecurringPaymentJobsGet extends
        TypeApiMethod<ByProjectKeyRecurringPaymentJobsGet, com.commercetools.checkout.models.recurring_payment_job.PaginatedRecurringPaymentJob>
        implements
        com.commercetools.checkout.client.Secured_by_view_recurring_payment_jobsTrait<ByProjectKeyRecurringPaymentJobsGet> {

    @Override
    public TypeReference<com.commercetools.checkout.models.recurring_payment_job.PaginatedRecurringPaymentJob> resultType() {
        return new TypeReference<com.commercetools.checkout.models.recurring_payment_job.PaginatedRecurringPaymentJob>() {
        };
    }

    private String projectKey;

    public ByProjectKeyRecurringPaymentJobsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyRecurringPaymentJobsGet(ByProjectKeyRecurringPaymentJobsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/recurring-payment-jobs", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.checkout.models.recurring_payment_job.PaginatedRecurringPaymentJob> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.checkout.models.recurring_payment_job.PaginatedRecurringPaymentJob.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.checkout.models.recurring_payment_job.PaginatedRecurringPaymentJob>> execute(
            final ApiHttpClient client) {
        return execute(client,
            com.commercetools.checkout.models.recurring_payment_job.PaginatedRecurringPaymentJob.class);
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

    public List<String> getStatusState() {
        return this.getQueryParam("status.state");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set sort with the specified value
     * @param sort value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     * @param sort value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     * @param sort values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet withSort(final Collection<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     * @param sort values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet addSort(final Collection<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     * @param withTotal value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet withWithTotal(final TValue withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     * @param withTotal value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet addWithTotal(final TValue withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet withWithTotal(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet addWithTotal(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet withWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet addWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     * @param withTotal values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet withWithTotal(final Collection<TValue> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     * @param withTotal values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet addWithTotal(final Collection<TValue> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set statusState with the specified value
     * @param statusState value to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet withStatusState(final TValue statusState) {
        return copy().withQueryParam("status.state", statusState);
    }

    /**
     * add additional statusState query parameter
     * @param statusState value to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet addStatusState(final TValue statusState) {
        return copy().addQueryParam("status.state", statusState);
    }

    /**
     * set statusState with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet withStatusState(final Supplier<String> supplier) {
        return copy().withQueryParam("status.state", supplier.get());
    }

    /**
     * add additional statusState query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet addStatusState(final Supplier<String> supplier) {
        return copy().addQueryParam("status.state", supplier.get());
    }

    /**
     * set statusState with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet withStatusState(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("status.state", op.apply(new StringBuilder()));
    }

    /**
     * add additional statusState query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public ByProjectKeyRecurringPaymentJobsGet addStatusState(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("status.state", op.apply(new StringBuilder()));
    }

    /**
     * set statusState with the specified values
     * @param statusState values to be set
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet withStatusState(final Collection<TValue> statusState) {
        return copy().withoutQueryParam("status.state")
                .addQueryParams(statusState.stream()
                        .map(s -> new ParamEntry<>("status.state", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional statusState query parameters
     * @param statusState values to be added
     * @param <TValue> value type
     * @return ByProjectKeyRecurringPaymentJobsGet
     */
    public <TValue> ByProjectKeyRecurringPaymentJobsGet addStatusState(final Collection<TValue> statusState) {
        return copy().addQueryParams(
            statusState.stream().map(s -> new ParamEntry<>("status.state", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyRecurringPaymentJobsGet that = (ByProjectKeyRecurringPaymentJobsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyRecurringPaymentJobsGet copy() {
        return new ByProjectKeyRecurringPaymentJobsGet(this);
    }
}
