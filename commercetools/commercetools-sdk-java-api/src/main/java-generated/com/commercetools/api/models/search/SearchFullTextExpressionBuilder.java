
package com.commercetools.api.models.search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchFullTextExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFullTextExpression searchFullTextExpression = SearchFullTextExpression.builder()
 *             .fullText(fullTextBuilder -> fullTextBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchFullTextExpressionBuilder implements Builder<SearchFullTextExpression> {

    private com.commercetools.api.models.search.SearchFullTextValue fullText;

    /**
     * set the value to the fullText using the builder function
     * @param builder function to build the fullText value
     * @return Builder
     */

    public SearchFullTextExpressionBuilder fullText(
            Function<com.commercetools.api.models.search.SearchFullTextValueBuilder, com.commercetools.api.models.search.SearchFullTextValueBuilder> builder) {
        this.fullText = builder.apply(com.commercetools.api.models.search.SearchFullTextValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the fullText using the builder function
     * @param builder function to build the fullText value
     * @return Builder
     */

    public SearchFullTextExpressionBuilder withFullText(
            Function<com.commercetools.api.models.search.SearchFullTextValueBuilder, com.commercetools.api.models.search.SearchFullTextValue> builder) {
        this.fullText = builder.apply(com.commercetools.api.models.search.SearchFullTextValueBuilder.of());
        return this;
    }

    /**
     * set the value to the fullText
     * @param fullText value to be set
     * @return Builder
     */

    public SearchFullTextExpressionBuilder fullText(
            final com.commercetools.api.models.search.SearchFullTextValue fullText) {
        this.fullText = fullText;
        return this;
    }

    /**
     * value of fullText}
     * @return fullText
     */

    public com.commercetools.api.models.search.SearchFullTextValue getFullText() {
        return this.fullText;
    }

    /**
     * builds SearchFullTextExpression with checking for non-null required values
     * @return SearchFullTextExpression
     */
    public SearchFullTextExpression build() {
        Objects.requireNonNull(fullText, SearchFullTextExpression.class + ": fullText is missing");
        return new SearchFullTextExpressionImpl(fullText);
    }

    /**
     * builds SearchFullTextExpression without checking for non-null required values
     * @return SearchFullTextExpression
     */
    public SearchFullTextExpression buildUnchecked() {
        return new SearchFullTextExpressionImpl(fullText);
    }

    /**
     * factory method for an instance of SearchFullTextExpressionBuilder
     * @return builder
     */
    public static SearchFullTextExpressionBuilder of() {
        return new SearchFullTextExpressionBuilder();
    }

    /**
     * create builder for SearchFullTextExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFullTextExpressionBuilder of(final SearchFullTextExpression template) {
        SearchFullTextExpressionBuilder builder = new SearchFullTextExpressionBuilder();
        builder.fullText = template.getFullText();
        return builder;
    }

}
