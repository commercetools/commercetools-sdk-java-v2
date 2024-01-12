
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
 * ProductSearchNotExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchNotExpression productSearchNotExpression = ProductSearchNotExpression.builder()
 *             .plusNot(notBuilder -> notBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchNotExpressionImpl.class)
public interface ProductSearchNotExpression extends ProductSearchCompoundExpression {

    /**
     *
     * @return not
     */
    @NotNull
    @Valid
    @JsonProperty("not")
    public List<ProductSearchQuery> getNot();

    /**
     * set not
     * @param not values to be set
     */

    @JsonIgnore
    public void setNot(final ProductSearchQuery... not);

    /**
     * set not
     * @param not values to be set
     */

    public void setNot(final List<ProductSearchQuery> not);

    /**
     * factory method
     * @return instance of ProductSearchNotExpression
     */
    public static ProductSearchNotExpression of() {
        return new ProductSearchNotExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchNotExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchNotExpression of(final ProductSearchNotExpression template) {
        ProductSearchNotExpressionImpl instance = new ProductSearchNotExpressionImpl();
        instance.setNot(template.getNot());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchNotExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchNotExpression deepCopy(@Nullable final ProductSearchNotExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchNotExpressionImpl instance = new ProductSearchNotExpressionImpl();
        instance.setNot(Optional.ofNullable(template.getNot())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchQuery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSearchNotExpression
     * @return builder
     */
    public static ProductSearchNotExpressionBuilder builder() {
        return ProductSearchNotExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchNotExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchNotExpressionBuilder builder(final ProductSearchNotExpression template) {
        return ProductSearchNotExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchNotExpression(Function<ProductSearchNotExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchNotExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchNotExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchNotExpression>";
            }
        };
    }
}
