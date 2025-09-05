
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
 *  <p>Generated when Checkout receives and loads the payment integrations configured for the Application.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationsReceived paymentIntegrationsReceived = PaymentIntegrationsReceived.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_integrations_received")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationsReceivedImpl.class)
public interface PaymentIntegrationsReceived extends ResponseMessage {

    /**
     * discriminator value for PaymentIntegrationsReceived
     */
    String PAYMENT_INTEGRATIONS_RECEIVED = "payment_integrations_received";

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
     *  <p>Payment integrations received.</p>
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
     *  <p>Contains the <code>paymentIntegrations</code> array of objects with the <code>type</code> and <code>connectorId</code> properties.</p>
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
     *  <p>Payment integrations received.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>paymentIntegrations</code> array of objects with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of PaymentIntegrationsReceived
     */
    public static PaymentIntegrationsReceived of() {
        return new PaymentIntegrationsReceivedImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationsReceived
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationsReceived of(final PaymentIntegrationsReceived template) {
        PaymentIntegrationsReceivedImpl instance = new PaymentIntegrationsReceivedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentIntegrationsReceived copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationsReceived
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationsReceived deepCopy(@Nullable final PaymentIntegrationsReceived template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationsReceivedImpl instance = new PaymentIntegrationsReceivedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationsReceived
     * @return builder
     */
    public static PaymentIntegrationsReceivedBuilder builder() {
        return PaymentIntegrationsReceivedBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationsReceived instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationsReceivedBuilder builder(final PaymentIntegrationsReceived template) {
        return PaymentIntegrationsReceivedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationsReceived(Function<PaymentIntegrationsReceived, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationsReceived> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationsReceived>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationsReceived>";
            }
        };
    }
}
