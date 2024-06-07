
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchNumberRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchNumberRangeExpression searchNumberRangeExpression = SearchNumberRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchNumberRangeExpressionBuilder implements Builder<SearchNumberRangeExpression> {

    private com.commercetools.api.models.search.SearchNumberRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public SearchNumberRangeExpressionBuilder range(
            Function<com.commercetools.api.models.search.SearchNumberRangeValueBuilder, com.commercetools.api.models.search.SearchNumberRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.search.SearchNumberRangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public SearchNumberRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.search.SearchNumberRangeValueBuilder, com.commercetools.api.models.search.SearchNumberRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.search.SearchNumberRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public SearchNumberRangeExpressionBuilder range(
            final com.commercetools.api.models.search.SearchNumberRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.search.SearchNumberRangeValue getRange() {
        return this.range;
    }

    /**
     * builds SearchNumberRangeExpression with checking for non-null required values
     * @return SearchNumberRangeExpression
     */
    public SearchNumberRangeExpression build() {
        Objects.requireNonNull(range, SearchNumberRangeExpression.class + ": range is missing");
        return new SearchNumberRangeExpressionImpl(range);
    }

    /**
     * builds SearchNumberRangeExpression without checking for non-null required values
     * @return SearchNumberRangeExpression
     */
    public SearchNumberRangeExpression buildUnchecked() {
        return new SearchNumberRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of SearchNumberRangeExpressionBuilder
     * @return builder
     */
    public static SearchNumberRangeExpressionBuilder of() {
        return new SearchNumberRangeExpressionBuilder();
    }

    /**
     * create builder for SearchNumberRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchNumberRangeExpressionBuilder of(final SearchNumberRangeExpression template) {
        SearchNumberRangeExpressionBuilder builder = new SearchNumberRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
