
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchLongRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchLongRangeExpression productSearchLongRangeExpression = ProductSearchLongRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchLongRangeExpressionBuilder implements Builder<ProductSearchLongRangeExpression> {

    private com.commercetools.api.models.product_search.ProductSearchLongRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public ProductSearchLongRangeExpressionBuilder range(
            Function<com.commercetools.api.models.product_search.ProductSearchLongRangeValueBuilder, com.commercetools.api.models.product_search.ProductSearchLongRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.product_search.ProductSearchLongRangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public ProductSearchLongRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.product_search.ProductSearchLongRangeValueBuilder, com.commercetools.api.models.product_search.ProductSearchLongRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.product_search.ProductSearchLongRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public ProductSearchLongRangeExpressionBuilder range(
            final com.commercetools.api.models.product_search.ProductSearchLongRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.product_search.ProductSearchLongRangeValue getRange() {
        return this.range;
    }

    /**
     * builds ProductSearchLongRangeExpression with checking for non-null required values
     * @return ProductSearchLongRangeExpression
     */
    public ProductSearchLongRangeExpression build() {
        Objects.requireNonNull(range, ProductSearchLongRangeExpression.class + ": range is missing");
        return new ProductSearchLongRangeExpressionImpl(range);
    }

    /**
     * builds ProductSearchLongRangeExpression without checking for non-null required values
     * @return ProductSearchLongRangeExpression
     */
    public ProductSearchLongRangeExpression buildUnchecked() {
        return new ProductSearchLongRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of ProductSearchLongRangeExpressionBuilder
     * @return builder
     */
    public static ProductSearchLongRangeExpressionBuilder of() {
        return new ProductSearchLongRangeExpressionBuilder();
    }

    /**
     * create builder for ProductSearchLongRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchLongRangeExpressionBuilder of(final ProductSearchLongRangeExpression template) {
        ProductSearchLongRangeExpressionBuilder builder = new ProductSearchLongRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
