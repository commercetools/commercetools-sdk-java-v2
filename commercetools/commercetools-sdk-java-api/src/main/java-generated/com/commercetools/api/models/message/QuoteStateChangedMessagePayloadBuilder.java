
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteStateChangedMessagePayload quoteStateChangedMessagePayload = QuoteStateChangedMessagePayload.builder()
 *             .quoteState(QuoteState.PENDING)
 *             .oldQuoteState(QuoteState.PENDING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteStateChangedMessagePayloadBuilder implements Builder<QuoteStateChangedMessagePayload> {

    private com.commercetools.api.models.quote.QuoteState quoteState;

    private com.commercetools.api.models.quote.QuoteState oldQuoteState;

    /**
     *  <p>State of the Quote after the Change Quote State update action.</p>
     * @param quoteState value to be set
     * @return Builder
     */

    public QuoteStateChangedMessagePayloadBuilder quoteState(
            final com.commercetools.api.models.quote.QuoteState quoteState) {
        this.quoteState = quoteState;
        return this;
    }

    /**
     *  <p>State of the Quote before the Change Quote State update action.</p>
     * @param oldQuoteState value to be set
     * @return Builder
     */

    public QuoteStateChangedMessagePayloadBuilder oldQuoteState(
            final com.commercetools.api.models.quote.QuoteState oldQuoteState) {
        this.oldQuoteState = oldQuoteState;
        return this;
    }

    /**
     *  <p>State of the Quote after the Change Quote State update action.</p>
     * @return quoteState
     */

    public com.commercetools.api.models.quote.QuoteState getQuoteState() {
        return this.quoteState;
    }

    /**
     *  <p>State of the Quote before the Change Quote State update action.</p>
     * @return oldQuoteState
     */

    public com.commercetools.api.models.quote.QuoteState getOldQuoteState() {
        return this.oldQuoteState;
    }

    /**
     * builds QuoteStateChangedMessagePayload with checking for non-null required values
     * @return QuoteStateChangedMessagePayload
     */
    public QuoteStateChangedMessagePayload build() {
        Objects.requireNonNull(quoteState, QuoteStateChangedMessagePayload.class + ": quoteState is missing");
        Objects.requireNonNull(oldQuoteState, QuoteStateChangedMessagePayload.class + ": oldQuoteState is missing");
        return new QuoteStateChangedMessagePayloadImpl(quoteState, oldQuoteState);
    }

    /**
     * builds QuoteStateChangedMessagePayload without checking for non-null required values
     * @return QuoteStateChangedMessagePayload
     */
    public QuoteStateChangedMessagePayload buildUnchecked() {
        return new QuoteStateChangedMessagePayloadImpl(quoteState, oldQuoteState);
    }

    /**
     * factory method for an instance of QuoteStateChangedMessagePayloadBuilder
     * @return builder
     */
    public static QuoteStateChangedMessagePayloadBuilder of() {
        return new QuoteStateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for QuoteStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteStateChangedMessagePayloadBuilder of(final QuoteStateChangedMessagePayload template) {
        QuoteStateChangedMessagePayloadBuilder builder = new QuoteStateChangedMessagePayloadBuilder();
        builder.quoteState = template.getQuoteState();
        builder.oldQuoteState = template.getOldQuoteState();
        return builder;
    }

}
