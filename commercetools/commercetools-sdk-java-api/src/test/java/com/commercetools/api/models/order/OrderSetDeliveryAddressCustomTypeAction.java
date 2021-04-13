package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order.OrderSetDeliveryAddressCustomTypeActionImpl;

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
@JsonDeserialize(as = OrderSetDeliveryAddressCustomTypeActionImpl.class)
public interface OrderSetDeliveryAddressCustomTypeAction extends OrderUpdateAction {

    String SET_DELIVERY_ADDRESS_CUSTOM_TYPE = "setDeliveryAddressCustomType";

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public Object getValue();

    
    public void setDeliveryId(final String deliveryId);
    
    
    
    public void setName(final String name);
    
    
    
    public void setValue(final Object value);
    

    public static OrderSetDeliveryAddressCustomTypeAction of(){
        return new OrderSetDeliveryAddressCustomTypeActionImpl();
    }
    

    public static OrderSetDeliveryAddressCustomTypeAction of(final OrderSetDeliveryAddressCustomTypeAction template) {
        OrderSetDeliveryAddressCustomTypeActionImpl instance = new OrderSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetDeliveryAddressCustomTypeActionBuilder builder(){
        return OrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }
    
    public static OrderSetDeliveryAddressCustomTypeActionBuilder builder(final OrderSetDeliveryAddressCustomTypeAction template){
        return OrderSetDeliveryAddressCustomTypeActionBuilder.of(template);
    }
    

    default <T> T withOrderSetDeliveryAddressCustomTypeAction(Function<OrderSetDeliveryAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
