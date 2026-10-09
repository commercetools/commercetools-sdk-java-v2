
package com.commercetools.checkout.models.recurring_payment;

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
 *  <p>Paginated result containing RecurringPayments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaginatedRecurringPayment paginatedRecurringPayment = PaginatedRecurringPayment.builder()
 *             .limit(1)
 *             .offset(1)
 *             .count(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaginatedRecurringPaymentImpl.class)
public interface PaginatedRecurringPayment {

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
     *  <p>RecurringPayments matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<RecurringPayment> getResults();

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
     *  <p>RecurringPayments matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final RecurringPayment... results);

    /**
     *  <p>RecurringPayments matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<RecurringPayment> results);

    /**
     * factory method
     * @return instance of PaginatedRecurringPayment
     */
    public static PaginatedRecurringPayment of() {
        return new PaginatedRecurringPaymentImpl();
    }

    /**
     * factory method to create a shallow copy PaginatedRecurringPayment
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaginatedRecurringPayment of(final PaginatedRecurringPayment template) {
        PaginatedRecurringPaymentImpl instance = new PaginatedRecurringPaymentImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public PaginatedRecurringPayment copyDeep();

    /**
     * factory method to create a deep copy of PaginatedRecurringPayment
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaginatedRecurringPayment deepCopy(@Nullable final PaginatedRecurringPayment template) {
        if (template == null) {
            return null;
        }
        PaginatedRecurringPaymentImpl instance = new PaginatedRecurringPaymentImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.recurring_payment.RecurringPayment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PaginatedRecurringPayment
     * @return builder
     */
    public static PaginatedRecurringPaymentBuilder builder() {
        return PaginatedRecurringPaymentBuilder.of();
    }

    /**
     * create builder for PaginatedRecurringPayment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaginatedRecurringPaymentBuilder builder(final PaginatedRecurringPayment template) {
        return PaginatedRecurringPaymentBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaginatedRecurringPayment(Function<PaginatedRecurringPayment, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<PaginatedRecurringPayment> typeReference() {
        return new tools.jackson.core.type.TypeReference<PaginatedRecurringPayment>() {
            @Override
            public String toString() {
                return "TypeReference<PaginatedRecurringPayment>";
            }
        };
    }
}
