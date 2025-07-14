
package com.commercetools.api.models.product_search;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResultStatsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultStats productSearchFacetResultStats = ProductSearchFacetResultStats.builder()
 *             .name("{name}")
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultStatsBuilder implements Builder<ProductSearchFacetResultStats> {

    private String name;

    private java.lang.Object min;

    private java.lang.Object max;

    @Nullable
    private java.lang.Object mean;

    @Nullable
    private java.lang.Object sum;

    private Long count;

    /**
     *  <p>Name of the facet.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSearchFacetResultStatsBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The minimum value of the field, scoped to the faceted results.</p>
     * @param min value to be set
     * @return Builder
     */

    public ProductSearchFacetResultStatsBuilder min(final java.lang.Object min) {
        this.min = min;
        return this;
    }

    /**
     *  <p>The maximum value of the field, scoped to the faceted results.</p>
     * @param max value to be set
     * @return Builder
     */

    public ProductSearchFacetResultStatsBuilder max(final java.lang.Object max) {
        this.max = max;
        return this;
    }

    /**
     *  <p>The average value of the field calculated as <code>sum</code> / <code>count</code>.</p>
     *  <p>Only returned for number fields.</p>
     * @param mean value to be set
     * @return Builder
     */

    public ProductSearchFacetResultStatsBuilder mean(@Nullable final java.lang.Object mean) {
        this.mean = mean;
        return this;
    }

    /**
     *  <p>The sum of values of the field that match the facet expression.</p>
     *  <p>Only returned for number fields.</p>
     * @param sum value to be set
     * @return Builder
     */

    public ProductSearchFacetResultStatsBuilder sum(@Nullable final java.lang.Object sum) {
        this.sum = sum;
        return this;
    }

    /**
     *  <p>The total number of values counted that match the facet expression.</p>
     * @param count value to be set
     * @return Builder
     */

    public ProductSearchFacetResultStatsBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Name of the facet.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The minimum value of the field, scoped to the faceted results.</p>
     * @return min
     */

    public java.lang.Object getMin() {
        return this.min;
    }

    /**
     *  <p>The maximum value of the field, scoped to the faceted results.</p>
     * @return max
     */

    public java.lang.Object getMax() {
        return this.max;
    }

    /**
     *  <p>The average value of the field calculated as <code>sum</code> / <code>count</code>.</p>
     *  <p>Only returned for number fields.</p>
     * @return mean
     */

    @Nullable
    public java.lang.Object getMean() {
        return this.mean;
    }

    /**
     *  <p>The sum of values of the field that match the facet expression.</p>
     *  <p>Only returned for number fields.</p>
     * @return sum
     */

    @Nullable
    public java.lang.Object getSum() {
        return this.sum;
    }

    /**
     *  <p>The total number of values counted that match the facet expression.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * builds ProductSearchFacetResultStats with checking for non-null required values
     * @return ProductSearchFacetResultStats
     */
    public ProductSearchFacetResultStats build() {
        Objects.requireNonNull(name, ProductSearchFacetResultStats.class + ": name is missing");
        Objects.requireNonNull(min, ProductSearchFacetResultStats.class + ": min is missing");
        Objects.requireNonNull(max, ProductSearchFacetResultStats.class + ": max is missing");
        Objects.requireNonNull(count, ProductSearchFacetResultStats.class + ": count is missing");
        return new ProductSearchFacetResultStatsImpl(name, min, max, mean, sum, count);
    }

    /**
     * builds ProductSearchFacetResultStats without checking for non-null required values
     * @return ProductSearchFacetResultStats
     */
    public ProductSearchFacetResultStats buildUnchecked() {
        return new ProductSearchFacetResultStatsImpl(name, min, max, mean, sum, count);
    }

    /**
     * factory method for an instance of ProductSearchFacetResultStatsBuilder
     * @return builder
     */
    public static ProductSearchFacetResultStatsBuilder of() {
        return new ProductSearchFacetResultStatsBuilder();
    }

    /**
     * create builder for ProductSearchFacetResultStats instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultStatsBuilder of(final ProductSearchFacetResultStats template) {
        ProductSearchFacetResultStatsBuilder builder = new ProductSearchFacetResultStatsBuilder();
        builder.name = template.getName();
        builder.min = template.getMin();
        builder.max = template.getMax();
        builder.mean = template.getMean();
        builder.sum = template.getSum();
        builder.count = template.getCount();
        return builder;
    }

}
