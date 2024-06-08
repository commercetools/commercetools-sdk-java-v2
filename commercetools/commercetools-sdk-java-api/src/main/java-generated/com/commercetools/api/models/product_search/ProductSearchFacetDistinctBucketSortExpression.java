
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.search.SearchSortOrder;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProductSearchFacetDistinctBucketSortExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetDistinctBucketSortExpression productSearchFacetDistinctBucketSortExpression = ProductSearchFacetDistinctBucketSortExpression.builder()
 *             .by(ProductSearchFacetDistinctBucketSortBy.COUNT)
 *             .order(SearchSortOrder.ASC)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetDistinctBucketSortExpressionImpl.class)
public interface ProductSearchFacetDistinctBucketSortExpression {

    /**
     *  <p>Defines whether to sort by bucket count or key.</p>
     * @return by
     */
    @NotNull
    @JsonProperty("by")
    public ProductSearchFacetDistinctBucketSortBy getBy();

    /**
     *  <p>Defines the sorting order.</p>
     * @return order
     */
    @NotNull
    @JsonProperty("order")
    public SearchSortOrder getOrder();

    /**
     *  <p>Defines whether to sort by bucket count or key.</p>
     * @param by value to be set
     */

    public void setBy(final ProductSearchFacetDistinctBucketSortBy by);

    /**
     *  <p>Defines the sorting order.</p>
     * @param order value to be set
     */

    public void setOrder(final SearchSortOrder order);

    /**
     * factory method
     * @return instance of ProductSearchFacetDistinctBucketSortExpression
     */
    public static ProductSearchFacetDistinctBucketSortExpression of() {
        return new ProductSearchFacetDistinctBucketSortExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetDistinctBucketSortExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetDistinctBucketSortExpression of(
            final ProductSearchFacetDistinctBucketSortExpression template) {
        ProductSearchFacetDistinctBucketSortExpressionImpl instance = new ProductSearchFacetDistinctBucketSortExpressionImpl();
        instance.setBy(template.getBy());
        instance.setOrder(template.getOrder());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetDistinctBucketSortExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetDistinctBucketSortExpression deepCopy(
            @Nullable final ProductSearchFacetDistinctBucketSortExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetDistinctBucketSortExpressionImpl instance = new ProductSearchFacetDistinctBucketSortExpressionImpl();
        instance.setBy(template.getBy());
        instance.setOrder(template.getOrder());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetDistinctBucketSortExpression
     * @return builder
     */
    public static ProductSearchFacetDistinctBucketSortExpressionBuilder builder() {
        return ProductSearchFacetDistinctBucketSortExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetDistinctBucketSortExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetDistinctBucketSortExpressionBuilder builder(
            final ProductSearchFacetDistinctBucketSortExpression template) {
        return ProductSearchFacetDistinctBucketSortExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetDistinctBucketSortExpression(
            Function<ProductSearchFacetDistinctBucketSortExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetDistinctBucketSortExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetDistinctBucketSortExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetDistinctBucketSortExpression>";
            }
        };
    }
}
