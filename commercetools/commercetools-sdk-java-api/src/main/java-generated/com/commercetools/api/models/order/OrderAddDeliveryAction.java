package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ParcelDraft;
import com.commercetools.api.models.order.OrderAddDeliveryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderAddDeliveryActionImpl.class)
public interface OrderAddDeliveryAction extends OrderUpdateAction {

    
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
    public void setItems(final DeliveryItem ...items);
    public void setItems(final List<DeliveryItem> items);
    
    public void setAddress(final Address address);
    
    @JsonIgnore
    public void setParcels(final ParcelDraft ...parcels);
    public void setParcels(final List<ParcelDraft> parcels);

    public static OrderAddDeliveryActionImpl of(){
        return new OrderAddDeliveryActionImpl();
    }
    

    public static OrderAddDeliveryActionImpl of(final OrderAddDeliveryAction template) {
        OrderAddDeliveryActionImpl instance = new OrderAddDeliveryActionImpl();
        instance.setItems(template.getItems());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
        return instance;
    }

    default <T> T withOrderAddDeliveryAction(Function<OrderAddDeliveryAction, T> helper) {
        return helper.apply(this);
    }
}
