
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchOrExpressionBuilder
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
public class ProductSearchOrExpressionBuilder implements Builder<ProductSearchOrExpression> {

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> or;

    /**
     * set values to the or
     * @param or value to be set
     * @return Builder
     */

    public ProductSearchOrExpressionBuilder or(
            final com.commercetools.api.models.product_search.ProductSearchQuery... or) {
        this.or = new ArrayList<>(Arrays.asList(or));
        return this;
    }

    /**
     * set value to the or
     * @param or value to be set
     * @return Builder
     */

    public ProductSearchOrExpressionBuilder or(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> or) {
        this.or = or;
        return this;
    }

    /**
     * add values to the or
     * @param or value to be set
     * @return Builder
     */

    public ProductSearchOrExpressionBuilder plusOr(
            final com.commercetools.api.models.product_search.ProductSearchQuery... or) {
        if (this.or == null) {
            this.or = new ArrayList<>();
        }
        this.or.addAll(Arrays.asList(or));
        return this;
    }

    /**
     * add the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */

    public ProductSearchOrExpressionBuilder plusOr(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQueryBuilder> builder) {
        if (this.or == null) {
            this.or = new ArrayList<>();
        }
        this.or.add(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */

    public ProductSearchOrExpressionBuilder withOr(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQueryBuilder> builder) {
        this.or = new ArrayList<>();
        this.or.add(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */

    public ProductSearchOrExpressionBuilder addOr(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQuery> builder) {
        return plusOr(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()));
    }

    /**
     * set the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */

    public ProductSearchOrExpressionBuilder setOr(
            Function<com.commercetools.api.models.product_search.ProductSearchQueryBuilder, com.commercetools.api.models.product_search.ProductSearchQuery> builder) {
        return or(builder.apply(com.commercetools.api.models.product_search.ProductSearchQueryBuilder.of()));
    }

    /**
     * value of or}
     * @return or
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchQuery> getOr() {
        return this.or;
    }

    /**
     * builds ProductSearchOrExpression with checking for non-null required values
     * @return ProductSearchOrExpression
     */
    public ProductSearchOrExpression build() {
        Objects.requireNonNull(or, ProductSearchOrExpression.class + ": or is missing");
        return new ProductSearchOrExpressionImpl(or);
    }

    /**
     * builds ProductSearchOrExpression without checking for non-null required values
     * @return ProductSearchOrExpression
     */
    public ProductSearchOrExpression buildUnchecked() {
        return new ProductSearchOrExpressionImpl(or);
    }

    /**
     * factory method for an instance of ProductSearchOrExpressionBuilder
     * @return builder
     */
    public static ProductSearchOrExpressionBuilder of() {
        return new ProductSearchOrExpressionBuilder();
    }

    /**
     * create builder for ProductSearchOrExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchOrExpressionBuilder of(final ProductSearchOrExpression template) {
        ProductSearchOrExpressionBuilder builder = new ProductSearchOrExpressionBuilder();
        builder.or = template.getOr();
        return builder;
    }

}
