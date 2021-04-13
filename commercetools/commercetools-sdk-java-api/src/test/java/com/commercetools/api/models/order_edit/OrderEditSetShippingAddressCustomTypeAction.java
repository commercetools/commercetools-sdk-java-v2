package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditSetShippingAddressCustomTypeActionImpl;

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
@JsonDeserialize(as = OrderEditSetShippingAddressCustomTypeActionImpl.class)
public interface OrderEditSetShippingAddressCustomTypeAction extends OrderEditUpdateAction {

    String SET_SHIPPING_ADDRESS_CUSTOM_TYPE = "setShippingAddressCustomType";

    
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    
    public void setType(final TypeResourceIdentifier type);
    
    
    
    public void setFields(final FieldContainer fields);
    

    public static OrderEditSetShippingAddressCustomTypeAction of(){
        return new OrderEditSetShippingAddressCustomTypeActionImpl();
    }
    

    public static OrderEditSetShippingAddressCustomTypeAction of(final OrderEditSetShippingAddressCustomTypeAction template) {
        OrderEditSetShippingAddressCustomTypeActionImpl instance = new OrderEditSetShippingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderEditSetShippingAddressCustomTypeActionBuilder builder(){
        return OrderEditSetShippingAddressCustomTypeActionBuilder.of();
    }
    
    public static OrderEditSetShippingAddressCustomTypeActionBuilder builder(final OrderEditSetShippingAddressCustomTypeAction template){
        return OrderEditSetShippingAddressCustomTypeActionBuilder.of(template);
    }
    

    default <T> T withOrderEditSetShippingAddressCustomTypeAction(Function<OrderEditSetShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
