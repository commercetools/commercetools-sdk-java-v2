
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchKeywordBuilder implements Builder<SearchKeyword> {

    private String text;

    @Nullable
    private com.commercetools.api.models.product.SuggestTokenizer suggestTokenizer;

    /**
     *  <p>Text to return in the SuggestionResult.</p>
     * @param text value to be set
     * @return Builder
     */

    public SearchKeywordBuilder text(final String text) {
        this.text = text;
        return this;
    }

    /**
     *  <p>If no tokenizer is defined, the <code>text</code> is used as a single token.</p>
     * @param suggestTokenizer value to be set
     * @return Builder
     */

    public SearchKeywordBuilder suggestTokenizer(
            @Nullable final com.commercetools.api.models.product.SuggestTokenizer suggestTokenizer) {
        this.suggestTokenizer = suggestTokenizer;
        return this;
    }

    /**
     *  <p>If no tokenizer is defined, the <code>text</code> is used as a single token.</p>
     * @param builder function to build the suggestTokenizer value
     * @return Builder
     */

    public SearchKeywordBuilder suggestTokenizer(
            Function<com.commercetools.api.models.product.SuggestTokenizerBuilder, Builder<? extends com.commercetools.api.models.product.SuggestTokenizer>> builder) {
        this.suggestTokenizer = builder.apply(com.commercetools.api.models.product.SuggestTokenizerBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Text to return in the SuggestionResult.</p>
     * @return text
     */

    public String getText() {
        return this.text;
    }

    /**
     *  <p>If no tokenizer is defined, the <code>text</code> is used as a single token.</p>
     * @return suggestTokenizer
     */

    @Nullable
    public com.commercetools.api.models.product.SuggestTokenizer getSuggestTokenizer() {
        return this.suggestTokenizer;
    }

    /**
     * builds SearchKeyword with checking for non-null required values
     * @return SearchKeyword
     */
    public SearchKeyword build() {
        Objects.requireNonNull(text, SearchKeyword.class + ": text is missing");
        return new SearchKeywordImpl(text, suggestTokenizer);
    }

    /**
     * builds SearchKeyword without checking for non-null required values
     * @return SearchKeyword
     */
    public SearchKeyword buildUnchecked() {
        return new SearchKeywordImpl(text, suggestTokenizer);
    }

    /**
     * factory method for an instance of SearchKeywordBuilder
     * @return builder
     */
    public static SearchKeywordBuilder of() {
        return new SearchKeywordBuilder();
    }

    /**
     * create builder for SearchKeyword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchKeywordBuilder of(final SearchKeyword template) {
        SearchKeywordBuilder builder = new SearchKeywordBuilder();
        builder.text = template.getText();
        builder.suggestTokenizer = template.getSuggestTokenizer();
        return builder;
    }

}
