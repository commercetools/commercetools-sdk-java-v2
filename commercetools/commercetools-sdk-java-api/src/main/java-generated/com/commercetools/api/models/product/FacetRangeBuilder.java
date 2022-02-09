
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public FacetRangeBuilder from(final Double from) {
        this.from = from;
        return this;
    }

    public FacetRangeBuilder fromStr(final String fromStr) {
        this.fromStr = fromStr;
        return this;
    }

    public FacetRangeBuilder to(final Double to) {
        this.to = to;
        return this;
    }

    public FacetRangeBuilder toStr(final String toStr) {
        this.toStr = toStr;
        return this;
    }

    public FacetRangeBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public FacetRangeBuilder productCount(@Nullable final Long productCount) {
        this.productCount = productCount;
        return this;
    }

    public FacetRangeBuilder total(final Double total) {
        this.total = total;
        return this;
    }

    public FacetRangeBuilder min(final Double min) {
        this.min = min;
        return this;
    }

    public FacetRangeBuilder max(final Double max) {
        this.max = max;
        return this;
    }

    public FacetRangeBuilder mean(final Double mean) {
        this.mean = mean;
        return this;
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

    @Nullable
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
     * builds FacetRange without checking for non null required values
     */
    public FacetRange buildUnchecked() {
        return new FacetRangeImpl(from, fromStr, to, toStr, count, productCount, total, min, max, mean);
    }

    public static FacetRangeBuilder of() {
        return new FacetRangeBuilder();
    }

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
