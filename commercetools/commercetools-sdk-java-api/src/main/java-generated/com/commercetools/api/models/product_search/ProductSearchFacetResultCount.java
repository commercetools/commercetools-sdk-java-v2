
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Result of a <span>count facet</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultCount productSearchFacetResultCount = ProductSearchFacetResultCount.builder()
 *             .name("{name}")
 *             .value(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetResultCountImpl.class)
public interface ProductSearchFacetResultCount extends ProductSearchFacetResult {

    /**
     *  <p>Number of Products (or Product Variants) matching the query.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Long getValue();

    /**
     *  <p>Number of Products (or Product Variants) matching the query.</p>
     * @param value value to be set
     */

    public void setValue(final Long value);

    /**
     * factory method
     * @return instance of ProductSearchFacetResultCount
     */
    public static ProductSearchFacetResultCount of() {
        return new ProductSearchFacetResultCountImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetResultCount
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetResultCount of(final ProductSearchFacetResultCount template) {
        ProductSearchFacetResultCountImpl instance = new ProductSearchFacetResultCountImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public ProductSearchFacetResultCount copyDeep();

    /**
     * factory method to create a deep copy of ProductSearchFacetResultCount
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetResultCount deepCopy(@Nullable final ProductSearchFacetResultCount template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetResultCountImpl instance = new ProductSearchFacetResultCountImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetResultCount
     * @return builder
     */
    public static ProductSearchFacetResultCountBuilder builder() {
        return ProductSearchFacetResultCountBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetResultCount instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultCountBuilder builder(final ProductSearchFacetResultCount template) {
        return ProductSearchFacetResultCountBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetResultCount(Function<ProductSearchFacetResultCount, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResultCount> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResultCount>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetResultCount>";
            }
        };
    }
}
