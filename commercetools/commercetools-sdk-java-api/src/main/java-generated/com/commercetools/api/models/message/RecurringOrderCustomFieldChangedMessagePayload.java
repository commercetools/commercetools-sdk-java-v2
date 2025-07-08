
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
 *  <p>Generated when an existing Custom Field has been changed using the Set CustomField action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomFieldChangedMessagePayload recurringOrderCustomFieldChangedMessagePayload = RecurringOrderCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderCustomFieldChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderCustomFieldChangedMessagePayloadImpl.class)
public interface RecurringOrderCustomFieldChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderCustomFieldChangedMessagePayload
     */
    String RECURRING_ORDER_CUSTOM_FIELD_CHANGED = "RecurringOrderCustomFieldChanged";

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
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Order before, an Order Custom Field Added Message is generated instead.</p>
     * @return previousValue
     */

    @JsonProperty("previousValue")
    public Object getPreviousValue();

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
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Order before, an Order Custom Field Added Message is generated instead.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     * factory method
     * @return instance of RecurringOrderCustomFieldChangedMessagePayload
     */
    public static RecurringOrderCustomFieldChangedMessagePayload of() {
        return new RecurringOrderCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderCustomFieldChangedMessagePayload of(
            final RecurringOrderCustomFieldChangedMessagePayload template) {
        RecurringOrderCustomFieldChangedMessagePayloadImpl instance = new RecurringOrderCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public RecurringOrderCustomFieldChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderCustomFieldChangedMessagePayload deepCopy(
            @Nullable final RecurringOrderCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderCustomFieldChangedMessagePayloadImpl instance = new RecurringOrderCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderCustomFieldChangedMessagePayload
     * @return builder
     */
    public static RecurringOrderCustomFieldChangedMessagePayloadBuilder builder() {
        return RecurringOrderCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomFieldChangedMessagePayloadBuilder builder(
            final RecurringOrderCustomFieldChangedMessagePayload template) {
        return RecurringOrderCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderCustomFieldChangedMessagePayload(
            Function<RecurringOrderCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderCustomFieldChangedMessagePayload>";
            }
        };
    }
}
