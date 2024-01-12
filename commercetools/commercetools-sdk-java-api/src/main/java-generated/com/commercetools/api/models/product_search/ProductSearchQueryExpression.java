
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchQueryExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchQueryExpression productSearchQueryExpression = ProductSearchQueryExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchQueryExpressionImpl.class)
public interface ProductSearchQueryExpression extends ProductSearchQuery {

    /**
     * factory method
     * @return instance of ProductSearchQueryExpression
     */
    public static ProductSearchQueryExpression of() {
        return new ProductSearchQueryExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchQueryExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchQueryExpression of(final ProductSearchQueryExpression template) {
        ProductSearchQueryExpressionImpl instance = new ProductSearchQueryExpressionImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchQueryExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchQueryExpression deepCopy(@Nullable final ProductSearchQueryExpression template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchDateRangeExpression) {
            return com.commercetools.api.models.product_search.ProductSearchDateRangeExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchDateRangeExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchDateTimeRangeExpression) {
            return com.commercetools.api.models.product_search.ProductSearchDateTimeRangeExpression.deepCopy(
                (com.commercetools.api.models.product_search.ProductSearchDateTimeRangeExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchExactExpression) {
            return com.commercetools.api.models.product_search.ProductSearchExactExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchExactExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchExistsExpression) {
            return com.commercetools.api.models.product_search.ProductSearchExistsExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchExistsExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchFullTextExpression) {
            return com.commercetools.api.models.product_search.ProductSearchFullTextExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchFullTextExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchLongRangeExpression) {
            return com.commercetools.api.models.product_search.ProductSearchLongRangeExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchLongRangeExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchNumberRangeExpression) {
            return com.commercetools.api.models.product_search.ProductSearchNumberRangeExpression.deepCopy(
                (com.commercetools.api.models.product_search.ProductSearchNumberRangeExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchPrefixExpression) {
            return com.commercetools.api.models.product_search.ProductSearchPrefixExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchPrefixExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchTimeRangeExpression) {
            return com.commercetools.api.models.product_search.ProductSearchTimeRangeExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchTimeRangeExpression) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchWildCardExpression) {
            return com.commercetools.api.models.product_search.ProductSearchWildCardExpression
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchWildCardExpression) template);
        }
        ProductSearchQueryExpressionImpl instance = new ProductSearchQueryExpressionImpl();
        return instance;
    }

    /**
     * builder factory method for ProductSearchQueryExpression
     * @return builder
     */
    public static ProductSearchQueryExpressionBuilder builder() {
        return ProductSearchQueryExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchQueryExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchQueryExpressionBuilder builder(final ProductSearchQueryExpression template) {
        return ProductSearchQueryExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchQueryExpression(Function<ProductSearchQueryExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchQueryExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchQueryExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchQueryExpression>";
            }
        };
    }
}
