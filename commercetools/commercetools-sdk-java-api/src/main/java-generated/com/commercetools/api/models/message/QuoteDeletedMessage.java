
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete Quote request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteDeletedMessage quoteDeletedMessage = QuoteDeletedMessage.builder()
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
@JsonDeserialize(as = QuoteDeletedMessageImpl.class)
public interface QuoteDeletedMessage extends Message {

    /**
     * discriminator value for QuoteDeletedMessage
     */
    String QUOTE_DELETED = "QuoteDeleted";

    /**
     * factory method
     * @return instance of QuoteDeletedMessage
     */
    public static QuoteDeletedMessage of() {
        return new QuoteDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy QuoteDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteDeletedMessage of(final QuoteDeletedMessage template) {
        QuoteDeletedMessageImpl instance = new QuoteDeletedMessageImpl();
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
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteDeletedMessage deepCopy(@Nullable final QuoteDeletedMessage template) {
        if (template == null) {
            return null;
        }
        QuoteDeletedMessageImpl instance = new QuoteDeletedMessageImpl();
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
        return instance;
    }

    /**
     * builder factory method for QuoteDeletedMessage
     * @return builder
     */
    public static QuoteDeletedMessageBuilder builder() {
        return QuoteDeletedMessageBuilder.of();
    }

    /**
     * create builder for QuoteDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteDeletedMessageBuilder builder(final QuoteDeletedMessage template) {
        return QuoteDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteDeletedMessage(Function<QuoteDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteDeletedMessage>";
            }
        };
    }
}
