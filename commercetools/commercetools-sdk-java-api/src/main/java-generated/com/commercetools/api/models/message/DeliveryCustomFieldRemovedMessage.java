
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
 *  <p>Generated when a Custom Field has been removed from the Delivery using the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomFieldRemovedMessage deliveryCustomFieldRemovedMessage = DeliveryCustomFieldRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .name("{name}")
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DeliveryCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryCustomFieldRemovedMessageImpl.class)
public interface DeliveryCustomFieldRemovedMessage extends OrderMessage {

    /**
     * discriminator value for DeliveryCustomFieldRemovedMessage
     */
    String DELIVERY_CUSTOM_FIELD_REMOVED = "DeliveryCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of DeliveryCustomFieldRemovedMessage
     */
    public static DeliveryCustomFieldRemovedMessage of() {
        return new DeliveryCustomFieldRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryCustomFieldRemovedMessage of(final DeliveryCustomFieldRemovedMessage template) {
        DeliveryCustomFieldRemovedMessageImpl instance = new DeliveryCustomFieldRemovedMessageImpl();
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
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    public DeliveryCustomFieldRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of DeliveryCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryCustomFieldRemovedMessage deepCopy(
            @Nullable final DeliveryCustomFieldRemovedMessage template) {
        if (template == null) {
            return null;
        }
        DeliveryCustomFieldRemovedMessageImpl instance = new DeliveryCustomFieldRemovedMessageImpl();
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
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * builder factory method for DeliveryCustomFieldRemovedMessage
     * @return builder
     */
    public static DeliveryCustomFieldRemovedMessageBuilder builder() {
        return DeliveryCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * create builder for DeliveryCustomFieldRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomFieldRemovedMessageBuilder builder(final DeliveryCustomFieldRemovedMessage template) {
        return DeliveryCustomFieldRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryCustomFieldRemovedMessage(Function<DeliveryCustomFieldRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomFieldRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomFieldRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryCustomFieldRemovedMessage>";
            }
        };
    }
}
