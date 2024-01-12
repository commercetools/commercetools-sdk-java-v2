
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
 * ProductSearchOrExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchOrExpression productSearchOrExpression = ProductSearchOrExpression.builder()
 *             .plusOr(orBuilder -> orBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchOrExpressionImpl.class)
public interface ProductSearchOrExpression extends ProductSearchCompoundExpression {

    /**
     *
     * @return or
     */
    @NotNull
    @Valid
    @JsonProperty("or")
    public List<ProductSearchQuery> getOr();

    /**
     * set or
     * @param or values to be set
     */

    @JsonIgnore
    public void setOr(final ProductSearchQuery... or);

    /**
     * set or
     * @param or values to be set
     */

    public void setOr(final List<ProductSearchQuery> or);

    /**
     * factory method
     * @return instance of ProductSearchOrExpression
     */
    public static ProductSearchOrExpression of() {
        return new ProductSearchOrExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchOrExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchOrExpression of(final ProductSearchOrExpression template) {
        ProductSearchOrExpressionImpl instance = new ProductSearchOrExpressionImpl();
        instance.setOr(template.getOr());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchOrExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchOrExpression deepCopy(@Nullable final ProductSearchOrExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchOrExpressionImpl instance = new ProductSearchOrExpressionImpl();
        instance.setOr(Optional.ofNullable(template.getOr())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchQuery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSearchOrExpression
     * @return builder
     */
    public static ProductSearchOrExpressionBuilder builder() {
        return ProductSearchOrExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchOrExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchOrExpressionBuilder builder(final ProductSearchOrExpression template) {
        return ProductSearchOrExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchOrExpression(Function<ProductSearchOrExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchOrExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchOrExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchOrExpression>";
            }
        };
    }
}
