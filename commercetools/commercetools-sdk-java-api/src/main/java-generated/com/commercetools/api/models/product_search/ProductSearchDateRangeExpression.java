
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
 * ProductSearchDateRangeExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchDateRangeExpression productSearchDateRangeExpression = ProductSearchDateRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchDateRangeExpressionImpl.class)
public interface ProductSearchDateRangeExpression extends ProductSearchQueryExpression {

    /**
     *
     * @return range
     */
    @NotNull
    @Valid
    @JsonProperty("range")
    public ProductSearchDateRangeValue getRange();

    /**
     * set range
     * @param range value to be set
     */

    public void setRange(final ProductSearchDateRangeValue range);

    /**
     * factory method
     * @return instance of ProductSearchDateRangeExpression
     */
    public static ProductSearchDateRangeExpression of() {
        return new ProductSearchDateRangeExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchDateRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchDateRangeExpression of(final ProductSearchDateRangeExpression template) {
        ProductSearchDateRangeExpressionImpl instance = new ProductSearchDateRangeExpressionImpl();
        instance.setRange(template.getRange());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchDateRangeExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchDateRangeExpression deepCopy(@Nullable final ProductSearchDateRangeExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchDateRangeExpressionImpl instance = new ProductSearchDateRangeExpressionImpl();
        instance.setRange(
            com.commercetools.api.models.product_search.ProductSearchDateRangeValue.deepCopy(template.getRange()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchDateRangeExpression
     * @return builder
     */
    public static ProductSearchDateRangeExpressionBuilder builder() {
        return ProductSearchDateRangeExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchDateRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchDateRangeExpressionBuilder builder(final ProductSearchDateRangeExpression template) {
        return ProductSearchDateRangeExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchDateRangeExpression(Function<ProductSearchDateRangeExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchDateRangeExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchDateRangeExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchDateRangeExpression>";
            }
        };
    }
}
