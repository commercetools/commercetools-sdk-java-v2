
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.payment.Payment;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Payment request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentCreatedMessagePayload paymentCreatedMessagePayload = PaymentCreatedMessagePayload.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentCreatedMessagePayloadImpl.class)
public interface PaymentCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentCreatedMessagePayload
     */
    String PAYMENT_CREATED = "PaymentCreated";

    /**
     *  <p>Payment that was created.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public Payment getPayment();

    /**
     *  <p>Payment that was created.</p>
     * @param payment value to be set
     */

    public void setPayment(final Payment payment);

    /**
     * factory method
     * @return instance of PaymentCreatedMessagePayload
     */
    public static PaymentCreatedMessagePayload of() {
        return new PaymentCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentCreatedMessagePayload of(final PaymentCreatedMessagePayload template) {
        PaymentCreatedMessagePayloadImpl instance = new PaymentCreatedMessagePayloadImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentCreatedMessagePayload deepCopy(@Nullable final PaymentCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentCreatedMessagePayloadImpl instance = new PaymentCreatedMessagePayloadImpl();
        instance.setPayment(com.commercetools.api.models.payment.Payment.deepCopy(template.getPayment()));
        return instance;
    }

    /**
     * builder factory method for PaymentCreatedMessagePayload
     * @return builder
     */
    public static PaymentCreatedMessagePayloadBuilder builder() {
        return PaymentCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentCreatedMessagePayloadBuilder builder(final PaymentCreatedMessagePayload template) {
        return PaymentCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentCreatedMessagePayload(Function<PaymentCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentCreatedMessagePayload>";
            }
        };
    }
}
