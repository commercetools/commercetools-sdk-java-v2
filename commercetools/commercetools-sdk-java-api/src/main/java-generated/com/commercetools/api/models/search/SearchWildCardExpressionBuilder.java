
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchWildCardExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchWildCardExpression searchWildCardExpression = SearchWildCardExpression.builder()
 *             .wildcard(wildcardBuilder -> wildcardBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchWildCardExpressionBuilder implements Builder<SearchWildCardExpression> {

    private com.commercetools.api.models.search.SearchAnyValue wildcard;

    /**
     * set the value to the wildcard using the builder function
     * @param builder function to build the wildcard value
     * @return Builder
     */

    public SearchWildCardExpressionBuilder wildcard(
            Function<com.commercetools.api.models.search.SearchAnyValueBuilder, com.commercetools.api.models.search.SearchAnyValueBuilder> builder) {
        this.wildcard = builder.apply(com.commercetools.api.models.search.SearchAnyValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the wildcard using the builder function
     * @param builder function to build the wildcard value
     * @return Builder
     */

    public SearchWildCardExpressionBuilder withWildcard(
            Function<com.commercetools.api.models.search.SearchAnyValueBuilder, com.commercetools.api.models.search.SearchAnyValue> builder) {
        this.wildcard = builder.apply(com.commercetools.api.models.search.SearchAnyValueBuilder.of());
        return this;
    }

    /**
     * set the value to the wildcard
     * @param wildcard value to be set
     * @return Builder
     */

    public SearchWildCardExpressionBuilder wildcard(final com.commercetools.api.models.search.SearchAnyValue wildcard) {
        this.wildcard = wildcard;
        return this;
    }

    /**
     * value of wildcard}
     * @return wildcard
     */

    public com.commercetools.api.models.search.SearchAnyValue getWildcard() {
        return this.wildcard;
    }

    /**
     * builds SearchWildCardExpression with checking for non-null required values
     * @return SearchWildCardExpression
     */
    public SearchWildCardExpression build() {
        Objects.requireNonNull(wildcard, SearchWildCardExpression.class + ": wildcard is missing");
        return new SearchWildCardExpressionImpl(wildcard);
    }

    /**
     * builds SearchWildCardExpression without checking for non-null required values
     * @return SearchWildCardExpression
     */
    public SearchWildCardExpression buildUnchecked() {
        return new SearchWildCardExpressionImpl(wildcard);
    }

    /**
     * factory method for an instance of SearchWildCardExpressionBuilder
     * @return builder
     */
    public static SearchWildCardExpressionBuilder of() {
        return new SearchWildCardExpressionBuilder();
    }

    /**
     * create builder for SearchWildCardExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchWildCardExpressionBuilder of(final SearchWildCardExpression template) {
        SearchWildCardExpressionBuilder builder = new SearchWildCardExpressionBuilder();
        builder.wildcard = template.getWildcard();
        return builder;
    }

}
