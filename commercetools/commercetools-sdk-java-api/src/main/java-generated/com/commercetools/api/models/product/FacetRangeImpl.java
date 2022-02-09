
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public FacetRangeImpl() {
    }

    public Double getFrom() {
        return this.from;
    }

    public String getFromStr() {
        return this.fromStr;
    }

    public Double getTo() {
        return this.to;
    }

    public String getToStr() {
        return this.toStr;
    }

    public Long getCount() {
        return this.count;
    }

    public Long getProductCount() {
        return this.productCount;
    }

    public Double getTotal() {
        return this.total;
    }

    public Double getMin() {
        return this.min;
    }

    public Double getMax() {
        return this.max;
    }

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

}
