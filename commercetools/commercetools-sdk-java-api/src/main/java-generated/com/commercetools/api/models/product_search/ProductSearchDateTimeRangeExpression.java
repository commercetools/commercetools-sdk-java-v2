
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
 * ProductSearchDateTimeRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchDateTimeRangeExpression productSearchDateTimeRangeExpression = ProductSearchDateTimeRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchDateTimeRangeExpressionImpl.class)
public interface ProductSearchDateTimeRangeExpression extends ProductSearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public ProductSearchDateTimeRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final ProductSearchDateTimeRangeValue range);

    /**
     * factory method
     * @return instance of ProductSearchDateTimeRangeExpression
     */
    public static ProductSearchDateTimeRangeExpression of() {
        return new ProductSearchDateTimeRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchDateTimeRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchDateTimeRangeExpression of(final ProductSearchDateTimeRangeExpression template) {
        ProductSearchDateTimeRangeExpressionImpl instance = new ProductSearchDateTimeRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchDateTimeRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchDateTimeRangeExpression deepCopy(
            @Nullable final ProductSearchDateTimeRangeExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchDateTimeRangeExpressionImpl instance = new ProductSearchDateTimeRangeExpressionImpl();
        instance.setRange(
            com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchDateTimeRangeExpression
     * @return builder
     */
    public static ProductSearchDateTimeRangeExpressionBuilder builder() {
        return ProductSearchDateTimeRangeExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchDateTimeRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchDateTimeRangeExpressionBuilder builder(
            final ProductSearchDateTimeRangeExpression template) {
        return ProductSearchDateTimeRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchDateTimeRangeExpression(Function<ProductSearchDateTimeRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchDateTimeRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchDateTimeRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchDateTimeRangeExpression>";
            }
        };
    }
}
