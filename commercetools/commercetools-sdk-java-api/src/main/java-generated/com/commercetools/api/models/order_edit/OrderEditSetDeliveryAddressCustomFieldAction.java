package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order_edit.OrderEditSetDeliveryAddressCustomFieldActionImpl;

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
@JsonDeserialize(as = OrderEditSetDeliveryAddressCustomFieldActionImpl.class)
public interface OrderEditSetDeliveryAddressCustomFieldAction extends OrderEditUpdateAction {

    String SET_DELIVERY_ADDRESS_CUSTOM_FIELD = "setDeliveryAddressCustomField";

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    
    public void setDeliveryId(final String deliveryId);
    
    
    
    public void setType(final TypeResourceIdentifier type);
    
    
    
    public void setFields(final FieldContainer fields);
    

    public static OrderEditSetDeliveryAddressCustomFieldAction of(){
        return new OrderEditSetDeliveryAddressCustomFieldActionImpl();
    }
    

    public static OrderEditSetDeliveryAddressCustomFieldAction of(final OrderEditSetDeliveryAddressCustomFieldAction template) {
        OrderEditSetDeliveryAddressCustomFieldActionImpl instance = new OrderEditSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderEditSetDeliveryAddressCustomFieldActionBuilder builder(){
        return OrderEditSetDeliveryAddressCustomFieldActionBuilder.of();
    }
    
    public static OrderEditSetDeliveryAddressCustomFieldActionBuilder builder(final OrderEditSetDeliveryAddressCustomFieldAction template){
        return OrderEditSetDeliveryAddressCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withOrderEditSetDeliveryAddressCustomFieldAction(Function<OrderEditSetDeliveryAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
