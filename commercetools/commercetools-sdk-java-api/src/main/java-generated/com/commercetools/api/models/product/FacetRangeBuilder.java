
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
     * set the value to the from
     * @param from value to be set
     * @return Builder
     */

    public FacetRangeBuilder from(final Double from) {
        this.from = from;
        return this;
    }

    /**
     * set the value to the fromStr
     * @param fromStr value to be set
     * @return Builder
     */

    public FacetRangeBuilder fromStr(final String fromStr) {
        this.fromStr = fromStr;
        return this;
    }

    /**
     * set the value to the to
     * @param to value to be set
     * @return Builder
     */

    public FacetRangeBuilder to(final Double to) {
        this.to = to;
        return this;
    }

    /**
     * set the value to the toStr
     * @param toStr value to be set
     * @return Builder
     */

    public FacetRangeBuilder toStr(final String toStr) {
        this.toStr = toStr;
        return this;
    }

    /**
     * set the value to the count
     * @param count value to be set
     * @return Builder
     */

    public FacetRangeBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     * set the value to the productCount
     * @param productCount value to be set
     * @return Builder
     */

    public FacetRangeBuilder productCount(@Nullable final Long productCount) {
        this.productCount = productCount;
        return this;
    }

    /**
     * set the value to the total
     * @param total value to be set
     * @return Builder
     */

    public FacetRangeBuilder total(final Double total) {
        this.total = total;
        return this;
    }

    /**
     * set the value to the min
     * @param min value to be set
     * @return Builder
     */

    public FacetRangeBuilder min(final Double min) {
        this.min = min;
        return this;
    }

    /**
     * set the value to the max
     * @param max value to be set
     * @return Builder
     */

    public FacetRangeBuilder max(final Double max) {
        this.max = max;
        return this;
    }

    /**
     * set the value to the mean
     * @param mean value to be set
     * @return Builder
     */

    public FacetRangeBuilder mean(final Double mean) {
        this.mean = mean;
        return this;
    }

    /**
     * value of from}
     * @return from
     */

    public Double getFrom() {
        return this.from;
    }

    /**
     * value of fromStr}
     * @return fromStr
     */

    public String getFromStr() {
        return this.fromStr;
    }

    /**
     * value of to}
     * @return to
     */

    public Double getTo() {
        return this.to;
    }

    /**
     * value of toStr}
     * @return toStr
     */

    public String getToStr() {
        return this.toStr;
    }

    /**
     * value of count}
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * value of productCount}
     * @return productCount
     */

    @Nullable
    public Long getProductCount() {
        return this.productCount;
    }

    /**
     * value of total}
     * @return total
     */

    public Double getTotal() {
        return this.total;
    }

    /**
     * value of min}
     * @return min
     */

    public Double getMin() {
        return this.min;
    }

    /**
     * value of max}
     * @return max
     */

    public Double getMax() {
        return this.max;
    }

    /**
     * value of mean}
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
