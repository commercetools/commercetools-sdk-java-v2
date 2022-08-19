
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

    String PARCEL_ITEMS_UPDATED = "ParcelItemsUpdated";

    /**
     *  <p>Unique identifier of the Parcel.</p>
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("oldItems")
    public List<DeliveryItem> getOldItems();

    public void setParcelId(final String parcelId);

    public void setDeliveryId(final String deliveryId);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    @JsonIgnore
    public void setOldItems(final DeliveryItem... oldItems);

    public void setOldItems(final List<DeliveryItem> oldItems);

    public static ParcelItemsUpdatedMessagePayload of() {
        return new ParcelItemsUpdatedMessagePayloadImpl();
    }

    public static ParcelItemsUpdatedMessagePayload of(final ParcelItemsUpdatedMessagePayload template) {
        ParcelItemsUpdatedMessagePayloadImpl instance = new ParcelItemsUpdatedMessagePayloadImpl();
        instance.setParcelId(template.getParcelId());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        instance.setOldItems(template.getOldItems());
        return instance;
    }

    public static ParcelItemsUpdatedMessagePayloadBuilder builder() {
        return ParcelItemsUpdatedMessagePayloadBuilder.of();
    }

    public static ParcelItemsUpdatedMessagePayloadBuilder builder(final ParcelItemsUpdatedMessagePayload template) {
        return ParcelItemsUpdatedMessagePayloadBuilder.of(template);
    }

    default <T> T withParcelItemsUpdatedMessagePayload(Function<ParcelItemsUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelItemsUpdatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelItemsUpdatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelItemsUpdatedMessagePayload>";
            }
        };
    }
}
