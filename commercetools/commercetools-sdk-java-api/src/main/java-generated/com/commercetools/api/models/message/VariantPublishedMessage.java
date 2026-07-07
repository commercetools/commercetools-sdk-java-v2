
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <span>Publish</span> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantPublishedMessage variantPublishedMessage = VariantPublishedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("VariantPublished")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantPublishedMessageImpl.class)
public interface VariantPublishedMessage extends Message {

    /**
     * discriminator value for VariantPublishedMessage
     */
    String VARIANT_PUBLISHED = "VariantPublished";

    /**
     * factory method
     * @return instance of VariantPublishedMessage
     */
    public static VariantPublishedMessage of() {
        return new VariantPublishedMessageImpl();
    }

    /**
     * factory method to create a shallow copy VariantPublishedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantPublishedMessage of(final VariantPublishedMessage template) {
        VariantPublishedMessageImpl instance = new VariantPublishedMessageImpl();
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

    public VariantPublishedMessage copyDeep();

    /**
     * factory method to create a deep copy of VariantPublishedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantPublishedMessage deepCopy(@Nullable final VariantPublishedMessage template) {
        if (template == null) {
            return null;
        }
        VariantPublishedMessageImpl instance = new VariantPublishedMessageImpl();
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
     * builder factory method for VariantPublishedMessage
     * @return builder
     */
    public static VariantPublishedMessageBuilder builder() {
        return VariantPublishedMessageBuilder.of();
    }

    /**
     * create builder for VariantPublishedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantPublishedMessageBuilder builder(final VariantPublishedMessage template) {
        return VariantPublishedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantPublishedMessage(Function<VariantPublishedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantPublishedMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantPublishedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<VariantPublishedMessage>";
            }
        };
    }
}
