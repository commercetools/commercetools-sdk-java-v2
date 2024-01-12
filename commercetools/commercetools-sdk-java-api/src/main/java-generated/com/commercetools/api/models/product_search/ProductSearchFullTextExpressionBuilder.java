
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFullTextExpressionBuilder
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
public class ProductSearchFullTextExpressionBuilder implements Builder<ProductSearchFullTextExpression> {

    private com.commercetools.api.models.product_search.ProductSearchFullTextValue fullText;

    /**
     * set the value to the fullText using the builder function
     * @param builder function to build the fullText value
     * @return Builder
     */

    public ProductSearchFullTextExpressionBuilder fullText(
            Function<com.commercetools.api.models.product_search.ProductSearchFullTextValueBuilder, com.commercetools.api.models.product_search.ProductSearchFullTextValueBuilder> builder) {
        this.fullText = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchFullTextValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the fullText using the builder function
     * @param builder function to build the fullText value
     * @return Builder
     */

    public ProductSearchFullTextExpressionBuilder withFullText(
            Function<com.commercetools.api.models.product_search.ProductSearchFullTextValueBuilder, com.commercetools.api.models.product_search.ProductSearchFullTextValue> builder) {
        this.fullText = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchFullTextValueBuilder.of());
        return this;
    }

    /**
     * set the value to the fullText
     * @param fullText value to be set
     * @return Builder
     */

    public ProductSearchFullTextExpressionBuilder fullText(
            final com.commercetools.api.models.product_search.ProductSearchFullTextValue fullText) {
        this.fullText = fullText;
        return this;
    }

    /**
     * value of fullText}
     * @return fullText
     */

    public com.commercetools.api.models.product_search.ProductSearchFullTextValue getFullText() {
        return this.fullText;
    }

    /**
     * builds ProductSearchFullTextExpression with checking for non-null required values
     * @return ProductSearchFullTextExpression
     */
    public ProductSearchFullTextExpression build() {
        Objects.requireNonNull(fullText, ProductSearchFullTextExpression.class + ": fullText is missing");
        return new ProductSearchFullTextExpressionImpl(fullText);
    }

    /**
     * builds ProductSearchFullTextExpression without checking for non-null required values
     * @return ProductSearchFullTextExpression
     */
    public ProductSearchFullTextExpression buildUnchecked() {
        return new ProductSearchFullTextExpressionImpl(fullText);
    }

    /**
     * factory method for an instance of ProductSearchFullTextExpressionBuilder
     * @return builder
     */
    public static ProductSearchFullTextExpressionBuilder of() {
        return new ProductSearchFullTextExpressionBuilder();
    }

    /**
     * create builder for ProductSearchFullTextExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchFullTextExpressionBuilder of(final ProductSearchFullTextExpression template) {
        ProductSearchFullTextExpressionBuilder builder = new ProductSearchFullTextExpressionBuilder();
        builder.fullText = template.getFullText();
        return builder;
    }

}
