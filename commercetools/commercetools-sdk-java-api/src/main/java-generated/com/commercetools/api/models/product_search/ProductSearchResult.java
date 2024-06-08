
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductSearchResult
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchResult productSearchResult = ProductSearchResult.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchResultImpl.class)
public interface ProductSearchResult {

    /**
     *  <p>Unique identifier of the Product.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains Product Projection data for Products matching the <code>projection</code> field in the Search Products request.</p>
     * @return productProjection
     */
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    /**
     *  <p>Describes the variants that matched the search criteria.</p>
     * @return matchingVariants
     */
    @Valid
    @JsonProperty("matchingVariants")
    public ProductSearchMatchingVariants getMatchingVariants();

    /**
     *  <p>Unique identifier of the Product.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Contains Product Projection data for Products matching the <code>projection</code> field in the Search Products request.</p>
     * @param productProjection value to be set
     */

    public void setProductProjection(final ProductProjection productProjection);

    /**
     *  <p>Describes the variants that matched the search criteria.</p>
     * @param matchingVariants value to be set
     */

    public void setMatchingVariants(final ProductSearchMatchingVariants matchingVariants);

    /**
     * factory method
     * @return instance of ProductSearchResult
     */
    public static ProductSearchResult of() {
        return new ProductSearchResultImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchResult of(final ProductSearchResult template) {
        ProductSearchResultImpl instance = new ProductSearchResultImpl();
        instance.setId(template.getId());
        instance.setProductProjection(template.getProductProjection());
        instance.setMatchingVariants(template.getMatchingVariants());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchResult deepCopy(@Nullable final ProductSearchResult template) {
        if (template == null) {
            return null;
        }
        ProductSearchResultImpl instance = new ProductSearchResultImpl();
        instance.setId(template.getId());
        instance.setProductProjection(
            com.commercetools.api.models.product.ProductProjection.deepCopy(template.getProductProjection()));
        instance.setMatchingVariants(com.commercetools.api.models.product_search.ProductSearchMatchingVariants
                .deepCopy(template.getMatchingVariants()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchResult
     * @return builder
     */
    public static ProductSearchResultBuilder builder() {
        return ProductSearchResultBuilder.of();
    }

    /**
     * create builder for ProductSearchResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchResultBuilder builder(final ProductSearchResult template) {
        return ProductSearchResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchResult(Function<ProductSearchResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchResult>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchResult>";
            }
        };
    }
}
