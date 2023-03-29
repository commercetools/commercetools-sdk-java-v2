
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * FacetRange
 *
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
@JsonDeserialize(as = FacetRangeImpl.class)
public interface FacetRange {

    /**
     *
     * @return from
     */
    @NotNull
    @JsonProperty("from")
    public Double getFrom();

    /**
     *
     * @return fromStr
     */
    @NotNull
    @JsonProperty("fromStr")
    public String getFromStr();

    /**
     *
     * @return to
     */
    @NotNull
    @JsonProperty("to")
    public Double getTo();

    /**
     *
     * @return toStr
     */
    @NotNull
    @JsonProperty("toStr")
    public String getToStr();

    /**
     *
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *
     * @return productCount
     */

    @JsonProperty("productCount")
    public Long getProductCount();

    /**
     *
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Double getTotal();

    /**
     *
     * @return min
     */
    @NotNull
    @JsonProperty("min")
    public Double getMin();

    /**
     *
     * @return max
     */
    @NotNull
    @JsonProperty("max")
    public Double getMax();

    /**
     *
     * @return mean
     */
    @NotNull
    @JsonProperty("mean")
    public Double getMean();

    /**
     * set from
     * @param from value to be set
     */

    public void setFrom(final Double from);

    /**
     * set fromStr
     * @param fromStr value to be set
     */

    public void setFromStr(final String fromStr);

    /**
     * set to
     * @param to value to be set
     */

    public void setTo(final Double to);

    /**
     * set toStr
     * @param toStr value to be set
     */

    public void setToStr(final String toStr);

    /**
     * set count
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     * set productCount
     * @param productCount value to be set
     */

    public void setProductCount(final Long productCount);

    /**
     * set total
     * @param total value to be set
     */

    public void setTotal(final Double total);

    /**
     * set min
     * @param min value to be set
     */

    public void setMin(final Double min);

    /**
     * set max
     * @param max value to be set
     */

    public void setMax(final Double max);

    /**
     * set mean
     * @param mean value to be set
     */

    public void setMean(final Double mean);

    /**
     * factory method
     * @return instance of FacetRange
     */
    public static FacetRange of() {
        return new FacetRangeImpl();
    }

    /**
     * factory method to create a shallow copy FacetRange
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of FacetRange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FacetRange deepCopy(@Nullable final FacetRange template) {
        if (template == null) {
            return null;
        }
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

    /**
     * builder factory method for FacetRange
     * @return builder
     */
    public static FacetRangeBuilder builder() {
        return FacetRangeBuilder.of();
    }

    /**
     * create builder for FacetRange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FacetRangeBuilder builder(final FacetRange template) {
        return FacetRangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFacetRange(Function<FacetRange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FacetRange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FacetRange>() {
            @Override
            public String toString() {
                return "TypeReference<FacetRange>";
            }
        };
    }
}
