
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
 *  <p>Generated when the payment starts.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStarted paymentStarted = PaymentStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment_started")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentStartedImpl.class)
public interface PaymentStarted extends ResponseMessage {

    /**
     * discriminator value for PaymentStarted
     */
    String PAYMENT_STARTED = "payment_started";

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
     *  <p>Payment started.</p>
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
     *  <p>Payment started.</p>
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
     * @return instance of PaymentStarted
     */
    public static PaymentStarted of() {
        return new PaymentStartedImpl();
    }

    /**
     * factory method to create a shallow copy PaymentStarted
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentStarted of(final PaymentStarted template) {
        PaymentStartedImpl instance = new PaymentStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public PaymentStarted copyDeep();

    /**
     * factory method to create a deep copy of PaymentStarted
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentStarted deepCopy(@Nullable final PaymentStarted template) {
        if (template == null) {
            return null;
        }
        PaymentStartedImpl instance = new PaymentStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for PaymentStarted
     * @return builder
     */
    public static PaymentStartedBuilder builder() {
        return PaymentStartedBuilder.of();
    }

    /**
     * create builder for PaymentStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStartedBuilder builder(final PaymentStarted template) {
        return PaymentStartedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentStarted(Function<PaymentStarted, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStarted> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStarted>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStarted>";
            }
        };
    }
}
