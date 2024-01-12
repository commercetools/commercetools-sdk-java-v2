
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
 * ProductSearchExactExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchExactExpression productSearchExactExpression = ProductSearchExactExpression.builder()
 *             .exact(exactBuilder -> exactBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchExactExpressionImpl.class)
public interface ProductSearchExactExpression extends ProductSearchQueryExpression {

    /**
     *
     * @return exact
     */
    @NotNull
    @Valid
    @JsonProperty("exact")
    public ProductSearchAnyValue getExact();

    /**
     * set exact
     * @param exact value to be set
     */

    public void setExact(final ProductSearchAnyValue exact);

    /**
     * factory method
     * @return instance of ProductSearchExactExpression
     */
    public static ProductSearchExactExpression of() {
        return new ProductSearchExactExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchExactExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchExactExpression of(final ProductSearchExactExpression template) {
        ProductSearchExactExpressionImpl instance = new ProductSearchExactExpressionImpl();
        instance.setExact(template.getExact());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchExactExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchExactExpression deepCopy(@Nullable final ProductSearchExactExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchExactExpressionImpl instance = new ProductSearchExactExpressionImpl();
        instance.setExact(
            com.commercetools.api.models.product_search.ProductSearchAnyValue.deepCopy(template.getExact()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchExactExpression
     * @return builder
     */
    public static ProductSearchExactExpressionBuilder builder() {
        return ProductSearchExactExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchExactExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchExactExpressionBuilder builder(final ProductSearchExactExpression template) {
        return ProductSearchExactExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchExactExpression(Function<ProductSearchExactExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchExactExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchExactExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchExactExpression>";
            }
        };
    }
}
