
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

/**
 *  <p>This action updates the <code>billingAddress</code> on the Order, but it does not change the billing address on the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> from which the Order is created.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderBillingAddressSetMessage" rel="nofollow">Order Billing Address Set</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetBillingAddressAction orderSetBillingAddressAction = OrderSetBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setBillingAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetBillingAddressActionImpl.class)
public interface OrderSetBillingAddressAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetBillingAddressAction
     */
    String SET_BILLING_ADDRESS = "setBillingAddress";

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
     * @return instance of OrderSetBillingAddressAction
     */
    public static OrderSetBillingAddressAction of() {
        return new OrderSetBillingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetBillingAddressAction of(final OrderSetBillingAddressAction template) {
        OrderSetBillingAddressActionImpl instance = new OrderSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public OrderSetBillingAddressAction copyDeep();

    /**
     * factory method to create a deep copy of OrderSetBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetBillingAddressAction deepCopy(@Nullable final OrderSetBillingAddressAction template) {
        if (template == null) {
            return null;
        }
        OrderSetBillingAddressActionImpl instance = new OrderSetBillingAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for OrderSetBillingAddressAction
     * @return builder
     */
    public static OrderSetBillingAddressActionBuilder builder() {
        return OrderSetBillingAddressActionBuilder.of();
    }

    /**
     * create builder for OrderSetBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetBillingAddressActionBuilder builder(final OrderSetBillingAddressAction template) {
        return OrderSetBillingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetBillingAddressAction(Function<OrderSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetBillingAddressAction>";
            }
        };
    }
}
