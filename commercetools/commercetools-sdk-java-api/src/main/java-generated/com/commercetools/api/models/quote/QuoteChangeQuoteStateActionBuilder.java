
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
     *  <p>New state to be set for the Quote, except <code>DeclinedForRenegotiation</code>. The <code>DeclinedForRenegotiation</code> state can be set only when performing a renegotiation request.</p>
     * @param quoteState value to be set
     * @return Builder
     */

    public QuoteChangeQuoteStateActionBuilder quoteState(
            final com.commercetools.api.models.quote.QuoteState quoteState) {
        this.quoteState = quoteState;
        return this;
    }

    /**
     *  <p>New state to be set for the Quote, except <code>DeclinedForRenegotiation</code>. The <code>DeclinedForRenegotiation</code> state can be set only when performing a renegotiation request.</p>
     * @return quoteState
     */

    public com.commercetools.api.models.quote.QuoteState getQuoteState() {
        return this.quoteState;
    }

    /**
     * builds QuoteChangeQuoteStateAction with checking for non-null required values
     * @return QuoteChangeQuoteStateAction
     */
    public QuoteChangeQuoteStateAction build() {
        Objects.requireNonNull(quoteState, QuoteChangeQuoteStateAction.class + ": quoteState is missing");
        return new QuoteChangeQuoteStateActionImpl(quoteState);
    }

    /**
     * builds QuoteChangeQuoteStateAction without checking for non-null required values
     * @return QuoteChangeQuoteStateAction
     */
    public QuoteChangeQuoteStateAction buildUnchecked() {
        return new QuoteChangeQuoteStateActionImpl(quoteState);
    }

    /**
     * factory method for an instance of QuoteChangeQuoteStateActionBuilder
     * @return builder
     */
    public static QuoteChangeQuoteStateActionBuilder of() {
        return new QuoteChangeQuoteStateActionBuilder();
    }

    /**
     * create builder for QuoteChangeQuoteStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteChangeQuoteStateActionBuilder of(final QuoteChangeQuoteStateAction template) {
        QuoteChangeQuoteStateActionBuilder builder = new QuoteChangeQuoteStateActionBuilder();
        builder.quoteState = template.getQuoteState();
        return builder;
    }

}
