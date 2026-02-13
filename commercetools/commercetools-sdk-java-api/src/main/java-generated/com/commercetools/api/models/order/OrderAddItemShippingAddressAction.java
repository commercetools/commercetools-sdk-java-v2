
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
 *  <p>Adds an address to the <code>itemShippingAddresses</code> of an Order. Use this action when shipping is defined per item. For example, when shipping items to multiple addresses or when using different Shipping Methods, even if all items share the same address.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddItemShippingAddressAction orderAddItemShippingAddressAction = OrderAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addItemShippingAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderAddItemShippingAddressActionImpl.class)
public interface OrderAddItemShippingAddressAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderAddItemShippingAddressAction
     */
    String ADD_ITEM_SHIPPING_ADDRESS = "addItemShippingAddress";

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>. The new Address must have a <code>key</code> that is unique across this Order.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>. The new Address must have a <code>key</code> that is unique across this Order.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of OrderAddItemShippingAddressAction
     */
    public static OrderAddItemShippingAddressAction of() {
        return new OrderAddItemShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderAddItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderAddItemShippingAddressAction of(final OrderAddItemShippingAddressAction template) {
        OrderAddItemShippingAddressActionImpl instance = new OrderAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public OrderAddItemShippingAddressAction copyDeep();

    /**
     * factory method to create a deep copy of OrderAddItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderAddItemShippingAddressAction deepCopy(
            @Nullable final OrderAddItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        OrderAddItemShippingAddressActionImpl instance = new OrderAddItemShippingAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for OrderAddItemShippingAddressAction
     * @return builder
     */
    public static OrderAddItemShippingAddressActionBuilder builder() {
        return OrderAddItemShippingAddressActionBuilder.of();
    }

    /**
     * create builder for OrderAddItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderAddItemShippingAddressActionBuilder builder(final OrderAddItemShippingAddressAction template) {
        return OrderAddItemShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderAddItemShippingAddressAction(Function<OrderAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderAddItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderAddItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderAddItemShippingAddressAction>";
            }
        };
    }
}
