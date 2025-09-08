
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
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that matches the search query.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Information about which Product Variants match the search query. Only present if <code>markMatchingVariants</code> is set to <code>true</code> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchRequest" rel="nofollow">ProductSearchRequest</a>.</p>
     * @return matchingVariants
     */
    @Valid
    @JsonProperty("matchingVariants")
    public ProductSearchMatchingVariants getMatchingVariants();

    /**
     *  <p>Projected data of the Product with <code>id</code>. Only present if data integration <span>with Product Projection parameters</span> is requested.</p>
     * @return productProjection
     */
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that matches the search query.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Information about which Product Variants match the search query. Only present if <code>markMatchingVariants</code> is set to <code>true</code> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchRequest" rel="nofollow">ProductSearchRequest</a>.</p>
     * @param matchingVariants value to be set
     */

    public void setMatchingVariants(final ProductSearchMatchingVariants matchingVariants);

    /**
     *  <p>Projected data of the Product with <code>id</code>. Only present if data integration <span>with Product Projection parameters</span> is requested.</p>
     * @param productProjection value to be set
     */

    public void setProductProjection(final ProductProjection productProjection);

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
        instance.setMatchingVariants(template.getMatchingVariants());
        instance.setProductProjection(template.getProductProjection());
        return instance;
    }

    public ProductSearchResult copyDeep();

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
        instance.setMatchingVariants(com.commercetools.api.models.product_search.ProductSearchMatchingVariants
                .deepCopy(template.getMatchingVariants()));
        instance.setProductProjection(
            com.commercetools.api.models.product.ProductProjection.deepCopy(template.getProductProjection()));
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
