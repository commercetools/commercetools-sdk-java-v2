
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SuggestionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Suggestion suggestion = Suggestion.builder()
 *             .text("{text}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SuggestionBuilder implements Builder<Suggestion> {

    private String text;

    /**
     <*  <p>The suggested text.</p>>
     */

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
