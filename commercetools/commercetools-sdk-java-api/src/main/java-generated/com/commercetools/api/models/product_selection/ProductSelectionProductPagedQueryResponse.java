
package com.commercetools.api.models.product_selection;

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
 *  <p><span>PagedQueryResult</span> containing an array of <a href="https://docs.commercetools.com/apis/ctp:api:type:AssignedProductReference" rel="nofollow">AssignedProductReference</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductPagedQueryResponse productSelectionProductPagedQueryResponse = ProductSelectionProductPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductPagedQueryResponseImpl.class)
public interface ProductSelectionProductPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<AssignedProductReference> {

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
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
     *  <p>Total number of results matching the query. Present only when the <code>withTotal</code> query parameter is set to <code>true</code>. This number is an estimation that is not <span>strongly consistent</span>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<AssignedProductReference> getResults();

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query. Present only when the <code>withTotal</code> query parameter is set to <code>true</code>. This number is an estimation that is not <span>strongly consistent</span>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final AssignedProductReference... results);

    /**
     *  <p>References to Products that are assigned to the ProductSelection.</p>
     * @param results values to be set
     */

    public void setResults(final List<AssignedProductReference> results);

    /**
     * factory method
     * @return instance of ProductSelectionProductPagedQueryResponse
     */
    public static ProductSelectionProductPagedQueryResponse of() {
        return new ProductSelectionProductPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionProductPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionProductPagedQueryResponse of(
            final ProductSelectionProductPagedQueryResponse template) {
        ProductSelectionProductPagedQueryResponseImpl instance = new ProductSelectionProductPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public ProductSelectionProductPagedQueryResponse copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionProductPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionProductPagedQueryResponse deepCopy(
            @Nullable final ProductSelectionProductPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        ProductSelectionProductPagedQueryResponseImpl instance = new ProductSelectionProductPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_selection.AssignedProductReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionProductPagedQueryResponse
     * @return builder
     */
    public static ProductSelectionProductPagedQueryResponseBuilder builder() {
        return ProductSelectionProductPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for ProductSelectionProductPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductPagedQueryResponseBuilder builder(
            final ProductSelectionProductPagedQueryResponse template) {
        return ProductSelectionProductPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionProductPagedQueryResponse(
            Function<ProductSelectionProductPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductPagedQueryResponse>";
            }
        };
    }
}
