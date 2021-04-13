package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldActionImpl;

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
@JsonDeserialize(as = CartSetDeliveryAddressCustomFieldActionImpl.class)
public interface CartSetDeliveryAddressCustomFieldAction extends CartUpdateAction {

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
    

    public static CartSetDeliveryAddressCustomFieldAction of(){
        return new CartSetDeliveryAddressCustomFieldActionImpl();
    }
    

    public static CartSetDeliveryAddressCustomFieldAction of(final CartSetDeliveryAddressCustomFieldAction template) {
        CartSetDeliveryAddressCustomFieldActionImpl instance = new CartSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder builder(){
        return CartSetDeliveryAddressCustomFieldActionBuilder.of();
    }
    
    public static CartSetDeliveryAddressCustomFieldActionBuilder builder(final CartSetDeliveryAddressCustomFieldAction template){
        return CartSetDeliveryAddressCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withCartSetDeliveryAddressCustomFieldAction(Function<CartSetDeliveryAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
