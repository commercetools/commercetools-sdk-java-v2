
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderAddDeliveryActionImpl.class)
public interface OrderAddDeliveryAction extends OrderUpdateAction {

    String ADD_DELIVERY = "addDelivery";

    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    @Valid
    @JsonProperty("parcels")
    public List<ParcelDraft> getParcels();

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public void setAddress(final Address address);

    @JsonIgnore
    public void setParcels(final ParcelDraft... parcels);

    public void setParcels(final List<ParcelDraft> parcels);

    public static OrderAddDeliveryAction of() {
        return new OrderAddDeliveryActionImpl();
    }

    public static OrderAddDeliveryAction of(final OrderAddDeliveryAction template) {
        OrderAddDeliveryActionImpl instance = new OrderAddDeliveryActionImpl();
        instance.setItems(template.getItems());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
        return instance;
    }

    public static OrderAddDeliveryActionBuilder builder() {
        return OrderAddDeliveryActionBuilder.of();
    }

    public static OrderAddDeliveryActionBuilder builder(final OrderAddDeliveryAction template) {
        return OrderAddDeliveryActionBuilder.of(template);
    }

    default <T> T withOrderAddDeliveryAction(Function<OrderAddDeliveryAction, T> helper) {
        return helper.apply(this);
    }
}
