
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
     *  <p>Predefined states tracking the status of the Quote.</p>
     */

    public QuoteStateChangedMessagePayloadBuilder quoteState(
            final com.commercetools.api.models.quote.QuoteState quoteState) {
        this.quoteState = quoteState;
        return this;
    }

    /**
     *  <p>Predefined states tracking the status of the Quote.</p>
     */

    public QuoteStateChangedMessagePayloadBuilder oldQuoteState(
            final com.commercetools.api.models.quote.QuoteState oldQuoteState) {
        this.oldQuoteState = oldQuoteState;
        return this;
    }

    public com.commercetools.api.models.quote.QuoteState getQuoteState() {
        return this.quoteState;
    }

    public com.commercetools.api.models.quote.QuoteState getOldQuoteState() {
        return this.oldQuoteState;
    }

    public QuoteStateChangedMessagePayload build() {
        Objects.requireNonNull(quoteState, QuoteStateChangedMessagePayload.class + ": quoteState is missing");
        Objects.requireNonNull(oldQuoteState, QuoteStateChangedMessagePayload.class + ": oldQuoteState is missing");
        return new QuoteStateChangedMessagePayloadImpl(quoteState, oldQuoteState);
    }

    /**
     * builds QuoteStateChangedMessagePayload without checking for non null required values
     */
    public QuoteStateChangedMessagePayload buildUnchecked() {
        return new QuoteStateChangedMessagePayloadImpl(quoteState, oldQuoteState);
    }

    public static QuoteStateChangedMessagePayloadBuilder of() {
        return new QuoteStateChangedMessagePayloadBuilder();
    }

    public static QuoteStateChangedMessagePayloadBuilder of(final QuoteStateChangedMessagePayload template) {
        QuoteStateChangedMessagePayloadBuilder builder = new QuoteStateChangedMessagePayloadBuilder();
        builder.quoteState = template.getQuoteState();
        builder.oldQuoteState = template.getOldQuoteState();
        return builder;
    }

}
