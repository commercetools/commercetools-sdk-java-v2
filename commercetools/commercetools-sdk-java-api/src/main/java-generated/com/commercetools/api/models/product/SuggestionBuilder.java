
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SuggestionBuilder implements Builder<Suggestion> {

    private String text;

    public SuggestionBuilder text(final String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Suggestion build() {
        Objects.requireNonNull(text, Suggestion.class + ": text is missing");
        return new SuggestionImpl(text);
    }

    /**
     * builds Suggestion without checking for non null required values
     */
    public Suggestion buildUnchecked() {
        return new SuggestionImpl(text);
    }

    public static SuggestionBuilder of() {
        return new SuggestionBuilder();
    }

    public static SuggestionBuilder of(final Suggestion template) {
        SuggestionBuilder builder = new SuggestionBuilder();
        builder.text = template.getText();
        return builder;
    }

}
