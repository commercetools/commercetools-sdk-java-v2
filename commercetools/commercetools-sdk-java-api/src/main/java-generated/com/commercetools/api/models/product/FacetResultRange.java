
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FacetResultRangeImpl.class)
public interface FacetResultRange {

    @NotNull
    @JsonProperty("from")
    public Double getFrom();

    @NotNull
    @JsonProperty("fromStr")
    public String getFromStr();

    @NotNull
    @JsonProperty("to")
    public Double getTo();

    @NotNull
    @JsonProperty("toStr")
    public String getToStr();

    @NotNull
    @JsonProperty("count")
    public Long getCount();

    @JsonProperty("productCount")
    public Long getProductCount();

    @NotNull
    @JsonProperty("total")
    public Double getTotal();

    @NotNull
    @JsonProperty("min")
    public Double getMin();

    @NotNull
    @JsonProperty("max")
    public Double getMax();

    @NotNull
    @JsonProperty("mean")
    public Double getMean();

    public void setFrom(final Double from);

    public void setFromStr(final String fromStr);

    public void setTo(final Double to);

    public void setToStr(final String toStr);

    public void setCount(final Long count);

    public void setProductCount(final Long productCount);

    public void setTotal(final Double total);

    public void setMin(final Double min);

    public void setMax(final Double max);

    public void setMean(final Double mean);

    public static FacetResultRange of() {
        return new FacetResultRangeImpl();
    }

    public static FacetResultRange of(final FacetResultRange template) {
        FacetResultRangeImpl instance = new FacetResultRangeImpl();
        instance.setFrom(template.getFrom());
        instance.setFromStr(template.getFromStr());
        instance.setTo(template.getTo());
        instance.setToStr(template.getToStr());
        instance.setCount(template.getCount());
        instance.setProductCount(template.getProductCount());
        instance.setTotal(template.getTotal());
        instance.setMin(template.getMin());
        instance.setMax(template.getMax());
        instance.setMean(template.getMean());
        return instance;
    }

    public static FacetResultRangeBuilder builder() {
        return FacetResultRangeBuilder.of();
    }

    public static FacetResultRangeBuilder builder(final FacetResultRange template) {
        return FacetResultRangeBuilder.of(template);
    }

    default <T> T withFacetResultRange(Function<FacetResultRange, T> helper) {
        return helper.apply(this);
    }
}
