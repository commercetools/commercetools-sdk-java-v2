
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated when an existing Custom Field has been changed using the Set CustomField action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomFieldChangedMessage orderCustomFieldChangedMessage = OrderCustomFieldChangedMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomFieldChangedMessageImpl.class)
public interface OrderCustomFieldChangedMessage extends OrderMessage {

    /**
     * discriminator value for OrderCustomFieldChangedMessage
     */
    String ORDER_CUSTOM_FIELD_CHANGED = "OrderCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that has been changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set Custom Field update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Order before, an Order Custom Field Added Message is generated instead.</p>
     * @return previousValue
     */

    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Name of the Custom Field that has been changed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set Custom Field update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Order before, an Order Custom Field Added Message is generated instead.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     * factory method
     * @return instance of OrderCustomFieldChangedMessage
     */
    public static OrderCustomFieldChangedMessage of() {
        return new OrderCustomFieldChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomFieldChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomFieldChangedMessage of(final OrderCustomFieldChangedMessage template) {
        OrderCustomFieldChangedMessageImpl instance = new OrderCustomFieldChangedMessageImpl();
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
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomFieldChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomFieldChangedMessage deepCopy(@Nullable final OrderCustomFieldChangedMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomFieldChangedMessageImpl instance = new OrderCustomFieldChangedMessageImpl();
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
        return instance;
    }

    /**
     * builder factory method for OrderCustomFieldChangedMessage
     * @return builder
     */
    public static OrderCustomFieldChangedMessageBuilder builder() {
        return OrderCustomFieldChangedMessageBuilder.of();
    }

    /**
     * create builder for OrderCustomFieldChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomFieldChangedMessageBuilder builder(final OrderCustomFieldChangedMessage template) {
        return OrderCustomFieldChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomFieldChangedMessage(Function<OrderCustomFieldChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomFieldChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomFieldChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomFieldChangedMessage>";
            }
        };
    }
}
