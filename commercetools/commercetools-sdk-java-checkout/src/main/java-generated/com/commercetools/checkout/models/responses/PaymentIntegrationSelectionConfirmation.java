
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
 *  <p>Generated when the customer has entered the payment integration information and moves to the next step.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationSelectionConfirmation paymentIntegrationSelectionConfirmation = PaymentIntegrationSelectionConfirmation.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_integration_selection_confirmation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationSelectionConfirmationImpl.class)
public interface PaymentIntegrationSelectionConfirmation extends ResponseMessage {

    /**
     * discriminator value for PaymentIntegrationSelectionConfirmation
     */
    String PAYMENT_INTEGRATION_SELECTION_CONFIRMATION = "payment_integration_selection_confirmation";

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
     *  <p>Payment integration selected.</p>
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
     *  <p>Contains the <code>integration</code> object with the <code>type</code> and <code>hasVendorButton</code> properties.</p>
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
     *  <p>Payment integration selected.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> and <code>hasVendorButton</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of PaymentIntegrationSelectionConfirmation
     */
    public static PaymentIntegrationSelectionConfirmation of() {
        return new PaymentIntegrationSelectionConfirmationImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationSelectionConfirmation
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationSelectionConfirmation of(final PaymentIntegrationSelectionConfirmation template) {
        PaymentIntegrationSelectionConfirmationImpl instance = new PaymentIntegrationSelectionConfirmationImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentIntegrationSelectionConfirmation copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationSelectionConfirmation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationSelectionConfirmation deepCopy(
            @Nullable final PaymentIntegrationSelectionConfirmation template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationSelectionConfirmationImpl instance = new PaymentIntegrationSelectionConfirmationImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationSelectionConfirmation
     * @return builder
     */
    public static PaymentIntegrationSelectionConfirmationBuilder builder() {
        return PaymentIntegrationSelectionConfirmationBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationSelectionConfirmation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationSelectionConfirmationBuilder builder(
            final PaymentIntegrationSelectionConfirmation template) {
        return PaymentIntegrationSelectionConfirmationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationSelectionConfirmation(
            Function<PaymentIntegrationSelectionConfirmation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationSelectionConfirmation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationSelectionConfirmation>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationSelectionConfirmation>";
            }
        };
    }
}
