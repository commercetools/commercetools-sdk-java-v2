
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResultBucketBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultBucket productSearchFacetResultBucket = ProductSearchFacetResultBucket.builder()
 *             .key("{key}")
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultBucketBuilder implements Builder<ProductSearchFacetResultBucket> {

    private String key;

    private Integer count;

    /**
     *  <p>Key of the bucket.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBucketBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Number of values in the bucket.</p>
     * @param count value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBucketBuilder count(final Integer count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Key of the bucket.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Number of values in the bucket.</p>
     * @return count
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * builds ProductSearchFacetResultBucket with checking for non-null required values
     * @return ProductSearchFacetResultBucket
     */
    public ProductSearchFacetResultBucket build() {
        Objects.requireNonNull(key, ProductSearchFacetResultBucket.class + ": key is missing");
        Objects.requireNonNull(count, ProductSearchFacetResultBucket.class + ": count is missing");
        return new ProductSearchFacetResultBucketImpl(key, count);
    }

    /**
     * builds ProductSearchFacetResultBucket without checking for non-null required values
     * @return ProductSearchFacetResultBucket
     */
    public ProductSearchFacetResultBucket buildUnchecked() {
        return new ProductSearchFacetResultBucketImpl(key, count);
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
        builder.key = template.getKey();
        builder.count = template.getCount();
        return builder;
    }

}
