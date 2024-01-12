
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchDateTimeRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchDateTimeRangeExpression productSearchDateTimeRangeExpression = ProductSearchDateTimeRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchDateTimeRangeExpressionBuilder implements Builder<ProductSearchDateTimeRangeExpression> {

    private com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public ProductSearchDateTimeRangeExpressionBuilder range(
            Function<com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValueBuilder, com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValueBuilder> builder) {
        this.range = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public ProductSearchDateTimeRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValueBuilder, com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValue> builder) {
        this.range = builder
                .apply(com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public ProductSearchDateTimeRangeExpressionBuilder range(
            final com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.product_search.ProductSearchDateTimeRangeValue getRange() {
        return this.range;
    }

    /**
     * builds ProductSearchDateTimeRangeExpression with checking for non-null required values
     * @return ProductSearchDateTimeRangeExpression
     */
    public ProductSearchDateTimeRangeExpression build() {
        Objects.requireNonNull(range, ProductSearchDateTimeRangeExpression.class + ": range is missing");
        return new ProductSearchDateTimeRangeExpressionImpl(range);
    }

    /**
     * builds ProductSearchDateTimeRangeExpression without checking for non-null required values
     * @return ProductSearchDateTimeRangeExpression
     */
    public ProductSearchDateTimeRangeExpression buildUnchecked() {
        return new ProductSearchDateTimeRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of ProductSearchDateTimeRangeExpressionBuilder
     * @return builder
     */
    public static ProductSearchDateTimeRangeExpressionBuilder of() {
        return new ProductSearchDateTimeRangeExpressionBuilder();
    }

    /**
     * create builder for ProductSearchDateTimeRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchDateTimeRangeExpressionBuilder of(final ProductSearchDateTimeRangeExpression template) {
        ProductSearchDateTimeRangeExpressionBuilder builder = new ProductSearchDateTimeRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
