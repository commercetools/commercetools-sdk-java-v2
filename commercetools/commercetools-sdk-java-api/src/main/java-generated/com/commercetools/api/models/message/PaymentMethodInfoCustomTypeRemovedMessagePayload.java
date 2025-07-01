
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing Custom Fields from a PaymentMethodInfo using the Set MethodInfo Custom Type update action on Payments and the Set MethodInfo Custom Type update action on My Payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomTypeRemovedMessagePayload paymentMethodInfoCustomTypeRemovedMessagePayload = PaymentMethodInfoCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoCustomTypeRemovedMessagePayloadImpl.class)
public interface PaymentMethodInfoCustomTypeRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInfoCustomTypeRemovedMessagePayload
     */
    String PAYMENT_METHOD_INFO_CUSTOM_TYPE_REMOVED = "PaymentMethodInfoCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p><code>id</code> of the Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of PaymentMethodInfoCustomTypeRemovedMessagePayload
     */
    public static PaymentMethodInfoCustomTypeRemovedMessagePayload of() {
        return new PaymentMethodInfoCustomTypeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoCustomTypeRemovedMessagePayload of(
            final PaymentMethodInfoCustomTypeRemovedMessagePayload template) {
        PaymentMethodInfoCustomTypeRemovedMessagePayloadImpl instance = new PaymentMethodInfoCustomTypeRemovedMessagePayloadImpl();
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    public PaymentMethodInfoCustomTypeRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoCustomTypeRemovedMessagePayload deepCopy(
            @Nullable final PaymentMethodInfoCustomTypeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoCustomTypeRemovedMessagePayloadImpl instance = new PaymentMethodInfoCustomTypeRemovedMessagePayloadImpl();
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoCustomTypeRemovedMessagePayload
     * @return builder
     */
    public static PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder builder() {
        return PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder builder(
            final PaymentMethodInfoCustomTypeRemovedMessagePayload template) {
        return PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoCustomTypeRemovedMessagePayload(
            Function<PaymentMethodInfoCustomTypeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomTypeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomTypeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoCustomTypeRemovedMessagePayload>";
            }
        };
    }
}
