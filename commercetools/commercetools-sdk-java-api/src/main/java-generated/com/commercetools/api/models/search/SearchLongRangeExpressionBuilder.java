
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchLongRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchLongRangeExpression searchLongRangeExpression = SearchLongRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchLongRangeExpressionBuilder implements Builder<SearchLongRangeExpression> {

    private com.commercetools.api.models.search.SearchLongRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public SearchLongRangeExpressionBuilder range(
            Function<com.commercetools.api.models.search.SearchLongRangeValueBuilder, com.commercetools.api.models.search.SearchLongRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.search.SearchLongRangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public SearchLongRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.search.SearchLongRangeValueBuilder, com.commercetools.api.models.search.SearchLongRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.search.SearchLongRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public SearchLongRangeExpressionBuilder range(
            final com.commercetools.api.models.search.SearchLongRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.search.SearchLongRangeValue getRange() {
        return this.range;
    }

    /**
     * builds SearchLongRangeExpression with checking for non-null required values
     * @return SearchLongRangeExpression
     */
    public SearchLongRangeExpression build() {
        Objects.requireNonNull(range, SearchLongRangeExpression.class + ": range is missing");
        return new SearchLongRangeExpressionImpl(range);
    }

    /**
     * builds SearchLongRangeExpression without checking for non-null required values
     * @return SearchLongRangeExpression
     */
    public SearchLongRangeExpression buildUnchecked() {
        return new SearchLongRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of SearchLongRangeExpressionBuilder
     * @return builder
     */
    public static SearchLongRangeExpressionBuilder of() {
        return new SearchLongRangeExpressionBuilder();
    }

    /**
     * create builder for SearchLongRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchLongRangeExpressionBuilder of(final SearchLongRangeExpression template) {
        SearchLongRangeExpressionBuilder builder = new SearchLongRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
