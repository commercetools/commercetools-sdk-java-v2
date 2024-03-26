
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetExpression productSearchFacetExpression = ProductSearchFacetExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetExpressionImpl.class)
public interface ProductSearchFacetExpression {

    /**
     * factory method
     * @return instance of ProductSearchFacetExpression
     */
    public static ProductSearchFacetExpression of() {
        return new ProductSearchFacetExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetExpression of(final ProductSearchFacetExpression template) {
        ProductSearchFacetExpressionImpl instance = new ProductSearchFacetExpressionImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetExpression deepCopy(@Nullable final ProductSearchFacetExpression template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchFacetCountExpression) {
            return com.commercetools.api.models.product_search.ProductSearchFacetCountExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchFacetCountExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchFacetDistinctExpression) {
            return com.commercetools.api.models.product_search.ProductSearchFacetDistinctExpression.deepCopy(
                (com.commercetools.api.models.product_search.ProductSearchFacetDistinctExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchFacetRangesExpression) {
            return com.commercetools.api.models.product_search.ProductSearchFacetRangesExpression.deepCopy(
                (com.commercetools.api.models.product_search.ProductSearchFacetRangesExpression) template);
        }
        ProductSearchFacetExpressionImpl instance = new ProductSearchFacetExpressionImpl();
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetExpression
     * @return builder
     */
    public static ProductSearchFacetExpressionBuilder builder() {
        return ProductSearchFacetExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetExpressionBuilder builder(final ProductSearchFacetExpression template) {
        return ProductSearchFacetExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetExpression(Function<ProductSearchFacetExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetExpression>";
            }
        };
    }
}
