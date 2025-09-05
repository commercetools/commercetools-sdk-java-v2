
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
 *  <p>Generated when the selected payment integration is loaded.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationLoaded paymentIntegrationLoaded = PaymentIntegrationLoaded.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_integration_loaded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationLoadedImpl.class)
public interface PaymentIntegrationLoaded extends ResponseMessage {

    /**
     * discriminator value for PaymentIntegrationLoaded
     */
    String PAYMENT_INTEGRATION_LOADED = "payment_integration_loaded";

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
     *  <p>Payment integration loaded.</p>
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
     *  <p>Contains the <code>integration</code> object with the <code>type</code> and <code>connectorId</code> properties.</p>
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
     *  <p>Payment integration loaded.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of PaymentIntegrationLoaded
     */
    public static PaymentIntegrationLoaded of() {
        return new PaymentIntegrationLoadedImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationLoaded
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationLoaded of(final PaymentIntegrationLoaded template) {
        PaymentIntegrationLoadedImpl instance = new PaymentIntegrationLoadedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentIntegrationLoaded copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationLoaded
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationLoaded deepCopy(@Nullable final PaymentIntegrationLoaded template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationLoadedImpl instance = new PaymentIntegrationLoadedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationLoaded
     * @return builder
     */
    public static PaymentIntegrationLoadedBuilder builder() {
        return PaymentIntegrationLoadedBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationLoaded instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationLoadedBuilder builder(final PaymentIntegrationLoaded template) {
        return PaymentIntegrationLoadedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationLoaded(Function<PaymentIntegrationLoaded, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationLoaded> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationLoaded>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationLoaded>";
            }
        };
    }
}
