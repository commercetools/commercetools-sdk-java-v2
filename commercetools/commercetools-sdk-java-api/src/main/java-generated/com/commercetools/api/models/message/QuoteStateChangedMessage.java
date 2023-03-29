
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.quote.QuoteState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Quote State update action.</p>
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

    /**
     * discriminator value for QuoteStateChangedMessage
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
     * @return instance of QuoteStateChangedMessage
     */
    public static QuoteStateChangedMessage of() {
        return new QuoteStateChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy QuoteStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of QuoteStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteStateChangedMessage deepCopy(@Nullable final QuoteStateChangedMessage template) {
        if (template == null) {
            return null;
        }
        QuoteStateChangedMessageImpl instance = new QuoteStateChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setQuoteState(template.getQuoteState());
        instance.setOldQuoteState(template.getOldQuoteState());
        return instance;
    }

    /**
     * builder factory method for QuoteStateChangedMessage
     * @return builder
     */
    public static QuoteStateChangedMessageBuilder builder() {
        return QuoteStateChangedMessageBuilder.of();
    }

    /**
     * create builder for QuoteStateChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteStateChangedMessageBuilder builder(final QuoteStateChangedMessage template) {
        return QuoteStateChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteStateChangedMessage(Function<QuoteStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteStateChangedMessage>";
            }
        };
    }
}
