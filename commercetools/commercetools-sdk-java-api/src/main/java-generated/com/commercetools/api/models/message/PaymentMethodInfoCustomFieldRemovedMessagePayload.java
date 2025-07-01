
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
 *  <p>Generated after removing a Custom Field from a PaymentMethodInfo using the Set MethodInfo CustomField update action on Payments and the Set MethodInfo CustomField update action on My Payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomFieldRemovedMessagePayload paymentMethodInfoCustomFieldRemovedMessagePayload = PaymentMethodInfoCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoCustomFieldRemovedMessagePayloadImpl.class)
public interface PaymentMethodInfoCustomFieldRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInfoCustomFieldRemovedMessagePayload
     */
    String PAYMENT_METHOD_INFO_CUSTOM_FIELD_REMOVED = "PaymentMethodInfoCustomFieldRemoved";

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
     * @return instance of PaymentMethodInfoCustomFieldRemovedMessagePayload
     */
    public static PaymentMethodInfoCustomFieldRemovedMessagePayload of() {
        return new PaymentMethodInfoCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoCustomFieldRemovedMessagePayload of(
            final PaymentMethodInfoCustomFieldRemovedMessagePayload template) {
        PaymentMethodInfoCustomFieldRemovedMessagePayloadImpl instance = new PaymentMethodInfoCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    public PaymentMethodInfoCustomFieldRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final PaymentMethodInfoCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoCustomFieldRemovedMessagePayloadImpl instance = new PaymentMethodInfoCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder builder() {
        return PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder builder(
            final PaymentMethodInfoCustomFieldRemovedMessagePayload template) {
        return PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoCustomFieldRemovedMessagePayload(
            Function<PaymentMethodInfoCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
