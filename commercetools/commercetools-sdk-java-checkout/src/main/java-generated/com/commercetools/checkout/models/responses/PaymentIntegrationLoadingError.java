
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
 *  <p>Generated when the loading of the selected payment integration fails.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationLoadingError paymentIntegrationLoadingError = PaymentIntegrationLoadingError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_integration_loading_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationLoadingErrorImpl.class)
public interface PaymentIntegrationLoadingError extends ResponseMessage {

    /**
     * discriminator value for PaymentIntegrationLoadingError
     */
    String PAYMENT_INTEGRATION_LOADING_ERROR = "payment_integration_loading_error";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`error`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Payment integration loading failed.</p>
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
     *  <p>Contains an <code>error</code> object and the <code>integration</code> object with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Payment integration loading failed.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains an <code>error</code> object and the <code>integration</code> object with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of PaymentIntegrationLoadingError
     */
    public static PaymentIntegrationLoadingError of() {
        return new PaymentIntegrationLoadingErrorImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationLoadingError
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationLoadingError of(final PaymentIntegrationLoadingError template) {
        PaymentIntegrationLoadingErrorImpl instance = new PaymentIntegrationLoadingErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentIntegrationLoadingError copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationLoadingError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationLoadingError deepCopy(@Nullable final PaymentIntegrationLoadingError template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationLoadingErrorImpl instance = new PaymentIntegrationLoadingErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationLoadingError
     * @return builder
     */
    public static PaymentIntegrationLoadingErrorBuilder builder() {
        return PaymentIntegrationLoadingErrorBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationLoadingError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationLoadingErrorBuilder builder(final PaymentIntegrationLoadingError template) {
        return PaymentIntegrationLoadingErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationLoadingError(Function<PaymentIntegrationLoadingError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationLoadingError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationLoadingError>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationLoadingError>";
            }
        };
    }
}
