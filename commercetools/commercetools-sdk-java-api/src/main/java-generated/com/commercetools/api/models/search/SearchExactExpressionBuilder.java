
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchExactExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchExactExpression searchExactExpression = SearchExactExpression.builder()
 *             .exact(exactBuilder -> exactBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchExactExpressionBuilder implements Builder<SearchExactExpression> {

    private com.commercetools.api.models.search.SearchExactValue exact;

    /**
     * set the value to the exact using the builder function
     * @param builder function to build the exact value
     * @return Builder
     */

    public SearchExactExpressionBuilder exact(
            Function<com.commercetools.api.models.search.SearchExactValueBuilder, com.commercetools.api.models.search.SearchExactValueBuilder> builder) {
        this.exact = builder.apply(com.commercetools.api.models.search.SearchExactValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the exact using the builder function
     * @param builder function to build the exact value
     * @return Builder
     */

    public SearchExactExpressionBuilder withExact(
            Function<com.commercetools.api.models.search.SearchExactValueBuilder, com.commercetools.api.models.search.SearchExactValue> builder) {
        this.exact = builder.apply(com.commercetools.api.models.search.SearchExactValueBuilder.of());
        return this;
    }

    /**
     * set the value to the exact
     * @param exact value to be set
     * @return Builder
     */

    public SearchExactExpressionBuilder exact(final com.commercetools.api.models.search.SearchExactValue exact) {
        this.exact = exact;
        return this;
    }

    /**
     * value of exact}
     * @return exact
     */

    public com.commercetools.api.models.search.SearchExactValue getExact() {
        return this.exact;
    }

    /**
     * builds SearchExactExpression with checking for non-null required values
     * @return SearchExactExpression
     */
    public SearchExactExpression build() {
        Objects.requireNonNull(exact, SearchExactExpression.class + ": exact is missing");
        return new SearchExactExpressionImpl(exact);
    }

    /**
     * builds SearchExactExpression without checking for non-null required values
     * @return SearchExactExpression
     */
    public SearchExactExpression buildUnchecked() {
        return new SearchExactExpressionImpl(exact);
    }

    /**
     * factory method for an instance of SearchExactExpressionBuilder
     * @return builder
     */
    public static SearchExactExpressionBuilder of() {
        return new SearchExactExpressionBuilder();
    }

    /**
     * create builder for SearchExactExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchExactExpressionBuilder of(final SearchExactExpression template) {
        SearchExactExpressionBuilder builder = new SearchExactExpressionBuilder();
        builder.exact = template.getExact();
        return builder;
    }

}
