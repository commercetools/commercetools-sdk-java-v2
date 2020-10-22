package com.commercetools.api.models.order;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetDeliveryItemsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderSetDeliveryItemsActionImpl.class)
public interface OrderSetDeliveryItemsAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setDeliveryId(final String deliveryId);
    
    public void setItems(final List<DeliveryItem> items);

    public static OrderSetDeliveryItemsActionImpl of(){
        return new OrderSetDeliveryItemsActionImpl();
    }
    

    public static OrderSetDeliveryItemsActionImpl of(final OrderSetDeliveryItemsAction template) {
        OrderSetDeliveryItemsActionImpl instance = new OrderSetDeliveryItemsActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        return instance;
    }

    default <T extends Accessor<OrderSetDeliveryItemsAction>> T withOrderSetDeliveryItemsAction(Function<OrderSetDeliveryItemsAction, T> helper) {
        return helper.apply(this);
    }
}
