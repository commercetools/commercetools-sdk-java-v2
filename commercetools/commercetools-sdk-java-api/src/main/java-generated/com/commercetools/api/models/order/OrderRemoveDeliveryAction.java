package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderRemoveDeliveryActionImpl;

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
@JsonDeserialize(as = OrderRemoveDeliveryActionImpl.class)
public interface OrderRemoveDeliveryAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    public void setDeliveryId(final String deliveryId);

    public static OrderRemoveDeliveryAction of(){
        return new OrderRemoveDeliveryActionImpl();
    }
    

    public static OrderRemoveDeliveryAction of(final OrderRemoveDeliveryAction template) {
        OrderRemoveDeliveryActionImpl instance = new OrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    public static OrderRemoveDeliveryActionBuilder builder(){
        return OrderRemoveDeliveryActionBuilder.of();
    }
    
    public static OrderRemoveDeliveryActionBuilder builder(final OrderRemoveDeliveryAction template){
        return OrderRemoveDeliveryActionBuilder.of(template);
    }
    

    default <T> T withOrderRemoveDeliveryAction(Function<OrderRemoveDeliveryAction, T> helper) {
        return helper.apply(this);
    }
}
