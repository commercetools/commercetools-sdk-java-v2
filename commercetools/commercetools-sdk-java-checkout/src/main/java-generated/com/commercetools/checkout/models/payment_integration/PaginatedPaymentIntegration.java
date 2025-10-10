
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Paginated result containing PaymentIntegrations.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaginatedPaymentIntegration paginatedPaymentIntegration = PaginatedPaymentIntegration.builder()
 *             .limit(1)
 *             .offset(1)
 *             .count(1)
 *             .total(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaginatedPaymentIntegrationImpl.class)
public interface PaginatedPaymentIntegration {

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
     *  <p>Total number of results matching the query.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Integer getTotal();

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<PaymentIntegration> getResults();

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
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     */

    public void setTotal(final Integer total);

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final PaymentIntegration... results);

    /**
     *  <p>PaymentIntegrations matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<PaymentIntegration> results);

    /**
     * factory method
     * @return instance of PaginatedPaymentIntegration
     */
    public static PaginatedPaymentIntegration of() {
        return new PaginatedPaymentIntegrationImpl();
    }

    /**
     * factory method to create a shallow copy PaginatedPaymentIntegration
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaginatedPaymentIntegration of(final PaginatedPaymentIntegration template) {
        PaginatedPaymentIntegrationImpl instance = new PaginatedPaymentIntegrationImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public PaginatedPaymentIntegration copyDeep();

    /**
     * factory method to create a deep copy of PaginatedPaymentIntegration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaginatedPaymentIntegration deepCopy(@Nullable final PaginatedPaymentIntegration template) {
        if (template == null) {
            return null;
        }
        PaginatedPaymentIntegrationImpl instance = new PaginatedPaymentIntegrationImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.payment_integration.PaymentIntegration::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PaginatedPaymentIntegration
     * @return builder
     */
    public static PaginatedPaymentIntegrationBuilder builder() {
        return PaginatedPaymentIntegrationBuilder.of();
    }

    /**
     * create builder for PaginatedPaymentIntegration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaginatedPaymentIntegrationBuilder builder(final PaginatedPaymentIntegration template) {
        return PaginatedPaymentIntegrationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaginatedPaymentIntegration(Function<PaginatedPaymentIntegration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaginatedPaymentIntegration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaginatedPaymentIntegration>() {
            @Override
            public String toString() {
                return "TypeReference<PaginatedPaymentIntegration>";
            }
        };
    }
}
