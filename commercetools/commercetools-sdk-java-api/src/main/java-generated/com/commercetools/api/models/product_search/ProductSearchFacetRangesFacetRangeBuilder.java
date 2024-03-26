
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetRangesFacetRangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetRangesFacetRange productSearchFacetRangesFacetRange = ProductSearchFacetRangesFacetRange.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetRangesFacetRangeBuilder implements Builder<ProductSearchFacetRangesFacetRange> {

    @Nullable
    private java.lang.Object from;

    @Nullable
    private java.lang.Object to;

    @Nullable
    private String key;

    /**
     *  <p>Starting value of the bucket (inclusive).</p>
     * @param from value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesFacetRangeBuilder from(@Nullable final java.lang.Object from) {
        this.from = from;
        return this;
    }

    /**
     *  <p>Ending value of the bucket (non-inclusive).</p>
     * @param to value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesFacetRangeBuilder to(@Nullable final java.lang.Object to) {
        this.to = to;
        return this;
    }

    /**
     *  <p>Key to assign the bucket.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductSearchFacetRangesFacetRangeBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Starting value of the bucket (inclusive).</p>
     * @return from
     */

    @Nullable
    public java.lang.Object getFrom() {
        return this.from;
    }

    /**
     *  <p>Ending value of the bucket (non-inclusive).</p>
     * @return to
     */

    @Nullable
    public java.lang.Object getTo() {
        return this.to;
    }

    /**
     *  <p>Key to assign the bucket.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ProductSearchFacetRangesFacetRange with checking for non-null required values
     * @return ProductSearchFacetRangesFacetRange
     */
    public ProductSearchFacetRangesFacetRange build() {
        return new ProductSearchFacetRangesFacetRangeImpl(from, to, key);
    }

    /**
     * builds ProductSearchFacetRangesFacetRange without checking for non-null required values
     * @return ProductSearchFacetRangesFacetRange
     */
    public ProductSearchFacetRangesFacetRange buildUnchecked() {
        return new ProductSearchFacetRangesFacetRangeImpl(from, to, key);
    }

    /**
     * factory method for an instance of ProductSearchFacetRangesFacetRangeBuilder
     * @return builder
     */
    public static ProductSearchFacetRangesFacetRangeBuilder of() {
        return new ProductSearchFacetRangesFacetRangeBuilder();
    }

    /**
     * create builder for ProductSearchFacetRangesFacetRange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetRangesFacetRangeBuilder of(final ProductSearchFacetRangesFacetRange template) {
        ProductSearchFacetRangesFacetRangeBuilder builder = new ProductSearchFacetRangesFacetRangeBuilder();
        builder.from = template.getFrom();
        builder.to = template.getTo();
        builder.key = template.getKey();
        return builder;
    }

}
