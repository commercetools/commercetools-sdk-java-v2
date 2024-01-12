
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFilterExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFilterExpression productSearchFilterExpression = ProductSearchFilterExpression.builder()
 *             .plusFilter(filterBuilder -> filterBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFilterExpressionImpl.class)
public interface ProductSearchFilterExpression extends ProductSearchCompoundExpression {

    /**
     *
     * @return filter
     */
    @NotNull
    @Valid
    @JsonProperty("filter")
    public List<ProductSearchQueryExpression> getFilter();

    /**
     * set filter
     * @param filter values to be set
     */

    @JsonIgnore
    public void setFilter(final ProductSearchQueryExpression... filter);

    /**
     * set filter
     * @param filter values to be set
     */

    public void setFilter(final List<ProductSearchQueryExpression> filter);

    /**
     * factory method
     * @return instance of ProductSearchFilterExpression
     */
    public static ProductSearchFilterExpression of() {
        return new ProductSearchFilterExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFilterExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFilterExpression of(final ProductSearchFilterExpression template) {
        ProductSearchFilterExpressionImpl instance = new ProductSearchFilterExpressionImpl();
        instance.setFilter(template.getFilter());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFilterExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFilterExpression deepCopy(@Nullable final ProductSearchFilterExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchFilterExpressionImpl instance = new ProductSearchFilterExpressionImpl();
        instance.setFilter(Optional.ofNullable(template.getFilter())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchQueryExpression::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSearchFilterExpression
     * @return builder
     */
    public static ProductSearchFilterExpressionBuilder builder() {
        return ProductSearchFilterExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchFilterExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFilterExpressionBuilder builder(final ProductSearchFilterExpression template) {
        return ProductSearchFilterExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFilterExpression(Function<ProductSearchFilterExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFilterExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFilterExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFilterExpression>";
            }
        };
    }
}
