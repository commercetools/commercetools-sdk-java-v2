
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
 *  <p>Generated when Checkout starts verifying the <span>Order</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderVerificationStarted orderVerificationStarted = OrderVerificationStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("order_verification_started")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderVerificationStartedImpl.class)
public interface OrderVerificationStarted extends Message {

    /**
     * discriminator value for OrderVerificationStarted
     */
    String ORDER_VERIFICATION_STARTED = "order_verification_started";

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
     *  <p>Order verification started.</p>
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
     *  <p>Order verification started.</p>
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
     * @return instance of OrderVerificationStarted
     */
    public static OrderVerificationStarted of() {
        return new OrderVerificationStartedImpl();
    }

    /**
     * factory method to create a shallow copy OrderVerificationStarted
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderVerificationStarted of(final OrderVerificationStarted template) {
        OrderVerificationStartedImpl instance = new OrderVerificationStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public OrderVerificationStarted copyDeep();

    /**
     * factory method to create a deep copy of OrderVerificationStarted
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderVerificationStarted deepCopy(@Nullable final OrderVerificationStarted template) {
        if (template == null) {
            return null;
        }
        OrderVerificationStartedImpl instance = new OrderVerificationStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for OrderVerificationStarted
     * @return builder
     */
    public static OrderVerificationStartedBuilder builder() {
        return OrderVerificationStartedBuilder.of();
    }

    /**
     * create builder for OrderVerificationStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderVerificationStartedBuilder builder(final OrderVerificationStarted template) {
        return OrderVerificationStartedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderVerificationStarted(Function<OrderVerificationStarted, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderVerificationStarted> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderVerificationStarted>() {
            @Override
            public String toString() {
                return "TypeReference<OrderVerificationStarted>";
            }
        };
    }
}
