
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FilteredFacetResultImpl.class)
public interface FilteredFacetResult extends FacetResult {

    /**
     * discriminator value for FilteredFacetResult
     */
    String FILTER = "filter";

    /**
     *
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *
     * @return productCount
     */

    @JsonProperty("productCount")
    public Long getProductCount();

    /**
     * set count
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     * set productCount
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
