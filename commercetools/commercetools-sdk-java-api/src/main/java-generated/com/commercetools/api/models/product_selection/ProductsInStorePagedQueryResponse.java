
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>PagedQueryResult containing an array of ProductSelectionAssignment.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductsInStorePagedQueryResponse productsInStorePagedQueryResponse = ProductsInStorePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductsInStorePagedQueryResponseImpl.class)
public interface ProductsInStorePagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductSelectionAssignment> {

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
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. Unlike other endpoints, the Product Selection endpoint does not return this field by default. To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>ProductSelectionAssignments matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductSelectionAssignment> getResults();

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
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. Unlike other endpoints, the Product Selection endpoint does not return this field by default. To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>ProductSelectionAssignments matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final ProductSelectionAssignment... results);

    /**
     *  <p>ProductSelectionAssignments matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<ProductSelectionAssignment> results);

    /**
     * factory method
     * @return instance of ProductsInStorePagedQueryResponse
     */
    public static ProductsInStorePagedQueryResponse of() {
        return new ProductsInStorePagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy ProductsInStorePagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductsInStorePagedQueryResponse of(final ProductsInStorePagedQueryResponse template) {
        ProductsInStorePagedQueryResponseImpl instance = new ProductsInStorePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductsInStorePagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductsInStorePagedQueryResponse deepCopy(
            @Nullable final ProductsInStorePagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        ProductsInStorePagedQueryResponseImpl instance = new ProductsInStorePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_selection.ProductSelectionAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductsInStorePagedQueryResponse
     * @return builder
     */
    public static ProductsInStorePagedQueryResponseBuilder builder() {
        return ProductsInStorePagedQueryResponseBuilder.of();
    }

    /**
     * create builder for ProductsInStorePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductsInStorePagedQueryResponseBuilder builder(final ProductsInStorePagedQueryResponse template) {
        return ProductsInStorePagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductsInStorePagedQueryResponse(Function<ProductsInStorePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductsInStorePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductsInStorePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductsInStorePagedQueryResponse>";
            }
        };
    }
}
