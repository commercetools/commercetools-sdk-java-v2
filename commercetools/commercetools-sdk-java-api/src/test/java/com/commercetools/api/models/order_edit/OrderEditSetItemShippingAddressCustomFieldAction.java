package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.OrderEditSetItemShippingAddressCustomFieldActionImpl;

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
@JsonDeserialize(as = OrderEditSetItemShippingAddressCustomFieldActionImpl.class)
public interface OrderEditSetItemShippingAddressCustomFieldAction extends OrderEditUpdateAction {

    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD = "setItemShippingAddressCustomField";

    
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public Object getValue();

    
    public void setAddressKey(final String addressKey);
    
    
    
    public void setName(final String name);
    
    
    
    public void setValue(final Object value);
    

    public static OrderEditSetItemShippingAddressCustomFieldAction of(){
        return new OrderEditSetItemShippingAddressCustomFieldActionImpl();
    }
    

    public static OrderEditSetItemShippingAddressCustomFieldAction of(final OrderEditSetItemShippingAddressCustomFieldAction template) {
        OrderEditSetItemShippingAddressCustomFieldActionImpl instance = new OrderEditSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderEditSetItemShippingAddressCustomFieldActionBuilder builder(){
        return OrderEditSetItemShippingAddressCustomFieldActionBuilder.of();
    }
    
    public static OrderEditSetItemShippingAddressCustomFieldActionBuilder builder(final OrderEditSetItemShippingAddressCustomFieldAction template){
        return OrderEditSetItemShippingAddressCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withOrderEditSetItemShippingAddressCustomFieldAction(Function<OrderEditSetItemShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
