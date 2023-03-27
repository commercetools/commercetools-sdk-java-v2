
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetBillingAddressAction
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetBillingAddressActionImpl.class)
public interface OrderSetBillingAddressAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetBillingAddressAction
     */
    String SET_BILLING_ADDRESS = "setBillingAddress";

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
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
     * factory method to copy an instance of OrderSetBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetBillingAddressAction of(final OrderSetBillingAddressAction template) {
        OrderSetBillingAddressActionImpl instance = new OrderSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
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
