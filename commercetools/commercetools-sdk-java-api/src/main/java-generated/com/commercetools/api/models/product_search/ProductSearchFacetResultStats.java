
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Result of a <span>stats facet</span>. The data type of <code>min</code> <code>max</code>, <code>mean</code>, and <code>sum</code> matches the data type of the <code>field</code> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchFacetStatsExpression" rel="nofollow">facet expression</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultStats productSearchFacetResultStats = ProductSearchFacetResultStats.builder()
 *             .name("{name}")
 *             .count(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetResultStatsImpl.class)
public interface ProductSearchFacetResultStats extends ProductSearchFacetResult {

    /**
     *  <p>The minimum value of the field, scoped to the faceted results.</p>
     * @return min
     */
    @NotNull
    @JsonProperty("min")
    public Object getMin();

    /**
     *  <p>The maximum value of the field, scoped to the faceted results.</p>
     * @return max
     */
    @NotNull
    @JsonProperty("max")
    public Object getMax();

    /**
     *  <p>The average value of the field calculated as <code>sum</code> / <code>count</code>.</p>
     *  <p>Only returned for number fields.</p>
     * @return mean
     */

    @JsonProperty("mean")
    public Object getMean();

    /**
     *  <p>The sum of values of the field that match the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchFacetStatsExpression" rel="nofollow">facet expression</a>.</p>
     *  <p>Only returned for number fields.</p>
     * @return sum
     */

    @JsonProperty("sum")
    public Object getSum();

    /**
     *  <p>The total number of values counted that match the facet expression.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>The minimum value of the field, scoped to the faceted results.</p>
     * @param min value to be set
     */

    public void setMin(final Object min);

    /**
     *  <p>The maximum value of the field, scoped to the faceted results.</p>
     * @param max value to be set
     */

    public void setMax(final Object max);

    /**
     *  <p>The average value of the field calculated as <code>sum</code> / <code>count</code>.</p>
     *  <p>Only returned for number fields.</p>
     * @param mean value to be set
     */

    public void setMean(final Object mean);

    /**
     *  <p>The sum of values of the field that match the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchFacetStatsExpression" rel="nofollow">facet expression</a>.</p>
     *  <p>Only returned for number fields.</p>
     * @param sum value to be set
     */

    public void setSum(final Object sum);

    /**
     *  <p>The total number of values counted that match the facet expression.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     * factory method
     * @return instance of ProductSearchFacetResultStats
     */
    public static ProductSearchFacetResultStats of() {
        return new ProductSearchFacetResultStatsImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetResultStats
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetResultStats of(final ProductSearchFacetResultStats template) {
        ProductSearchFacetResultStatsImpl instance = new ProductSearchFacetResultStatsImpl();
        instance.setName(template.getName());
        instance.setMin(template.getMin());
        instance.setMax(template.getMax());
        instance.setMean(template.getMean());
        instance.setSum(template.getSum());
        instance.setCount(template.getCount());
        return instance;
    }

    public ProductSearchFacetResultStats copyDeep();

    /**
     * factory method to create a deep copy of ProductSearchFacetResultStats
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetResultStats deepCopy(@Nullable final ProductSearchFacetResultStats template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetResultStatsImpl instance = new ProductSearchFacetResultStatsImpl();
        instance.setName(template.getName());
        instance.setMin(template.getMin());
        instance.setMax(template.getMax());
        instance.setMean(template.getMean());
        instance.setSum(template.getSum());
        instance.setCount(template.getCount());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetResultStats
     * @return builder
     */
    public static ProductSearchFacetResultStatsBuilder builder() {
        return ProductSearchFacetResultStatsBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetResultStats instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultStatsBuilder builder(final ProductSearchFacetResultStats template) {
        return ProductSearchFacetResultStatsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetResultStats(Function<ProductSearchFacetResultStats, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResultStats> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResultStats>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetResultStats>";
            }
        };
    }
}
