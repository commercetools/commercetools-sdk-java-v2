
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SuggestTokenizerBuilder implements Builder<SuggestTokenizer> {

    private String type;

    public SuggestTokenizerBuilder type(final String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public SuggestTokenizer build() {
        Objects.requireNonNull(type, SuggestTokenizer.class + ": type is missing");
        return new SuggestTokenizerImpl(type);
    }

    /**
     * builds SuggestTokenizer without checking for non null required values
     */
    public SuggestTokenizer buildUnchecked() {
        return new SuggestTokenizerImpl(type);
    }

    public static SuggestTokenizerBuilder of() {
        return new SuggestTokenizerBuilder();
    }

    public static SuggestTokenizerBuilder of(final SuggestTokenizer template) {
        SuggestTokenizerBuilder builder = new SuggestTokenizerBuilder();
        builder.type = template.getType();
        return builder;
    }

}
