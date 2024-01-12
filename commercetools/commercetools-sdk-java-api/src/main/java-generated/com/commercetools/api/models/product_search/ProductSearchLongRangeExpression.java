
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
 * ProductSearchLongRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchLongRangeExpression productSearchLongRangeExpression = ProductSearchLongRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchLongRangeExpressionImpl.class)
public interface ProductSearchLongRangeExpression extends ProductSearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public ProductSearchLongRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final ProductSearchLongRangeValue range);

    /**
     * factory method
     * @return instance of ProductSearchLongRangeExpression
     */
    public static ProductSearchLongRangeExpression of() {
        return new ProductSearchLongRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchLongRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchLongRangeExpression of(final ProductSearchLongRangeExpression template) {
        ProductSearchLongRangeExpressionImpl instance = new ProductSearchLongRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchLongRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchLongRangeExpression deepCopy(@Nullable final ProductSearchLongRangeExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchLongRangeExpressionImpl instance = new ProductSearchLongRangeExpressionImpl();
        instance.setRange(
            com.commercetools.api.models.product_search.ProductSearchLongRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchLongRangeExpression
     * @return builder
     */
    public static ProductSearchLongRangeExpressionBuilder builder() {
        return ProductSearchLongRangeExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchLongRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchLongRangeExpressionBuilder builder(final ProductSearchLongRangeExpression template) {
        return ProductSearchLongRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchLongRangeExpression(Function<ProductSearchLongRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchLongRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchLongRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchLongRangeExpression>";
            }
        };
    }
}
