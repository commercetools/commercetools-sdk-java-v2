
package com.commercetools.importapi.models.products;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class WhitespaceTokenizerBuilder implements Builder<WhitespaceTokenizer> {

    public WhitespaceTokenizer build() {
        return new WhitespaceTokenizerImpl();
    }

    /**
     * builds WhitespaceTokenizer without checking for non null required values
     */
    public WhitespaceTokenizer buildUnchecked() {
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
