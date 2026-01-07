
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
 *  <p>Generated when the customer cancels the Express Payments process.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentCancelled expressPaymentCancelled = ExpressPaymentCancelled.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("express_payment_cancelled")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpressPaymentCancelledImpl.class)
public interface ExpressPaymentCancelled extends ResponseMessage {

    /**
     * discriminator value for ExpressPaymentCancelled
     */
    String EXPRESS_PAYMENT_CANCELLED = "express_payment_cancelled";

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
     *  <p>Express Payments process cancelled.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Contains the <code>paymentReference</code> and <code>method</code> object with the <code>type</code> property (if available).</p>
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
     *  <p>Express Payments process cancelled.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Contains the <code>paymentReference</code> and <code>method</code> object with the <code>type</code> property (if available).</p>
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
     * @return instance of ExpressPaymentCancelled
     */
    public static ExpressPaymentCancelled of() {
        return new ExpressPaymentCancelledImpl();
    }

    /**
     * factory method to create a shallow copy ExpressPaymentCancelled
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpressPaymentCancelled of(final ExpressPaymentCancelled template) {
        ExpressPaymentCancelledImpl instance = new ExpressPaymentCancelledImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ExpressPaymentCancelled copyDeep();

    /**
     * factory method to create a deep copy of ExpressPaymentCancelled
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpressPaymentCancelled deepCopy(@Nullable final ExpressPaymentCancelled template) {
        if (template == null) {
            return null;
        }
        ExpressPaymentCancelledImpl instance = new ExpressPaymentCancelledImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ExpressPaymentCancelled
     * @return builder
     */
    public static ExpressPaymentCancelledBuilder builder() {
        return ExpressPaymentCancelledBuilder.of();
    }

    /**
     * create builder for ExpressPaymentCancelled instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentCancelledBuilder builder(final ExpressPaymentCancelled template) {
        return ExpressPaymentCancelledBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpressPaymentCancelled(Function<ExpressPaymentCancelled, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentCancelled> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentCancelled>() {
            @Override
            public String toString() {
                return "TypeReference<ExpressPaymentCancelled>";
            }
        };
    }
}
