
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the Delivery Items Updated Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryItemsAction orderSetDeliveryItemsAction = OrderSetDeliveryItemsAction.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryItemsActionImpl.class)
public interface OrderSetDeliveryItemsAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetDeliveryItemsAction
     */
    String SET_DELIVERY_ITEMS = "setDeliveryItems";

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
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

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
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     * factory method
     * @return instance of OrderSetDeliveryItemsAction
     */
    public static OrderSetDeliveryItemsAction of() {
        return new OrderSetDeliveryItemsActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetDeliveryItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetDeliveryItemsAction of(final OrderSetDeliveryItemsAction template) {
        OrderSetDeliveryItemsActionImpl instance = new OrderSetDeliveryItemsActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetDeliveryItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetDeliveryItemsAction deepCopy(@Nullable final OrderSetDeliveryItemsAction template) {
        if (template == null) {
            return null;
        }
        OrderSetDeliveryItemsActionImpl instance = new OrderSetDeliveryItemsActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderSetDeliveryItemsAction
     * @return builder
     */
    public static OrderSetDeliveryItemsActionBuilder builder() {
        return OrderSetDeliveryItemsActionBuilder.of();
    }

    /**
     * create builder for OrderSetDeliveryItemsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryItemsActionBuilder builder(final OrderSetDeliveryItemsAction template) {
        return OrderSetDeliveryItemsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetDeliveryItemsAction(Function<OrderSetDeliveryItemsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryItemsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetDeliveryItemsAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetDeliveryItemsAction>";
            }
        };
    }
}
