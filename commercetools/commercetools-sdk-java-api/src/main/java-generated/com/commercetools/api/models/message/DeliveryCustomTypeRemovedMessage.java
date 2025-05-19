
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
 *  <p>Generated after removing a Custom Type from a Delivery using the Set Custom Type update action with empty parameters.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomTypeRemovedMessage deliveryCustomTypeRemovedMessage = DeliveryCustomTypeRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DeliveryCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryCustomTypeRemovedMessageImpl.class)
public interface DeliveryCustomTypeRemovedMessage extends OrderMessage {

    /**
     * discriminator value for DeliveryCustomTypeRemovedMessage
     */
    String DELIVERY_CUSTOM_TYPE_REMOVED = "DeliveryCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of DeliveryCustomTypeRemovedMessage
     */
    public static DeliveryCustomTypeRemovedMessage of() {
        return new DeliveryCustomTypeRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryCustomTypeRemovedMessage of(final DeliveryCustomTypeRemovedMessage template) {
        DeliveryCustomTypeRemovedMessageImpl instance = new DeliveryCustomTypeRemovedMessageImpl();
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
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    public DeliveryCustomTypeRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of DeliveryCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryCustomTypeRemovedMessage deepCopy(@Nullable final DeliveryCustomTypeRemovedMessage template) {
        if (template == null) {
            return null;
        }
        DeliveryCustomTypeRemovedMessageImpl instance = new DeliveryCustomTypeRemovedMessageImpl();
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
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * builder factory method for DeliveryCustomTypeRemovedMessage
     * @return builder
     */
    public static DeliveryCustomTypeRemovedMessageBuilder builder() {
        return DeliveryCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * create builder for DeliveryCustomTypeRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomTypeRemovedMessageBuilder builder(final DeliveryCustomTypeRemovedMessage template) {
        return DeliveryCustomTypeRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryCustomTypeRemovedMessage(Function<DeliveryCustomTypeRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomTypeRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomTypeRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryCustomTypeRemovedMessage>";
            }
        };
    }
}
