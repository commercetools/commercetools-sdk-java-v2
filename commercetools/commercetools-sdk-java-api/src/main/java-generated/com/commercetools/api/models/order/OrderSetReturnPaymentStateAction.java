
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
 *  <p>To set a ReturnPaymentState, the Order <code>returnInfo</code> must have at least one ReturnItem.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnPaymentStateAction orderSetReturnPaymentStateAction = OrderSetReturnPaymentStateAction.builder()
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
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemId
     */

    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemKey
     */

    @JsonProperty("returnItemKey")
    public String getReturnItemKey();

    /**
     *  <p>New Payment status of the ReturnItem.</p>
     * @return paymentState
     */
    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemId value to be set
     */

    public void setReturnItemId(final String returnItemId);

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemKey value to be set
     */

    public void setReturnItemKey(final String returnItemKey);

    /**
     *  <p>New Payment status of the ReturnItem.</p>
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
     * factory method to create a shallow copy OrderSetReturnPaymentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetReturnPaymentStateAction of(final OrderSetReturnPaymentStateAction template) {
        OrderSetReturnPaymentStateActionImpl instance = new OrderSetReturnPaymentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnItemKey(template.getReturnItemKey());
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetReturnPaymentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetReturnPaymentStateAction deepCopy(@Nullable final OrderSetReturnPaymentStateAction template) {
        if (template == null) {
            return null;
        }
        OrderSetReturnPaymentStateActionImpl instance = new OrderSetReturnPaymentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnItemKey(template.getReturnItemKey());
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
