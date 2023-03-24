
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SuggestTokenizerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SuggestTokenizer suggestTokenizer = SuggestTokenizer.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SuggestTokenizerBuilder implements Builder<SuggestTokenizer> {

    private String type;

    /**
     *
     * @param type value to be set
     * @return Builder
     */

    public SuggestTokenizerBuilder type(final String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    /**
     * builds SuggestTokenizer with checking for non-null required values
     * @return SuggestTokenizer
     */
    public SuggestTokenizer build() {
        Objects.requireNonNull(type, SuggestTokenizer.class + ": type is missing");
        return new SuggestTokenizerImpl(type);
    }

    /**
     * builds SuggestTokenizer without checking for non-null required values
     * @return SuggestTokenizer
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
