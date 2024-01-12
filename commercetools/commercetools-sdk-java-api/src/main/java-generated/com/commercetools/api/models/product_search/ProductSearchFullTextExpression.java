
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
 * ProductSearchFullTextExpression
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchFullTextExpression productSearchFullTextExpression = ProductSearchFullTextExpression.builder()
 *             .fullText(fullTextBuilder -> fullTextBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchFullTextExpressionImpl.class)
public interface ProductSearchFullTextExpression extends ProductSearchQueryExpression {

    /**
     *
     * @return fullText
     */
    @NotNull
    @Valid
    @JsonProperty("fullText")
    public ProductSearchFullTextValue getFullText();

    /**
     * set fullText
     * @param fullText value to be set
     */

    public void setFullText(final ProductSearchFullTextValue fullText);

    /**
     * factory method
     * @return instance of ProductSearchFullTextExpression
     */
    public static ProductSearchFullTextExpression of() {
        return new ProductSearchFullTextExpressionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchFullTextExpression
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchFullTextExpression of(final ProductSearchFullTextExpression template) {
        ProductSearchFullTextExpressionImpl instance = new ProductSearchFullTextExpressionImpl();
        instance.setFullText(template.getFullText());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchFullTextExpression
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchFullTextExpression deepCopy(@Nullable final ProductSearchFullTextExpression template) {
        if (template == null) {
            return null;
        }
        ProductSearchFullTextExpressionImpl instance = new ProductSearchFullTextExpressionImpl();
        instance.setFullText(
            com.commercetools.api.models.product_search.ProductSearchFullTextValue.deepCopy(template.getFullText()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchFullTextExpression
     * @return builder
     */
    public static ProductSearchFullTextExpressionBuilder builder() {
        return ProductSearchFullTextExpressionBuilder.of();
    }

    /**
     * create builder for ProductSearchFullTextExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFullTextExpressionBuilder builder(final ProductSearchFullTextExpression template) {
        return ProductSearchFullTextExpressionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchFullTextExpression(Function<ProductSearchFullTextExpression, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchFullTextExpression> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchFullTextExpression>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchFullTextExpression>";
            }
        };
    }
}
