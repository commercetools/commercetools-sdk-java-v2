
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
     *  <p>The range's lower endpoint.</p>
     *  <p><code>0</code> represents -∞.</p>
     * @return from
     */
    @NotNull
    @JsonProperty("from")
    public Double getFrom();

    /**
     *  <p>The range's lower endpoint.</p>
     *  <p>An empty string represents -∞.</p>
     * @return fromStr
     */
    @NotNull
    @JsonProperty("fromStr")
    public String getFromStr();

    /**
     *  <p>The range's upper endpoint.</p>
     *  <p><code>0</code> represents +∞.</p>
     * @return to
     */
    @NotNull
    @JsonProperty("to")
    public Double getTo();

    /**
     *  <p>The range's upper endpoint.</p>
     *  <p>An empty string represents +∞.</p>
     * @return toStr
     */
    @NotNull
    @JsonProperty("toStr")
    public String getToStr();

    /**
     *  <p>Number of ProductVariants for which the values in a field fall into the specified range.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Number of Products for which the values in a field fall into the specified range.</p>
     *  <p>Present only if the <code>counting products</code> extension is enabled.</p>
     * @return productCount
     */

    @JsonProperty("productCount")
    public Long getProductCount();

    /**
     *  <p>Sum of all values contained in the range.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Double getTotal();

    /**
     *  <p>Minimum value within the range.</p>
     * @return min
     */
    @NotNull
    @JsonProperty("min")
    public Double getMin();

    /**
     *  <p>Maximum value within the range.</p>
     * @return max
     */
    @NotNull
    @JsonProperty("max")
    public Double getMax();

    /**
     *  <p>Arithmetic mean of the values within the range.</p>
     * @return mean
     */
    @NotNull
    @JsonProperty("mean")
    public Double getMean();

    /**
     *  <p>The range's lower endpoint.</p>
     *  <p><code>0</code> represents -∞.</p>
     * @param from value to be set
     */

    public void setFrom(final Double from);

    /**
     *  <p>The range's lower endpoint.</p>
     *  <p>An empty string represents -∞.</p>
     * @param fromStr value to be set
     */

    public void setFromStr(final String fromStr);

    /**
     *  <p>The range's upper endpoint.</p>
     *  <p><code>0</code> represents +∞.</p>
     * @param to value to be set
     */

    public void setTo(final Double to);

    /**
     *  <p>The range's upper endpoint.</p>
     *  <p>An empty string represents +∞.</p>
     * @param toStr value to be set
     */

    public void setToStr(final String toStr);

    /**
     *  <p>Number of ProductVariants for which the values in a field fall into the specified range.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Number of Products for which the values in a field fall into the specified range.</p>
     *  <p>Present only if the <code>counting products</code> extension is enabled.</p>
     * @param productCount value to be set
     */

    public void setProductCount(final Long productCount);

    /**
     *  <p>Sum of all values contained in the range.</p>
     * @param total value to be set
     */

    public void setTotal(final Double total);

    /**
     *  <p>Minimum value within the range.</p>
     * @param min value to be set
     */

    public void setMin(final Double min);

    /**
     *  <p>Maximum value within the range.</p>
     * @param max value to be set
     */

    public void setMax(final Double max);

    /**
     *  <p>Arithmetic mean of the values within the range.</p>
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
