
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
 *  <p>Generated after a successful Set Parcel Items update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelItemsUpdatedMessagePayload parcelItemsUpdatedMessagePayload = ParcelItemsUpdatedMessagePayload.builder()
 *             .parcelId("{parcelId}")
 *             .deliveryId("{deliveryId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusOldItems(oldItemsBuilder -> oldItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelItemsUpdatedMessagePayloadImpl.class)
public interface ParcelItemsUpdatedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for ParcelItemsUpdatedMessagePayload
     */
    String PARCEL_ITEMS_UPDATED = "ParcelItemsUpdated";

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
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

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @param oldItems values to be set
     */

    @JsonIgnore
    public void setOldItems(final DeliveryItem... oldItems);

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @param oldItems values to be set
     */

    public void setOldItems(final List<DeliveryItem> oldItems);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of ParcelItemsUpdatedMessagePayload
     */
    public static ParcelItemsUpdatedMessagePayload of() {
        return new ParcelItemsUpdatedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of ParcelItemsUpdatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelItemsUpdatedMessagePayload of(final ParcelItemsUpdatedMessagePayload template) {
        ParcelItemsUpdatedMessagePayloadImpl instance = new ParcelItemsUpdatedMessagePayloadImpl();
        instance.setParcelId(template.getParcelId());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        instance.setOldItems(template.getOldItems());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for ParcelItemsUpdatedMessagePayload
     * @return builder
     */
    public static ParcelItemsUpdatedMessagePayloadBuilder builder() {
        return ParcelItemsUpdatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ParcelItemsUpdatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelItemsUpdatedMessagePayloadBuilder builder(final ParcelItemsUpdatedMessagePayload template) {
        return ParcelItemsUpdatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelItemsUpdatedMessagePayload(Function<ParcelItemsUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelItemsUpdatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelItemsUpdatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelItemsUpdatedMessagePayload>";
            }
        };
    }
}
