
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchFullTextPrefixExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFullTextPrefixExpression searchFullTextPrefixExpression = SearchFullTextPrefixExpression.builder()
 *             .fullTextPrefix(fullTextPrefixBuilder -> fullTextPrefixBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFullTextPrefixExpressionBuilder implements Builder<SearchFullTextPrefixExpression> {

    private com.commercetools.api.models.search.SearchFullTextPrefixValue fullTextPrefix;

    /**
     * set the value to the fullTextPrefix using the builder function
     * @param builder function to build the fullTextPrefix value
     * @return Builder
     */

    public SearchFullTextPrefixExpressionBuilder fullTextPrefix(
            Function<com.commercetools.api.models.search.SearchFullTextPrefixValueBuilder, com.commercetools.api.models.search.SearchFullTextPrefixValueBuilder> builder) {
        this.fullTextPrefix = builder.apply(com.commercetools.api.models.search.SearchFullTextPrefixValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the fullTextPrefix using the builder function
     * @param builder function to build the fullTextPrefix value
     * @return Builder
     */

    public SearchFullTextPrefixExpressionBuilder withFullTextPrefix(
            Function<com.commercetools.api.models.search.SearchFullTextPrefixValueBuilder, com.commercetools.api.models.search.SearchFullTextPrefixValue> builder) {
        this.fullTextPrefix = builder.apply(com.commercetools.api.models.search.SearchFullTextPrefixValueBuilder.of());
        return this;
    }

    /**
     * set the value to the fullTextPrefix
     * @param fullTextPrefix value to be set
     * @return Builder
     */

    public SearchFullTextPrefixExpressionBuilder fullTextPrefix(
            final com.commercetools.api.models.search.SearchFullTextPrefixValue fullTextPrefix) {
        this.fullTextPrefix = fullTextPrefix;
        return this;
    }

    /**
     * value of fullTextPrefix}
     * @return fullTextPrefix
     */

    public com.commercetools.api.models.search.SearchFullTextPrefixValue getFullTextPrefix() {
        return this.fullTextPrefix;
    }

    /**
     * builds SearchFullTextPrefixExpression with checking for non-null required values
     * @return SearchFullTextPrefixExpression
     */
    public SearchFullTextPrefixExpression build() {
        Objects.requireNonNull(fullTextPrefix, SearchFullTextPrefixExpression.class + ": fullTextPrefix is missing");
        return new SearchFullTextPrefixExpressionImpl(fullTextPrefix);
    }

    /**
     * builds SearchFullTextPrefixExpression without checking for non-null required values
     * @return SearchFullTextPrefixExpression
     */
    public SearchFullTextPrefixExpression buildUnchecked() {
        return new SearchFullTextPrefixExpressionImpl(fullTextPrefix);
    }

    /**
     * factory method for an instance of SearchFullTextPrefixExpressionBuilder
     * @return builder
     */
    public static SearchFullTextPrefixExpressionBuilder of() {
        return new SearchFullTextPrefixExpressionBuilder();
    }

    /**
     * create builder for SearchFullTextPrefixExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFullTextPrefixExpressionBuilder of(final SearchFullTextPrefixExpression template) {
        SearchFullTextPrefixExpressionBuilder builder = new SearchFullTextPrefixExpressionBuilder();
        builder.fullTextPrefix = template.getFullTextPrefix();
        return builder;
    }

}
