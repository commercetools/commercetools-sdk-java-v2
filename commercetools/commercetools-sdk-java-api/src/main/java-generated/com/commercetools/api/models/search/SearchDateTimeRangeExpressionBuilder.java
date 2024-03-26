
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchDateTimeRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchDateTimeRangeExpression searchDateTimeRangeExpression = SearchDateTimeRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchDateTimeRangeExpressionBuilder implements Builder<SearchDateTimeRangeExpression> {

    private com.commercetools.api.models.search.SearchDateTimeRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public SearchDateTimeRangeExpressionBuilder range(
            Function<com.commercetools.api.models.search.SearchDateTimeRangeValueBuilder, com.commercetools.api.models.search.SearchDateTimeRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.search.SearchDateTimeRangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public SearchDateTimeRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.search.SearchDateTimeRangeValueBuilder, com.commercetools.api.models.search.SearchDateTimeRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.search.SearchDateTimeRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public SearchDateTimeRangeExpressionBuilder range(
            final com.commercetools.api.models.search.SearchDateTimeRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.search.SearchDateTimeRangeValue getRange() {
        return this.range;
    }

    /**
     * builds SearchDateTimeRangeExpression with checking for non-null required values
     * @return SearchDateTimeRangeExpression
     */
    public SearchDateTimeRangeExpression build() {
        Objects.requireNonNull(range, SearchDateTimeRangeExpression.class + ": range is missing");
        return new SearchDateTimeRangeExpressionImpl(range);
    }

    /**
     * builds SearchDateTimeRangeExpression without checking for non-null required values
     * @return SearchDateTimeRangeExpression
     */
    public SearchDateTimeRangeExpression buildUnchecked() {
        return new SearchDateTimeRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of SearchDateTimeRangeExpressionBuilder
     * @return builder
     */
    public static SearchDateTimeRangeExpressionBuilder of() {
        return new SearchDateTimeRangeExpressionBuilder();
    }

    /**
     * create builder for SearchDateTimeRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchDateTimeRangeExpressionBuilder of(final SearchDateTimeRangeExpression template) {
        SearchDateTimeRangeExpressionBuilder builder = new SearchDateTimeRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
