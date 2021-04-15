
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelItemsUpdatedMessagePayloadImpl.class)
public interface ParcelItemsUpdatedMessagePayload extends MessagePayload {

    String PARCEL_ITEMS_UPDATED = "ParcelItemsUpdated";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

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
}
