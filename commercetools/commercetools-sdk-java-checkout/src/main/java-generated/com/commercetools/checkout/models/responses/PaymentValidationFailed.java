
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
 *  <p>Generated when Checkout and the payment service provider (PSP) do not validate the payment information entered by the customer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentValidationFailed paymentValidationFailed = PaymentValidationFailed.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_validation_failed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentValidationFailedImpl.class)
public interface PaymentValidationFailed extends ResponseMessage {

    /**
     * discriminator value for PaymentValidationFailed
     */
    String PAYMENT_VALIDATION_FAILED = "payment_validation_failed";

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
     *  <p>Payment validation failed.</p>
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
     *  <p>Payment validation failed.</p>
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
     * @return instance of PaymentValidationFailed
     */
    public static PaymentValidationFailed of() {
        return new PaymentValidationFailedImpl();
    }

    /**
     * factory method to create a shallow copy PaymentValidationFailed
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentValidationFailed of(final PaymentValidationFailed template) {
        PaymentValidationFailedImpl instance = new PaymentValidationFailedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentValidationFailed copyDeep();

    /**
     * factory method to create a deep copy of PaymentValidationFailed
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentValidationFailed deepCopy(@Nullable final PaymentValidationFailed template) {
        if (template == null) {
            return null;
        }
        PaymentValidationFailedImpl instance = new PaymentValidationFailedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(com.commercetools.checkout.models.payment.PaymentReference.deepCopy(template.getPayload()));
        return instance;
    }

    /**
     * builder factory method for PaymentValidationFailed
     * @return builder
     */
    public static PaymentValidationFailedBuilder builder() {
        return PaymentValidationFailedBuilder.of();
    }

    /**
     * create builder for PaymentValidationFailed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentValidationFailedBuilder builder(final PaymentValidationFailed template) {
        return PaymentValidationFailedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentValidationFailed(Function<PaymentValidationFailed, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentValidationFailed> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentValidationFailed>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentValidationFailed>";
            }
        };
    }
}
