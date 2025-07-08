
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Custom Type with empty parameters.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomTypeRemovedMessage recurringOrderCustomTypeRemovedMessage = RecurringOrderCustomTypeRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderCustomTypeRemovedMessageImpl.class)
public interface RecurringOrderCustomTypeRemovedMessage extends Message {

    /**
     * discriminator value for RecurringOrderCustomTypeRemovedMessage
     */
    String RECURRING_ORDER_CUSTOM_TYPE_REMOVED = "RecurringOrderCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     * factory method
     * @return instance of RecurringOrderCustomTypeRemovedMessage
     */
    public static RecurringOrderCustomTypeRemovedMessage of() {
        return new RecurringOrderCustomTypeRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderCustomTypeRemovedMessage of(final RecurringOrderCustomTypeRemovedMessage template) {
        RecurringOrderCustomTypeRemovedMessageImpl instance = new RecurringOrderCustomTypeRemovedMessageImpl();
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
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    public RecurringOrderCustomTypeRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderCustomTypeRemovedMessage deepCopy(
            @Nullable final RecurringOrderCustomTypeRemovedMessage template) {
        if (template == null) {
            return null;
        }
        RecurringOrderCustomTypeRemovedMessageImpl instance = new RecurringOrderCustomTypeRemovedMessageImpl();
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
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderCustomTypeRemovedMessage
     * @return builder
     */
    public static RecurringOrderCustomTypeRemovedMessageBuilder builder() {
        return RecurringOrderCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * create builder for RecurringOrderCustomTypeRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomTypeRemovedMessageBuilder builder(
            final RecurringOrderCustomTypeRemovedMessage template) {
        return RecurringOrderCustomTypeRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderCustomTypeRemovedMessage(
            Function<RecurringOrderCustomTypeRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomTypeRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomTypeRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderCustomTypeRemovedMessage>";
            }
        };
    }
}
