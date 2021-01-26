
package com.commercetools.api.models.product;

import java.lang.Object;
import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.SearchKeyword;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchKeywordBuilder {

    private String text;

    @Nullable
    private java.lang.Object suggestTokenizer;

    public SearchKeywordBuilder text(final String text) {
        this.text = text;
        return this;
    }

    public SearchKeywordBuilder suggestTokenizer(@Nullable final java.lang.Object suggestTokenizer) {
        this.suggestTokenizer = suggestTokenizer;
        return this;
    }

    public String getText() {
        return this.text;
    }

    @Nullable
    public java.lang.Object getSuggestTokenizer() {
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
