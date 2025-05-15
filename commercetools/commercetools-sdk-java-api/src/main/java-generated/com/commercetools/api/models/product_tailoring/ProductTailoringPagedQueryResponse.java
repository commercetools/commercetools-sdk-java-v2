
package com.commercetools.api.models.product_tailoring;

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
 *  <p>PagedQueryResult with results containing an array of ProductTailoring.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringPagedQueryResponse productTailoringPagedQueryResponse = ProductTailoringPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringPagedQueryResponseImpl.class)
public interface ProductTailoringPagedQueryResponse {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query. Present only when the <code>withTotal</code> query parameter is set to <code>true</code>. This number is an estimation that is not strongly consistent. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>ProductTailoring list matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductTailoring> getResults();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query. Present only when the <code>withTotal</code> query parameter is set to <code>true</code>. This number is an estimation that is not strongly consistent. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>ProductTailoring list matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final ProductTailoring... results);

    /**
     *  <p>ProductTailoring list matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<ProductTailoring> results);

    /**
     * factory method
     * @return instance of ProductTailoringPagedQueryResponse
     */
    public static ProductTailoringPagedQueryResponse of() {
        return new ProductTailoringPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringPagedQueryResponse of(final ProductTailoringPagedQueryResponse template) {
        ProductTailoringPagedQueryResponseImpl instance = new ProductTailoringPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public ProductTailoringPagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringPagedQueryResponse deepCopy(
            @Nullable final ProductTailoringPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        ProductTailoringPagedQueryResponseImpl instance = new ProductTailoringPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_tailoring.ProductTailoring::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringPagedQueryResponse
     * @return builder
     */
    public static ProductTailoringPagedQueryResponseBuilder builder() {
        return ProductTailoringPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for ProductTailoringPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringPagedQueryResponseBuilder builder(final ProductTailoringPagedQueryResponse template) {
        return ProductTailoringPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringPagedQueryResponse(Function<ProductTailoringPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringPagedQueryResponse>";
            }
        };
    }
}
