
package com.commercetools.api.models.product_search;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResultBucketEntryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultBucketEntry productSearchFacetResultBucketEntry = ProductSearchFacetResultBucketEntry.builder()
 *             .key("{key}")
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultBucketEntryBuilder implements Builder<ProductSearchFacetResultBucketEntry> {

    private String key;

    private Integer count;

    /**
     *  <p>Key of the bucket.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBucketEntryBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Number of values in the bucket.</p>
     * @param count value to be set
     * @return Builder
     */

    public ProductSearchFacetResultBucketEntryBuilder count(final Integer count) {
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
     * builds ProductSearchFacetResultBucketEntry with checking for non-null required values
     * @return ProductSearchFacetResultBucketEntry
     */
    public ProductSearchFacetResultBucketEntry build() {
        Objects.requireNonNull(key, ProductSearchFacetResultBucketEntry.class + ": key is missing");
        Objects.requireNonNull(count, ProductSearchFacetResultBucketEntry.class + ": count is missing");
        return new ProductSearchFacetResultBucketEntryImpl(key, count);
    }

    /**
     * builds ProductSearchFacetResultBucketEntry without checking for non-null required values
     * @return ProductSearchFacetResultBucketEntry
     */
    public ProductSearchFacetResultBucketEntry buildUnchecked() {
        return new ProductSearchFacetResultBucketEntryImpl(key, count);
    }

    /**
     * factory method for an instance of ProductSearchFacetResultBucketEntryBuilder
     * @return builder
     */
    public static ProductSearchFacetResultBucketEntryBuilder of() {
        return new ProductSearchFacetResultBucketEntryBuilder();
    }

    /**
     * create builder for ProductSearchFacetResultBucketEntry instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultBucketEntryBuilder of(final ProductSearchFacetResultBucketEntry template) {
        ProductSearchFacetResultBucketEntryBuilder builder = new ProductSearchFacetResultBucketEntryBuilder();
        builder.key = template.getKey();
        builder.count = template.getCount();
        return builder;
    }

}
