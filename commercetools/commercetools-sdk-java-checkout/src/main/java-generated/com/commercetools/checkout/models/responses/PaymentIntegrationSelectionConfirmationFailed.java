
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when the selection of the payment integration by the customer is not successful.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationSelectionConfirmationFailed paymentIntegrationSelectionConfirmationFailed = PaymentIntegrationSelectionConfirmationFailed.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_integration_selection_confirmation_failed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationSelectionConfirmationFailedImpl.class)
public interface PaymentIntegrationSelectionConfirmationFailed extends ResponseMessage {

    /**
     * discriminator value for PaymentIntegrationSelectionConfirmationFailed
     */
    String PAYMENT_INTEGRATION_SELECTION_CONFIRMATION_FAILED = "payment_integration_selection_confirmation_failed";

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
     *  <p>Payment integration selection failed.</p>
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
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Payment integration selection failed.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of PaymentIntegrationSelectionConfirmationFailed
     */
    public static PaymentIntegrationSelectionConfirmationFailed of() {
        return new PaymentIntegrationSelectionConfirmationFailedImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationSelectionConfirmationFailed
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationSelectionConfirmationFailed of(
            final PaymentIntegrationSelectionConfirmationFailed template) {
        PaymentIntegrationSelectionConfirmationFailedImpl instance = new PaymentIntegrationSelectionConfirmationFailedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentIntegrationSelectionConfirmationFailed copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationSelectionConfirmationFailed
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationSelectionConfirmationFailed deepCopy(
            @Nullable final PaymentIntegrationSelectionConfirmationFailed template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationSelectionConfirmationFailedImpl instance = new PaymentIntegrationSelectionConfirmationFailedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationSelectionConfirmationFailed
     * @return builder
     */
    public static PaymentIntegrationSelectionConfirmationFailedBuilder builder() {
        return PaymentIntegrationSelectionConfirmationFailedBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationSelectionConfirmationFailed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationSelectionConfirmationFailedBuilder builder(
            final PaymentIntegrationSelectionConfirmationFailed template) {
        return PaymentIntegrationSelectionConfirmationFailedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationSelectionConfirmationFailed(
            Function<PaymentIntegrationSelectionConfirmationFailed, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationSelectionConfirmationFailed> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationSelectionConfirmationFailed>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationSelectionConfirmationFailed>";
            }
        };
    }
}
