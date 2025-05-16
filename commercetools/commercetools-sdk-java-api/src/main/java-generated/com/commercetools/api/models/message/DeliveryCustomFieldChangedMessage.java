
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
 *  <p>Generated when an existing Custom Field on a Delivery has been changed using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomFieldChangedMessage deliveryCustomFieldChangedMessage = DeliveryCustomFieldChangedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("DeliveryCustomFieldChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryCustomFieldChangedMessageImpl.class)
public interface DeliveryCustomFieldChangedMessage extends OrderMessage {

    /**
     * discriminator value for DeliveryCustomFieldChangedMessage
     */
    String DELIVERY_CUSTOM_FIELD_CHANGED = "DeliveryCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Delivery before, a Delivery Custom Field Added Message is generated instead.</p>
     * @return previousValue
     */

    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Delivery before, a Delivery Custom Field Added Message is generated instead.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of DeliveryCustomFieldChangedMessage
     */
    public static DeliveryCustomFieldChangedMessage of() {
        return new DeliveryCustomFieldChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryCustomFieldChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryCustomFieldChangedMessage of(final DeliveryCustomFieldChangedMessage template) {
        DeliveryCustomFieldChangedMessageImpl instance = new DeliveryCustomFieldChangedMessageImpl();
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
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    public DeliveryCustomFieldChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of DeliveryCustomFieldChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryCustomFieldChangedMessage deepCopy(
            @Nullable final DeliveryCustomFieldChangedMessage template) {
        if (template == null) {
            return null;
        }
        DeliveryCustomFieldChangedMessageImpl instance = new DeliveryCustomFieldChangedMessageImpl();
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
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * builder factory method for DeliveryCustomFieldChangedMessage
     * @return builder
     */
    public static DeliveryCustomFieldChangedMessageBuilder builder() {
        return DeliveryCustomFieldChangedMessageBuilder.of();
    }

    /**
     * create builder for DeliveryCustomFieldChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomFieldChangedMessageBuilder builder(final DeliveryCustomFieldChangedMessage template) {
        return DeliveryCustomFieldChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryCustomFieldChangedMessage(Function<DeliveryCustomFieldChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomFieldChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomFieldChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryCustomFieldChangedMessage>";
            }
        };
    }
}
