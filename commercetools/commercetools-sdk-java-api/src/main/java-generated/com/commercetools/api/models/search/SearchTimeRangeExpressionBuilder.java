
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchTimeRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchTimeRangeExpression searchTimeRangeExpression = SearchTimeRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchTimeRangeExpressionBuilder implements Builder<SearchTimeRangeExpression> {

    private com.commercetools.api.models.search.SearchTimeRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public SearchTimeRangeExpressionBuilder range(
            Function<com.commercetools.api.models.search.SearchTimeRangeValueBuilder, com.commercetools.api.models.search.SearchTimeRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.search.SearchTimeRangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public SearchTimeRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.search.SearchTimeRangeValueBuilder, com.commercetools.api.models.search.SearchTimeRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.search.SearchTimeRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public SearchTimeRangeExpressionBuilder range(
            final com.commercetools.api.models.search.SearchTimeRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.search.SearchTimeRangeValue getRange() {
        return this.range;
    }

    /**
     * builds SearchTimeRangeExpression with checking for non-null required values
     * @return SearchTimeRangeExpression
     */
    public SearchTimeRangeExpression build() {
        Objects.requireNonNull(range, SearchTimeRangeExpression.class + ": range is missing");
        return new SearchTimeRangeExpressionImpl(range);
    }

    /**
     * builds SearchTimeRangeExpression without checking for non-null required values
     * @return SearchTimeRangeExpression
     */
    public SearchTimeRangeExpression buildUnchecked() {
        return new SearchTimeRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of SearchTimeRangeExpressionBuilder
     * @return builder
     */
    public static SearchTimeRangeExpressionBuilder of() {
        return new SearchTimeRangeExpressionBuilder();
    }

    /**
     * create builder for SearchTimeRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchTimeRangeExpressionBuilder of(final SearchTimeRangeExpression template) {
        SearchTimeRangeExpressionBuilder builder = new SearchTimeRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
