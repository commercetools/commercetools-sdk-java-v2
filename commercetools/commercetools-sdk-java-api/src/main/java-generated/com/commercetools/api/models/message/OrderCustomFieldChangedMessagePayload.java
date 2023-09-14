
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
 *     OrderCustomFieldChangedMessagePayload orderCustomFieldChangedMessagePayload = OrderCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomFieldChangedMessagePayloadImpl.class)
public interface OrderCustomFieldChangedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomFieldChangedMessagePayload
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
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
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
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
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
     * @return instance of OrderCustomFieldChangedMessagePayload
     */
    public static OrderCustomFieldChangedMessagePayload of() {
        return new OrderCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomFieldChangedMessagePayload of(final OrderCustomFieldChangedMessagePayload template) {
        OrderCustomFieldChangedMessagePayloadImpl instance = new OrderCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomFieldChangedMessagePayload deepCopy(
            @Nullable final OrderCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomFieldChangedMessagePayloadImpl instance = new OrderCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for OrderCustomFieldChangedMessagePayload
     * @return builder
     */
    public static OrderCustomFieldChangedMessagePayloadBuilder builder() {
        return OrderCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomFieldChangedMessagePayloadBuilder builder(
            final OrderCustomFieldChangedMessagePayload template) {
        return OrderCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomFieldChangedMessagePayload(Function<OrderCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomFieldChangedMessagePayload>";
            }
        };
    }
}
