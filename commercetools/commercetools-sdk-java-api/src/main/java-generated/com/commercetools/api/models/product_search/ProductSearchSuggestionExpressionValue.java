
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchSuggestionExpressionValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchSuggestionExpressionValue productSearchSuggestionExpressionValue = ProductSearchSuggestionExpressionValue.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchSuggestionExpressionValueImpl.class)
public interface ProductSearchSuggestionExpressionValue {

    /**
     * factory method
     * @return instance of ProductSearchSuggestionExpressionValue
     */
    public static ProductSearchSuggestionExpressionValue of() {
        return new ProductSearchSuggestionExpressionValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchSuggestionExpressionValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchSuggestionExpressionValue of(final ProductSearchSuggestionExpressionValue template) {
        ProductSearchSuggestionExpressionValueImpl instance = new ProductSearchSuggestionExpressionValueImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchSuggestionExpressionValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchSuggestionExpressionValue deepCopy(
            @Nullable final ProductSearchSuggestionExpressionValue template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue) {
            return com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue
                    .deepCopy(
                        (com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue) template);
        }
        ProductSearchSuggestionExpressionValueImpl instance = new ProductSearchSuggestionExpressionValueImpl();
        return instance;
    }

    /**
     * builder factory method for ProductSearchSuggestionExpressionValue
     * @return builder
     */
    public static ProductSearchSuggestionExpressionValueBuilder builder() {
        return ProductSearchSuggestionExpressionValueBuilder.of();
    }

    /**
     * create builder for ProductSearchSuggestionExpressionValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchSuggestionExpressionValueBuilder builder(
            final ProductSearchSuggestionExpressionValue template) {
        return ProductSearchSuggestionExpressionValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchSuggestionExpressionValue(
            Function<ProductSearchSuggestionExpressionValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchSuggestionExpressionValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchSuggestionExpressionValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchSuggestionExpressionValue>";
            }
        };
    }
}
