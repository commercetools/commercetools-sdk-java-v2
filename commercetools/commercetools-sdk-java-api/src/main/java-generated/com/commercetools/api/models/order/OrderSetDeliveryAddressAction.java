
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
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:DeliveryAddressSetMessage" rel="nofollow">DeliveryAddressSet</a> Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setDeliveryAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryAddressActionImpl.class)
public interface OrderSetDeliveryAddressAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetDeliveryAddressAction
     */
    String SET_DELIVERY_ADDRESS = "setDeliveryAddress";

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryId
     */

    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryKey
     */

    @JsonProperty("deliveryKey")
    public String getDeliveryKey();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryKey value to be set
     */

    public void setDeliveryKey(final String deliveryKey);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
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

    public OrderSetDeliveryAddressAction copyDeep();

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
