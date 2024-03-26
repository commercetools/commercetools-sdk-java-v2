
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchPrefixExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchPrefixExpression searchPrefixExpression = SearchPrefixExpression.builder()
 *             .prefix(prefixBuilder -> prefixBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchPrefixExpressionBuilder implements Builder<SearchPrefixExpression> {

    private com.commercetools.api.models.search.SearchAnyValue prefix;

    /**
     * set the value to the prefix using the builder function
     * @param builder function to build the prefix value
     * @return Builder
     */

    public SearchPrefixExpressionBuilder prefix(
            Function<com.commercetools.api.models.search.SearchAnyValueBuilder, com.commercetools.api.models.search.SearchAnyValueBuilder> builder) {
        this.prefix = builder.apply(com.commercetools.api.models.search.SearchAnyValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the prefix using the builder function
     * @param builder function to build the prefix value
     * @return Builder
     */

    public SearchPrefixExpressionBuilder withPrefix(
            Function<com.commercetools.api.models.search.SearchAnyValueBuilder, com.commercetools.api.models.search.SearchAnyValue> builder) {
        this.prefix = builder.apply(com.commercetools.api.models.search.SearchAnyValueBuilder.of());
        return this;
    }

    /**
     * set the value to the prefix
     * @param prefix value to be set
     * @return Builder
     */

    public SearchPrefixExpressionBuilder prefix(final com.commercetools.api.models.search.SearchAnyValue prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * value of prefix}
     * @return prefix
     */

    public com.commercetools.api.models.search.SearchAnyValue getPrefix() {
        return this.prefix;
    }

    /**
     * builds SearchPrefixExpression with checking for non-null required values
     * @return SearchPrefixExpression
     */
    public SearchPrefixExpression build() {
        Objects.requireNonNull(prefix, SearchPrefixExpression.class + ": prefix is missing");
        return new SearchPrefixExpressionImpl(prefix);
    }

    /**
     * builds SearchPrefixExpression without checking for non-null required values
     * @return SearchPrefixExpression
     */
    public SearchPrefixExpression buildUnchecked() {
        return new SearchPrefixExpressionImpl(prefix);
    }

    /**
     * factory method for an instance of SearchPrefixExpressionBuilder
     * @return builder
     */
    public static SearchPrefixExpressionBuilder of() {
        return new SearchPrefixExpressionBuilder();
    }

    /**
     * create builder for SearchPrefixExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchPrefixExpressionBuilder of(final SearchPrefixExpression template) {
        SearchPrefixExpressionBuilder builder = new SearchPrefixExpressionBuilder();
        builder.prefix = template.getPrefix();
        return builder;
    }

}
