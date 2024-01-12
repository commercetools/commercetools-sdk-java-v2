
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchHitBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchHit productSearchHit = ProductSearchHit.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchHitBuilder implements Builder<ProductSearchHit> {

    private String id;

    @Nullable
    private com.commercetools.api.models.product.ProductProjection productProjection;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_search.ProductSearchMatchingVariant> matchingVariants;

    /**
     *  <p>Unique identifier of the Product.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductSearchHitBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains Product Projection data for Products matching the <code>projection</code> field in the Search Products request.</p>
     * @param builder function to build the productProjection value
     * @return Builder
     */

    public ProductSearchHitBuilder productProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.productProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Contains Product Projection data for Products matching the <code>projection</code> field in the Search Products request.</p>
     * @param builder function to build the productProjection value
     * @return Builder
     */

    public ProductSearchHitBuilder withProductProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        this.productProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of());
        return this;
    }

    /**
     *  <p>Contains Product Projection data for Products matching the <code>projection</code> field in the Search Products request.</p>
     * @param productProjection value to be set
     * @return Builder
     */

    public ProductSearchHitBuilder productProjection(
            @Nullable final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
        return this;
    }

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @param matchingVariants value to be set
     * @return Builder
     */

    public ProductSearchHitBuilder matchingVariants(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchMatchingVariant... matchingVariants) {
        this.matchingVariants = new ArrayList<>(Arrays.asList(matchingVariants));
        return this;
    }

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @param matchingVariants value to be set
     * @return Builder
     */

    public ProductSearchHitBuilder matchingVariants(
            @Nullable final java.util.List<com.commercetools.api.models.product_search.ProductSearchMatchingVariant> matchingVariants) {
        this.matchingVariants = matchingVariants;
        return this;
    }

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @param matchingVariants value to be set
     * @return Builder
     */

    public ProductSearchHitBuilder plusMatchingVariants(
            @Nullable final com.commercetools.api.models.product_search.ProductSearchMatchingVariant... matchingVariants) {
        if (this.matchingVariants == null) {
            this.matchingVariants = new ArrayList<>();
        }
        this.matchingVariants.addAll(Arrays.asList(matchingVariants));
        return this;
    }

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @param builder function to build the matchingVariants value
     * @return Builder
     */

    public ProductSearchHitBuilder plusMatchingVariants(
            Function<com.commercetools.api.models.product_search.ProductSearchMatchingVariantBuilder, com.commercetools.api.models.product_search.ProductSearchMatchingVariantBuilder> builder) {
        if (this.matchingVariants == null) {
            this.matchingVariants = new ArrayList<>();
        }
        this.matchingVariants
                .add(builder.apply(com.commercetools.api.models.product_search.ProductSearchMatchingVariantBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @param builder function to build the matchingVariants value
     * @return Builder
     */

    public ProductSearchHitBuilder withMatchingVariants(
            Function<com.commercetools.api.models.product_search.ProductSearchMatchingVariantBuilder, com.commercetools.api.models.product_search.ProductSearchMatchingVariantBuilder> builder) {
        this.matchingVariants = new ArrayList<>();
        this.matchingVariants
                .add(builder.apply(com.commercetools.api.models.product_search.ProductSearchMatchingVariantBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @param builder function to build the matchingVariants value
     * @return Builder
     */

    public ProductSearchHitBuilder addMatchingVariants(
            Function<com.commercetools.api.models.product_search.ProductSearchMatchingVariantBuilder, com.commercetools.api.models.product_search.ProductSearchMatchingVariant> builder) {
        return plusMatchingVariants(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchMatchingVariantBuilder.of()));
    }

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @param builder function to build the matchingVariants value
     * @return Builder
     */

    public ProductSearchHitBuilder setMatchingVariants(
            Function<com.commercetools.api.models.product_search.ProductSearchMatchingVariantBuilder, com.commercetools.api.models.product_search.ProductSearchMatchingVariant> builder) {
        return matchingVariants(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchMatchingVariantBuilder.of()));
    }

    /**
     *  <p>Unique identifier of the Product.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains Product Projection data for Products matching the <code>projection</code> field in the Search Products request.</p>
     * @return productProjection
     */

    @Nullable
    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @return matchingVariants
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product_search.ProductSearchMatchingVariant> getMatchingVariants() {
        return this.matchingVariants;
    }

    /**
     * builds ProductSearchHit with checking for non-null required values
     * @return ProductSearchHit
     */
    public ProductSearchHit build() {
        Objects.requireNonNull(id, ProductSearchHit.class + ": id is missing");
        return new ProductSearchHitImpl(id, productProjection, matchingVariants);
    }

    /**
     * builds ProductSearchHit without checking for non-null required values
     * @return ProductSearchHit
     */
    public ProductSearchHit buildUnchecked() {
        return new ProductSearchHitImpl(id, productProjection, matchingVariants);
    }

    /**
     * factory method for an instance of ProductSearchHitBuilder
     * @return builder
     */
    public static ProductSearchHitBuilder of() {
        return new ProductSearchHitBuilder();
    }

    /**
     * create builder for ProductSearchHit instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchHitBuilder of(final ProductSearchHit template) {
        ProductSearchHitBuilder builder = new ProductSearchHitBuilder();
        builder.id = template.getId();
        builder.productProjection = template.getProductProjection();
        builder.matchingVariants = template.getMatchingVariants();
        return builder;
    }

}
