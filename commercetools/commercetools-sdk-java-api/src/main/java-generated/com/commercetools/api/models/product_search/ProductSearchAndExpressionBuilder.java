
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchAndExpressionBuilder
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
public class ProductSearchAndExpressionBuilder implements Builder<ProductSearchAndExpression> {

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> and;

    /**
     * set values to the and
     * @param and value to be set
     * @return Builder
     */

    public ProductSearchAndExpressionBuilder and(
            final com.commercetools.api.models.product_search.ProductSearchQuery... and) {
        this.and = new ArrayList<>(Arrays.asList(and));
        return this;
    }

    /**
     * set value to the and
     * @param and value to be set
     * @return Builder
     */

    public ProductSearchAndExpressionBuilder and(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> and) {
        this.and = and;
        return this;
    }

    /**
     * add values to the and
     * @param and value to be set
     * @return Builder
     */

    public ProductSearchAndExpressionBuilder plusAnd(
            final com.commercetools.api.models.product_search.ProductSearchQuery... and) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.addAll(Arrays.asList(and));
        return this;
    }

    /**
     * add the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */

    public ProductSearchAndExpressionBuilder plusAnd(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQueryBuilder> builder) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.add(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */

    public ProductSearchAndExpressionBuilder withAnd(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQueryBuilder> builder) {
        this.and = new ArrayList<>();
        this.and.add(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */

    public ProductSearchAndExpressionBuilder addAnd(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQuery> builder) {
        return plusAnd(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()));
    }

    /**
     * set the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */

    public ProductSearchAndExpressionBuilder setAnd(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQuery> builder) {
        return and(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()));
    }

    /**
     * value of and}
     * @return and
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> getAnd() {
        return this.and;
    }

    /**
     * builds ProductSearchAndExpression with checking for non-null required values
     * @return ProductSearchAndExpression
     */
    public ProductSearchAndExpression build() {
        Objects.requireNonNull(and, ProductSearchAndExpression.class + ": and is missing");
        return new ProductSearchAndExpressionImpl(and);
    }

    /**
     * builds ProductSearchAndExpression without checking for non-null required values
     * @return ProductSearchAndExpression
     */
    public ProductSearchAndExpression buildUnchecked() {
        return new ProductSearchAndExpressionImpl(and);
    }

    /**
     * factory method for an instance of ProductSearchAndExpressionBuilder
     * @return builder
     */
    public static ProductSearchAndExpressionBuilder of() {
        return new ProductSearchAndExpressionBuilder();
    }

    /**
     * create builder for ProductSearchAndExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchAndExpressionBuilder of(final ProductSearchAndExpression template) {
        ProductSearchAndExpressionBuilder builder = new ProductSearchAndExpressionBuilder();
        builder.and = template.getAnd();
        return builder;
    }

}
