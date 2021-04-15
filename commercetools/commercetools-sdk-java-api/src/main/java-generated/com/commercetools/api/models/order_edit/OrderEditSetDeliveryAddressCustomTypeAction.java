package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.OrderEditSetDeliveryAddressCustomTypeActionImpl;

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
@JsonDeserialize(as = OrderEditSetDeliveryAddressCustomTypeActionImpl.class)
public interface OrderEditSetDeliveryAddressCustomTypeAction extends OrderEditUpdateAction {

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
    

    public static OrderEditSetDeliveryAddressCustomTypeAction of(){
        return new OrderEditSetDeliveryAddressCustomTypeActionImpl();
    }
    

    public static OrderEditSetDeliveryAddressCustomTypeAction of(final OrderEditSetDeliveryAddressCustomTypeAction template) {
        OrderEditSetDeliveryAddressCustomTypeActionImpl instance = new OrderEditSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderEditSetDeliveryAddressCustomTypeActionBuilder builder(){
        return OrderEditSetDeliveryAddressCustomTypeActionBuilder.of();
    }
    
    public static OrderEditSetDeliveryAddressCustomTypeActionBuilder builder(final OrderEditSetDeliveryAddressCustomTypeAction template){
        return OrderEditSetDeliveryAddressCustomTypeActionBuilder.of(template);
    }
    

    default <T> T withOrderEditSetDeliveryAddressCustomTypeAction(Function<OrderEditSetDeliveryAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
