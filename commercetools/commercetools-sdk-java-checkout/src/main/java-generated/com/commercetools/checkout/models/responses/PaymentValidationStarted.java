
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when the validation of the payment information entered by the customer starts.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentValidationStarted paymentValidationStarted = PaymentValidationStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_validation_started")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentValidationStartedImpl.class)
public interface PaymentValidationStarted extends Message {

    /**
     * discriminator value for PaymentValidationStarted
     */
    String PAYMENT_VALIDATION_STARTED = "payment_validation_started";

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
     *  <p>Payment validation started.</p>
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
     *  <p>`info`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Payment validation started.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     * factory method
     * @return instance of PaymentValidationStarted
     */
    public static PaymentValidationStarted of() {
        return new PaymentValidationStartedImpl();
    }

    /**
     * factory method to create a shallow copy PaymentValidationStarted
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentValidationStarted of(final PaymentValidationStarted template) {
        PaymentValidationStartedImpl instance = new PaymentValidationStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public PaymentValidationStarted copyDeep();

    /**
     * factory method to create a deep copy of PaymentValidationStarted
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentValidationStarted deepCopy(@Nullable final PaymentValidationStarted template) {
        if (template == null) {
            return null;
        }
        PaymentValidationStartedImpl instance = new PaymentValidationStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for PaymentValidationStarted
     * @return builder
     */
    public static PaymentValidationStartedBuilder builder() {
        return PaymentValidationStartedBuilder.of();
    }

    /**
     * create builder for PaymentValidationStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentValidationStartedBuilder builder(final PaymentValidationStarted template) {
        return PaymentValidationStartedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentValidationStarted(Function<PaymentValidationStarted, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentValidationStarted> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentValidationStarted>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentValidationStarted>";
            }
        };
    }
}
