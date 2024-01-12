
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchNotExpressionBuilder
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
public class ProductSearchNotExpressionBuilder implements Builder<ProductSearchNotExpression> {

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> not;

    /**
     * set values to the not
     * @param not value to be set
     * @return Builder
     */

    public ProductSearchNotExpressionBuilder not(
            final com.commercetools.api.models.product_search.ProductSearchQuery... not) {
        this.not = new ArrayList<>(Arrays.asList(not));
        return this;
    }

    /**
     * set value to the not
     * @param not value to be set
     * @return Builder
     */

    public ProductSearchNotExpressionBuilder not(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> not) {
        this.not = not;
        return this;
    }

    /**
     * add values to the not
     * @param not value to be set
     * @return Builder
     */

    public ProductSearchNotExpressionBuilder plusNot(
            final com.commercetools.api.models.product_search.ProductSearchQuery... not) {
        if (this.not == null) {
            this.not = new ArrayList<>();
        }
        this.not.addAll(Arrays.asList(not));
        return this;
    }

    /**
     * add the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */

    public ProductSearchNotExpressionBuilder plusNot(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQueryBuilder> builder) {
        if (this.not == null) {
            this.not = new ArrayList<>();
        }
        this.not.add(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */

    public ProductSearchNotExpressionBuilder withNot(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQueryBuilder> builder) {
        this.not = new ArrayList<>();
        this.not.add(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */

    public ProductSearchNotExpressionBuilder addNot(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQuery> builder) {
        return plusNot(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()));
    }

    /**
     * set the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */

    public ProductSearchNotExpressionBuilder setNot(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQuery> builder) {
        return not(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()));
    }

    /**
     * value of not}
     * @return not
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> getNot() {
        return this.not;
    }

    /**
     * builds ProductSearchNotExpression with checking for non-null required values
     * @return ProductSearchNotExpression
     */
    public ProductSearchNotExpression build() {
        Objects.requireNonNull(not, ProductSearchNotExpression.class + ": not is missing");
        return new ProductSearchNotExpressionImpl(not);
    }

    /**
     * builds ProductSearchNotExpression without checking for non-null required values
     * @return ProductSearchNotExpression
     */
    public ProductSearchNotExpression buildUnchecked() {
        return new ProductSearchNotExpressionImpl(not);
    }

    /**
     * factory method for an instance of ProductSearchNotExpressionBuilder
     * @return builder
     */
    public static ProductSearchNotExpressionBuilder of() {
        return new ProductSearchNotExpressionBuilder();
    }

    /**
     * create builder for ProductSearchNotExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchNotExpressionBuilder of(final ProductSearchNotExpression template) {
        ProductSearchNotExpressionBuilder builder = new ProductSearchNotExpressionBuilder();
        builder.not = template.getNot();
        return builder;
    }

}
