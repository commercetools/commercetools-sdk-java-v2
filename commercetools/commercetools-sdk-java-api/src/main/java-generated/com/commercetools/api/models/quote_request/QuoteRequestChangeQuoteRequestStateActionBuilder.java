package com.commercetools.api.models.quote_request;

import com.commercetools.api.models.quote_request.QuoteRequestState;
import com.commercetools.api.models.quote_request.QuoteRequestUpdateAction;
import com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteRequestChangeQuoteRequestStateActionBuilder implements Builder<QuoteRequestChangeQuoteRequestStateAction> {

    
    
    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;

    
    /**
     *  <p>New state to be set for the Quote Request.</p>
     * @param quoteRequestState value to be set
     * @return Builder
     */
    
    public QuoteRequestChangeQuoteRequestStateActionBuilder quoteRequestState( final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        return this;
    }
    
    

    /**
     *  <p>New state to be set for the Quote Request.</p>
     * @return quoteRequestState
     */
    
    
    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState(){
        return this.quoteRequestState;
    }

    /**
     * builds QuoteRequestChangeQuoteRequestStateAction with checking for non-null required values
     * @return QuoteRequestChangeQuoteRequestStateAction
     */
    public QuoteRequestChangeQuoteRequestStateAction build() {
        Objects.requireNonNull(quoteRequestState, QuoteRequestChangeQuoteRequestStateAction.class + ": quoteRequestState is missing");
        return new QuoteRequestChangeQuoteRequestStateActionImpl(quoteRequestState);
    }
    
    /**
     * builds QuoteRequestChangeQuoteRequestStateAction without checking for non-null required values
     * @return QuoteRequestChangeQuoteRequestStateAction
     */
    public QuoteRequestChangeQuoteRequestStateAction buildUnchecked() {
        return new QuoteRequestChangeQuoteRequestStateActionImpl(quoteRequestState);
    }

    /**
     * factory method for an instance of QuoteRequestChangeQuoteRequestStateActionBuilder
     * @return builder 
     */
    public static QuoteRequestChangeQuoteRequestStateActionBuilder of() {
        return new QuoteRequestChangeQuoteRequestStateActionBuilder();
    }

    /**
     * create builder for QuoteRequestChangeQuoteRequestStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestChangeQuoteRequestStateActionBuilder of(final QuoteRequestChangeQuoteRequestStateAction template) {
        QuoteRequestChangeQuoteRequestStateActionBuilder builder = new QuoteRequestChangeQuoteRequestStateActionBuilder();
        builder.quoteRequestState = template.getQuoteRequestState();
        return builder;
    }

}
