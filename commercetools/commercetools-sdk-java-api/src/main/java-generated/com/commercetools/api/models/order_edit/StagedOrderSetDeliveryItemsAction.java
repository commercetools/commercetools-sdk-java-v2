
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryItemsActionImpl.class)
public interface StagedOrderSetDeliveryItemsAction extends StagedOrderUpdateAction {

    String SET_DELIVERY_ITEMS = "setDeliveryItems";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setDeliveryId(final String deliveryId);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public static StagedOrderSetDeliveryItemsAction of() {
        return new StagedOrderSetDeliveryItemsActionImpl();
    }

    public static StagedOrderSetDeliveryItemsAction of(final StagedOrderSetDeliveryItemsAction template) {
        StagedOrderSetDeliveryItemsActionImpl instance = new StagedOrderSetDeliveryItemsActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        return instance;
    }

    public static StagedOrderSetDeliveryItemsActionBuilder builder() {
        return StagedOrderSetDeliveryItemsActionBuilder.of();
    }

    public static StagedOrderSetDeliveryItemsActionBuilder builder(final StagedOrderSetDeliveryItemsAction template) {
        return StagedOrderSetDeliveryItemsActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetDeliveryItemsAction(Function<StagedOrderSetDeliveryItemsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryItemsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryItemsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryItemsAction>";
            }
        };
    }
}
