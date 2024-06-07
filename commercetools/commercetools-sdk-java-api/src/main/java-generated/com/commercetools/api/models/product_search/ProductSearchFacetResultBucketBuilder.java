
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResultBucketBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultBucket productSearchFacetResultBucket = ProductSearchFacetResultBucket.builder()
 *             .name("{name}")
 *             .plusBuckets(bucketsBuilder -> bucketsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultBucketBuilder implements Builder<ProductSearchFacetResultBucket> {

    private String name;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntry> buckets;

    /**
     *  <p>Name of the facet.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBucketBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param buckets value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBucketBuilder buckets(
            final com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntry... buckets) {
        this.buckets = new ArrayList<>(Arrays.asList(buckets));
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param buckets value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBucketBuilder buckets(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntry> buckets) {
        this.buckets = buckets;
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param buckets value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBucketBuilder plusBuckets(
            final com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntry... buckets) {
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

    public ProductSearchFacetResultBucketBuilder plusBuckets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryBuilder> builder) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        this.buckets.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param builder function to build the buckets value
     * @return Builder
     */

    public ProductSearchFacetResultBucketBuilder withBuckets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryBuilder> builder) {
        this.buckets = new ArrayList<>();
        this.buckets.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param builder function to build the buckets value
     * @return Builder
     */

    public ProductSearchFacetResultBucketBuilder addBuckets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntry> builder) {
        return plusBuckets(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryBuilder.of()));
    }

    /**
     *  <p>Contains results of the facet.</p>
     * @param builder function to build the buckets value
     * @return Builder
     */

    public ProductSearchFacetResultBucketBuilder setBuckets(
            Function<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryBuilder, com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntry> builder) {
        return buckets(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntryBuilder.of()));
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

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntry> getBuckets() {
        return this.buckets;
    }

    /**
     * builds ProductSearchFacetResultBucket with checking for non-null required values
     * @return ProductSearchFacetResultBucket
     */
    public ProductSearchFacetResultBucket build() {
        Objects.requireNonNull(name, ProductSearchFacetResultBucket.class + ": name is missing");
        Objects.requireNonNull(buckets, ProductSearchFacetResultBucket.class + ": buckets is missing");
        return new ProductSearchFacetResultBucketImpl(name, buckets);
    }

    /**
     * builds ProductSearchFacetResultBucket without checking for non-null required values
     * @return ProductSearchFacetResultBucket
     */
    public ProductSearchFacetResultBucket buildUnchecked() {
        return new ProductSearchFacetResultBucketImpl(name, buckets);
    }

    /**
     * factory method for an instance of ProductSearchFacetResultBucketBuilder
     * @return builder
     */
    public static ProductSearchFacetResultBucketBuilder of() {
        return new ProductSearchFacetResultBucketBuilder();
    }

    /**
     * create builder for ProductSearchFacetResultBucket instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultBucketBuilder of(final ProductSearchFacetResultBucket template) {
        ProductSearchFacetResultBucketBuilder builder = new ProductSearchFacetResultBucketBuilder();
        builder.name = template.getName();
        builder.buckets = template.getBuckets();
        return builder;
    }

}
