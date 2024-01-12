
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchSuggestionCompletionExpressionValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchSuggestionCompletionExpressionValue productSearchSuggestionCompletionExpressionValue = ProductSearchSuggestionCompletionExpressionValue.builder()
 *             .name("{name}")
 *             .field("{field}")
 *             .prefix("{prefix}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchSuggestionCompletionExpressionValueImpl.class)
public interface ProductSearchSuggestionCompletionExpressionValue extends ProductSearchSuggestionExpressionValue {

    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *
     * @return prefix
     */
    @NotNull
    @JsonProperty("prefix")
    public String getPrefix();

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * set field
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     * set prefix
     * @param prefix value to be set
     */

    public void setPrefix(final String prefix);

    /**
     * factory method
     * @return instance of ProductSearchSuggestionCompletionExpressionValue
     */
    public static ProductSearchSuggestionCompletionExpressionValue of() {
        return new ProductSearchSuggestionCompletionExpressionValueImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchSuggestionCompletionExpressionValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchSuggestionCompletionExpressionValue of(
            final ProductSearchSuggestionCompletionExpressionValue template) {
        ProductSearchSuggestionCompletionExpressionValueImpl instance = new ProductSearchSuggestionCompletionExpressionValueImpl();
        instance.setName(template.getName());
        instance.setField(template.getField());
        instance.setPrefix(template.getPrefix());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchSuggestionCompletionExpressionValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchSuggestionCompletionExpressionValue deepCopy(
            @Nullable final ProductSearchSuggestionCompletionExpressionValue template) {
        if (template == null) {
            return null;
        }
        ProductSearchSuggestionCompletionExpressionValueImpl instance = new ProductSearchSuggestionCompletionExpressionValueImpl();
        instance.setName(template.getName());
        instance.setField(template.getField());
        instance.setPrefix(template.getPrefix());
        return instance;
    }

    /**
     * builder factory method for ProductSearchSuggestionCompletionExpressionValue
     * @return builder
     */
    public static ProductSearchSuggestionCompletionExpressionValueBuilder builder() {
        return ProductSearchSuggestionCompletionExpressionValueBuilder.of();
    }

    /**
     * create builder for ProductSearchSuggestionCompletionExpressionValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchSuggestionCompletionExpressionValueBuilder builder(
            final ProductSearchSuggestionCompletionExpressionValue template) {
        return ProductSearchSuggestionCompletionExpressionValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchSuggestionCompletionExpressionValue(
            Function<ProductSearchSuggestionCompletionExpressionValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchSuggestionCompletionExpressionValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchSuggestionCompletionExpressionValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchSuggestionCompletionExpressionValue>";
            }
        };
    }
}
