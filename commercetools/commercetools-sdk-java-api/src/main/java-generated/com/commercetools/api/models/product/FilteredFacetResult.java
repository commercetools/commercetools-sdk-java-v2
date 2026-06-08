
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * FilteredFacetResult
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FilteredFacetResult filteredFacetResult = FilteredFacetResult.builder()
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("filter")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FilteredFacetResultImpl.class)
public interface FilteredFacetResult extends FacetResult {

    /**
     * discriminator value for FilteredFacetResult
     */
    String FILTER = "filter";

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> matching the value specified in <span>filtered facet expression</span>.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> matching the value specified in <span>filtered facet expression</span>.</p>
     *  <p>Present only if the <code>counting products</code> <span>extension</span> is enabled.</p>
     * @return productCount
     */

    @JsonProperty("productCount")
    public Long getProductCount();

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> matching the value specified in <span>filtered facet expression</span>.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> matching the value specified in <span>filtered facet expression</span>.</p>
     *  <p>Present only if the <code>counting products</code> <span>extension</span> is enabled.</p>
     * @param productCount value to be set
     */

    public void setProductCount(final Long productCount);

    /**
     * factory method
     * @return instance of FilteredFacetResult
     */
    public static FilteredFacetResult of() {
        return new FilteredFacetResultImpl();
    }

    /**
     * factory method to create a shallow copy FilteredFacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static FilteredFacetResult of(final FilteredFacetResult template) {
        FilteredFacetResultImpl instance = new FilteredFacetResultImpl();
        instance.setCount(template.getCount());
        instance.setProductCount(template.getProductCount());
        return instance;
    }

    public FilteredFacetResult copyDeep();

    /**
     * factory method to create a deep copy of FilteredFacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FilteredFacetResult deepCopy(@Nullable final FilteredFacetResult template) {
        if (template == null) {
            return null;
        }
        FilteredFacetResultImpl instance = new FilteredFacetResultImpl();
        instance.setCount(template.getCount());
        instance.setProductCount(template.getProductCount());
        return instance;
    }

    /**
     * builder factory method for FilteredFacetResult
     * @return builder
     */
    public static FilteredFacetResultBuilder builder() {
        return FilteredFacetResultBuilder.of();
    }

    /**
     * create builder for FilteredFacetResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FilteredFacetResultBuilder builder(final FilteredFacetResult template) {
        return FilteredFacetResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFilteredFacetResult(Function<FilteredFacetResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FilteredFacetResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FilteredFacetResult>() {
            @Override
            public String toString() {
                return "TypeReference<FilteredFacetResult>";
            }
        };
    }
}
