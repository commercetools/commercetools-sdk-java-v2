
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment_method.PaymentMethodStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set PaymentMethodStatus update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodPaymentMethodStatusSetMessagePayload paymentMethodPaymentMethodStatusSetMessagePayload = PaymentMethodPaymentMethodStatusSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodPaymentMethodStatusSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodPaymentMethodStatusSetMessagePayloadImpl.class)
public interface PaymentMethodPaymentMethodStatusSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodPaymentMethodStatusSetMessagePayload
     */
    String PAYMENT_METHOD_PAYMENT_METHOD_STATUS_SET = "PaymentMethodPaymentMethodStatusSet";

    /**
     *  <p>Status of the Payment Method after the Set PaymentMethodStatus update action.</p>
     * @return status
     */

    @JsonProperty("status")
    public PaymentMethodStatus getStatus();

    /**
     *  <p>Status of the Payment Method before the Set PaymentMethodStatus update action.</p>
     * @return oldStatus
     */

    @JsonProperty("oldStatus")
    public PaymentMethodStatus getOldStatus();

    /**
     *  <p>Status of the Payment Method after the Set PaymentMethodStatus update action.</p>
     * @param status value to be set
     */

    public void setStatus(final PaymentMethodStatus status);

    /**
     *  <p>Status of the Payment Method before the Set PaymentMethodStatus update action.</p>
     * @param oldStatus value to be set
     */

    public void setOldStatus(final PaymentMethodStatus oldStatus);

    /**
     * factory method
     * @return instance of PaymentMethodPaymentMethodStatusSetMessagePayload
     */
    public static PaymentMethodPaymentMethodStatusSetMessagePayload of() {
        return new PaymentMethodPaymentMethodStatusSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodPaymentMethodStatusSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodPaymentMethodStatusSetMessagePayload of(
            final PaymentMethodPaymentMethodStatusSetMessagePayload template) {
        PaymentMethodPaymentMethodStatusSetMessagePayloadImpl instance = new PaymentMethodPaymentMethodStatusSetMessagePayloadImpl();
        instance.setStatus(template.getStatus());
        instance.setOldStatus(template.getOldStatus());
        return instance;
    }

    public PaymentMethodPaymentMethodStatusSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodPaymentMethodStatusSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodPaymentMethodStatusSetMessagePayload deepCopy(
            @Nullable final PaymentMethodPaymentMethodStatusSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodPaymentMethodStatusSetMessagePayloadImpl instance = new PaymentMethodPaymentMethodStatusSetMessagePayloadImpl();
        instance.setStatus(template.getStatus());
        instance.setOldStatus(template.getOldStatus());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodPaymentMethodStatusSetMessagePayload
     * @return builder
     */
    public static PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder builder() {
        return PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodPaymentMethodStatusSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder builder(
            final PaymentMethodPaymentMethodStatusSetMessagePayload template) {
        return PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodPaymentMethodStatusSetMessagePayload(
            Function<PaymentMethodPaymentMethodStatusSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodPaymentMethodStatusSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodPaymentMethodStatusSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodPaymentMethodStatusSetMessagePayload>";
            }
        };
    }
}
