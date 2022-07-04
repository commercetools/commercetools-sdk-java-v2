
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestStateChangedMessagePayload quoteRequestStateChangedMessagePayload = QuoteRequestStateChangedMessagePayload.builder()
 *             .quoteRequestState(QuoteRequestState.SUBMITTED)
 *             .oldQuoteRequestState(QuoteRequestState.SUBMITTED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestStateChangedMessagePayloadBuilder implements Builder<QuoteRequestStateChangedMessagePayload> {

    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;

    private com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState;

    /**
     *  <p>Predefined states tracking the status of the Quote Request in the negotiation process.</p>
     */

    public QuoteRequestStateChangedMessagePayloadBuilder quoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        return this;
    }

    /**
     *  <p>Predefined states tracking the status of the Quote Request in the negotiation process.</p>
     */

    public QuoteRequestStateChangedMessagePayloadBuilder oldQuoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState) {
        this.oldQuoteRequestState = oldQuoteRequestState;
        return this;
    }

    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState() {
        return this.quoteRequestState;
    }

    public com.commercetools.api.models.quote_request.QuoteRequestState getOldQuoteRequestState() {
        return this.oldQuoteRequestState;
    }

    public QuoteRequestStateChangedMessagePayload build() {
        Objects.requireNonNull(quoteRequestState,
            QuoteRequestStateChangedMessagePayload.class + ": quoteRequestState is missing");
        Objects.requireNonNull(oldQuoteRequestState,
            QuoteRequestStateChangedMessagePayload.class + ": oldQuoteRequestState is missing");
        return new QuoteRequestStateChangedMessagePayloadImpl(quoteRequestState, oldQuoteRequestState);
    }

    /**
     * builds QuoteRequestStateChangedMessagePayload without checking for non null required values
     */
    public QuoteRequestStateChangedMessagePayload buildUnchecked() {
        return new QuoteRequestStateChangedMessagePayloadImpl(quoteRequestState, oldQuoteRequestState);
    }

    public static QuoteRequestStateChangedMessagePayloadBuilder of() {
        return new QuoteRequestStateChangedMessagePayloadBuilder();
    }

    public static QuoteRequestStateChangedMessagePayloadBuilder of(
            final QuoteRequestStateChangedMessagePayload template) {
        QuoteRequestStateChangedMessagePayloadBuilder builder = new QuoteRequestStateChangedMessagePayloadBuilder();
        builder.quoteRequestState = template.getQuoteRequestState();
        builder.oldQuoteRequestState = template.getOldQuoteRequestState();
        return builder;
    }

}
