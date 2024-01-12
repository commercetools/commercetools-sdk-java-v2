
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetBucketResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetBucketResult productSearchFacetBucketResult = ProductSearchFacetBucketResult.builder()
 *             .name("{name}")
 *             .plusBuckets(bucketsBuilder -> bucketsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetBucketResultBuilder implements Builder<ProductSearchFacetBucketResult> {

    private String name;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultBucket> buckets;

    /**
     *  <p>Name of the facet.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchFacetBucketResultBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param buckets value to be set
     * @return Builder
     */

    public ProductSearchFacetBucketResultBuilder buckets(
            final com.commercetools.api.models.product_search.ProductSearchFacetResultBucket... buckets) {
        this.buckets = new ArrayList<>(Arrays.asList(buckets));
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param buckets value to be set
     * @return Builder
     */

    public ProductSearchFacetBucketResultBuilder buckets(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultBucket> buckets) {
        this.buckets = buckets;
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param buckets value to be set
     * @return Builder
     */

    public ProductSearchFacetBucketResultBuilder plusBuckets(
            final com.commercetools.api.models.product_search.ProductSearchFacetResultBucket... buckets) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        this.buckets.addAll(Arrays.asList(buckets));
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param builder function to build the buckets value
     * @return Builder
     */

    public ProductSearchFacetBucketResultBuilder plusBuckets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBucketBuilder> builder) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        this.buckets.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBucketBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param builder function to build the buckets value
     * @return Builder
     */

    public ProductSearchFacetBucketResultBuilder withBuckets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBucketBuilder> builder) {
        this.buckets = new ArrayList<>();
        this.buckets.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBucketBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param builder function to build the buckets value
     * @return Builder
     */

    public ProductSearchFacetBucketResultBuilder addBuckets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBucket> builder) {
        return plusBuckets(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBucketBuilder.of()));
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param builder function to build the buckets value
     * @return Builder
     */

    public ProductSearchFacetBucketResultBuilder setBuckets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBucket> builder) {
        return buckets(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBucketBuilder.of()));
    }

    /**
     *  <p>Name of the facet.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @return buckets
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultBucket> getBuckets() {
        return this.buckets;
    }

    /**
     * builds ProductSearchFacetBucketResult with checking for non-null required values
     * @return ProductSearchFacetBucketResult
     */
    public ProductSearchFacetBucketResult build() {
        Objects.requireNonNull(name, ProductSearchFacetBucketResult.class + ": name is missing");
        Objects.requireNonNull(buckets, ProductSearchFacetBucketResult.class + ": buckets is missing");
        return new ProductSearchFacetBucketResultImpl(name, buckets);
    }

    /**
     * builds ProductSearchFacetBucketResult without checking for non-null required values
     * @return ProductSearchFacetBucketResult
     */
    public ProductSearchFacetBucketResult buildUnchecked() {
        return new ProductSearchFacetBucketResultImpl(name, buckets);
    }

    /**
     * factory method for an instance of ProductSearchFacetBucketResultBuilder
     * @return builder
     */
    public static ProductSearchFacetBucketResultBuilder of() {
        return new ProductSearchFacetBucketResultBuilder();
    }

    /**
     * create builder for ProductSearchFacetBucketResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetBucketResultBuilder of(final ProductSearchFacetBucketResult template) {
        ProductSearchFacetBucketResultBuilder builder = new ProductSearchFacetBucketResultBuilder();
        builder.name = template.getName();
        builder.buckets = template.getBuckets();
        return builder;
    }

}
