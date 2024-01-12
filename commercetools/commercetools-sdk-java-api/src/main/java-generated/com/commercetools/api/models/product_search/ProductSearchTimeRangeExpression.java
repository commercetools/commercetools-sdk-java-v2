
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
 * ProductSearchTimeRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchTimeRangeExpression productSearchTimeRangeExpression = ProductSearchTimeRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchTimeRangeExpressionImpl.class)
public interface ProductSearchTimeRangeExpression extends ProductSearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public ProductSearchTimeRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final ProductSearchTimeRangeValue range);

    /**
     * factory method
     * @return instance of ProductSearchTimeRangeExpression
     */
    public static ProductSearchTimeRangeExpression of() {
        return new ProductSearchTimeRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchTimeRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchTimeRangeExpression of(final ProductSearchTimeRangeExpression template) {
        ProductSearchTimeRangeExpressionImpl instance = new ProductSearchTimeRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchTimeRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchTimeRangeExpression deepCopy(@Nullable final ProductSearchTimeRangeExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchTimeRangeExpressionImpl instance = new ProductSearchTimeRangeExpressionImpl();
        instance.setRange(
            com.commercetools.api.models.product_search.ProductSearchTimeRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchTimeRangeExpression
     * @return builder
     */
    public static ProductSearchTimeRangeExpressionBuilder builder() {
        return ProductSearchTimeRangeExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchTimeRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchTimeRangeExpressionBuilder builder(final ProductSearchTimeRangeExpression template) {
        return ProductSearchTimeRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchTimeRangeExpression(Function<ProductSearchTimeRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchTimeRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchTimeRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchTimeRangeExpression>";
            }
        };
    }
}
