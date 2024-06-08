
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updates an address in <code>itemShippingAddresses</code> by keeping the Address <code>key</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderUpdateItemShippingAddressAction orderUpdateItemShippingAddressAction = OrderUpdateItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderUpdateItemShippingAddressActionImpl.class)
public interface OrderUpdateItemShippingAddressAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderUpdateItemShippingAddressAction
     */
    String UPDATE_ITEM_SHIPPING_ADDRESS = "updateItemShippingAddress";

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of OrderUpdateItemShippingAddressAction
     */
    public static OrderUpdateItemShippingAddressAction of() {
        return new OrderUpdateItemShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderUpdateItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderUpdateItemShippingAddressAction of(final OrderUpdateItemShippingAddressAction template) {
        OrderUpdateItemShippingAddressActionImpl instance = new OrderUpdateItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderUpdateItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderUpdateItemShippingAddressAction deepCopy(
            @Nullable final OrderUpdateItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        OrderUpdateItemShippingAddressActionImpl instance = new OrderUpdateItemShippingAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for OrderUpdateItemShippingAddressAction
     * @return builder
     */
    public static OrderUpdateItemShippingAddressActionBuilder builder() {
        return OrderUpdateItemShippingAddressActionBuilder.of();
    }

    /**
     * create builder for OrderUpdateItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderUpdateItemShippingAddressActionBuilder builder(
            final OrderUpdateItemShippingAddressAction template) {
        return OrderUpdateItemShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderUpdateItemShippingAddressAction(Function<OrderUpdateItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderUpdateItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderUpdateItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderUpdateItemShippingAddressAction>";
            }
        };
    }
}
