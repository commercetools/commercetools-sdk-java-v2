
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>An address can only be removed if it is not referenced in any ItemShippingTarget of the Cart. In such case, change the Line Item shipping address to a different <code>addressKey</code> first using the Set LineItemShippingDetails update action, before you remove the obsolete address.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderRemoveItemShippingAddressAction orderRemoveItemShippingAddressAction = OrderRemoveItemShippingAddressAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderRemoveItemShippingAddressActionImpl.class)
public interface OrderRemoveItemShippingAddressAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderRemoveItemShippingAddressAction
     */
    String REMOVE_ITEM_SHIPPING_ADDRESS = "removeItemShippingAddress";

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     * @return addressKey
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of OrderRemoveItemShippingAddressAction
     */
    public static OrderRemoveItemShippingAddressAction of() {
        return new OrderRemoveItemShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderRemoveItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderRemoveItemShippingAddressAction of(final OrderRemoveItemShippingAddressAction template) {
        OrderRemoveItemShippingAddressActionImpl instance = new OrderRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderRemoveItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderRemoveItemShippingAddressAction deepCopy(
            @Nullable final OrderRemoveItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        OrderRemoveItemShippingAddressActionImpl instance = new OrderRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for OrderRemoveItemShippingAddressAction
     * @return builder
     */
    public static OrderRemoveItemShippingAddressActionBuilder builder() {
        return OrderRemoveItemShippingAddressActionBuilder.of();
    }

    /**
     * create builder for OrderRemoveItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderRemoveItemShippingAddressActionBuilder builder(
            final OrderRemoveItemShippingAddressAction template) {
        return OrderRemoveItemShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderRemoveItemShippingAddressAction(Function<OrderRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderRemoveItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderRemoveItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderRemoveItemShippingAddressAction>";
            }
        };
    }
}
