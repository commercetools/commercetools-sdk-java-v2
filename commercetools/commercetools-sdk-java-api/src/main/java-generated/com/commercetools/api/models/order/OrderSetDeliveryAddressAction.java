
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
 * OrderSetDeliveryAddressAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryAddressAction orderSetDeliveryAddressAction = OrderSetDeliveryAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryAddressActionImpl.class)
public interface OrderSetDeliveryAddressAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetDeliveryAddressAction
     */
    String SET_DELIVERY_ADDRESS = "setDeliveryAddress";

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */

    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */

    @JsonProperty("deliveryKey")
    public String getDeliveryKey();

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     */

    public void setDeliveryKey(final String deliveryKey);

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of OrderSetDeliveryAddressAction
     */
    public static OrderSetDeliveryAddressAction of() {
        return new OrderSetDeliveryAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetDeliveryAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetDeliveryAddressAction of(final OrderSetDeliveryAddressAction template) {
        OrderSetDeliveryAddressActionImpl instance = new OrderSetDeliveryAddressActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetDeliveryAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetDeliveryAddressAction deepCopy(@Nullable final OrderSetDeliveryAddressAction template) {
        if (template == null) {
            return null;
        }
        OrderSetDeliveryAddressActionImpl instance = new OrderSetDeliveryAddressActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for OrderSetDeliveryAddressAction
     * @return builder
     */
    public static OrderSetDeliveryAddressActionBuilder builder() {
        return OrderSetDeliveryAddressActionBuilder.of();
    }

    /**
     * create builder for OrderSetDeliveryAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryAddressActionBuilder builder(final OrderSetDeliveryAddressAction template) {
        return OrderSetDeliveryAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetDeliveryAddressAction(Function<OrderSetDeliveryAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetDeliveryAddressAction ofUnset(final String deliveryId) {
        return OrderSetDeliveryAddressActionBuilder.of().deliveryId(deliveryId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetDeliveryAddressAction>";
            }
        };
    }
}
