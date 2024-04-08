
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResult
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResult productSearchFacetResult = ProductSearchFacetResult.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetResultImpl.class)
public interface ProductSearchFacetResult {

    /**
     *  <p>Name of the facet.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the facet.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of ProductSearchFacetResult
     */
    public static ProductSearchFacetResult of() {
        return new ProductSearchFacetResultImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetResult of(final ProductSearchFacetResult template) {
        ProductSearchFacetResultImpl instance = new ProductSearchFacetResultImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetResult deepCopy(@Nullable final ProductSearchFacetResult template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchFacetResultBucket) {
            return com.commercetools.api.models.product_search.ProductSearchFacetResultBucket
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchFacetResultBucket) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchFacetResultCount) {
            return com.commercetools.api.models.product_search.ProductSearchFacetResultCount
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchFacetResultCount) template);
        }
        ProductSearchFacetResultImpl instance = new ProductSearchFacetResultImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetResult
     * @return builder
     */
    public static ProductSearchFacetResultBuilder builder() {
        return ProductSearchFacetResultBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultBuilder builder(final ProductSearchFacetResult template) {
        return ProductSearchFacetResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetResult(Function<ProductSearchFacetResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResult>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetResult>";
            }
        };
    }
}
