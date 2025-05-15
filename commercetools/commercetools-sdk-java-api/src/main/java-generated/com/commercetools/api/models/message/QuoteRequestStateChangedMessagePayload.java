
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.quote_request.QuoteRequestState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Quote Request State update action.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("QuoteRequestStateChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestStateChangedMessagePayloadImpl.class)
public interface QuoteRequestStateChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for QuoteRequestStateChangedMessagePayload
     */
    String QUOTE_REQUEST_STATE_CHANGED = "QuoteRequestStateChanged";

    /**
     *  <p>State of the Quote Request after the Change Quote Request State update action.</p>
     * @return quoteRequestState
     */
    @NotNull
    @JsonProperty("quoteRequestState")
    public QuoteRequestState getQuoteRequestState();

    /**
     *  <p>State of the Quote Request before the Change Quote Request State update action.</p>
     * @return oldQuoteRequestState
     */
    @NotNull
    @JsonProperty("oldQuoteRequestState")
    public QuoteRequestState getOldQuoteRequestState();

    /**
     *  <p>State of the Quote Request after the Change Quote Request State update action.</p>
     * @param quoteRequestState value to be set
     */

    public void setQuoteRequestState(final QuoteRequestState quoteRequestState);

    /**
     *  <p>State of the Quote Request before the Change Quote Request State update action.</p>
     * @param oldQuoteRequestState value to be set
     */

    public void setOldQuoteRequestState(final QuoteRequestState oldQuoteRequestState);

    /**
     * factory method
     * @return instance of QuoteRequestStateChangedMessagePayload
     */
    public static QuoteRequestStateChangedMessagePayload of() {
        return new QuoteRequestStateChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestStateChangedMessagePayload of(final QuoteRequestStateChangedMessagePayload template) {
        QuoteRequestStateChangedMessagePayloadImpl instance = new QuoteRequestStateChangedMessagePayloadImpl();
        instance.setQuoteRequestState(template.getQuoteRequestState());
        instance.setOldQuoteRequestState(template.getOldQuoteRequestState());
        return instance;
    }

    public QuoteRequestStateChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of QuoteRequestStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestStateChangedMessagePayload deepCopy(
            @Nullable final QuoteRequestStateChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        QuoteRequestStateChangedMessagePayloadImpl instance = new QuoteRequestStateChangedMessagePayloadImpl();
        instance.setQuoteRequestState(template.getQuoteRequestState());
        instance.setOldQuoteRequestState(template.getOldQuoteRequestState());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestStateChangedMessagePayload
     * @return builder
     */
    public static QuoteRequestStateChangedMessagePayloadBuilder builder() {
        return QuoteRequestStateChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for QuoteRequestStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestStateChangedMessagePayloadBuilder builder(
            final QuoteRequestStateChangedMessagePayload template) {
        return QuoteRequestStateChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestStateChangedMessagePayload(
            Function<QuoteRequestStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestStateChangedMessagePayload>";
            }
        };
    }
}
