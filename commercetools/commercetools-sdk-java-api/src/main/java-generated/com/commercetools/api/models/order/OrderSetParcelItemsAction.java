
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelItemsActionImpl.class)
public interface OrderSetParcelItemsAction extends OrderUpdateAction {

    String SET_PARCEL_ITEMS = "setParcelItems";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setParcelId(final String parcelId);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public static OrderSetParcelItemsAction of() {
        return new OrderSetParcelItemsActionImpl();
    }

    public static OrderSetParcelItemsAction of(final OrderSetParcelItemsAction template) {
        OrderSetParcelItemsActionImpl instance = new OrderSetParcelItemsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setItems(template.getItems());
        return instance;
    }

    public static OrderSetParcelItemsActionBuilder builder() {
        return OrderSetParcelItemsActionBuilder.of();
    }

    public static OrderSetParcelItemsActionBuilder builder(final OrderSetParcelItemsAction template) {
        return OrderSetParcelItemsActionBuilder.of(template);
    }

    default <T> T withOrderSetParcelItemsAction(Function<OrderSetParcelItemsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelItemsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelItemsAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetParcelItemsAction>";
            }
        };
    }
}
