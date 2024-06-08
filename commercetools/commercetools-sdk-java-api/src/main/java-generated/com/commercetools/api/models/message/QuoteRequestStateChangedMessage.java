
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

    /**
     * discriminator value for QuoteRequestStateChangedMessage
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
     * @return instance of QuoteRequestStateChangedMessage
     */
    public static QuoteRequestStateChangedMessage of() {
        return new QuoteRequestStateChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of QuoteRequestStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestStateChangedMessage deepCopy(@Nullable final QuoteRequestStateChangedMessage template) {
        if (template == null) {
            return null;
        }
        QuoteRequestStateChangedMessageImpl instance = new QuoteRequestStateChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setQuoteRequestState(template.getQuoteRequestState());
        instance.setOldQuoteRequestState(template.getOldQuoteRequestState());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestStateChangedMessage
     * @return builder
     */
    public static QuoteRequestStateChangedMessageBuilder builder() {
        return QuoteRequestStateChangedMessageBuilder.of();
    }

    /**
     * create builder for QuoteRequestStateChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestStateChangedMessageBuilder builder(final QuoteRequestStateChangedMessage template) {
        return QuoteRequestStateChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestStateChangedMessage(Function<QuoteRequestStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestStateChangedMessage>";
            }
        };
    }
}
