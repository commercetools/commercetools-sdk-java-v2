
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
 * ProductSearchWildCardExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchWildCardExpression productSearchWildCardExpression = ProductSearchWildCardExpression.builder()
 *             .wildcard(wildcardBuilder -> wildcardBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchWildCardExpressionImpl.class)
public interface ProductSearchWildCardExpression extends ProductSearchQueryExpression {

    /**
     *
     * @return wildcard
     */
    @NotNull
    @Valid
    @JsonProperty("wildcard")
    public ProductSearchAnyValue getWildcard();

    /**
     * set wildcard
     * @param wildcard value to be set
     */

    public void setWildcard(final ProductSearchAnyValue wildcard);

    /**
     * factory method
     * @return instance of ProductSearchWildCardExpression
     */
    public static ProductSearchWildCardExpression of() {
        return new ProductSearchWildCardExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchWildCardExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchWildCardExpression of(final ProductSearchWildCardExpression template) {
        ProductSearchWildCardExpressionImpl instance = new ProductSearchWildCardExpressionImpl();
        instance.setWildcard(template.getWildcard());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchWildCardExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchWildCardExpression deepCopy(@Nullable final ProductSearchWildCardExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchWildCardExpressionImpl instance = new ProductSearchWildCardExpressionImpl();
        instance.setWildcard(
            com.commercetools.api.models.product_search.ProductSearchAnyValue.deepCopy(template.getWildcard()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchWildCardExpression
     * @return builder
     */
    public static ProductSearchWildCardExpressionBuilder builder() {
        return ProductSearchWildCardExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchWildCardExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchWildCardExpressionBuilder builder(final ProductSearchWildCardExpression template) {
        return ProductSearchWildCardExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchWildCardExpression(Function<ProductSearchWildCardExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchWildCardExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchWildCardExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchWildCardExpression>";
            }
        };
    }
}
