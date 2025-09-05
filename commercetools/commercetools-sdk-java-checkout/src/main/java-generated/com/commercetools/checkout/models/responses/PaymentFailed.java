
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
 *  <p>Generated when the payment fails.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentFailed paymentFailed = PaymentFailed.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_failed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentFailedImpl.class)
public interface PaymentFailed extends ResponseMessage {

    /**
     * discriminator value for PaymentFailed
     */
    String PAYMENT_FAILED = "payment_failed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`error`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Payment failed.</p>
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
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Payment failed.</p>
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
     * @return instance of PaymentFailed
     */
    public static PaymentFailed of() {
        return new PaymentFailedImpl();
    }

    /**
     * factory method to create a shallow copy PaymentFailed
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentFailed of(final PaymentFailed template) {
        PaymentFailedImpl instance = new PaymentFailedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentFailed copyDeep();

    /**
     * factory method to create a deep copy of PaymentFailed
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentFailed deepCopy(@Nullable final PaymentFailed template) {
        if (template == null) {
            return null;
        }
        PaymentFailedImpl instance = new PaymentFailedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(com.commercetools.checkout.models.payment.PaymentReference.deepCopy(template.getPayload()));
        return instance;
    }

    /**
     * builder factory method for PaymentFailed
     * @return builder
     */
    public static PaymentFailedBuilder builder() {
        return PaymentFailedBuilder.of();
    }

    /**
     * create builder for PaymentFailed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentFailedBuilder builder(final PaymentFailed template) {
        return PaymentFailedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentFailed(Function<PaymentFailed, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentFailed> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentFailed>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentFailed>";
            }
        };
    }
}
