
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
 *  <p>Generated when an <span>Order</span> that references an approved <span>Payment</span> cannot be created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreationError orderCreationError = OrderCreationError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("order_creation_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCreationErrorImpl.class)
public interface OrderCreationError extends ResponseMessage {

    /**
     * discriminator value for OrderCreationError
     */
    String ORDER_CREATION_ERROR = "order_creation_error";

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
     *  <p>Order creation failed with approved payment.</p>
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
     *  <p>Contains <code>paymentReference</code>, <code>sessionId</code>, and the <code>errors</code> array of objects, with the related <code>code</code> and <code>message</code> properties.</p>
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
     *  <p>Order creation failed with approved payment.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains <code>paymentReference</code>, <code>sessionId</code>, and the <code>errors</code> array of objects, with the related <code>code</code> and <code>message</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of OrderCreationError
     */
    public static OrderCreationError of() {
        return new OrderCreationErrorImpl();
    }

    /**
     * factory method to create a shallow copy OrderCreationError
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCreationError of(final OrderCreationError template) {
        OrderCreationErrorImpl instance = new OrderCreationErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public OrderCreationError copyDeep();

    /**
     * factory method to create a deep copy of OrderCreationError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCreationError deepCopy(@Nullable final OrderCreationError template) {
        if (template == null) {
            return null;
        }
        OrderCreationErrorImpl instance = new OrderCreationErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for OrderCreationError
     * @return builder
     */
    public static OrderCreationErrorBuilder builder() {
        return OrderCreationErrorBuilder.of();
    }

    /**
     * create builder for OrderCreationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCreationErrorBuilder builder(final OrderCreationError template) {
        return OrderCreationErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCreationError(Function<OrderCreationError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCreationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCreationError>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCreationError>";
            }
        };
    }
}
