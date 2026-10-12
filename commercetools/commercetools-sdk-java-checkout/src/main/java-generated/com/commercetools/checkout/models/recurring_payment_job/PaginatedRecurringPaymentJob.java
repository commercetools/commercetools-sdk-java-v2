
package com.commercetools.checkout.models.recurring_payment_job;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Paginated result containing Recurring Payment Jobs.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaginatedRecurringPaymentJob paginatedRecurringPaymentJob = PaginatedRecurringPaymentJob.builder()
 *             .limit(1)
 *             .offset(1)
 *             .count(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaginatedRecurringPaymentJobImpl.class)
public interface PaginatedRecurringPaymentJob {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Integer getOffset();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
     *  <p>Total number of results matching the query. Only present when the <code>withTotal</code> query parameter is <code>true</code>.</p>
     * @return total
     */

    @JsonProperty("total")
    public Integer getTotal();

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<RecurringPaymentJob> getResults();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Integer count);

    /**
     *  <p>Total number of results matching the query. Only present when the <code>withTotal</code> query parameter is <code>true</code>.</p>
     * @param total value to be set
     */

    public void setTotal(final Integer total);

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final RecurringPaymentJob... results);

    /**
     *  <p>Recurring Payment Jobs matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<RecurringPaymentJob> results);

    /**
     * factory method
     * @return instance of PaginatedRecurringPaymentJob
     */
    public static PaginatedRecurringPaymentJob of() {
        return new PaginatedRecurringPaymentJobImpl();
    }

    /**
     * factory method to create a shallow copy PaginatedRecurringPaymentJob
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaginatedRecurringPaymentJob of(final PaginatedRecurringPaymentJob template) {
        PaginatedRecurringPaymentJobImpl instance = new PaginatedRecurringPaymentJobImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public PaginatedRecurringPaymentJob copyDeep();

    /**
     * factory method to create a deep copy of PaginatedRecurringPaymentJob
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaginatedRecurringPaymentJob deepCopy(@Nullable final PaginatedRecurringPaymentJob template) {
        if (template == null) {
            return null;
        }
        PaginatedRecurringPaymentJobImpl instance = new PaginatedRecurringPaymentJobImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.recurring_payment_job.RecurringPaymentJob::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PaginatedRecurringPaymentJob
     * @return builder
     */
    public static PaginatedRecurringPaymentJobBuilder builder() {
        return PaginatedRecurringPaymentJobBuilder.of();
    }

    /**
     * create builder for PaginatedRecurringPaymentJob instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaginatedRecurringPaymentJobBuilder builder(final PaginatedRecurringPaymentJob template) {
        return PaginatedRecurringPaymentJobBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaginatedRecurringPaymentJob(Function<PaginatedRecurringPaymentJob, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<PaginatedRecurringPaymentJob> typeReference() {
        return new tools.jackson.core.type.TypeReference<PaginatedRecurringPaymentJob>() {
            @Override
            public String toString() {
                return "TypeReference<PaginatedRecurringPaymentJob>";
            }
        };
    }
}
