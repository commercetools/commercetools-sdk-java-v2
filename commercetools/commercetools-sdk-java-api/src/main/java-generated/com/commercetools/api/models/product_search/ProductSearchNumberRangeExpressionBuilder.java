
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchNumberRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchNumberRangeExpression productSearchNumberRangeExpression = ProductSearchNumberRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchNumberRangeExpressionBuilder implements Builder<ProductSearchNumberRangeExpression> {

    private com.commercetools.api.models.product_search.ProductSearchNumberRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public ProductSearchNumberRangeExpressionBuilder range(
            Function<com.commercetools.api.models.product_search.ProductSearchNumberRangeValueBuilder, com.commercetools.api.models.product_search.ProductSearchNumberRangeValueBuilder> builder) {
        this.range = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchNumberRangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public ProductSearchNumberRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.product_search.ProductSearchNumberRangeValueBuilder, com.commercetools.api.models.product_search.ProductSearchNumberRangeValue> builder) {
        this.range = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchNumberRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public ProductSearchNumberRangeExpressionBuilder range(
            final com.commercetools.api.models.product_search.ProductSearchNumberRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.product_search.ProductSearchNumberRangeValue getRange() {
        return this.range;
    }

    /**
     * builds ProductSearchNumberRangeExpression with checking for non-null required values
     * @return ProductSearchNumberRangeExpression
     */
    public ProductSearchNumberRangeExpression build() {
        Objects.requireNonNull(range, ProductSearchNumberRangeExpression.class + ": range is missing");
        return new ProductSearchNumberRangeExpressionImpl(range);
    }

    /**
     * builds ProductSearchNumberRangeExpression without checking for non-null required values
     * @return ProductSearchNumberRangeExpression
     */
    public ProductSearchNumberRangeExpression buildUnchecked() {
        return new ProductSearchNumberRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of ProductSearchNumberRangeExpressionBuilder
     * @return builder
     */
    public static ProductSearchNumberRangeExpressionBuilder of() {
        return new ProductSearchNumberRangeExpressionBuilder();
    }

    /**
     * create builder for ProductSearchNumberRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchNumberRangeExpressionBuilder of(final ProductSearchNumberRangeExpression template) {
        ProductSearchNumberRangeExpressionBuilder builder = new ProductSearchNumberRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
