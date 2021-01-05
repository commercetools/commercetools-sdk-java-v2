package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderRemoveParcelFromDeliveryActionImpl;

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
@JsonDeserialize(as = OrderRemoveParcelFromDeliveryActionImpl.class)
public interface OrderRemoveParcelFromDeliveryAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    public void setParcelId(final String parcelId);

    public static OrderRemoveParcelFromDeliveryAction of(){
        return new OrderRemoveParcelFromDeliveryActionImpl();
    }
    

    public static OrderRemoveParcelFromDeliveryAction of(final OrderRemoveParcelFromDeliveryAction template) {
        OrderRemoveParcelFromDeliveryActionImpl instance = new OrderRemoveParcelFromDeliveryActionImpl();
        instance.setParcelId(template.getParcelId());
        return instance;
    }

    public static OrderRemoveParcelFromDeliveryActionBuilder builder(){
        return OrderRemoveParcelFromDeliveryActionBuilder.of();
    }
    
    public static OrderRemoveParcelFromDeliveryActionBuilder builder(final OrderRemoveParcelFromDeliveryAction template){
        return OrderRemoveParcelFromDeliveryActionBuilder.of(template);
    }
    

    default <T> T withOrderRemoveParcelFromDeliveryAction(Function<OrderRemoveParcelFromDeliveryAction, T> helper) {
        return helper.apply(this);
    }
}
