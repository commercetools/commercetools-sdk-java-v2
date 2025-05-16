
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
 *  <p>Generated when a Custom Field has been removed from the Order using the Set CustomField action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomFieldRemovedMessage orderCustomFieldRemovedMessage = OrderCustomFieldRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("OrderCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomFieldRemovedMessageImpl.class)
public interface OrderCustomFieldRemovedMessage extends OrderMessage {

    /**
     * discriminator value for OrderCustomFieldRemovedMessage
     */
    String ORDER_CUSTOM_FIELD_REMOVED = "OrderCustomFieldRemoved";

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
     * @return instance of OrderCustomFieldRemovedMessage
     */
    public static OrderCustomFieldRemovedMessage of() {
        return new OrderCustomFieldRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomFieldRemovedMessage of(final OrderCustomFieldRemovedMessage template) {
        OrderCustomFieldRemovedMessageImpl instance = new OrderCustomFieldRemovedMessageImpl();
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

    public OrderCustomFieldRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomFieldRemovedMessage deepCopy(@Nullable final OrderCustomFieldRemovedMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomFieldRemovedMessageImpl instance = new OrderCustomFieldRemovedMessageImpl();
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
     * builder factory method for OrderCustomFieldRemovedMessage
     * @return builder
     */
    public static OrderCustomFieldRemovedMessageBuilder builder() {
        return OrderCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * create builder for OrderCustomFieldRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomFieldRemovedMessageBuilder builder(final OrderCustomFieldRemovedMessage template) {
        return OrderCustomFieldRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomFieldRemovedMessage(Function<OrderCustomFieldRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomFieldRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomFieldRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomFieldRemovedMessage>";
            }
        };
    }
}
