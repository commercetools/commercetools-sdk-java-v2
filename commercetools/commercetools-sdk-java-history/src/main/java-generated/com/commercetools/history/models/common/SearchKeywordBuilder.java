
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchKeywordBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchKeyword searchKeyword = SearchKeyword.builder()
 *             .text("{text}")
 *             .suggestTokenizer(suggestTokenizerBuilder -> suggestTokenizerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchKeywordBuilder implements Builder<SearchKeyword> {

    private String text;

    private com.commercetools.history.models.common.SuggestTokenizer suggestTokenizer;

    /**
     *
     * @param text value to be set
     * @return Builder
     */

    public SearchKeywordBuilder text(final String text) {
        this.text = text;
        return this;
    }

    /**
     *
     * @param builder function to build the suggestTokenizer value
     * @return Builder
     */

    public SearchKeywordBuilder suggestTokenizer(
            Function<com.commercetools.history.models.common.SuggestTokenizerBuilder, com.commercetools.history.models.common.SuggestTokenizerBuilder> builder) {
        this.suggestTokenizer = builder.apply(com.commercetools.history.models.common.SuggestTokenizerBuilder.of())
                .build();
        return this;
    }

    /**
     *
     * @param suggestTokenizer value to be set
     * @return Builder
     */

    public SearchKeywordBuilder suggestTokenizer(
            final com.commercetools.history.models.common.SuggestTokenizer suggestTokenizer) {
        this.suggestTokenizer = suggestTokenizer;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public com.commercetools.history.models.common.SuggestTokenizer getSuggestTokenizer() {
        return this.suggestTokenizer;
    }

    /**
     * builds SearchKeyword with checking for non-null required values
     * @return SearchKeyword
     */
    public SearchKeyword build() {
        Objects.requireNonNull(text, SearchKeyword.class + ": text is missing");
        Objects.requireNonNull(suggestTokenizer, SearchKeyword.class + ": suggestTokenizer is missing");
        return new SearchKeywordImpl(text, suggestTokenizer);
    }

    /**
     * builds SearchKeyword without checking for non-null required values
     * @return SearchKeyword
     */
    public SearchKeyword buildUnchecked() {
        return new SearchKeywordImpl(text, suggestTokenizer);
    }

    public static SearchKeywordBuilder of() {
        return new SearchKeywordBuilder();
    }

    public static SearchKeywordBuilder of(final SearchKeyword template) {
        SearchKeywordBuilder builder = new SearchKeywordBuilder();
        builder.text = template.getText();
        builder.suggestTokenizer = template.getSuggestTokenizer();
        return builder;
    }

}
