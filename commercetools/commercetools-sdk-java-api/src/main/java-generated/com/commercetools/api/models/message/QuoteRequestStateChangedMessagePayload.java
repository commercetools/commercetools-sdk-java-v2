
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.quote_request.QuoteRequestState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestStateChangedMessagePayload
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestStateChangedMessagePayloadImpl.class)
public interface QuoteRequestStateChangedMessagePayload extends MessagePayload {

    String QUOTE_REQUEST_STATE_CHANGED = "QuoteRequestStateChanged";

    /**
     *  <p>Predefined states tracking the status of the Quote Request in the negotiation process.</p>
     */
    @NotNull
    @JsonProperty("quoteRequestState")
    public QuoteRequestState getQuoteRequestState();

    /**
     *  <p>Predefined states tracking the status of the Quote Request in the negotiation process.</p>
     */
    @NotNull
    @JsonProperty("oldQuoteRequestState")
    public QuoteRequestState getOldQuoteRequestState();

    public void setQuoteRequestState(final QuoteRequestState quoteRequestState);

    public void setOldQuoteRequestState(final QuoteRequestState oldQuoteRequestState);

    public static QuoteRequestStateChangedMessagePayload of() {
        return new QuoteRequestStateChangedMessagePayloadImpl();
    }

    public static QuoteRequestStateChangedMessagePayload of(final QuoteRequestStateChangedMessagePayload template) {
        QuoteRequestStateChangedMessagePayloadImpl instance = new QuoteRequestStateChangedMessagePayloadImpl();
        instance.setQuoteRequestState(template.getQuoteRequestState());
        instance.setOldQuoteRequestState(template.getOldQuoteRequestState());
        return instance;
    }

    public static QuoteRequestStateChangedMessagePayloadBuilder builder() {
        return QuoteRequestStateChangedMessagePayloadBuilder.of();
    }

    public static QuoteRequestStateChangedMessagePayloadBuilder builder(
            final QuoteRequestStateChangedMessagePayload template) {
        return QuoteRequestStateChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withQuoteRequestStateChangedMessagePayload(
            Function<QuoteRequestStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestStateChangedMessagePayload>";
            }
        };
    }
}
