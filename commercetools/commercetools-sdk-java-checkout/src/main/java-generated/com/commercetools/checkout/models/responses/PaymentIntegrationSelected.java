
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
 *  <p>Generated when the customer selects the payment integration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationSelected paymentIntegrationSelected = PaymentIntegrationSelected.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_integration_selected")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationSelectedImpl.class)
public interface PaymentIntegrationSelected extends ResponseMessage {

    /**
     * discriminator value for PaymentIntegrationSelected
     */
    String PAYMENT_INTEGRATION_SELECTED = "payment_integration_selected";

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
     * @return instance of PaymentIntegrationSelected
     */
    public static PaymentIntegrationSelected of() {
        return new PaymentIntegrationSelectedImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationSelected
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationSelected of(final PaymentIntegrationSelected template) {
        PaymentIntegrationSelectedImpl instance = new PaymentIntegrationSelectedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentIntegrationSelected copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationSelected
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationSelected deepCopy(@Nullable final PaymentIntegrationSelected template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationSelectedImpl instance = new PaymentIntegrationSelectedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationSelected
     * @return builder
     */
    public static PaymentIntegrationSelectedBuilder builder() {
        return PaymentIntegrationSelectedBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationSelected instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationSelectedBuilder builder(final PaymentIntegrationSelected template) {
        return PaymentIntegrationSelectedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationSelected(Function<PaymentIntegrationSelected, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationSelected> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationSelected>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationSelected>";
            }
        };
    }
}
