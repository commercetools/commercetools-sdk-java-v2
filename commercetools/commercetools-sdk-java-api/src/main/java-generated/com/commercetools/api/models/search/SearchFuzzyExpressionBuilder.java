
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchFuzzyExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFuzzyExpression searchFuzzyExpression = SearchFuzzyExpression.builder()
 *             .fuzzy(fuzzyBuilder -> fuzzyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFuzzyExpressionBuilder implements Builder<SearchFuzzyExpression> {

    private com.commercetools.api.models.search.SearchFuzzyValue fuzzy;

    /**
     * set the value to the fuzzy using the builder function
     * @param builder function to build the fuzzy value
     * @return Builder
     */

    public SearchFuzzyExpressionBuilder fuzzy(
            Function<com.commercetools.api.models.search.SearchFuzzyValueBuilder, com.commercetools.api.models.search.SearchFuzzyValueBuilder> builder) {
        this.fuzzy = builder.apply(com.commercetools.api.models.search.SearchFuzzyValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the fuzzy using the builder function
     * @param builder function to build the fuzzy value
     * @return Builder
     */

    public SearchFuzzyExpressionBuilder withFuzzy(
            Function<com.commercetools.api.models.search.SearchFuzzyValueBuilder, com.commercetools.api.models.search.SearchFuzzyValue> builder) {
        this.fuzzy = builder.apply(com.commercetools.api.models.search.SearchFuzzyValueBuilder.of());
        return this;
    }

    /**
     * set the value to the fuzzy
     * @param fuzzy value to be set
     * @return Builder
     */

    public SearchFuzzyExpressionBuilder fuzzy(final com.commercetools.api.models.search.SearchFuzzyValue fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }

    /**
     * value of fuzzy}
     * @return fuzzy
     */

    public com.commercetools.api.models.search.SearchFuzzyValue getFuzzy() {
        return this.fuzzy;
    }

    /**
     * builds SearchFuzzyExpression with checking for non-null required values
     * @return SearchFuzzyExpression
     */
    public SearchFuzzyExpression build() {
        Objects.requireNonNull(fuzzy, SearchFuzzyExpression.class + ": fuzzy is missing");
        return new SearchFuzzyExpressionImpl(fuzzy);
    }

    /**
     * builds SearchFuzzyExpression without checking for non-null required values
     * @return SearchFuzzyExpression
     */
    public SearchFuzzyExpression buildUnchecked() {
        return new SearchFuzzyExpressionImpl(fuzzy);
    }

    /**
     * factory method for an instance of SearchFuzzyExpressionBuilder
     * @return builder
     */
    public static SearchFuzzyExpressionBuilder of() {
        return new SearchFuzzyExpressionBuilder();
    }

    /**
     * create builder for SearchFuzzyExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFuzzyExpressionBuilder of(final SearchFuzzyExpression template) {
        SearchFuzzyExpressionBuilder builder = new SearchFuzzyExpressionBuilder();
        builder.fuzzy = template.getFuzzy();
        return builder;
    }

}
