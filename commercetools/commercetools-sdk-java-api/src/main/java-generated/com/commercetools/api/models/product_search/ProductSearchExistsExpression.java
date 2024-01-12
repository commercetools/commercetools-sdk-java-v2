
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
 * ProductSearchExistsExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchExistsExpression productSearchExistsExpression = ProductSearchExistsExpression.builder()
 *             .exists(existsBuilder -> existsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchExistsExpressionImpl.class)
public interface ProductSearchExistsExpression extends ProductSearchQueryExpression {

    /**
     *
     * @return exists
     */
    @NotNull
    @Valid
    @JsonProperty("exists")
    public ProductSearchExistsValue getExists();

    /**
     * set exists
     * @param exists value to be set
     */

    public void setExists(final ProductSearchExistsValue exists);

    /**
     * factory method
     * @return instance of ProductSearchExistsExpression
     */
    public static ProductSearchExistsExpression of() {
        return new ProductSearchExistsExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchExistsExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchExistsExpression of(final ProductSearchExistsExpression template) {
        ProductSearchExistsExpressionImpl instance = new ProductSearchExistsExpressionImpl();
        instance.setExists(template.getExists());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchExistsExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchExistsExpression deepCopy(@Nullable final ProductSearchExistsExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchExistsExpressionImpl instance = new ProductSearchExistsExpressionImpl();
        instance.setExists(
            com.commercetools.api.models.product_search.ProductSearchExistsValue.deepCopy(template.getExists()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchExistsExpression
     * @return builder
     */
    public static ProductSearchExistsExpressionBuilder builder() {
        return ProductSearchExistsExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchExistsExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchExistsExpressionBuilder builder(final ProductSearchExistsExpression template) {
        return ProductSearchExistsExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchExistsExpression(Function<ProductSearchExistsExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchExistsExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchExistsExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchExistsExpression>";
            }
        };
    }
}
