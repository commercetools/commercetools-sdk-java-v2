
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FacetResultRangeBuilder {

    private Double from;

    private String fromStr;

    private Double to;

    private String toStr;

    private Long count;

    @Nullable
    private Long productCount;

    private Long total;

    private Double min;

    private Double max;

    private Double mean;

    public FacetResultRangeBuilder from(final Double from) {
        this.from = from;
        return this;
    }

    public FacetResultRangeBuilder fromStr(final String fromStr) {
        this.fromStr = fromStr;
        return this;
    }

    public FacetResultRangeBuilder to(final Double to) {
        this.to = to;
        return this;
    }

    public FacetResultRangeBuilder toStr(final String toStr) {
        this.toStr = toStr;
        return this;
    }

    public FacetResultRangeBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public FacetResultRangeBuilder productCount(@Nullable final Long productCount) {
        this.productCount = productCount;
        return this;
    }

    public FacetResultRangeBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public FacetResultRangeBuilder min(final Double min) {
        this.min = min;
        return this;
    }

    public FacetResultRangeBuilder max(final Double max) {
        this.max = max;
        return this;
    }

    public FacetResultRangeBuilder mean(final Double mean) {
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

    public Long getTotal() {
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

    public FacetResultRange build() {
        return new FacetResultRangeImpl(from, fromStr, to, toStr, count, productCount, total, min, max, mean);
    }

    public static FacetResultRangeBuilder of() {
        return new FacetResultRangeBuilder();
    }

    public static FacetResultRangeBuilder of(final FacetResultRange template) {
        FacetResultRangeBuilder builder = new FacetResultRangeBuilder();
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
