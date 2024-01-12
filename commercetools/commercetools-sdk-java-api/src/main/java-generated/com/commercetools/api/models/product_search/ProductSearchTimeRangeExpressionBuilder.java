
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchTimeRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchTimeRangeExpression productSearchTimeRangeExpression = ProductSearchTimeRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchTimeRangeExpressionBuilder implements Builder<ProductSearchTimeRangeExpression> {

    private com.commercetools.api.models.product_search.ProductSearchTimeRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public ProductSearchTimeRangeExpressionBuilder range(
            Function<com.commercetools.api.models.product_search.ProductSearchTimeRangeValueBuilder, com.commercetools.api.models.product_search.ProductSearchTimeRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.product_search.ProductSearchTimeRangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public ProductSearchTimeRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.product_search.ProductSearchTimeRangeValueBuilder, com.commercetools.api.models.product_search.ProductSearchTimeRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.product_search.ProductSearchTimeRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public ProductSearchTimeRangeExpressionBuilder range(
            final com.commercetools.api.models.product_search.ProductSearchTimeRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.product_search.ProductSearchTimeRangeValue getRange() {
        return this.range;
    }

    /**
     * builds ProductSearchTimeRangeExpression with checking for non-null required values
     * @return ProductSearchTimeRangeExpression
     */
    public ProductSearchTimeRangeExpression build() {
        Objects.requireNonNull(range, ProductSearchTimeRangeExpression.class + ": range is missing");
        return new ProductSearchTimeRangeExpressionImpl(range);
    }

    /**
     * builds ProductSearchTimeRangeExpression without checking for non-null required values
     * @return ProductSearchTimeRangeExpression
     */
    public ProductSearchTimeRangeExpression buildUnchecked() {
        return new ProductSearchTimeRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of ProductSearchTimeRangeExpressionBuilder
     * @return builder
     */
    public static ProductSearchTimeRangeExpressionBuilder of() {
        return new ProductSearchTimeRangeExpressionBuilder();
    }

    /**
     * create builder for ProductSearchTimeRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchTimeRangeExpressionBuilder of(final ProductSearchTimeRangeExpression template) {
        ProductSearchTimeRangeExpressionBuilder builder = new ProductSearchTimeRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
