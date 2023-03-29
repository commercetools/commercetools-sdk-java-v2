
package com.commercetools.api.models.product;

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
 * ProductProjectionPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductProjectionPagedQueryResponse productProjectionPagedQueryResponse = ProductProjectionPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductProjectionPagedQueryResponseImpl.class)
public interface ProductProjectionPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductProjection> {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
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
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>ProductProjections matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductProjection> getResults();

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
     *  <p>ProductProjections matching the query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final ProductProjection... results);

    /**
     *  <p>ProductProjections matching the query.</p>
     * @param results values to be set
     */

    public void setResults(final List<ProductProjection> results);

    /**
     * factory method
     * @return instance of ProductProjectionPagedQueryResponse
     */
    public static ProductProjectionPagedQueryResponse of() {
        return new ProductProjectionPagedQueryResponseImpl();
    }

    /**
     * factory method to create a shallow copy ProductProjectionPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductProjectionPagedQueryResponse of(final ProductProjectionPagedQueryResponse template) {
        ProductProjectionPagedQueryResponseImpl instance = new ProductProjectionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductProjectionPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductProjectionPagedQueryResponse deepCopy(
            @Nullable final ProductProjectionPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        ProductProjectionPagedQueryResponseImpl instance = new ProductProjectionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.ProductProjection::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductProjectionPagedQueryResponse
     * @return builder
     */
    public static ProductProjectionPagedQueryResponseBuilder builder() {
        return ProductProjectionPagedQueryResponseBuilder.of();
    }

    /**
     * create builder for ProductProjectionPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductProjectionPagedQueryResponseBuilder builder(
            final ProductProjectionPagedQueryResponse template) {
        return ProductProjectionPagedQueryResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductProjectionPagedQueryResponse(Function<ProductProjectionPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductProjectionPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductProjectionPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductProjectionPagedQueryResponse>";
            }
        };
    }
}
