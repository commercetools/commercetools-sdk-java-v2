
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
 *  <p>Generated after adding a Custom Field to a PaymentMethodInfo using the Set MethodInfo CustomField update action on Payments and the Set MethodInfo CustomField update action on My Payments. If a Custom Field already exists with the same name, a PaymentMethodInfoCustomFieldChanged Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomFieldAddedMessagePayload paymentMethodInfoCustomFieldAddedMessagePayload = PaymentMethodInfoCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoCustomFieldAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoCustomFieldAddedMessagePayloadImpl.class)
public interface PaymentMethodInfoCustomFieldAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInfoCustomFieldAddedMessagePayload
     */
    String PAYMENT_METHOD_INFO_CUSTOM_FIELD_ADDED = "PaymentMethodInfoCustomFieldAdded";

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of PaymentMethodInfoCustomFieldAddedMessagePayload
     */
    public static PaymentMethodInfoCustomFieldAddedMessagePayload of() {
        return new PaymentMethodInfoCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoCustomFieldAddedMessagePayload of(
            final PaymentMethodInfoCustomFieldAddedMessagePayload template) {
        PaymentMethodInfoCustomFieldAddedMessagePayloadImpl instance = new PaymentMethodInfoCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public PaymentMethodInfoCustomFieldAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoCustomFieldAddedMessagePayload deepCopy(
            @Nullable final PaymentMethodInfoCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoCustomFieldAddedMessagePayloadImpl instance = new PaymentMethodInfoCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoCustomFieldAddedMessagePayload
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder builder() {
        return PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder builder(
            final PaymentMethodInfoCustomFieldAddedMessagePayload template) {
        return PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoCustomFieldAddedMessagePayload(
            Function<PaymentMethodInfoCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoCustomFieldAddedMessagePayload>";
            }
        };
    }
}
