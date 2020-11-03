package com.commercetools.api.models.order;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetParcelItemsActionImpl;

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
@JsonDeserialize(as = OrderSetParcelItemsActionImpl.class)
public interface OrderSetParcelItemsAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();
    
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setParcelId(final String parcelId);
    
    @JsonIgnore
    public void setItems(final DeliveryItem ...items);
    public void setItems(final List<DeliveryItem> items);

    public static OrderSetParcelItemsActionImpl of(){
        return new OrderSetParcelItemsActionImpl();
    }
    

    public static OrderSetParcelItemsActionImpl of(final OrderSetParcelItemsAction template) {
        OrderSetParcelItemsActionImpl instance = new OrderSetParcelItemsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setItems(template.getItems());
        return instance;
    }

    default <T> T withOrderSetParcelItemsAction(Function<OrderSetParcelItemsAction, T> helper) {
        return helper.apply(this);
    }
}
