
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
     *  <p>Text to return in the result of a suggest query.</p>
     */

    public SearchKeywordBuilder text(final String text) {
        this.text = text;
        return this;
    }

    /**
     *  <p>If no tokenizer is defined, the <code>text</code> is used as a single token.</p>
     */

    public SearchKeywordBuilder suggestTokenizer(
            @Nullable final com.commercetools.api.models.product.SuggestTokenizer suggestTokenizer) {
        this.suggestTokenizer = suggestTokenizer;
        return this;
    }

    /**
     *  <p>If no tokenizer is defined, the <code>text</code> is used as a single token.</p>
     */

    public SearchKeywordBuilder suggestTokenizer(
            Function<com.commercetools.api.models.product.SuggestTokenizerBuilder, Builder<? extends com.commercetools.api.models.product.SuggestTokenizer>> builder) {
        this.suggestTokenizer = builder.apply(com.commercetools.api.models.product.SuggestTokenizerBuilder.of())
                .build();
        return this;
    }

    public String getText() {
        return this.text;
    }

    @Nullable
    public com.commercetools.api.models.product.SuggestTokenizer getSuggestTokenizer() {
        return this.suggestTokenizer;
    }

    public SearchKeyword build() {
        Objects.requireNonNull(text, SearchKeyword.class + ": text is missing");
        return new SearchKeywordImpl(text, suggestTokenizer);
    }

    /**
     * builds SearchKeyword without checking for non null required values
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
