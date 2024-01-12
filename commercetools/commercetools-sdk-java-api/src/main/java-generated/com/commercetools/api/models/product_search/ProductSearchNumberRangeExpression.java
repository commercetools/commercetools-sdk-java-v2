
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
 * ProductSearchNumberRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchNumberRangeExpression productSearchNumberRangeExpression = ProductSearchNumberRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchNumberRangeExpressionImpl.class)
public interface ProductSearchNumberRangeExpression extends ProductSearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public ProductSearchNumberRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final ProductSearchNumberRangeValue range);

    /**
     * factory method
     * @return instance of ProductSearchNumberRangeExpression
     */
    public static ProductSearchNumberRangeExpression of() {
        return new ProductSearchNumberRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchNumberRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchNumberRangeExpression of(final ProductSearchNumberRangeExpression template) {
        ProductSearchNumberRangeExpressionImpl instance = new ProductSearchNumberRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchNumberRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchNumberRangeExpression deepCopy(
            @Nullable final ProductSearchNumberRangeExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchNumberRangeExpressionImpl instance = new ProductSearchNumberRangeExpressionImpl();
        instance.setRange(
            com.commercetools.api.models.product_search.ProductSearchNumberRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchNumberRangeExpression
     * @return builder
     */
    public static ProductSearchNumberRangeExpressionBuilder builder() {
        return ProductSearchNumberRangeExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchNumberRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchNumberRangeExpressionBuilder builder(final ProductSearchNumberRangeExpression template) {
        return ProductSearchNumberRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchNumberRangeExpression(Function<ProductSearchNumberRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchNumberRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchNumberRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchNumberRangeExpression>";
            }
        };
    }
}
