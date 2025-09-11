
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
 *  <p>Generated when the verification of the <span>Order</span> times out.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderVerificationTimeout orderVerificationTimeout = OrderVerificationTimeout.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("order_verification_timeout")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderVerificationTimeoutImpl.class)
public interface OrderVerificationTimeout extends Message {

    /**
     * discriminator value for OrderVerificationTimeout
     */
    String ORDER_VERIFICATION_TIMEOUT = "order_verification_timeout";

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
     *  <p>Order verification timeout.</p>
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
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Order verification timeout.</p>
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
     * @return instance of OrderVerificationTimeout
     */
    public static OrderVerificationTimeout of() {
        return new OrderVerificationTimeoutImpl();
    }

    /**
     * factory method to create a shallow copy OrderVerificationTimeout
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderVerificationTimeout of(final OrderVerificationTimeout template) {
        OrderVerificationTimeoutImpl instance = new OrderVerificationTimeoutImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public OrderVerificationTimeout copyDeep();

    /**
     * factory method to create a deep copy of OrderVerificationTimeout
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderVerificationTimeout deepCopy(@Nullable final OrderVerificationTimeout template) {
        if (template == null) {
            return null;
        }
        OrderVerificationTimeoutImpl instance = new OrderVerificationTimeoutImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for OrderVerificationTimeout
     * @return builder
     */
    public static OrderVerificationTimeoutBuilder builder() {
        return OrderVerificationTimeoutBuilder.of();
    }

    /**
     * create builder for OrderVerificationTimeout instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderVerificationTimeoutBuilder builder(final OrderVerificationTimeout template) {
        return OrderVerificationTimeoutBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderVerificationTimeout(Function<OrderVerificationTimeout, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderVerificationTimeout> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderVerificationTimeout>() {
            @Override
            public String toString() {
                return "TypeReference<OrderVerificationTimeout>";
            }
        };
    }
}
