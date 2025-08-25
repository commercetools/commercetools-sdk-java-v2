
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FacetRangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FacetRange facetRange = FacetRange.builder()
 *             .from(0.3)
 *             .fromStr("{fromStr}")
 *             .to(0.3)
 *             .toStr("{toStr}")
 *             .count(0.3)
 *             .total(0.3)
 *             .min(0.3)
 *             .max(0.3)
 *             .mean(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FacetRangeBuilder implements Builder<FacetRange> {

    private Double from;

    private String fromStr;

    private Double to;

    private String toStr;

    private Long count;

    @Nullable
    private Long productCount;

    private Double total;

    private Double min;

    private Double max;

    private Double mean;

    /**
     *  <p>The range's lower endpoint.</p>
     *  <p><code>0</code> represents -∞.</p>
     * @param from value to be set
     * @return Builder
     */

    public FacetRangeBuilder from(final Double from) {
        this.from = from;
        return this;
    }

    /**
     *  <p>The range's lower endpoint.</p>
     *  <p>An empty string represents -∞.</p>
     * @param fromStr value to be set
     * @return Builder
     */

    public FacetRangeBuilder fromStr(final String fromStr) {
        this.fromStr = fromStr;
        return this;
    }

    /**
     *  <p>The range's upper endpoint.</p>
     *  <p><code>0</code> represents +∞.</p>
     * @param to value to be set
     * @return Builder
     */

    public FacetRangeBuilder to(final Double to) {
        this.to = to;
        return this;
    }

    /**
     *  <p>The range's upper endpoint.</p>
     *  <p>An empty string represents +∞.</p>
     * @param toStr value to be set
     * @return Builder
     */

    public FacetRangeBuilder toStr(final String toStr) {
        this.toStr = toStr;
        return this;
    }

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> for which the values in a field fall into the specified range.</p>
     * @param count value to be set
     * @return Builder
     */

    public FacetRangeBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> for which the values in a field fall into the specified range.</p>
     *  <p>Present only if the <code>counting products</code> <span>extension</span> is enabled.</p>
     * @param productCount value to be set
     * @return Builder
     */

    public FacetRangeBuilder productCount(@Nullable final Long productCount) {
        this.productCount = productCount;
        return this;
    }

    /**
     *  <p>Sum of all values contained in the range.</p>
     * @param total value to be set
     * @return Builder
     */

    public FacetRangeBuilder total(final Double total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Minimum value within the range.</p>
     * @param min value to be set
     * @return Builder
     */

    public FacetRangeBuilder min(final Double min) {
        this.min = min;
        return this;
    }

    /**
     *  <p>Maximum value within the range.</p>
     * @param max value to be set
     * @return Builder
     */

    public FacetRangeBuilder max(final Double max) {
        this.max = max;
        return this;
    }

    /**
     *  <p>Arithmetic mean of the values within the range.</p>
     * @param mean value to be set
     * @return Builder
     */

    public FacetRangeBuilder mean(final Double mean) {
        this.mean = mean;
        return this;
    }

    /**
     *  <p>The range's lower endpoint.</p>
     *  <p><code>0</code> represents -∞.</p>
     * @return from
     */

    public Double getFrom() {
        return this.from;
    }

    /**
     *  <p>The range's lower endpoint.</p>
     *  <p>An empty string represents -∞.</p>
     * @return fromStr
     */

    public String getFromStr() {
        return this.fromStr;
    }

    /**
     *  <p>The range's upper endpoint.</p>
     *  <p><code>0</code> represents +∞.</p>
     * @return to
     */

    public Double getTo() {
        return this.to;
    }

    /**
     *  <p>The range's upper endpoint.</p>
     *  <p>An empty string represents +∞.</p>
     * @return toStr
     */

    public String getToStr() {
        return this.toStr;
    }

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a> for which the values in a field fall into the specified range.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> for which the values in a field fall into the specified range.</p>
     *  <p>Present only if the <code>counting products</code> <span>extension</span> is enabled.</p>
     * @return productCount
     */

    @Nullable
    public Long getProductCount() {
        return this.productCount;
    }

    /**
     *  <p>Sum of all values contained in the range.</p>
     * @return total
     */

    public Double getTotal() {
        return this.total;
    }

    /**
     *  <p>Minimum value within the range.</p>
     * @return min
     */

    public Double getMin() {
        return this.min;
    }

    /**
     *  <p>Maximum value within the range.</p>
     * @return max
     */

    public Double getMax() {
        return this.max;
    }

    /**
     *  <p>Arithmetic mean of the values within the range.</p>
     * @return mean
     */

    public Double getMean() {
        return this.mean;
    }

    /**
     * builds FacetRange with checking for non-null required values
     * @return FacetRange
     */
    public FacetRange build() {
        Objects.requireNonNull(from, FacetRange.class + ": from is missing");
        Objects.requireNonNull(fromStr, FacetRange.class + ": fromStr is missing");
        Objects.requireNonNull(to, FacetRange.class + ": to is missing");
        Objects.requireNonNull(toStr, FacetRange.class + ": toStr is missing");
        Objects.requireNonNull(count, FacetRange.class + ": count is missing");
        Objects.requireNonNull(total, FacetRange.class + ": total is missing");
        Objects.requireNonNull(min, FacetRange.class + ": min is missing");
        Objects.requireNonNull(max, FacetRange.class + ": max is missing");
        Objects.requireNonNull(mean, FacetRange.class + ": mean is missing");
        return new FacetRangeImpl(from, fromStr, to, toStr, count, productCount, total, min, max, mean);
    }

    /**
     * builds FacetRange without checking for non-null required values
     * @return FacetRange
     */
    public FacetRange buildUnchecked() {
        return new FacetRangeImpl(from, fromStr, to, toStr, count, productCount, total, min, max, mean);
    }

    /**
     * factory method for an instance of FacetRangeBuilder
     * @return builder
     */
    public static FacetRangeBuilder of() {
        return new FacetRangeBuilder();
    }

    /**
     * create builder for FacetRange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FacetRangeBuilder of(final FacetRange template) {
        FacetRangeBuilder builder = new FacetRangeBuilder();
        builder.from = template.getFrom();
        builder.fromStr = template.getFromStr();
        builder.to = template.getTo();
        builder.toStr = template.getToStr();
        builder.count = template.getCount();
        builder.productCount = template.getProductCount();
        builder.total = template.getTotal();
        builder.min = template.getMin();
        builder.max = template.getMax();
        builder.mean = template.getMean();
        return builder;
    }

}
