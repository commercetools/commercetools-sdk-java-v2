
package com.commercetools.api.models.quote_request;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestChangeQuoteRequestStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestChangeQuoteRequestStateAction quoteRequestChangeQuoteRequestStateAction = QuoteRequestChangeQuoteRequestStateAction.builder()
 *             .quoteRequestState(QuoteRequestState.SUBMITTED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestChangeQuoteRequestStateActionBuilder
        implements Builder<QuoteRequestChangeQuoteRequestStateAction> {

    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;

    /**
     *  <p>The new state to be set for the Quote Request.</p>
     */

    public QuoteRequestChangeQuoteRequestStateActionBuilder quoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        return this;
    }

    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState() {
        return this.quoteRequestState;
    }

    public QuoteRequestChangeQuoteRequestStateAction build() {
        Objects.requireNonNull(quoteRequestState,
            QuoteRequestChangeQuoteRequestStateAction.class + ": quoteRequestState is missing");
        return new QuoteRequestChangeQuoteRequestStateActionImpl(quoteRequestState);
    }

    /**
     * builds QuoteRequestChangeQuoteRequestStateAction without checking for non null required values
     */
    public QuoteRequestChangeQuoteRequestStateAction buildUnchecked() {
        return new QuoteRequestChangeQuoteRequestStateActionImpl(quoteRequestState);
    }

    public static QuoteRequestChangeQuoteRequestStateActionBuilder of() {
        return new QuoteRequestChangeQuoteRequestStateActionBuilder();
    }

    public static QuoteRequestChangeQuoteRequestStateActionBuilder of(
            final QuoteRequestChangeQuoteRequestStateAction template) {
        QuoteRequestChangeQuoteRequestStateActionBuilder builder = new QuoteRequestChangeQuoteRequestStateActionBuilder();
        builder.quoteRequestState = template.getQuoteRequestState();
        return builder;
    }

}
