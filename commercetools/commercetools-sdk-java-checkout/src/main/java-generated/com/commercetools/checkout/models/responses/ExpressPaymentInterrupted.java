
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when the Express Payments process is interrupted by the seller's callback.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentInterrupted expressPaymentInterrupted = ExpressPaymentInterrupted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("express_payment_interrupted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpressPaymentInterruptedImpl.class)
public interface ExpressPaymentInterrupted extends Message {

    /**
     * discriminator value for ExpressPaymentInterrupted
     */
    String EXPRESS_PAYMENT_INTERRUPTED = "express_payment_interrupted";

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
     *  <p>Express Payments process was interrupted by a callback.</p>
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
     *  <p>`info`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Express Payments process was interrupted by a callback.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     * factory method
     * @return instance of ExpressPaymentInterrupted
     */
    public static ExpressPaymentInterrupted of() {
        return new ExpressPaymentInterruptedImpl();
    }

    /**
     * factory method to create a shallow copy ExpressPaymentInterrupted
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpressPaymentInterrupted of(final ExpressPaymentInterrupted template) {
        ExpressPaymentInterruptedImpl instance = new ExpressPaymentInterruptedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public ExpressPaymentInterrupted copyDeep();

    /**
     * factory method to create a deep copy of ExpressPaymentInterrupted
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpressPaymentInterrupted deepCopy(@Nullable final ExpressPaymentInterrupted template) {
        if (template == null) {
            return null;
        }
        ExpressPaymentInterruptedImpl instance = new ExpressPaymentInterruptedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for ExpressPaymentInterrupted
     * @return builder
     */
    public static ExpressPaymentInterruptedBuilder builder() {
        return ExpressPaymentInterruptedBuilder.of();
    }

    /**
     * create builder for ExpressPaymentInterrupted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentInterruptedBuilder builder(final ExpressPaymentInterrupted template) {
        return ExpressPaymentInterruptedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpressPaymentInterrupted(Function<ExpressPaymentInterrupted, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentInterrupted> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentInterrupted>() {
            @Override
            public String toString() {
                return "TypeReference<ExpressPaymentInterrupted>";
            }
        };
    }
}
