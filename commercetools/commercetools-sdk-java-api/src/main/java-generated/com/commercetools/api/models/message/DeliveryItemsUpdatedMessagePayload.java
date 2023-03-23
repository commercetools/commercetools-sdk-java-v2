
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Delivery Items update action.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryItemsUpdatedMessagePayloadImpl.class)
public interface DeliveryItemsUpdatedMessagePayload extends OrderMessagePayload {

    String DELIVERY_ITEMS_UPDATED = "DeliveryItemsUpdated";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
     * @return oldItems
     */
    @NotNull
    @Valid
    @JsonProperty("oldItems")
    public List<DeliveryItem> getOldItems();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    public void setDeliveryId(final String deliveryId);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    @JsonIgnore
    public void setOldItems(final DeliveryItem... oldItems);

    public void setOldItems(final List<DeliveryItem> oldItems);

    public void setShippingKey(final String shippingKey);

    public static DeliveryItemsUpdatedMessagePayload of() {
        return new DeliveryItemsUpdatedMessagePayloadImpl();
    }

    public static DeliveryItemsUpdatedMessagePayload of(final DeliveryItemsUpdatedMessagePayload template) {
        DeliveryItemsUpdatedMessagePayloadImpl instance = new DeliveryItemsUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        instance.setOldItems(template.getOldItems());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public static DeliveryItemsUpdatedMessagePayloadBuilder builder() {
        return DeliveryItemsUpdatedMessagePayloadBuilder.of();
    }

    public static DeliveryItemsUpdatedMessagePayloadBuilder builder(final DeliveryItemsUpdatedMessagePayload template) {
        return DeliveryItemsUpdatedMessagePayloadBuilder.of(template);
    }

    default <T> T withDeliveryItemsUpdatedMessagePayload(Function<DeliveryItemsUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryItemsUpdatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryItemsUpdatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryItemsUpdatedMessagePayload>";
            }
        };
    }
}
