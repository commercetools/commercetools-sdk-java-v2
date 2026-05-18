
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
 *  <p>Generated when the customer clicks an Express Payments button and the Express Payment process starts.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentStarted expressPaymentStarted = ExpressPaymentStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("express_payment_started")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpressPaymentStartedImpl.class)
public interface ExpressPaymentStarted extends ResponseMessage {

    /**
     * discriminator value for ExpressPaymentStarted
     */
    String EXPRESS_PAYMENT_STARTED = "express_payment_started";

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
     *  <p>Express payment started.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property.</p>
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
     *  <p>`info`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Express payment started.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property.</p>
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
     * @return instance of ExpressPaymentStarted
     */
    public static ExpressPaymentStarted of() {
        return new ExpressPaymentStartedImpl();
    }

    /**
     * factory method to create a shallow copy ExpressPaymentStarted
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpressPaymentStarted of(final ExpressPaymentStarted template) {
        ExpressPaymentStartedImpl instance = new ExpressPaymentStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ExpressPaymentStarted copyDeep();

    /**
     * factory method to create a deep copy of ExpressPaymentStarted
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpressPaymentStarted deepCopy(@Nullable final ExpressPaymentStarted template) {
        if (template == null) {
            return null;
        }
        ExpressPaymentStartedImpl instance = new ExpressPaymentStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ExpressPaymentStarted
     * @return builder
     */
    public static ExpressPaymentStartedBuilder builder() {
        return ExpressPaymentStartedBuilder.of();
    }

    /**
     * create builder for ExpressPaymentStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentStartedBuilder builder(final ExpressPaymentStarted template) {
        return ExpressPaymentStartedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpressPaymentStarted(Function<ExpressPaymentStarted, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentStarted> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentStarted>() {
            @Override
            public String toString() {
                return "TypeReference<ExpressPaymentStarted>";
            }
        };
    }
}
