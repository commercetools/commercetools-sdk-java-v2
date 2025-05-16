
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the DeliveryRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderRemoveDeliveryAction orderRemoveDeliveryAction = OrderRemoveDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeDelivery")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderRemoveDeliveryActionImpl.class)
public interface OrderRemoveDeliveryAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderRemoveDeliveryAction
     */
    String REMOVE_DELIVERY = "removeDelivery";

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryId
     */

    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryKey
     */

    @JsonProperty("deliveryKey")
    public String getDeliveryKey();

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryKey value to be set
     */

    public void setDeliveryKey(final String deliveryKey);

    /**
     * factory method
     * @return instance of OrderRemoveDeliveryAction
     */
    public static OrderRemoveDeliveryAction of() {
        return new OrderRemoveDeliveryActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderRemoveDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderRemoveDeliveryAction of(final OrderRemoveDeliveryAction template) {
        OrderRemoveDeliveryActionImpl instance = new OrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        return instance;
    }

    public OrderRemoveDeliveryAction copyDeep();

    /**
     * factory method to create a deep copy of OrderRemoveDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderRemoveDeliveryAction deepCopy(@Nullable final OrderRemoveDeliveryAction template) {
        if (template == null) {
            return null;
        }
        OrderRemoveDeliveryActionImpl instance = new OrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        return instance;
    }

    /**
     * builder factory method for OrderRemoveDeliveryAction
     * @return builder
     */
    public static OrderRemoveDeliveryActionBuilder builder() {
        return OrderRemoveDeliveryActionBuilder.of();
    }

    /**
     * create builder for OrderRemoveDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderRemoveDeliveryActionBuilder builder(final OrderRemoveDeliveryAction template) {
        return OrderRemoveDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderRemoveDeliveryAction(Function<OrderRemoveDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderRemoveDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderRemoveDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderRemoveDeliveryAction>";
            }
        };
    }
}
