
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchDateRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchDateRangeExpression productSearchDateRangeExpression = ProductSearchDateRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchDateRangeExpressionBuilder implements Builder<ProductSearchDateRangeExpression> {

    private com.commercetools.api.models.product_search.ProductSearchDateRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public ProductSearchDateRangeExpressionBuilder range(
            Function<com.commercetools.api.models.product_search.ProductSearchDateRangeValueBuilder, com.commercetools.api.models.product_search.ProductSearchDateRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.product_search.ProductSearchDateRangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public ProductSearchDateRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.product_search.ProductSearchDateRangeValueBuilder, com.commercetools.api.models.product_search.ProductSearchDateRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.product_search.ProductSearchDateRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public ProductSearchDateRangeExpressionBuilder range(
            final com.commercetools.api.models.product_search.ProductSearchDateRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.product_search.ProductSearchDateRangeValue getRange() {
        return this.range;
    }

    /**
     * builds ProductSearchDateRangeExpression with checking for non-null required values
     * @return ProductSearchDateRangeExpression
     */
    public ProductSearchDateRangeExpression build() {
        Objects.requireNonNull(range, ProductSearchDateRangeExpression.class + ": range is missing");
        return new ProductSearchDateRangeExpressionImpl(range);
    }

    /**
     * builds ProductSearchDateRangeExpression without checking for non-null required values
     * @return ProductSearchDateRangeExpression
     */
    public ProductSearchDateRangeExpression buildUnchecked() {
        return new ProductSearchDateRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of ProductSearchDateRangeExpressionBuilder
     * @return builder
     */
    public static ProductSearchDateRangeExpressionBuilder of() {
        return new ProductSearchDateRangeExpressionBuilder();
    }

    /**
     * create builder for ProductSearchDateRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchDateRangeExpressionBuilder of(final ProductSearchDateRangeExpression template) {
        ProductSearchDateRangeExpressionBuilder builder = new ProductSearchDateRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
