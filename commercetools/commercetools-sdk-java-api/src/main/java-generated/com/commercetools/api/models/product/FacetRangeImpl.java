
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * FacetRange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FacetRangeImpl implements FacetRange, ModelBase {

    private Double from;

    private String fromStr;

    private Double to;

    private String toStr;

    private Long count;

    private Long productCount;

    private Double total;

    private Double min;

    private Double max;

    private Double mean;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FacetRangeImpl(@JsonProperty("from") final Double from, @JsonProperty("fromStr") final String fromStr,
            @JsonProperty("to") final Double to, @JsonProperty("toStr") final String toStr,
            @JsonProperty("count") final Long count, @JsonProperty("productCount") final Long productCount,
            @JsonProperty("total") final Double total, @JsonProperty("min") final Double min,
            @JsonProperty("max") final Double max, @JsonProperty("mean") final Double mean) {
        this.from = from;
        this.fromStr = fromStr;
        this.to = to;
        this.toStr = toStr;
        this.count = count;
        this.productCount = productCount;
        this.total = total;
        this.min = min;
        this.max = max;
        this.mean = mean;
    }

    /**
     * create empty instance
     */
    public FacetRangeImpl() {
    }

    /**
     *  <p>The range's lower endpoint.</p>
     *  <p><code>0</code> represents -∞.</p>
     */

    public Double getFrom() {
        return this.from;
    }

    /**
     *  <p>The range's lower endpoint.</p>
     *  <p>An empty string represents -∞.</p>
     */

    public String getFromStr() {
        return this.fromStr;
    }

    /**
     *  <p>The range's upper endpoint.</p>
     *  <p><code>0</code> represents +∞.</p>
     */

    public Double getTo() {
        return this.to;
    }

    /**
     *  <p>The range's upper endpoint.</p>
     *  <p>An empty string represents +∞.</p>
     */

    public String getToStr() {
        return this.toStr;
    }

    /**
     *  <p>Number of ProductVariants for which the values in a field fall into the specified range.</p>
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Number of Products for which the values in a field fall into the specified range.</p>
     *  <p>Present only if the <code>counting products</code> extension is enabled.</p>
     */

    public Long getProductCount() {
        return this.productCount;
    }

    /**
     *  <p>Sum of all values contained in the range.</p>
     */

    public Double getTotal() {
        return this.total;
    }

    /**
     *  <p>Minimum value within the range.</p>
     */

    public Double getMin() {
        return this.min;
    }

    /**
     *  <p>Maximum value within the range.</p>
     */

    public Double getMax() {
        return this.max;
    }

    /**
     *  <p>Arithmetic mean of the values within the range.</p>
     */

    public Double getMean() {
        return this.mean;
    }

    public void setFrom(final Double from) {
        this.from = from;
    }

    public void setFromStr(final String fromStr) {
        this.fromStr = fromStr;
    }

    public void setTo(final Double to) {
        this.to = to;
    }

    public void setToStr(final String toStr) {
        this.toStr = toStr;
    }

    public void setCount(final Long count) {
        this.count = count;
    }

    public void setProductCount(final Long productCount) {
        this.productCount = productCount;
    }

    public void setTotal(final Double total) {
        this.total = total;
    }

    public void setMin(final Double min) {
        this.min = min;
    }

    public void setMax(final Double max) {
        this.max = max;
    }

    public void setMean(final Double mean) {
        this.mean = mean;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        FacetRangeImpl that = (FacetRangeImpl) o;

        return new EqualsBuilder().append(from, that.from)
                .append(fromStr, that.fromStr)
                .append(to, that.to)
                .append(toStr, that.toStr)
                .append(count, that.count)
                .append(productCount, that.productCount)
                .append(total, that.total)
                .append(min, that.min)
                .append(max, that.max)
                .append(mean, that.mean)
                .append(from, that.from)
                .append(fromStr, that.fromStr)
                .append(to, that.to)
                .append(toStr, that.toStr)
                .append(count, that.count)
                .append(productCount, that.productCount)
                .append(total, that.total)
                .append(min, that.min)
                .append(max, that.max)
                .append(mean, that.mean)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(from)
                .append(fromStr)
                .append(to)
                .append(toStr)
                .append(count)
                .append(productCount)
                .append(total)
                .append(min)
                .append(max)
                .append(mean)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("from", from)
                .append("fromStr", fromStr)
                .append("to", to)
                .append("toStr", toStr)
                .append("count", count)
                .append("productCount", productCount)
                .append("total", total)
                .append("min", min)
                .append("max", max)
                .append("mean", mean)
                .build();
    }

}
