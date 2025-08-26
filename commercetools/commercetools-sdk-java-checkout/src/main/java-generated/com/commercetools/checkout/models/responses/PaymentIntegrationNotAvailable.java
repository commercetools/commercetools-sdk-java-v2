
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
 *  <p>Generated when there is an error with the selected payment integration and the payment integration is unavailable.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationNotAvailable paymentIntegrationNotAvailable = PaymentIntegrationNotAvailable.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_integration_not_available")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationNotAvailableImpl.class)
public interface PaymentIntegrationNotAvailable extends ResponseMessage {

    /**
     * discriminator value for PaymentIntegrationNotAvailable
     */
    String PAYMENT_INTEGRATION_NOT_AVAILABLE = "payment_integration_not_available";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`warn`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Payment integration not available.</p>
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
     *  <p>Contains the <code>method</code> object with the <code>type</code>, <code>id</code>, and <code>connectorId</code> properties.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Payment integration not available.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>method</code> object with the <code>type</code>, <code>id</code>, and <code>connectorId</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of PaymentIntegrationNotAvailable
     */
    public static PaymentIntegrationNotAvailable of() {
        return new PaymentIntegrationNotAvailableImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationNotAvailable
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationNotAvailable of(final PaymentIntegrationNotAvailable template) {
        PaymentIntegrationNotAvailableImpl instance = new PaymentIntegrationNotAvailableImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentIntegrationNotAvailable copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationNotAvailable
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationNotAvailable deepCopy(@Nullable final PaymentIntegrationNotAvailable template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationNotAvailableImpl instance = new PaymentIntegrationNotAvailableImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationNotAvailable
     * @return builder
     */
    public static PaymentIntegrationNotAvailableBuilder builder() {
        return PaymentIntegrationNotAvailableBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationNotAvailable instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationNotAvailableBuilder builder(final PaymentIntegrationNotAvailable template) {
        return PaymentIntegrationNotAvailableBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationNotAvailable(Function<PaymentIntegrationNotAvailable, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationNotAvailable> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationNotAvailable>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationNotAvailable>";
            }
        };
    }
}
