
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
@JsonDeserialize(as = ParcelItemsUpdatedMessageImpl.class)
public interface ParcelItemsUpdatedMessage extends OrderMessage {

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

    public static ParcelItemsUpdatedMessage of() {
        return new ParcelItemsUpdatedMessageImpl();
    }

    public static ParcelItemsUpdatedMessage of(final ParcelItemsUpdatedMessage template) {
        ParcelItemsUpdatedMessageImpl instance = new ParcelItemsUpdatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setParcelId(template.getParcelId());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        instance.setOldItems(template.getOldItems());
        return instance;
    }

    public static ParcelItemsUpdatedMessageBuilder builder() {
        return ParcelItemsUpdatedMessageBuilder.of();
    }

    public static ParcelItemsUpdatedMessageBuilder builder(final ParcelItemsUpdatedMessage template) {
        return ParcelItemsUpdatedMessageBuilder.of(template);
    }

    default <T> T withParcelItemsUpdatedMessage(Function<ParcelItemsUpdatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelItemsUpdatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelItemsUpdatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelItemsUpdatedMessage>";
            }
        };
    }
}
