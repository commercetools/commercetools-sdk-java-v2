
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestQuoteRenegotiationAction" rel="nofollow">Request Quote Renegotiation</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRenegotiationRequestedMessagePayload quoteRenegotiationRequestedMessagePayload = QuoteRenegotiationRequestedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("QuoteRenegotiationRequested")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRenegotiationRequestedMessagePayloadImpl.class)
public interface QuoteRenegotiationRequestedMessagePayload extends MessagePayload {

    /**
     * discriminator value for QuoteRenegotiationRequestedMessagePayload
     */
    String QUOTE_RENEGOTIATION_REQUESTED = "QuoteRenegotiationRequested";

    /**
     *  <p>Message from the <span>Buyer</span> regarding the Quote renegotiation request.</p>
     * @return buyerComment
     */

    @JsonProperty("buyerComment")
    public String getBuyerComment();

    /**
     *  <p>Message from the <span>Buyer</span> regarding the Quote renegotiation request.</p>
     * @param buyerComment value to be set
     */

    public void setBuyerComment(final String buyerComment);

    /**
     * factory method
     * @return instance of QuoteRenegotiationRequestedMessagePayload
     */
    public static QuoteRenegotiationRequestedMessagePayload of() {
        return new QuoteRenegotiationRequestedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRenegotiationRequestedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRenegotiationRequestedMessagePayload of(
            final QuoteRenegotiationRequestedMessagePayload template) {
        QuoteRenegotiationRequestedMessagePayloadImpl instance = new QuoteRenegotiationRequestedMessagePayloadImpl();
        instance.setBuyerComment(template.getBuyerComment());
        return instance;
    }

    public QuoteRenegotiationRequestedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of QuoteRenegotiationRequestedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRenegotiationRequestedMessagePayload deepCopy(
            @Nullable final QuoteRenegotiationRequestedMessagePayload template) {
        if (template == null) {
            return null;
        }
        QuoteRenegotiationRequestedMessagePayloadImpl instance = new QuoteRenegotiationRequestedMessagePayloadImpl();
        instance.setBuyerComment(template.getBuyerComment());
        return instance;
    }

    /**
     * builder factory method for QuoteRenegotiationRequestedMessagePayload
     * @return builder
     */
    public static QuoteRenegotiationRequestedMessagePayloadBuilder builder() {
        return QuoteRenegotiationRequestedMessagePayloadBuilder.of();
    }

    /**
     * create builder for QuoteRenegotiationRequestedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRenegotiationRequestedMessagePayloadBuilder builder(
            final QuoteRenegotiationRequestedMessagePayload template) {
        return QuoteRenegotiationRequestedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRenegotiationRequestedMessagePayload(
            Function<QuoteRenegotiationRequestedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRenegotiationRequestedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRenegotiationRequestedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRenegotiationRequestedMessagePayload>";
            }
        };
    }
}
