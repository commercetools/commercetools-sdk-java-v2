
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SuggestTokenizerBuilder {

    private String type;

    public SuggestTokenizerBuilder type(final String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public SuggestTokenizer build() {
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
