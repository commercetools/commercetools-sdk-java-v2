
package com.commercetools.api.models.quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Represents the Buyer requesting renegotiation for a Quote. Valid for Quotes in a <code>Pending</code> or <code>Failed</code> state.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestQuoteRenegotiationAction quoteRequestQuoteRenegotiationAction = QuoteRequestQuoteRenegotiationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestQuoteRenegotiationActionImpl.class)
public interface QuoteRequestQuoteRenegotiationAction extends QuoteUpdateAction {

    /**
     * discriminator value for QuoteRequestQuoteRenegotiationAction
     */
    String REQUEST_QUOTE_RENEGOTIATION = "requestQuoteRenegotiation";

    /**
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
     * @return buyerComment
     */

    @JsonProperty("buyerComment")
    public String getBuyerComment();

    /**
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
     * @param buyerComment value to be set
     */

    public void setBuyerComment(final String buyerComment);

    /**
     * factory method
     * @return instance of QuoteRequestQuoteRenegotiationAction
     */
    public static QuoteRequestQuoteRenegotiationAction of() {
        return new QuoteRequestQuoteRenegotiationActionImpl();
    }

    /**
     * factory method to copy an instance of QuoteRequestQuoteRenegotiationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestQuoteRenegotiationAction of(final QuoteRequestQuoteRenegotiationAction template) {
        QuoteRequestQuoteRenegotiationActionImpl instance = new QuoteRequestQuoteRenegotiationActionImpl();
        instance.setBuyerComment(template.getBuyerComment());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestQuoteRenegotiationAction
     * @return builder
     */
    public static QuoteRequestQuoteRenegotiationActionBuilder builder() {
        return QuoteRequestQuoteRenegotiationActionBuilder.of();
    }

    /**
     * create builder for QuoteRequestQuoteRenegotiationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestQuoteRenegotiationActionBuilder builder(
            final QuoteRequestQuoteRenegotiationAction template) {
        return QuoteRequestQuoteRenegotiationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestQuoteRenegotiationAction(Function<QuoteRequestQuoteRenegotiationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestQuoteRenegotiationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestQuoteRenegotiationAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestQuoteRenegotiationAction>";
            }
        };
    }
}
