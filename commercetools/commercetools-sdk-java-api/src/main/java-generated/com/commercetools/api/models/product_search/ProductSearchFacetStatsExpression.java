
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductSearchFacetStatsExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetStatsExpression productSearchFacetStatsExpression = ProductSearchFacetStatsExpression.builder()
 *             .stats(statsBuilder -> statsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetStatsExpressionImpl.class)
public interface ProductSearchFacetStatsExpression extends ProductSearchFacetExpression {

    /**
     *  <p>Definition of the stats facet.</p>
     * @return stats
     */
    @NotNull
    @Valid
    @JsonProperty("stats")
    public ProductSearchFacetStatsValue getStats();

    /**
     *  <p>Definition of the stats facet.</p>
     * @param stats value to be set
     */

    public void setStats(final ProductSearchFacetStatsValue stats);

    /**
     * factory method
     * @return instance of ProductSearchFacetStatsExpression
     */
    public static ProductSearchFacetStatsExpression of() {
        return new ProductSearchFacetStatsExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetStatsExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetStatsExpression of(final ProductSearchFacetStatsExpression template) {
        ProductSearchFacetStatsExpressionImpl instance = new ProductSearchFacetStatsExpressionImpl();
        instance.setStats(template.getStats());
        return instance;
    }

    public ProductSearchFacetStatsExpression copyDeep();

    /**
     * factory method to create a deep copy of ProductSearchFacetStatsExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetStatsExpression deepCopy(
            @Nullable final ProductSearchFacetStatsExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetStatsExpressionImpl instance = new ProductSearchFacetStatsExpressionImpl();
        instance.setStats(
            com.commercetools.api.models.product_search.ProductSearchFacetStatsValue.deepCopy(template.getStats()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetStatsExpression
     * @return builder
     */
    public static ProductSearchFacetStatsExpressionBuilder builder() {
        return ProductSearchFacetStatsExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetStatsExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetStatsExpressionBuilder builder(final ProductSearchFacetStatsExpression template) {
        return ProductSearchFacetStatsExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetStatsExpression(Function<ProductSearchFacetStatsExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetStatsExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetStatsExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetStatsExpression>";
            }
        };
    }
}
