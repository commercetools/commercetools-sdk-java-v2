
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductSearchFacetDistinctExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetDistinctExpression productSearchFacetDistinctExpression = ProductSearchFacetDistinctExpression.builder()
 *             .distinct(distinctBuilder -> distinctBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetDistinctExpressionImpl.class)
public interface ProductSearchFacetDistinctExpression extends ProductSearchFacetExpression {

    /**
     *  <p>Definition of the distinct facet.</p>
     * @return distinct
     */
    @NotNull
    @Valid
    @JsonProperty("distinct")
    public ProductSearchFacetDistinctValue getDistinct();

    /**
     *  <p>Definition of the distinct facet.</p>
     * @param distinct value to be set
     */

    public void setDistinct(final ProductSearchFacetDistinctValue distinct);

    /**
     * factory method
     * @return instance of ProductSearchFacetDistinctExpression
     */
    public static ProductSearchFacetDistinctExpression of() {
        return new ProductSearchFacetDistinctExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetDistinctExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetDistinctExpression of(final ProductSearchFacetDistinctExpression template) {
        ProductSearchFacetDistinctExpressionImpl instance = new ProductSearchFacetDistinctExpressionImpl();
        instance.setDistinct(template.getDistinct());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetDistinctExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetDistinctExpression deepCopy(
            @Nullable final ProductSearchFacetDistinctExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetDistinctExpressionImpl instance = new ProductSearchFacetDistinctExpressionImpl();
        instance.setDistinct(com.commercetools.api.models.product_search.ProductSearchFacetDistinctValue
                .deepCopy(template.getDistinct()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetDistinctExpression
     * @return builder
     */
    public static ProductSearchFacetDistinctExpressionBuilder builder() {
        return ProductSearchFacetDistinctExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetDistinctExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetDistinctExpressionBuilder builder(
            final ProductSearchFacetDistinctExpression template) {
        return ProductSearchFacetDistinctExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetDistinctExpression(Function<ProductSearchFacetDistinctExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetDistinctExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetDistinctExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetDistinctExpression>";
            }
        };
    }
}
