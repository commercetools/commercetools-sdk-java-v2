
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
 *  <p>Generated after adding a Custom Field to a Payment Method using the Set CustomField update action. If a Custom Field already exists with the same name, a PaymentMethodCustomFieldChanged Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomFieldAddedMessagePayload paymentMethodCustomFieldAddedMessagePayload = PaymentMethodCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodCustomFieldAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodCustomFieldAddedMessagePayloadImpl.class)
public interface PaymentMethodCustomFieldAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodCustomFieldAddedMessagePayload
     */
    String PAYMENT_METHOD_CUSTOM_FIELD_ADDED = "PaymentMethodCustomFieldAdded";

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
     * @return instance of PaymentMethodCustomFieldAddedMessagePayload
     */
    public static PaymentMethodCustomFieldAddedMessagePayload of() {
        return new PaymentMethodCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodCustomFieldAddedMessagePayload of(
            final PaymentMethodCustomFieldAddedMessagePayload template) {
        PaymentMethodCustomFieldAddedMessagePayloadImpl instance = new PaymentMethodCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public PaymentMethodCustomFieldAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodCustomFieldAddedMessagePayload deepCopy(
            @Nullable final PaymentMethodCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodCustomFieldAddedMessagePayloadImpl instance = new PaymentMethodCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodCustomFieldAddedMessagePayload
     * @return builder
     */
    public static PaymentMethodCustomFieldAddedMessagePayloadBuilder builder() {
        return PaymentMethodCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomFieldAddedMessagePayloadBuilder builder(
            final PaymentMethodCustomFieldAddedMessagePayload template) {
        return PaymentMethodCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodCustomFieldAddedMessagePayload(
            Function<PaymentMethodCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodCustomFieldAddedMessagePayload>";
            }
        };
    }
}
