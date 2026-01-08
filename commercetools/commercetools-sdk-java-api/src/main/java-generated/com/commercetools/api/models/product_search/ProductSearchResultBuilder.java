
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchResultBuilder
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
public class ProductSearchResultBuilder implements Builder<ProductSearchResult> {

    private String id;

    @Nullable
    private com.commercetools.api.models.product_search.ProductSearchMatchingVariants matchingVariants;

    @Deprecated
    @Nullable
    private com.commercetools.api.models.product.ProductProjection productProjection;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that matches the search query.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductSearchResultBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Information about which Product Variants match the search query. Only present if <code>markMatchingVariants</code> is set to <code>true</code> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchRequest" rel="nofollow">ProductSearchRequest</a>.</p>
     * @param builder function to build the matchingVariants value
     * @return Builder
     */

    public ProductSearchResultBuilder matchingVariants(
            Function<com.commercetools.api.models.product_search.ProductSearchMatchingVariantsBuilder, com.commercetools.api.models.product_search.ProductSearchMatchingVariantsBuilder> builder) {
        this.matchingVariants = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchMatchingVariantsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Information about which Product Variants match the search query. Only present if <code>markMatchingVariants</code> is set to <code>true</code> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchRequest" rel="nofollow">ProductSearchRequest</a>.</p>
     * @param builder function to build the matchingVariants value
     * @return Builder
     */

    public ProductSearchResultBuilder withMatchingVariants(
            Function<com.commercetools.api.models.product_search.ProductSearchMatchingVariantsBuilder, com.commercetools.api.models.product_search.ProductSearchMatchingVariants> builder) {
        this.matchingVariants = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchMatchingVariantsBuilder.of());
        return this;
    }

    /**
     *  <p>Information about which Product Variants match the search query. Only present if <code>markMatchingVariants</code> is set to <code>true</code> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchRequest" rel="nofollow">ProductSearchRequest</a>.</p>
     * @param matchingVariants value to be set
     * @return Builder
     */

    public ProductSearchResultBuilder matchingVariants(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchMatchingVariants matchingVariants) {
        this.matchingVariants = matchingVariants;
        return this;
    }

    /**
     *  <p>Projected data of the Product with <code>id</code>. Only present if deprecated data integration <span>with Product Projection parameters</span> is requested.</p>
     * @param builder function to build the productProjection value
     * @return Builder
     */
    @Deprecated
    public ProductSearchResultBuilder productProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.productProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Projected data of the Product with <code>id</code>. Only present if deprecated data integration <span>with Product Projection parameters</span> is requested.</p>
     * @param builder function to build the productProjection value
     * @return Builder
     */
    @Deprecated
    public ProductSearchResultBuilder withProductProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        this.productProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of());
        return this;
    }

    /**
     *  <p>Projected data of the Product with <code>id</code>. Only present if deprecated data integration <span>with Product Projection parameters</span> is requested.</p>
     * @param productProjection value to be set
     * @return Builder
     */
    @Deprecated
    public ProductSearchResultBuilder productProjection(
            @Nullable final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that matches the search query.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Information about which Product Variants match the search query. Only present if <code>markMatchingVariants</code> is set to <code>true</code> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchRequest" rel="nofollow">ProductSearchRequest</a>.</p>
     * @return matchingVariants
     */

    @Nullable
    public com.commercetools.api.models.product_search.ProductSearchMatchingVariants getMatchingVariants() {
        return this.matchingVariants;
    }

    /**
     *  <p>Projected data of the Product with <code>id</code>. Only present if deprecated data integration <span>with Product Projection parameters</span> is requested.</p>
     * @return productProjection
     */
    @Deprecated
    @Nullable
    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    /**
     * builds ProductSearchResult with checking for non-null required values
     * @return ProductSearchResult
     */
    public ProductSearchResult build() {
        Objects.requireNonNull(id, ProductSearchResult.class + ": id is missing");
        return new ProductSearchResultImpl(id, matchingVariants, productProjection);
    }

    /**
     * builds ProductSearchResult without checking for non-null required values
     * @return ProductSearchResult
     */
    public ProductSearchResult buildUnchecked() {
        return new ProductSearchResultImpl(id, matchingVariants, productProjection);
    }

    /**
     * factory method for an instance of ProductSearchResultBuilder
     * @return builder
     */
    public static ProductSearchResultBuilder of() {
        return new ProductSearchResultBuilder();
    }

    /**
     * create builder for ProductSearchResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchResultBuilder of(final ProductSearchResult template) {
        ProductSearchResultBuilder builder = new ProductSearchResultBuilder();
        builder.id = template.getId();
        builder.matchingVariants = template.getMatchingVariants();
        builder.productProjection = template.getProductProjection();
        return builder;
    }

}
