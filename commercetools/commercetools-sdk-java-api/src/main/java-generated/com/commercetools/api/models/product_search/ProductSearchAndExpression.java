
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
 * ProductSearchAndExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchAndExpression productSearchAndExpression = ProductSearchAndExpression.builder()
 *             .plusAnd(andBuilder -> andBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchAndExpressionImpl.class)
public interface ProductSearchAndExpression extends ProductSearchCompoundExpression {

    /**
     *
     * @return and
     */
    @NotNull
    @Valid
    @JsonProperty("and")
    public List<ProductSearchQuery> getAnd();

    /**
     * set and
     * @param and values to be set
     */

    @JsonIgnore
    public void setAnd(final ProductSearchQuery... and);

    /**
     * set and
     * @param and values to be set
     */

    public void setAnd(final List<ProductSearchQuery> and);

    /**
     * factory method
     * @return instance of ProductSearchAndExpression
     */
    public static ProductSearchAndExpression of() {
        return new ProductSearchAndExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchAndExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchAndExpression of(final ProductSearchAndExpression template) {
        ProductSearchAndExpressionImpl instance = new ProductSearchAndExpressionImpl();
        instance.setAnd(template.getAnd());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchAndExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchAndExpression deepCopy(@Nullable final ProductSearchAndExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchAndExpressionImpl instance = new ProductSearchAndExpressionImpl();
        instance.setAnd(Optional.ofNullable(template.getAnd())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchQuery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSearchAndExpression
     * @return builder
     */
    public static ProductSearchAndExpressionBuilder builder() {
        return ProductSearchAndExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchAndExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchAndExpressionBuilder builder(final ProductSearchAndExpression template) {
        return ProductSearchAndExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchAndExpression(Function<ProductSearchAndExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchAndExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchAndExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchAndExpression>";
            }
        };
    }
}
