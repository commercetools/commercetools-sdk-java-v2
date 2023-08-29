
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Request Quote Renegotiation update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRenegotiationRequestedMessage quoteRenegotiationRequestedMessage = QuoteRenegotiationRequestedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRenegotiationRequestedMessageImpl.class)
public interface QuoteRenegotiationRequestedMessage extends Message {

    /**
     * discriminator value for QuoteRenegotiationRequestedMessage
     */
    String QUOTE_RENEGOTIATION_REQUESTED = "QuoteRenegotiationRequested";

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
     * @return instance of QuoteRenegotiationRequestedMessage
     */
    public static QuoteRenegotiationRequestedMessage of() {
        return new QuoteRenegotiationRequestedMessageImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRenegotiationRequestedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRenegotiationRequestedMessage of(final QuoteRenegotiationRequestedMessage template) {
        QuoteRenegotiationRequestedMessageImpl instance = new QuoteRenegotiationRequestedMessageImpl();
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
        instance.setBuyerComment(template.getBuyerComment());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteRenegotiationRequestedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRenegotiationRequestedMessage deepCopy(
            @Nullable final QuoteRenegotiationRequestedMessage template) {
        if (template == null) {
            return null;
        }
        QuoteRenegotiationRequestedMessageImpl instance = new QuoteRenegotiationRequestedMessageImpl();
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
        instance.setBuyerComment(template.getBuyerComment());
        return instance;
    }

    /**
     * builder factory method for QuoteRenegotiationRequestedMessage
     * @return builder
     */
    public static QuoteRenegotiationRequestedMessageBuilder builder() {
        return QuoteRenegotiationRequestedMessageBuilder.of();
    }

    /**
     * create builder for QuoteRenegotiationRequestedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRenegotiationRequestedMessageBuilder builder(final QuoteRenegotiationRequestedMessage template) {
        return QuoteRenegotiationRequestedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRenegotiationRequestedMessage(Function<QuoteRenegotiationRequestedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRenegotiationRequestedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRenegotiationRequestedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRenegotiationRequestedMessage>";
            }
        };
    }
}
