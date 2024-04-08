
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
 * ProductSearchFacetCountExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetCountExpression productSearchFacetCountExpression = ProductSearchFacetCountExpression.builder()
 *             .count(countBuilder -> countBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetCountExpressionImpl.class)
public interface ProductSearchFacetCountExpression extends ProductSearchFacetExpression {

    /**
     *  <p>Definition of the count facet.</p>
     * @return count
     */
    @NotNull
    @Valid
    @JsonProperty("count")
    public ProductSearchFacetCountValue getCount();

    /**
     *  <p>Definition of the count facet.</p>
     * @param count value to be set
     */

    public void setCount(final ProductSearchFacetCountValue count);

    /**
     * factory method
     * @return instance of ProductSearchFacetCountExpression
     */
    public static ProductSearchFacetCountExpression of() {
        return new ProductSearchFacetCountExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetCountExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetCountExpression of(final ProductSearchFacetCountExpression template) {
        ProductSearchFacetCountExpressionImpl instance = new ProductSearchFacetCountExpressionImpl();
        instance.setCount(template.getCount());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetCountExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetCountExpression deepCopy(
            @Nullable final ProductSearchFacetCountExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchFacetCountExpressionImpl instance = new ProductSearchFacetCountExpressionImpl();
        instance.setCount(
            com.commercetools.api.models.product_search.ProductSearchFacetCountValue.deepCopy(template.getCount()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetCountExpression
     * @return builder
     */
    public static ProductSearchFacetCountExpressionBuilder builder() {
        return ProductSearchFacetCountExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetCountExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetCountExpressionBuilder builder(final ProductSearchFacetCountExpression template) {
        return ProductSearchFacetCountExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetCountExpression(Function<ProductSearchFacetCountExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetCountExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetCountExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetCountExpression>";
            }
        };
    }
}
