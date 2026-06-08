
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.payment.PaymentReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when the customer cancels the payment (for example, by closing the browser's window).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentCancelled paymentCancelled = PaymentCancelled.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_cancelled")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentCancelledImpl.class)
public interface PaymentCancelled extends ResponseMessage {

    /**
     * discriminator value for PaymentCancelled
     */
    String PAYMENT_CANCELLED = "payment_cancelled";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`info`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Payment cancelled.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public PaymentReference getPayload();

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Payment cancelled.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @param payload value to be set
     */

    public void setPayload(final PaymentReference payload);

    /**
     * factory method
     * @return instance of PaymentCancelled
     */
    public static PaymentCancelled of() {
        return new PaymentCancelledImpl();
    }

    /**
     * factory method to create a shallow copy PaymentCancelled
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentCancelled of(final PaymentCancelled template) {
        PaymentCancelledImpl instance = new PaymentCancelledImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentCancelled copyDeep();

    /**
     * factory method to create a deep copy of PaymentCancelled
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentCancelled deepCopy(@Nullable final PaymentCancelled template) {
        if (template == null) {
            return null;
        }
        PaymentCancelledImpl instance = new PaymentCancelledImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(com.commercetools.checkout.models.payment.PaymentReference.deepCopy(template.getPayload()));
        return instance;
    }

    /**
     * builder factory method for PaymentCancelled
     * @return builder
     */
    public static PaymentCancelledBuilder builder() {
        return PaymentCancelledBuilder.of();
    }

    /**
     * create builder for PaymentCancelled instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentCancelledBuilder builder(final PaymentCancelled template) {
        return PaymentCancelledBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentCancelled(Function<PaymentCancelled, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentCancelled> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentCancelled>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentCancelled>";
            }
        };
    }
}
