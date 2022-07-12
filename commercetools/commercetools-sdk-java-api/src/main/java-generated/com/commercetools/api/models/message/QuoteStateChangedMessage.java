
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
 * QuoteStateChangedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteStateChangedMessage quoteStateChangedMessage = QuoteStateChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .quoteState(QuoteState.PENDING)
 *             .oldQuoteState(QuoteState.PENDING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteStateChangedMessageImpl.class)
public interface QuoteStateChangedMessage extends Message {

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

    public static QuoteStateChangedMessage of() {
        return new QuoteStateChangedMessageImpl();
    }

    public static QuoteStateChangedMessage of(final QuoteStateChangedMessage template) {
        QuoteStateChangedMessageImpl instance = new QuoteStateChangedMessageImpl();
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
        instance.setQuoteState(template.getQuoteState());
        instance.setOldQuoteState(template.getOldQuoteState());
        return instance;
    }

    public static QuoteStateChangedMessageBuilder builder() {
        return QuoteStateChangedMessageBuilder.of();
    }

    public static QuoteStateChangedMessageBuilder builder(final QuoteStateChangedMessage template) {
        return QuoteStateChangedMessageBuilder.of(template);
    }

    default <T> T withQuoteStateChangedMessage(Function<QuoteStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteStateChangedMessage>";
            }
        };
    }
}
