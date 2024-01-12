
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchSuggestionExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchSuggestionExpression productSearchSuggestionExpression = ProductSearchSuggestionExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchSuggestionExpressionImpl.class)
public interface ProductSearchSuggestionExpression {

    /**
     * factory method
     * @return instance of ProductSearchSuggestionExpression
     */
    public static ProductSearchSuggestionExpression of() {
        return new ProductSearchSuggestionExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchSuggestionExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchSuggestionExpression of(final ProductSearchSuggestionExpression template) {
        ProductSearchSuggestionExpressionImpl instance = new ProductSearchSuggestionExpressionImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchSuggestionExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchSuggestionExpression deepCopy(
            @Nullable final ProductSearchSuggestionExpression template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpression) {
            return com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpression.deepCopy(
                (com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpression) template);
        }
        ProductSearchSuggestionExpressionImpl instance = new ProductSearchSuggestionExpressionImpl();
        return instance;
    }

    /**
     * builder factory method for ProductSearchSuggestionExpression
     * @return builder
     */
    public static ProductSearchSuggestionExpressionBuilder builder() {
        return ProductSearchSuggestionExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchSuggestionExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchSuggestionExpressionBuilder builder(final ProductSearchSuggestionExpression template) {
        return ProductSearchSuggestionExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchSuggestionExpression(Function<ProductSearchSuggestionExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchSuggestionExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchSuggestionExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchSuggestionExpression>";
            }
        };
    }
}
