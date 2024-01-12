
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
 * ProductSearchSuggestionCompletionExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchSuggestionCompletionExpression productSearchSuggestionCompletionExpression = ProductSearchSuggestionCompletionExpression.builder()
 *             .completion(completionBuilder -> completionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchSuggestionCompletionExpressionImpl.class)
public interface ProductSearchSuggestionCompletionExpression extends ProductSearchSuggestionExpression {

    /**
     *
     * @return completion
     */
    @NotNull
    @Valid
    @JsonProperty("completion")
    public ProductSearchSuggestionCompletionExpressionValue getCompletion();

    /**
     * set completion
     * @param completion value to be set
     */

    public void setCompletion(final ProductSearchSuggestionCompletionExpressionValue completion);

    /**
     * factory method
     * @return instance of ProductSearchSuggestionCompletionExpression
     */
    public static ProductSearchSuggestionCompletionExpression of() {
        return new ProductSearchSuggestionCompletionExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchSuggestionCompletionExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchSuggestionCompletionExpression of(
            final ProductSearchSuggestionCompletionExpression template) {
        ProductSearchSuggestionCompletionExpressionImpl instance = new ProductSearchSuggestionCompletionExpressionImpl();
        instance.setCompletion(template.getCompletion());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchSuggestionCompletionExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchSuggestionCompletionExpression deepCopy(
            @Nullable final ProductSearchSuggestionCompletionExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchSuggestionCompletionExpressionImpl instance = new ProductSearchSuggestionCompletionExpressionImpl();
        instance.setCompletion(
            com.commercetools.api.models.product_search.ProductSearchSuggestionCompletionExpressionValue
                    .deepCopy(template.getCompletion()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchSuggestionCompletionExpression
     * @return builder
     */
    public static ProductSearchSuggestionCompletionExpressionBuilder builder() {
        return ProductSearchSuggestionCompletionExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchSuggestionCompletionExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchSuggestionCompletionExpressionBuilder builder(
            final ProductSearchSuggestionCompletionExpression template) {
        return ProductSearchSuggestionCompletionExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchSuggestionCompletionExpression(
            Function<ProductSearchSuggestionCompletionExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchSuggestionCompletionExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchSuggestionCompletionExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchSuggestionCompletionExpression>";
            }
        };
    }
}
