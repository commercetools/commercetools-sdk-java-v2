
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchDateRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchDateRangeExpression searchDateRangeExpression = SearchDateRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchDateRangeExpressionBuilder implements Builder<SearchDateRangeExpression> {

    private com.commercetools.api.models.search.SearchDateRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public SearchDateRangeExpressionBuilder range(
            Function<com.commercetools.api.models.search.SearchDateRangeValueBuilder, com.commercetools.api.models.search.SearchDateRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.search.SearchDateRangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public SearchDateRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.search.SearchDateRangeValueBuilder, com.commercetools.api.models.search.SearchDateRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.search.SearchDateRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public SearchDateRangeExpressionBuilder range(
            final com.commercetools.api.models.search.SearchDateRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.search.SearchDateRangeValue getRange() {
        return this.range;
    }

    /**
     * builds SearchDateRangeExpression with checking for non-null required values
     * @return SearchDateRangeExpression
     */
    public SearchDateRangeExpression build() {
        Objects.requireNonNull(range, SearchDateRangeExpression.class + ": range is missing");
        return new SearchDateRangeExpressionImpl(range);
    }

    /**
     * builds SearchDateRangeExpression without checking for non-null required values
     * @return SearchDateRangeExpression
     */
    public SearchDateRangeExpression buildUnchecked() {
        return new SearchDateRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of SearchDateRangeExpressionBuilder
     * @return builder
     */
    public static SearchDateRangeExpressionBuilder of() {
        return new SearchDateRangeExpressionBuilder();
    }

    /**
     * create builder for SearchDateRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchDateRangeExpressionBuilder of(final SearchDateRangeExpression template) {
        SearchDateRangeExpressionBuilder builder = new SearchDateRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
