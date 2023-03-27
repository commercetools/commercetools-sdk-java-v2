
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
     *  <p>State of the Quote Request after the Change Quote Request State update action.</p>
     * @param quoteRequestState value to be set
     * @return Builder
     */

    public QuoteRequestStateChangedMessagePayloadBuilder quoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        return this;
    }

    /**
     *  <p>State of the Quote Request before the Change Quote Request State update action.</p>
     * @param oldQuoteRequestState value to be set
     * @return Builder
     */

    public QuoteRequestStateChangedMessagePayloadBuilder oldQuoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState) {
        this.oldQuoteRequestState = oldQuoteRequestState;
        return this;
    }

    /**
     *  <p>State of the Quote Request after the Change Quote Request State update action.</p>
     * @return quoteRequestState
     */

    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState() {
        return this.quoteRequestState;
    }

    /**
     *  <p>State of the Quote Request before the Change Quote Request State update action.</p>
     * @return oldQuoteRequestState
     */

    public com.commercetools.api.models.quote_request.QuoteRequestState getOldQuoteRequestState() {
        return this.oldQuoteRequestState;
    }

    /**
     * builds QuoteRequestStateChangedMessagePayload with checking for non-null required values
     * @return QuoteRequestStateChangedMessagePayload
     */
    public QuoteRequestStateChangedMessagePayload build() {
        Objects.requireNonNull(quoteRequestState,
            QuoteRequestStateChangedMessagePayload.class + ": quoteRequestState is missing");
        Objects.requireNonNull(oldQuoteRequestState,
            QuoteRequestStateChangedMessagePayload.class + ": oldQuoteRequestState is missing");
        return new QuoteRequestStateChangedMessagePayloadImpl(quoteRequestState, oldQuoteRequestState);
    }

    /**
     * builds QuoteRequestStateChangedMessagePayload without checking for non-null required values
     * @return QuoteRequestStateChangedMessagePayload
     */
    public QuoteRequestStateChangedMessagePayload buildUnchecked() {
        return new QuoteRequestStateChangedMessagePayloadImpl(quoteRequestState, oldQuoteRequestState);
    }

    /**
     * factory method for an instance of QuoteRequestStateChangedMessagePayloadBuilder
     * @return builder
     */
    public static QuoteRequestStateChangedMessagePayloadBuilder of() {
        return new QuoteRequestStateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for QuoteRequestStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestStateChangedMessagePayloadBuilder of(
            final QuoteRequestStateChangedMessagePayload template) {
        QuoteRequestStateChangedMessagePayloadBuilder builder = new QuoteRequestStateChangedMessagePayloadBuilder();
        builder.quoteRequestState = template.getQuoteRequestState();
        builder.oldQuoteRequestState = template.getOldQuoteRequestState();
        return builder;
    }

}
