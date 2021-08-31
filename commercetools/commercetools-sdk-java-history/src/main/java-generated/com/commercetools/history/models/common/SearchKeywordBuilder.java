
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchKeywordBuilder implements Builder<SearchKeyword> {

    private String text;

    private com.commercetools.history.models.common.SuggestTokenizer suggestTokenizer;

    public SearchKeywordBuilder text(final String text) {
        this.text = text;
        return this;
    }

    public SearchKeywordBuilder suggestTokenizer(
            Function<com.commercetools.history.models.common.SuggestTokenizerBuilder, com.commercetools.history.models.common.SuggestTokenizerBuilder> builder) {
        this.suggestTokenizer = builder.apply(com.commercetools.history.models.common.SuggestTokenizerBuilder.of())
                .build();
        return this;
    }

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

    public SearchKeyword build() {
        Objects.requireNonNull(text, SearchKeyword.class + ": text is missing");
        Objects.requireNonNull(suggestTokenizer, SearchKeyword.class + ": suggestTokenizer is missing");
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
