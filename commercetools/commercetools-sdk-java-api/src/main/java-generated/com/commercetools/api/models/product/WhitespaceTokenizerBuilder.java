
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class WhitespaceTokenizerBuilder {

    public WhitespaceTokenizer build() {
        return new WhitespaceTokenizerImpl();
    }

    public static WhitespaceTokenizerBuilder of() {
        return new WhitespaceTokenizerBuilder();
    }

    public static WhitespaceTokenizerBuilder of(final WhitespaceTokenizer template) {
        WhitespaceTokenizerBuilder builder = new WhitespaceTokenizerBuilder();
        return builder;
    }

}
