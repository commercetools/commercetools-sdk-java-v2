
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
     *  <p>The suggested text.</p>
     * @param text value to be set
     * @return Builder
     */

    public SuggestionBuilder text(final String text) {
        this.text = text;
        return this;
    }

    /**
     *  <p>The suggested text.</p>
     * @return text
     */

    public String getText() {
        return this.text;
    }

    /**
     * builds Suggestion with checking for non-null required values
     * @return Suggestion
     */
    public Suggestion build() {
        Objects.requireNonNull(text, Suggestion.class + ": text is missing");
        return new SuggestionImpl(text);
    }

    /**
     * builds Suggestion without checking for non-null required values
     * @return Suggestion
     */
    public Suggestion buildUnchecked() {
        return new SuggestionImpl(text);
    }

    /**
     * factory method for an instance of SuggestionBuilder
     * @return builder
     */
    public static SuggestionBuilder of() {
        return new SuggestionBuilder();
    }

    /**
     * create builder for Suggestion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SuggestionBuilder of(final Suggestion template) {
        SuggestionBuilder builder = new SuggestionBuilder();
        builder.text = template.getText();
        return builder;
    }

}
