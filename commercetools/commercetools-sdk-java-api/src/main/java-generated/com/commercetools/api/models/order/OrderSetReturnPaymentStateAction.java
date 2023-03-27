
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnPaymentStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnPaymentStateAction orderSetReturnPaymentStateAction = OrderSetReturnPaymentStateAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnPaymentStateActionImpl.class)
public interface OrderSetReturnPaymentStateAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetReturnPaymentStateAction
     */
    String SET_RETURN_PAYMENT_STATE = "setReturnPaymentState";

    /**
     *
     * @return returnItemId
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
     *
     * @return paymentState
     */
    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    /**
     * set returnItemId
     * @param returnItemId value to be set
     */

    public void setReturnItemId(final String returnItemId);

    /**
     * set paymentState
     * @param paymentState value to be set
     */

    public void setPaymentState(final ReturnPaymentState paymentState);

    /**
     * factory method
     * @return instance of OrderSetReturnPaymentStateAction
     */
    public static OrderSetReturnPaymentStateAction of() {
        return new OrderSetReturnPaymentStateActionImpl();
    }

    /**
     * factory method to copy an instance of OrderSetReturnPaymentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetReturnPaymentStateAction of(final OrderSetReturnPaymentStateAction template) {
        OrderSetReturnPaymentStateActionImpl instance = new OrderSetReturnPaymentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    /**
     * builder factory method for OrderSetReturnPaymentStateAction
     * @return builder
     */
    public static OrderSetReturnPaymentStateActionBuilder builder() {
        return OrderSetReturnPaymentStateActionBuilder.of();
    }

    /**
     * create builder for OrderSetReturnPaymentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnPaymentStateActionBuilder builder(final OrderSetReturnPaymentStateAction template) {
        return OrderSetReturnPaymentStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetReturnPaymentStateAction(Function<OrderSetReturnPaymentStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnPaymentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnPaymentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetReturnPaymentStateAction>";
            }
        };
    }
}
