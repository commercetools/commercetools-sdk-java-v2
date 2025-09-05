
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
 *  <p>Generated when the selected payment integration is loading.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationLoading paymentIntegrationLoading = PaymentIntegrationLoading.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_integration_loading")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationLoadingImpl.class)
public interface PaymentIntegrationLoading extends ResponseMessage {

    /**
     * discriminator value for PaymentIntegrationLoading
     */
    String PAYMENT_INTEGRATION_LOADING = "payment_integration_loading";

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
     *  <p>Payment integration loading.</p>
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
     *  <p>Payment integration loading.</p>
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
     * @return instance of PaymentIntegrationLoading
     */
    public static PaymentIntegrationLoading of() {
        return new PaymentIntegrationLoadingImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationLoading
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationLoading of(final PaymentIntegrationLoading template) {
        PaymentIntegrationLoadingImpl instance = new PaymentIntegrationLoadingImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentIntegrationLoading copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationLoading
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationLoading deepCopy(@Nullable final PaymentIntegrationLoading template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationLoadingImpl instance = new PaymentIntegrationLoadingImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationLoading
     * @return builder
     */
    public static PaymentIntegrationLoadingBuilder builder() {
        return PaymentIntegrationLoadingBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationLoading instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationLoadingBuilder builder(final PaymentIntegrationLoading template) {
        return PaymentIntegrationLoadingBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationLoading(Function<PaymentIntegrationLoading, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationLoading> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationLoading>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationLoading>";
            }
        };
    }
}
