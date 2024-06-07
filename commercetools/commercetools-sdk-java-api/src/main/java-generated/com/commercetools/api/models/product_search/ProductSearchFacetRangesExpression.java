
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetRangesExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetRangesExpression productSearchFacetRangesExpression = ProductSearchFacetRangesExpression.builder()
 *             .ranges(rangesBuilder -> rangesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetRangesExpressionImpl.class)
public interface ProductSearchFacetRangesExpression extends ProductSearchFacetExpression {

    /**
     *  <p>Definition of the ranges facet.</p>
     * @return ranges
     */
    @NotNull
    @Valid
    @JsonProperty("ranges")
    public ProductSearchFacetRangesValue getRanges();

    /**
     *  <p>Definition of the ranges facet.</p>
     * @param ranges value to be set
     */

    public void setRanges(final ProductSearchFacetRangesValue ranges);

    /**
     * factory method
     * @return instance of ProductSearchFacetRangesExpression
     */
    public static ProductSearchFacetRangesExpression of() {
        return new ProductSearchFacetRangesExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetRangesExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetRangesExpression of(final ProductSearchFacetRangesExpression template) {
        ProductSearchFacetRangesExpressionImpl instance = new ProductSearchFacetRangesExpressionImpl();
        instance.setRanges(template.getRanges());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetRangesExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetRangesExpression deepCopy(
            @Nullable final ProductSearchFacetRangesExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetRangesExpressionImpl instance = new ProductSearchFacetRangesExpressionImpl();
        instance.setRanges(
            com.commercetools.api.models.product_search.ProductSearchFacetRangesValue.deepCopy(template.getRanges()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetRangesExpression
     * @return builder
     */
    public static ProductSearchFacetRangesExpressionBuilder builder() {
        return ProductSearchFacetRangesExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetRangesExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetRangesExpressionBuilder builder(final ProductSearchFacetRangesExpression template) {
        return ProductSearchFacetRangesExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetRangesExpression(Function<ProductSearchFacetRangesExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetRangesExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetRangesExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetRangesExpression>";
            }
        };
    }
}
