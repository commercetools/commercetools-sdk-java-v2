
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
 *  <p>Generated when the Express Payments process is completed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentCompleted expressPaymentCompleted = ExpressPaymentCompleted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("express_payment_completed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpressPaymentCompletedImpl.class)
public interface ExpressPaymentCompleted extends ResponseMessage {

    /**
     * discriminator value for ExpressPaymentCompleted
     */
    String EXPRESS_PAYMENT_COMPLETED = "express_payment_completed";

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
     *  <p>Express payment for <code>{orderId}</code> completed.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Contains the <code>order</code> object with the <code>id</code> property.</p>
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
     *  <p>Express payment for <code>{orderId}</code> completed.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Contains the <code>order</code> object with the <code>id</code> property.</p>
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
     * @return instance of ExpressPaymentCompleted
     */
    public static ExpressPaymentCompleted of() {
        return new ExpressPaymentCompletedImpl();
    }

    /**
     * factory method to create a shallow copy ExpressPaymentCompleted
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpressPaymentCompleted of(final ExpressPaymentCompleted template) {
        ExpressPaymentCompletedImpl instance = new ExpressPaymentCompletedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ExpressPaymentCompleted copyDeep();

    /**
     * factory method to create a deep copy of ExpressPaymentCompleted
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpressPaymentCompleted deepCopy(@Nullable final ExpressPaymentCompleted template) {
        if (template == null) {
            return null;
        }
        ExpressPaymentCompletedImpl instance = new ExpressPaymentCompletedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ExpressPaymentCompleted
     * @return builder
     */
    public static ExpressPaymentCompletedBuilder builder() {
        return ExpressPaymentCompletedBuilder.of();
    }

    /**
     * create builder for ExpressPaymentCompleted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentCompletedBuilder builder(final ExpressPaymentCompleted template) {
        return ExpressPaymentCompletedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpressPaymentCompleted(Function<ExpressPaymentCompleted, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentCompleted> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpressPaymentCompleted>() {
            @Override
            public String toString() {
                return "TypeReference<ExpressPaymentCompleted>";
            }
        };
    }
}
