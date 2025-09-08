
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
 *  <p>Generated when an <span>Order</span> is created after a successful checkout process.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreated orderCreated = OrderCreated.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("order_created")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCreatedImpl.class)
public interface OrderCreated extends ResponseMessage {

    /**
     * discriminator value for OrderCreated
     */
    String ORDER_CREATED = "order_created";

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
     *  <p>Order <code>{orderId}</code> created.</p>
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
     *  <p>Contains the <code>order</code> object with the <code>id</code> property.</p>
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
     *  <p>Order <code>{orderId}</code> created.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>order</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of OrderCreated
     */
    public static OrderCreated of() {
        return new OrderCreatedImpl();
    }

    /**
     * factory method to create a shallow copy OrderCreated
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCreated of(final OrderCreated template) {
        OrderCreatedImpl instance = new OrderCreatedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public OrderCreated copyDeep();

    /**
     * factory method to create a deep copy of OrderCreated
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCreated deepCopy(@Nullable final OrderCreated template) {
        if (template == null) {
            return null;
        }
        OrderCreatedImpl instance = new OrderCreatedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for OrderCreated
     * @return builder
     */
    public static OrderCreatedBuilder builder() {
        return OrderCreatedBuilder.of();
    }

    /**
     * create builder for OrderCreated instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCreatedBuilder builder(final OrderCreated template) {
        return OrderCreatedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCreated(Function<OrderCreated, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCreated> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCreated>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCreated>";
            }
        };
    }
}
