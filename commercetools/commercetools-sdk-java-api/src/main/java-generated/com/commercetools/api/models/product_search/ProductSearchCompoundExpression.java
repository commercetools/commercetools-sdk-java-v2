
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchCompoundExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchCompoundExpression productSearchCompoundExpression = ProductSearchCompoundExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchCompoundExpressionImpl.class)
public interface ProductSearchCompoundExpression extends ProductSearchQuery {

    /**
     * factory method
     * @return instance of ProductSearchCompoundExpression
     */
    public static ProductSearchCompoundExpression of() {
        return new ProductSearchCompoundExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchCompoundExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchCompoundExpression of(final ProductSearchCompoundExpression template) {
        ProductSearchCompoundExpressionImpl instance = new ProductSearchCompoundExpressionImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchCompoundExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchCompoundExpression deepCopy(@Nullable final ProductSearchCompoundExpression template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchAndExpression) {
            return com.commercetools.api.models.product_search.ProductSearchAndExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchAndExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchFilterExpression) {
            return com.commercetools.api.models.product_search.ProductSearchFilterExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchFilterExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchNotExpression) {
            return com.commercetools.api.models.product_search.ProductSearchNotExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchNotExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchOrExpression) {
            return com.commercetools.api.models.product_search.ProductSearchOrExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchOrExpression) template);
        }
        ProductSearchCompoundExpressionImpl instance = new ProductSearchCompoundExpressionImpl();
        return instance;
    }

    /**
     * builder factory method for ProductSearchCompoundExpression
     * @return builder
     */
    public static ProductSearchCompoundExpressionBuilder builder() {
        return ProductSearchCompoundExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchCompoundExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchCompoundExpressionBuilder builder(final ProductSearchCompoundExpression template) {
        return ProductSearchCompoundExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchCompoundExpression(Function<ProductSearchCompoundExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchCompoundExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchCompoundExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchCompoundExpression>";
            }
        };
    }
}
