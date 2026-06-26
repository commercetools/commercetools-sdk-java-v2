
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <span>Staged Changes Removed</span> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantStagedChangesRemovedMessage variantStagedChangesRemovedMessage = VariantStagedChangesRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("VariantStagedChangesRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantStagedChangesRemovedMessageImpl.class)
public interface VariantStagedChangesRemovedMessage extends Message {

    /**
     * discriminator value for VariantStagedChangesRemovedMessage
     */
    String VARIANT_STAGED_CHANGES_REMOVED = "VariantStagedChangesRemoved";

    /**
     * factory method
     * @return instance of VariantStagedChangesRemovedMessage
     */
    public static VariantStagedChangesRemovedMessage of() {
        return new VariantStagedChangesRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy VariantStagedChangesRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantStagedChangesRemovedMessage of(final VariantStagedChangesRemovedMessage template) {
        VariantStagedChangesRemovedMessageImpl instance = new VariantStagedChangesRemovedMessageImpl();
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

    public VariantStagedChangesRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of VariantStagedChangesRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantStagedChangesRemovedMessage deepCopy(
            @Nullable final VariantStagedChangesRemovedMessage template) {
        if (template == null) {
            return null;
        }
        VariantStagedChangesRemovedMessageImpl instance = new VariantStagedChangesRemovedMessageImpl();
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
     * builder factory method for VariantStagedChangesRemovedMessage
     * @return builder
     */
    public static VariantStagedChangesRemovedMessageBuilder builder() {
        return VariantStagedChangesRemovedMessageBuilder.of();
    }

    /**
     * create builder for VariantStagedChangesRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantStagedChangesRemovedMessageBuilder builder(final VariantStagedChangesRemovedMessage template) {
        return VariantStagedChangesRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantStagedChangesRemovedMessage(Function<VariantStagedChangesRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantStagedChangesRemovedMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantStagedChangesRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<VariantStagedChangesRemovedMessage>";
            }
        };
    }
}
