
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
 *  <p>Generated when a requested Express Payments integration is not available. This can happen when using <code>mountMethod()</code> with a payment method that is not configured or not available for the current session.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentIntegrationNotAvailable expressPaymentIntegrationNotAvailable = ExpressPaymentIntegrationNotAvailable.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("express_payment_integration_not_available")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpressPaymentIntegrationNotAvailableImpl.class)
public interface ExpressPaymentIntegrationNotAvailable extends ResponseMessage {

    /**
     * discriminator value for ExpressPaymentIntegrationNotAvailable
     */
    String EXPRESS_PAYMENT_INTEGRATION_NOT_AVAILABLE = "express_payment_integration_not_available";

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
     *  <p>Express Payments integration not available.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property indicating the requested payment integration type, and <code>availableMethods</code> array listing the available payment methods.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Express Payments integration not available.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property indicating the requested payment integration type, and <code>availableMethods</code> array listing the available payment methods.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     * factory method
     * @return instance of ExpressPaymentIntegrationNotAvailable
     */
    public static ExpressPaymentIntegrationNotAvailable of() {
        return new ExpressPaymentIntegrationNotAvailableImpl();
    }

    /**
     * factory method to create a shallow copy ExpressPaymentIntegrationNotAvailable
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpressPaymentIntegrationNotAvailable of(final ExpressPaymentIntegrationNotAvailable template) {
        ExpressPaymentIntegrationNotAvailableImpl instance = new ExpressPaymentIntegrationNotAvailableImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ExpressPaymentIntegrationNotAvailable copyDeep();

    /**
     * factory method to create a deep copy of ExpressPaymentIntegrationNotAvailable
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpressPaymentIntegrationNotAvailable deepCopy(
            @Nullable final ExpressPaymentIntegrationNotAvailable template) {
        if (template == null) {
            return null;
        }
        ExpressPaymentIntegrationNotAvailableImpl instance = new ExpressPaymentIntegrationNotAvailableImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ExpressPaymentIntegrationNotAvailable
     * @return builder
     */
    public static ExpressPaymentIntegrationNotAvailableBuilder builder() {
        return ExpressPaymentIntegrationNotAvailableBuilder.of();
    }

    /**
     * create builder for ExpressPaymentIntegrationNotAvailable instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentIntegrationNotAvailableBuilder builder(
            final ExpressPaymentIntegrationNotAvailable template) {
        return ExpressPaymentIntegrationNotAvailableBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpressPaymentIntegrationNotAvailable(Function<ExpressPaymentIntegrationNotAvailable, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentIntegrationNotAvailable> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentIntegrationNotAvailable>() {
            @Override
            public String toString() {
                return "TypeReference<ExpressPaymentIntegrationNotAvailable>";
            }
        };
    }
}
