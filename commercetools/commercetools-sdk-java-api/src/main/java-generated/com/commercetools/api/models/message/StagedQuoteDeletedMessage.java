
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete StagedQuote request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteDeletedMessage stagedQuoteDeletedMessage = StagedQuoteDeletedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StagedQuoteDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteDeletedMessageImpl.class)
public interface StagedQuoteDeletedMessage extends Message {

    /**
     * discriminator value for StagedQuoteDeletedMessage
     */
    String STAGED_QUOTE_DELETED = "StagedQuoteDeleted";

    /**
     * factory method
     * @return instance of StagedQuoteDeletedMessage
     */
    public static StagedQuoteDeletedMessage of() {
        return new StagedQuoteDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StagedQuoteDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedQuoteDeletedMessage of(final StagedQuoteDeletedMessage template) {
        StagedQuoteDeletedMessageImpl instance = new StagedQuoteDeletedMessageImpl();
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

    public StagedQuoteDeletedMessage copyDeep();

    /**
     * factory method to create a deep copy of StagedQuoteDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedQuoteDeletedMessage deepCopy(@Nullable final StagedQuoteDeletedMessage template) {
        if (template == null) {
            return null;
        }
        StagedQuoteDeletedMessageImpl instance = new StagedQuoteDeletedMessageImpl();
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
        return instance;
    }

    /**
     * builder factory method for StagedQuoteDeletedMessage
     * @return builder
     */
    public static StagedQuoteDeletedMessageBuilder builder() {
        return StagedQuoteDeletedMessageBuilder.of();
    }

    /**
     * create builder for StagedQuoteDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteDeletedMessageBuilder builder(final StagedQuoteDeletedMessage template) {
        return StagedQuoteDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedQuoteDeletedMessage(Function<StagedQuoteDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteDeletedMessage>";
            }
        };
    }
}
