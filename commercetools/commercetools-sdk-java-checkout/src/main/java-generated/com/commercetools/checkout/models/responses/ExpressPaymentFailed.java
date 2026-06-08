
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
 *  <p>Generated when the Express Payments process fails.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentFailed expressPaymentFailed = ExpressPaymentFailed.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("express_payment_failed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpressPaymentFailedImpl.class)
public interface ExpressPaymentFailed extends ResponseMessage {

    /**
     * discriminator value for ExpressPaymentFailed
     */
    String EXPRESS_PAYMENT_FAILED = "express_payment_failed";

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
     *  <p>Express payment failed.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Contains the <code>paymentReference</code>, <code>error</code>, and <code>method</code> object with the <code>type</code> property (if available).</p>
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
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Express payment failed.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Contains the <code>paymentReference</code>, <code>error</code>, and <code>method</code> object with the <code>type</code> property (if available).</p>
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
     * @return instance of ExpressPaymentFailed
     */
    public static ExpressPaymentFailed of() {
        return new ExpressPaymentFailedImpl();
    }

    /**
     * factory method to create a shallow copy ExpressPaymentFailed
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpressPaymentFailed of(final ExpressPaymentFailed template) {
        ExpressPaymentFailedImpl instance = new ExpressPaymentFailedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ExpressPaymentFailed copyDeep();

    /**
     * factory method to create a deep copy of ExpressPaymentFailed
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpressPaymentFailed deepCopy(@Nullable final ExpressPaymentFailed template) {
        if (template == null) {
            return null;
        }
        ExpressPaymentFailedImpl instance = new ExpressPaymentFailedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ExpressPaymentFailed
     * @return builder
     */
    public static ExpressPaymentFailedBuilder builder() {
        return ExpressPaymentFailedBuilder.of();
    }

    /**
     * create builder for ExpressPaymentFailed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentFailedBuilder builder(final ExpressPaymentFailed template) {
        return ExpressPaymentFailedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpressPaymentFailed(Function<ExpressPaymentFailed, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentFailed> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentFailed>() {
            @Override
            public String toString() {
                return "TypeReference<ExpressPaymentFailed>";
            }
        };
    }
}
