
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.quote.QuoteState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Quote State update action.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("QuoteStateChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteStateChangedMessagePayloadImpl.class)
public interface QuoteStateChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for QuoteStateChangedMessagePayload
     */
    String QUOTE_STATE_CHANGED = "QuoteStateChanged";

    /**
     *  <p>State of the Quote after the Change Quote State update action.</p>
     * @return quoteState
     */
    @NotNull
    @JsonProperty("quoteState")
    public QuoteState getQuoteState();

    /**
     *  <p>State of the Quote before the Change Quote State update action.</p>
     * @return oldQuoteState
     */
    @NotNull
    @JsonProperty("oldQuoteState")
    public QuoteState getOldQuoteState();

    /**
     *  <p>State of the Quote after the Change Quote State update action.</p>
     * @param quoteState value to be set
     */

    public void setQuoteState(final QuoteState quoteState);

    /**
     *  <p>State of the Quote before the Change Quote State update action.</p>
     * @param oldQuoteState value to be set
     */

    public void setOldQuoteState(final QuoteState oldQuoteState);

    /**
     * factory method
     * @return instance of QuoteStateChangedMessagePayload
     */
    public static QuoteStateChangedMessagePayload of() {
        return new QuoteStateChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy QuoteStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteStateChangedMessagePayload of(final QuoteStateChangedMessagePayload template) {
        QuoteStateChangedMessagePayloadImpl instance = new QuoteStateChangedMessagePayloadImpl();
        instance.setQuoteState(template.getQuoteState());
        instance.setOldQuoteState(template.getOldQuoteState());
        return instance;
    }

    public QuoteStateChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of QuoteStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteStateChangedMessagePayload deepCopy(@Nullable final QuoteStateChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        QuoteStateChangedMessagePayloadImpl instance = new QuoteStateChangedMessagePayloadImpl();
        instance.setQuoteState(template.getQuoteState());
        instance.setOldQuoteState(template.getOldQuoteState());
        return instance;
    }

    /**
     * builder factory method for QuoteStateChangedMessagePayload
     * @return builder
     */
    public static QuoteStateChangedMessagePayloadBuilder builder() {
        return QuoteStateChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for QuoteStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteStateChangedMessagePayloadBuilder builder(final QuoteStateChangedMessagePayload template) {
        return QuoteStateChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteStateChangedMessagePayload(Function<QuoteStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteStateChangedMessagePayload>";
            }
        };
    }
}
