
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Order State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStateChangedMessagePayload orderStateChangedMessagePayload = OrderStateChangedMessagePayload.builder()
 *             .orderState(OrderState.OPEN)
 *             .oldOrderState(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderStateChangedMessagePayloadImpl.class)
public interface OrderStateChangedMessagePayload extends OrderMessagePayload {

    String ORDER_STATE_CHANGED = "OrderStateChanged";

    /**
     *  <p>OrderState after the Change Order State update action.</p>
     */
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>OrderState before the Change Order State update action.</p>
     */
    @NotNull
    @JsonProperty("oldOrderState")
    public OrderState getOldOrderState();

    public void setOrderState(final OrderState orderState);

    public void setOldOrderState(final OrderState oldOrderState);

    public static OrderStateChangedMessagePayload of() {
        return new OrderStateChangedMessagePayloadImpl();
    }

    public static OrderStateChangedMessagePayload of(final OrderStateChangedMessagePayload template) {
        OrderStateChangedMessagePayloadImpl instance = new OrderStateChangedMessagePayloadImpl();
        instance.setOrderState(template.getOrderState());
        instance.setOldOrderState(template.getOldOrderState());
        return instance;
    }

    public static OrderStateChangedMessagePayloadBuilder builder() {
        return OrderStateChangedMessagePayloadBuilder.of();
    }

    public static OrderStateChangedMessagePayloadBuilder builder(final OrderStateChangedMessagePayload template) {
        return OrderStateChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderStateChangedMessagePayload(Function<OrderStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderStateChangedMessagePayload>";
            }
        };
    }
}
