
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchQuery
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchQuery productSearchQuery = ProductSearchQuery.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchQueryImpl.class)
public interface ProductSearchQuery {

    /**
     * factory method
     * @return instance of ProductSearchQuery
     */
    public static ProductSearchQuery of() {
        return new ProductSearchQueryImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchQuery
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchQuery of(final ProductSearchQuery template) {
        ProductSearchQueryImpl instance = new ProductSearchQueryImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchQuery
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchQuery deepCopy(@Nullable final ProductSearchQuery template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchCompoundExpression) {
            return com.commercetools.api.models.product_search.ProductSearchCompoundExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchCompoundExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchQueryExpression) {
            return com.commercetools.api.models.product_search.ProductSearchQueryExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchQueryExpression) template);
        }
        ProductSearchQueryImpl instance = new ProductSearchQueryImpl();
        return instance;
    }

    /**
     * builder factory method for ProductSearchQuery
     * @return builder
     */
    public static ProductSearchQueryBuilder builder() {
        return ProductSearchQueryBuilder.of();
    }

    /**
     * create builder for ProductSearchQuery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchQueryBuilder builder(final ProductSearchQuery template) {
        return ProductSearchQueryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchQuery(Function<ProductSearchQuery, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchQuery> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchQuery>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchQuery>";
            }
        };
    }
}
