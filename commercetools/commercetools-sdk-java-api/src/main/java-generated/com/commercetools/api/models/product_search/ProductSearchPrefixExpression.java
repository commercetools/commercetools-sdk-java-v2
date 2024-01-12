
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
 * ProductSearchPrefixExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchPrefixExpression productSearchPrefixExpression = ProductSearchPrefixExpression.builder()
 *             .prefix(prefixBuilder -> prefixBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchPrefixExpressionImpl.class)
public interface ProductSearchPrefixExpression extends ProductSearchQueryExpression {

    /**
     *
     * @return prefix
     */
    @NotNull
    @Valid
    @JsonProperty("prefix")
    public ProductSearchAnyValue getPrefix();

    /**
     * set prefix
     * @param prefix value to be set
     */

    public void setPrefix(final ProductSearchAnyValue prefix);

    /**
     * factory method
     * @return instance of ProductSearchPrefixExpression
     */
    public static ProductSearchPrefixExpression of() {
        return new ProductSearchPrefixExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchPrefixExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchPrefixExpression of(final ProductSearchPrefixExpression template) {
        ProductSearchPrefixExpressionImpl instance = new ProductSearchPrefixExpressionImpl();
        instance.setPrefix(template.getPrefix());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchPrefixExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchPrefixExpression deepCopy(@Nullable final ProductSearchPrefixExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchPrefixExpressionImpl instance = new ProductSearchPrefixExpressionImpl();
        instance.setPrefix(
            com.commercetools.api.models.product_search.ProductSearchAnyValue.deepCopy(template.getPrefix()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchPrefixExpression
     * @return builder
     */
    public static ProductSearchPrefixExpressionBuilder builder() {
        return ProductSearchPrefixExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchPrefixExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchPrefixExpressionBuilder builder(final ProductSearchPrefixExpression template) {
        return ProductSearchPrefixExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchPrefixExpression(Function<ProductSearchPrefixExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchPrefixExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchPrefixExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchPrefixExpression>";
            }
        };
    }
}
