
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
 *  <p>Generated after removing a Custom Field from a Payment Method using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomFieldRemovedMessagePayload paymentMethodCustomFieldRemovedMessagePayload = PaymentMethodCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodCustomFieldRemovedMessagePayloadImpl.class)
public interface PaymentMethodCustomFieldRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodCustomFieldRemovedMessagePayload
     */
    String PAYMENT_METHOD_CUSTOM_FIELD_REMOVED = "PaymentMethodCustomFieldRemoved";

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
     * @return instance of PaymentMethodCustomFieldRemovedMessagePayload
     */
    public static PaymentMethodCustomFieldRemovedMessagePayload of() {
        return new PaymentMethodCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodCustomFieldRemovedMessagePayload of(
            final PaymentMethodCustomFieldRemovedMessagePayload template) {
        PaymentMethodCustomFieldRemovedMessagePayloadImpl instance = new PaymentMethodCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    public PaymentMethodCustomFieldRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final PaymentMethodCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodCustomFieldRemovedMessagePayloadImpl instance = new PaymentMethodCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static PaymentMethodCustomFieldRemovedMessagePayloadBuilder builder() {
        return PaymentMethodCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomFieldRemovedMessagePayloadBuilder builder(
            final PaymentMethodCustomFieldRemovedMessagePayload template) {
        return PaymentMethodCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodCustomFieldRemovedMessagePayload(
            Function<PaymentMethodCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
