
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
@JsonDeserialize(as = DeliveryItemsUpdatedMessageImpl.class)
public interface DeliveryItemsUpdatedMessage extends OrderMessage {

    String DELIVERY_ITEMS_UPDATED = "DeliveryItemsUpdated";

    @NotNull
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

    public void setDeliveryId(final String deliveryId);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    @JsonIgnore
    public void setOldItems(final DeliveryItem... oldItems);

    public void setOldItems(final List<DeliveryItem> oldItems);

    public static DeliveryItemsUpdatedMessage of() {
        return new DeliveryItemsUpdatedMessageImpl();
    }

    public static DeliveryItemsUpdatedMessage of(final DeliveryItemsUpdatedMessage template) {
        DeliveryItemsUpdatedMessageImpl instance = new DeliveryItemsUpdatedMessageImpl();
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
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        instance.setOldItems(template.getOldItems());
        return instance;
    }

    public static DeliveryItemsUpdatedMessageBuilder builder() {
        return DeliveryItemsUpdatedMessageBuilder.of();
    }

    public static DeliveryItemsUpdatedMessageBuilder builder(final DeliveryItemsUpdatedMessage template) {
        return DeliveryItemsUpdatedMessageBuilder.of(template);
    }

    default <T> T withDeliveryItemsUpdatedMessage(Function<DeliveryItemsUpdatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryItemsUpdatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryItemsUpdatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryItemsUpdatedMessage>";
            }
        };
    }
}
