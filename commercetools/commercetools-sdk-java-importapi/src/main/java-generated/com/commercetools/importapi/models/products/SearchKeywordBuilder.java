
package com.commercetools.importapi.models.products;

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
    private com.commercetools.importapi.models.products.SuggestTokenizer suggestTokenizer;

    /**
     * set the value to the text
     * @param text value to be set
     * @return Builder
     */

    public SearchKeywordBuilder text(final String text) {
        this.text = text;
        return this;
    }

    /**
     *  <p>The tokenizer defines the tokens that are used to match against the Suggest Query input.</p>
     * @param suggestTokenizer value to be set
     * @return Builder
     */

    public SearchKeywordBuilder suggestTokenizer(
            @Nullable final com.commercetools.importapi.models.products.SuggestTokenizer suggestTokenizer) {
        this.suggestTokenizer = suggestTokenizer;
        return this;
    }

    /**
     *  <p>The tokenizer defines the tokens that are used to match against the Suggest Query input.</p>
     * @param builder function to build the suggestTokenizer value
     * @return Builder
     */

    public SearchKeywordBuilder suggestTokenizer(
            Function<com.commercetools.importapi.models.products.SuggestTokenizerBuilder, Builder<? extends com.commercetools.importapi.models.products.SuggestTokenizer>> builder) {
        this.suggestTokenizer = builder.apply(com.commercetools.importapi.models.products.SuggestTokenizerBuilder.of())
                .build();
        return this;
    }

    /**
     * value of text}
     * @return text
     */

    public String getText() {
        return this.text;
    }

    /**
     *  <p>The tokenizer defines the tokens that are used to match against the Suggest Query input.</p>
     * @return suggestTokenizer
     */

    @Nullable
    public com.commercetools.importapi.models.products.SuggestTokenizer getSuggestTokenizer() {
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
