
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
 * QuoteRequestStateChangedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestStateChangedMessage quoteRequestStateChangedMessage = QuoteRequestStateChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .quoteRequestState(QuoteRequestState.SUBMITTED)
 *             .oldQuoteRequestState(QuoteRequestState.SUBMITTED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestStateChangedMessageImpl.class)
public interface QuoteRequestStateChangedMessage extends Message {

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

    public static QuoteRequestStateChangedMessage of() {
        return new QuoteRequestStateChangedMessageImpl();
    }

    public static QuoteRequestStateChangedMessage of(final QuoteRequestStateChangedMessage template) {
        QuoteRequestStateChangedMessageImpl instance = new QuoteRequestStateChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setQuoteRequestState(template.getQuoteRequestState());
        instance.setOldQuoteRequestState(template.getOldQuoteRequestState());
        return instance;
    }

    public static QuoteRequestStateChangedMessageBuilder builder() {
        return QuoteRequestStateChangedMessageBuilder.of();
    }

    public static QuoteRequestStateChangedMessageBuilder builder(final QuoteRequestStateChangedMessage template) {
        return QuoteRequestStateChangedMessageBuilder.of(template);
    }

    default <T> T withQuoteRequestStateChangedMessage(Function<QuoteRequestStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestStateChangedMessage>";
            }
        };
    }
}
