
package com.commercetools.api.models.quote;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteChangeQuoteStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteChangeQuoteStateAction quoteChangeQuoteStateAction = QuoteChangeQuoteStateAction.builder()
 *             .quoteState(QuoteState.PENDING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteChangeQuoteStateActionBuilder implements Builder<QuoteChangeQuoteStateAction> {

    private com.commercetools.api.models.quote.QuoteState quoteState;

    /**
     *  <p>The new quote state to be set for the Quote.</p>
     */

    public QuoteChangeQuoteStateActionBuilder quoteState(
            final com.commercetools.api.models.quote.QuoteState quoteState) {
        this.quoteState = quoteState;
        return this;
    }

    public com.commercetools.api.models.quote.QuoteState getQuoteState() {
        return this.quoteState;
    }

    public QuoteChangeQuoteStateAction build() {
        Objects.requireNonNull(quoteState, QuoteChangeQuoteStateAction.class + ": quoteState is missing");
        return new QuoteChangeQuoteStateActionImpl(quoteState);
    }

    /**
     * builds QuoteChangeQuoteStateAction without checking for non null required values
     */
    public QuoteChangeQuoteStateAction buildUnchecked() {
        return new QuoteChangeQuoteStateActionImpl(quoteState);
    }

    public static QuoteChangeQuoteStateActionBuilder of() {
        return new QuoteChangeQuoteStateActionBuilder();
    }

    public static QuoteChangeQuoteStateActionBuilder of(final QuoteChangeQuoteStateAction template) {
        QuoteChangeQuoteStateActionBuilder builder = new QuoteChangeQuoteStateActionBuilder();
        builder.quoteState = template.getQuoteState();
        return builder;
    }

}
