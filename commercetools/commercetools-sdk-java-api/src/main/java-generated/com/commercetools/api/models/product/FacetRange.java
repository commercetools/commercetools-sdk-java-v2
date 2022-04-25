
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FacetRangeImpl.class)
public interface FacetRange {

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

    public static FacetRange of() {
        return new FacetRangeImpl();
    }

    public static FacetRange of(final FacetRange template) {
        FacetRangeImpl instance = new FacetRangeImpl();
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

    public static FacetRangeBuilder builder() {
        return FacetRangeBuilder.of();
    }

    public static FacetRangeBuilder builder(final FacetRange template) {
        return FacetRangeBuilder.of(template);
    }

    default <T> T withFacetRange(Function<FacetRange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<FacetRange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FacetRange>() {
            @Override
            public String toString() {
                return "TypeReference<FacetRange>";
            }
        };
    }
}
