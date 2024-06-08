
package com.commercetools.api.models.shipping_method;

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
 *  <p>PagedQueryResult with <code>results</code> containing an array of ShippingMethod.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodPagedQueryResponse shippingMethodPagedQueryResponse = ShippingMethodPagedQueryResponse.builder()
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodPagedQueryResponseImpl.class)
public interface ShippingMethodPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ShippingMethod> {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Shipping Methods matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ShippingMethod> getResults();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>Shipping Methods matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final ShippingMethod... results);

    /**
     *  <p>Shipping Methods matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<ShippingMethod> results);

    /**
     * factory method
     * @return instance of ShippingMethodPagedQueryResponse
     */
    public static ShippingMethodPagedQueryResponse of() {
        return new ShippingMethodPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodPagedQueryResponse of(final ShippingMethodPagedQueryResponse template) {
        ShippingMethodPagedQueryResponseImpl instance = new ShippingMethodPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodPagedQueryResponse deepCopy(@Nullable final ShippingMethodPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        ShippingMethodPagedQueryResponseImpl instance = new ShippingMethodPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.shipping_method.ShippingMethod::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodPagedQueryResponse
     * @return builder
     */
    public static ShippingMethodPagedQueryResponseBuilder builder() {
        return ShippingMethodPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for ShippingMethodPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodPagedQueryResponseBuilder builder(final ShippingMethodPagedQueryResponse template) {
        return ShippingMethodPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodPagedQueryResponse(Function<ShippingMethodPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodPagedQueryResponse>";
            }
        };
    }
}
