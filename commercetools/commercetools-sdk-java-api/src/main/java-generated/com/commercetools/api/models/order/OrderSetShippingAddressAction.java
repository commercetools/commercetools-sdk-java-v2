
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action updates the <code>shippingAddress</code> on the Order, but it does not change the shipping address on the referenced Cart from which the Order is created. Also, it does not recalculate the Cart as taxes may not fit to the shipping address anymore.</p>
 *  <p>Produces the Order Shipping Address Set Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingAddressAction orderSetShippingAddressAction = OrderSetShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetShippingAddressActionImpl.class)
public interface OrderSetShippingAddressAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetShippingAddressAction
     */
    String SET_SHIPPING_ADDRESS = "setShippingAddress";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of OrderSetShippingAddressAction
     */
    public static OrderSetShippingAddressAction of() {
        return new OrderSetShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetShippingAddressAction of(final OrderSetShippingAddressAction template) {
        OrderSetShippingAddressActionImpl instance = new OrderSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetShippingAddressAction deepCopy(@Nullable final OrderSetShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        OrderSetShippingAddressActionImpl instance = new OrderSetShippingAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for OrderSetShippingAddressAction
     * @return builder
     */
    public static OrderSetShippingAddressActionBuilder builder() {
        return OrderSetShippingAddressActionBuilder.of();
    }

    /**
     * create builder for OrderSetShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetShippingAddressActionBuilder builder(final OrderSetShippingAddressAction template) {
        return OrderSetShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetShippingAddressAction(Function<OrderSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetShippingAddressAction>";
            }
        };
    }
}
