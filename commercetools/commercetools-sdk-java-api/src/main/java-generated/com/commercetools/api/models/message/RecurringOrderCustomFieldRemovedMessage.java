
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when a Custom Field has been removed from the Order using the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetCustomFieldAction" rel="nofollow">Set CustomField</a> action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomFieldRemovedMessage recurringOrderCustomFieldRemovedMessage = RecurringOrderCustomFieldRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderCustomFieldRemovedMessageImpl.class)
public interface RecurringOrderCustomFieldRemovedMessage extends Message {

    /**
     * discriminator value for RecurringOrderCustomFieldRemovedMessage
     */
    String RECURRING_ORDER_CUSTOM_FIELD_REMOVED = "RecurringOrderCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of RecurringOrderCustomFieldRemovedMessage
     */
    public static RecurringOrderCustomFieldRemovedMessage of() {
        return new RecurringOrderCustomFieldRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderCustomFieldRemovedMessage of(final RecurringOrderCustomFieldRemovedMessage template) {
        RecurringOrderCustomFieldRemovedMessageImpl instance = new RecurringOrderCustomFieldRemovedMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    public RecurringOrderCustomFieldRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderCustomFieldRemovedMessage deepCopy(
            @Nullable final RecurringOrderCustomFieldRemovedMessage template) {
        if (template == null) {
            return null;
        }
        RecurringOrderCustomFieldRemovedMessageImpl instance = new RecurringOrderCustomFieldRemovedMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderCustomFieldRemovedMessage
     * @return builder
     */
    public static RecurringOrderCustomFieldRemovedMessageBuilder builder() {
        return RecurringOrderCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * create builder for RecurringOrderCustomFieldRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomFieldRemovedMessageBuilder builder(
            final RecurringOrderCustomFieldRemovedMessage template) {
        return RecurringOrderCustomFieldRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderCustomFieldRemovedMessage(
            Function<RecurringOrderCustomFieldRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomFieldRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomFieldRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderCustomFieldRemovedMessage>";
            }
        };
    }
}
