
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.quote.QuoteState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteStateChangedMessagePayload
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteStateChangedMessagePayloadImpl.class)
public interface QuoteStateChangedMessagePayload extends MessagePayload {

    String QUOTE_STATE_CHANGED = "QuoteStateChanged";

    /**
     *  <p>Predefined states tracking the status of the Quote.</p>
     */
    @NotNull
    @JsonProperty("quoteState")
    public QuoteState getQuoteState();

    /**
     *  <p>Predefined states tracking the status of the Quote.</p>
     */
    @NotNull
    @JsonProperty("oldQuoteState")
    public QuoteState getOldQuoteState();

    public void setQuoteState(final QuoteState quoteState);

    public void setOldQuoteState(final QuoteState oldQuoteState);

    public static QuoteStateChangedMessagePayload of() {
        return new QuoteStateChangedMessagePayloadImpl();
    }

    public static QuoteStateChangedMessagePayload of(final QuoteStateChangedMessagePayload template) {
        QuoteStateChangedMessagePayloadImpl instance = new QuoteStateChangedMessagePayloadImpl();
        instance.setQuoteState(template.getQuoteState());
        instance.setOldQuoteState(template.getOldQuoteState());
        return instance;
    }

    public static QuoteStateChangedMessagePayloadBuilder builder() {
        return QuoteStateChangedMessagePayloadBuilder.of();
    }

    public static QuoteStateChangedMessagePayloadBuilder builder(final QuoteStateChangedMessagePayload template) {
        return QuoteStateChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withQuoteStateChangedMessagePayload(Function<QuoteStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteStateChangedMessagePayload>";
            }
        };
    }
}
