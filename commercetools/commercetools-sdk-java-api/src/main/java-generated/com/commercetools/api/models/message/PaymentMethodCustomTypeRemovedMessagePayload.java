
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing a Custom Type from a Payment Method using the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetCustomTypeAction" rel="nofollow">Set Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomTypeRemovedMessagePayload paymentMethodCustomTypeRemovedMessagePayload = PaymentMethodCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodCustomTypeRemovedMessagePayloadImpl.class)
public interface PaymentMethodCustomTypeRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodCustomTypeRemovedMessagePayload
     */
    String PAYMENT_METHOD_CUSTOM_TYPE_REMOVED = "PaymentMethodCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of PaymentMethodCustomTypeRemovedMessagePayload
     */
    public static PaymentMethodCustomTypeRemovedMessagePayload of() {
        return new PaymentMethodCustomTypeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodCustomTypeRemovedMessagePayload of(
            final PaymentMethodCustomTypeRemovedMessagePayload template) {
        PaymentMethodCustomTypeRemovedMessagePayloadImpl instance = new PaymentMethodCustomTypeRemovedMessagePayloadImpl();
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    public PaymentMethodCustomTypeRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodCustomTypeRemovedMessagePayload deepCopy(
            @Nullable final PaymentMethodCustomTypeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodCustomTypeRemovedMessagePayloadImpl instance = new PaymentMethodCustomTypeRemovedMessagePayloadImpl();
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodCustomTypeRemovedMessagePayload
     * @return builder
     */
    public static PaymentMethodCustomTypeRemovedMessagePayloadBuilder builder() {
        return PaymentMethodCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomTypeRemovedMessagePayloadBuilder builder(
            final PaymentMethodCustomTypeRemovedMessagePayload template) {
        return PaymentMethodCustomTypeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodCustomTypeRemovedMessagePayload(
            Function<PaymentMethodCustomTypeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomTypeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomTypeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodCustomTypeRemovedMessagePayload>";
            }
        };
    }
}
