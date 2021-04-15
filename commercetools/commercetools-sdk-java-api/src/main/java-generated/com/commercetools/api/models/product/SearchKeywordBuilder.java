
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchKeywordBuilder {

    private String text;

    @Nullable
    private com.commercetools.api.models.product.SuggestTokenizer suggestTokenizer;

    public SearchKeywordBuilder text(final String text) {
        this.text = text;
        return this;
    }

    public SearchKeywordBuilder suggestTokenizer(
            @Nullable final com.commercetools.api.models.product.SuggestTokenizer suggestTokenizer) {
        this.suggestTokenizer = suggestTokenizer;
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
