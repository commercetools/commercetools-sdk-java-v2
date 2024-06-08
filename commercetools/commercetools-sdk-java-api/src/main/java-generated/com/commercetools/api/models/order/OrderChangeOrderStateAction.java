
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the Order State Changed Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderChangeOrderStateAction orderChangeOrderStateAction = OrderChangeOrderStateAction.builder()
 *             .orderState(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderChangeOrderStateActionImpl.class)
public interface OrderChangeOrderStateAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderChangeOrderStateAction
     */
    String CHANGE_ORDER_STATE = "changeOrderState";

    /**
     *  <p>New status of the Order.</p>
     * @return orderState
     */
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>New status of the Order.</p>
     * @param orderState value to be set
     */

    public void setOrderState(final OrderState orderState);

    /**
     * factory method
     * @return instance of OrderChangeOrderStateAction
     */
    public static OrderChangeOrderStateAction of() {
        return new OrderChangeOrderStateActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderChangeOrderStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderChangeOrderStateAction of(final OrderChangeOrderStateAction template) {
        OrderChangeOrderStateActionImpl instance = new OrderChangeOrderStateActionImpl();
        instance.setOrderState(template.getOrderState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderChangeOrderStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderChangeOrderStateAction deepCopy(@Nullable final OrderChangeOrderStateAction template) {
        if (template == null) {
            return null;
        }
        OrderChangeOrderStateActionImpl instance = new OrderChangeOrderStateActionImpl();
        instance.setOrderState(template.getOrderState());
        return instance;
    }

    /**
     * builder factory method for OrderChangeOrderStateAction
     * @return builder
     */
    public static OrderChangeOrderStateActionBuilder builder() {
        return OrderChangeOrderStateActionBuilder.of();
    }

    /**
     * create builder for OrderChangeOrderStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderChangeOrderStateActionBuilder builder(final OrderChangeOrderStateAction template) {
        return OrderChangeOrderStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderChangeOrderStateAction(Function<OrderChangeOrderStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderChangeOrderStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderChangeOrderStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderChangeOrderStateAction>";
            }
        };
    }
}
