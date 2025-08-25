
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryItemsAction" rel="nofollow">Set Delivery Items</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryItemsUpdatedMessagePayload deliveryItemsUpdatedMessagePayload = DeliveryItemsUpdatedMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusOldItems(oldItemsBuilder -> oldItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DeliveryItemsUpdated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryItemsUpdatedMessagePayloadImpl.class)
public interface DeliveryItemsUpdatedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for DeliveryItemsUpdatedMessagePayload
     */
    String DELIVERY_ITEMS_UPDATED = "DeliveryItemsUpdated";

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DeliveryItem" rel="nofollow">Delivery Items</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryItemsAction" rel="nofollow">Set Delivery Items</a> update action.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DeliveryItem" rel="nofollow">Delivery Items</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryItemsAction" rel="nofollow">Set Delivery Items</a> update action.</p>
     * @return oldItems
     */
    @NotNull
    @Valid
    @JsonProperty("oldItems")
    public List<DeliveryItem> getOldItems();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DeliveryItem" rel="nofollow">Delivery Items</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryItemsAction" rel="nofollow">Set Delivery Items</a> update action.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DeliveryItem" rel="nofollow">Delivery Items</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryItemsAction" rel="nofollow">Set Delivery Items</a> update action.</p>
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DeliveryItem" rel="nofollow">Delivery Items</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryItemsAction" rel="nofollow">Set Delivery Items</a> update action.</p>
     * @param oldItems values to be set
     */

    @JsonIgnore
    public void setOldItems(final DeliveryItem... oldItems);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DeliveryItem" rel="nofollow">Delivery Items</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryItemsAction" rel="nofollow">Set Delivery Items</a> update action.</p>
     * @param oldItems values to be set
     */

    public void setOldItems(final List<DeliveryItem> oldItems);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of DeliveryItemsUpdatedMessagePayload
     */
    public static DeliveryItemsUpdatedMessagePayload of() {
        return new DeliveryItemsUpdatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryItemsUpdatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryItemsUpdatedMessagePayload of(final DeliveryItemsUpdatedMessagePayload template) {
        DeliveryItemsUpdatedMessagePayloadImpl instance = new DeliveryItemsUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        instance.setOldItems(template.getOldItems());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public DeliveryItemsUpdatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DeliveryItemsUpdatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryItemsUpdatedMessagePayload deepCopy(
            @Nullable final DeliveryItemsUpdatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DeliveryItemsUpdatedMessagePayloadImpl instance = new DeliveryItemsUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setOldItems(Optional.ofNullable(template.getOldItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for DeliveryItemsUpdatedMessagePayload
     * @return builder
     */
    public static DeliveryItemsUpdatedMessagePayloadBuilder builder() {
        return DeliveryItemsUpdatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DeliveryItemsUpdatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryItemsUpdatedMessagePayloadBuilder builder(final DeliveryItemsUpdatedMessagePayload template) {
        return DeliveryItemsUpdatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryItemsUpdatedMessagePayload(Function<DeliveryItemsUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryItemsUpdatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryItemsUpdatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryItemsUpdatedMessagePayload>";
            }
        };
    }
}
