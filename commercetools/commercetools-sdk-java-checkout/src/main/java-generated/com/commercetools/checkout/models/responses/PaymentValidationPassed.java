
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
 *  <p>Generated when Checkout and the payment service provider (PSP) validate the payment information entered by the customer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentValidationPassed paymentValidationPassed = PaymentValidationPassed.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_validation_passed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentValidationPassedImpl.class)
public interface PaymentValidationPassed extends Message {

    /**
     * discriminator value for PaymentValidationPassed
     */
    String PAYMENT_VALIDATION_PASSED = "payment_validation_passed";

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
     *  <p>Payment validation passed.</p>
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
     *  <p>Payment validation passed.</p>
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
     * @return instance of PaymentValidationPassed
     */
    public static PaymentValidationPassed of() {
        return new PaymentValidationPassedImpl();
    }

    /**
     * factory method to create a shallow copy PaymentValidationPassed
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentValidationPassed of(final PaymentValidationPassed template) {
        PaymentValidationPassedImpl instance = new PaymentValidationPassedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public PaymentValidationPassed copyDeep();

    /**
     * factory method to create a deep copy of PaymentValidationPassed
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentValidationPassed deepCopy(@Nullable final PaymentValidationPassed template) {
        if (template == null) {
            return null;
        }
        PaymentValidationPassedImpl instance = new PaymentValidationPassedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for PaymentValidationPassed
     * @return builder
     */
    public static PaymentValidationPassedBuilder builder() {
        return PaymentValidationPassedBuilder.of();
    }

    /**
     * create builder for PaymentValidationPassed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentValidationPassedBuilder builder(final PaymentValidationPassed template) {
        return PaymentValidationPassedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentValidationPassed(Function<PaymentValidationPassed, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentValidationPassed> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentValidationPassed>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentValidationPassed>";
            }
        };
    }
}
