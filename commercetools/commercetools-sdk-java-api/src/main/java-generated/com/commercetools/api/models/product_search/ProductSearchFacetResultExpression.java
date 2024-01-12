
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetResultExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFacetResultExpression productSearchFacetResultExpression = ProductSearchFacetResultExpression.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFacetResultExpressionImpl.class)
public interface ProductSearchFacetResultExpression {

    /**
     *  <p>Name of the facet.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the facet.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of ProductSearchFacetResultExpression
     */
    public static ProductSearchFacetResultExpression of() {
        return new ProductSearchFacetResultExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFacetResultExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFacetResultExpression of(final ProductSearchFacetResultExpression template) {
        ProductSearchFacetResultExpressionImpl instance = new ProductSearchFacetResultExpressionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFacetResultExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFacetResultExpression deepCopy(
            @Nullable final ProductSearchFacetResultExpression template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchFacetBucketResult) {
            return com.commercetools.api.models.product_search.ProductSearchFacetBucketResult
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchFacetBucketResult) template);
        }
        if (template instanceof com.commercetools.api.models.product_search.ProductSearchFacetResultCount) {
            return com.commercetools.api.models.product_search.ProductSearchFacetResultCount
                    .deepCopy((com.commercetools.api.models.product_search.ProductSearchFacetResultCount) template);
        }
        ProductSearchFacetResultExpressionImpl instance = new ProductSearchFacetResultExpressionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ProductSearchFacetResultExpression
     * @return builder
     */
    public static ProductSearchFacetResultExpressionBuilder builder() {
        return ProductSearchFacetResultExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchFacetResultExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFacetResultExpressionBuilder builder(final ProductSearchFacetResultExpression template) {
        return ProductSearchFacetResultExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFacetResultExpression(Function<ProductSearchFacetResultExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResultExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFacetResultExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFacetResultExpression>";
            }
        };
    }
}
